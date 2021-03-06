package ecologylab.bigsemantics.generated.library.video;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.video.YoutubeChannel;
import ecologylab.bigsemantics.generated.library.video.YoutubeVideo;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class YoutubeVideoGrid extends CompoundDocument
{
	@simpl_collection("youtube_video")
	@mm_name("videos")
	private List<YoutubeVideo> videos;

	@simpl_collection("youtube_channel")
	@mm_name("featured_channels")
	private List<YoutubeChannel> featuredChannels;

	@simpl_collection("youtube_channel")
	@mm_name("related_channels")
	private List<YoutubeChannel> relatedChannels;

	public YoutubeVideoGrid()
	{ super(); }

	public YoutubeVideoGrid(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<YoutubeVideo> getVideos()
	{
		return videos;
	}

  // lazy evaluation:
  public List<YoutubeVideo> videos()
  {
    if (videos == null)
      videos = new ArrayList<YoutubeVideo>();
    return videos;
  }

  // addTo:
  public void addToVideos(YoutubeVideo element)
  {
    videos().add(element);
  }

  // size:
  public int videosSize()
  {
    return videos == null ? 0 : videos.size();
  }

	public void setVideos(List<YoutubeVideo> videos)
	{
		this.videos = videos;
	}

	public List<YoutubeChannel> getFeaturedChannels()
	{
		return featuredChannels;
	}

  // lazy evaluation:
  public List<YoutubeChannel> featuredChannels()
  {
    if (featuredChannels == null)
      featuredChannels = new ArrayList<YoutubeChannel>();
    return featuredChannels;
  }

  // addTo:
  public void addToFeaturedChannels(YoutubeChannel element)
  {
    featuredChannels().add(element);
  }

  // size:
  public int featuredChannelsSize()
  {
    return featuredChannels == null ? 0 : featuredChannels.size();
  }

	public void setFeaturedChannels(List<YoutubeChannel> featuredChannels)
	{
		this.featuredChannels = featuredChannels;
	}

	public List<YoutubeChannel> getRelatedChannels()
	{
		return relatedChannels;
	}

  // lazy evaluation:
  public List<YoutubeChannel> relatedChannels()
  {
    if (relatedChannels == null)
      relatedChannels = new ArrayList<YoutubeChannel>();
    return relatedChannels;
  }

  // addTo:
  public void addToRelatedChannels(YoutubeChannel element)
  {
    relatedChannels().add(element);
  }

  // size:
  public int relatedChannelsSize()
  {
    return relatedChannels == null ? 0 : relatedChannels.size();
  }

	public void setRelatedChannels(List<YoutubeChannel> relatedChannels)
	{
		this.relatedChannels = relatedChannels;
	}
}
