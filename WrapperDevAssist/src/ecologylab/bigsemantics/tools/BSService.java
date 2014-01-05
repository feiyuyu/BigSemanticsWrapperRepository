package ecologylab.bigsemantics.tools;

import java.io.File;
import java.io.IOException;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A class for running and stopping the BigSemantics service suite (including a downloading service,
 * an extraction service, and a downloading worker).
 * 
 * @author quyin
 */
public class BSService
{

  public static class ServiceOpException extends Exception
  {

    public ServiceOpException(String message)
    {
      super(message);
    }

  }

  static Logger logger = LoggerFactory.getLogger(BSService.class);

  int           servicePort;

  String        dpoolWarPath;

  String        bssWarPath;

  String        downloaderJarPath;

  Server        server;

  Process       downloaderProc;

  public BSService() throws ConfigurationException
  {
    this("resources/service-default.conf");
  }

  public BSService(String configFile) throws ConfigurationException
  {
    Configuration config = new PropertiesConfiguration(configFile);
    servicePort = config.getInt("service_port");
    dpoolWarPath = config.getString("dpool_war_path");
    bssWarPath = config.getString("bsservice_war_path");
    downloaderJarPath = config.getString("downloader_jar_path");
  }

  public void start() throws Exception
  {
    if (checkRequiredArchives())
    {
      runServer();
      runDownloader();
    }
  }

  public void stop() throws Exception
  {
    stopServer();
    stopDownloader();
  }

  private boolean checkRequiredArchives() throws ServiceOpException
  {
    isExistingOrThrowException(dpoolWarPath);
    isExistingOrThrowException(bssWarPath);
    isExistingOrThrowException(downloaderJarPath);
    return true;
  }

  private void isExistingOrThrowException(String path) throws ServiceOpException
  {
    File f = new File(path);
    if (!f.exists())
    {
      throw new ServiceOpException("Missing required archive: " + path);
    }
  }

  private void runServer() throws Exception
  {
    ContextHandlerCollection contexts = new ContextHandlerCollection();

    WebAppContext context1 = new WebAppContext(contexts, dpoolWarPath, "/DownloaderPool");
    contexts.addHandler(context1);

    WebAppContext context2 = new WebAppContext(contexts, bssWarPath, "/BigSemanticsService");
    contexts.addHandler(context2);

    server = new Server(servicePort);
    server.setHandler(contexts);
    server.start();
    for (int i = 0; i < 30; ++i)
    {
      if (server.isRunning())
      {
        break;
      }
      Thread.sleep(500);
    }

    if (!server.isRunning())
    {
      throw new RuntimeException("Failed to start the BigSemantics web service(s).");
    }

    logger.info("BS web services started.");
  }

  private void stopServer() throws Exception
  {
    server.stop();

    for (int i = 0; i < 30; ++i)
    {
      if (server.isStopped())
      {
        break;
      }
      Thread.sleep(500);
    }

    if (!server.isStopped())
    {
      throw new RuntimeException("Failed to stop the BigSemantics web service(s).");
    }

    logger.info("BS web services stopped.");
  }

  private void runDownloader() throws IOException
  {
    stopDownloader();
    ProcessBuilder pb = new ProcessBuilder("java", "-jar", downloaderJarPath);
    downloaderProc = pb.start();
    logger.info("downloader started.");
  }

  private void stopDownloader()
  {
    if (downloaderProc != null)
    {
      downloaderProc.destroy();
      downloaderProc = null;
      logger.info("downloader stopped.");
    }
  }

  public static void main(String[] args) throws Exception
  {
    BSService runner = new BSService();
    runner.start();
    Thread.sleep(10000);
    logger.info("requesting stop ...");
    runner.stop();
  }

}