package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.xml.ElementState.xml_tag;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.types.element.Mappable;
import ecologylab.xml.xml_inherit;
import java.util.*;


/**
	An article on wikipedia
**/ 

@xml_inherit

public class  WikipediaPage
extends  Document
{


/**
	null
**/ 

	 @xml_leaf private MetadataParsedURL	mainImageSrc;
	@xml_collection("paragraphs") private ArrayList<Paragraph>	paragraphs;
	@xml_collection("categories") private ArrayList<Category>	categories;
	@xml_collection("thumbinners") private ArrayList<Thumbinner>	thumbinners;

/**
	Constructor
**/ 

public WikipediaPage()
{
 super();
}

/**
	Constructor
**/ 

public WikipediaPage(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for mainImageSrc
**/ 

public MetadataParsedURL	mainImageSrc()
{
MetadataParsedURL	result	=this.mainImageSrc;
if(result == null)
{
result = new MetadataParsedURL();
this.mainImageSrc	=	 result;
}
return result;
}

/**
	Gets the value of the field mainImageSrc
**/ 

public ParsedURL getMainImageSrc(){
return mainImageSrc().getValue();
}

/**
	Sets the value of the field mainImageSrc
**/ 

public void setMainImageSrc( ParsedURL mainImageSrc )
{
this.mainImageSrc().setValue(mainImageSrc);
}

/**
	The heavy weight setter method for field mainImageSrc
**/ 

public void hwSetMainImageSrc( ParsedURL mainImageSrc )
{
this.mainImageSrc().setValue(mainImageSrc);
rebuildCompositeTermVector();
 }
/**
	 Sets the mainImageSrc directly
**/ 

public void setMainImageSrcMetadata(MetadataParsedURL mainImageSrc)
{	this.mainImageSrc = mainImageSrc;
}
/**
	Heavy Weight Direct setter method for mainImageSrc
**/ 

public void hwSetMainImageSrcMetadata(MetadataParsedURL mainImageSrc)
{	 if(this.mainImageSrc!=null && this.mainImageSrc.getValue()!=null && hasTermVector())
		 termVector().remove(this.mainImageSrc.termVector());
	 this.mainImageSrc = mainImageSrc;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for paragraphs
**/ 

public  ArrayList<Paragraph>	paragraphs()
{
 ArrayList<Paragraph>	result	=this.paragraphs;
if(result == null)
{
result = new  ArrayList<Paragraph>();
this.paragraphs	=	 result;
}
return result;
}

/**
	Set the value of field paragraphs
**/ 

public void setParagraphs(  ArrayList<Paragraph> paragraphs )
{
this.paragraphs = paragraphs ;
}

/**
	Get the value of field paragraphs
**/ 

public  ArrayList<Paragraph> getParagraphs(){
return this.paragraphs;
}

/**
	Lazy Evaluation for categories
**/ 

public  ArrayList<Category>	categories()
{
 ArrayList<Category>	result	=this.categories;
if(result == null)
{
result = new  ArrayList<Category>();
this.categories	=	 result;
}
return result;
}

/**
	Set the value of field categories
**/ 

public void setCategories(  ArrayList<Category> categories )
{
this.categories = categories ;
}

/**
	Get the value of field categories
**/ 

public  ArrayList<Category> getCategories(){
return this.categories;
}

/**
	Lazy Evaluation for thumbinners
**/ 

public  ArrayList<Thumbinner>	thumbinners()
{
 ArrayList<Thumbinner>	result	=this.thumbinners;
if(result == null)
{
result = new  ArrayList<Thumbinner>();
this.thumbinners	=	 result;
}
return result;
}

/**
	Set the value of field thumbinners
**/ 

public void setThumbinners(  ArrayList<Thumbinner> thumbinners )
{
this.thumbinners = thumbinners ;
}

/**
	Get the value of field thumbinners
**/ 

public  ArrayList<Thumbinner> getThumbinners(){
return this.thumbinners;
}

}

