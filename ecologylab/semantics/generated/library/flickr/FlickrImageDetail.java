package ecologylab.semantics.generated.library.flickr;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.flickr.FlickrTag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  FlickrImageDetail.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * A Flickr Image result page
 */ 
@simpl_inherit
public class FlickrImageDetail extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL thumbnailKludge;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL imageKludge;

	/** 
	 */ 
	@simpl_collection("flickr_tag")	@mm_name("flickr_tags")
	private List<FlickrTag> flickrTags;

	public FlickrImageDetail()
	{ }

	public FlickrImageDetail(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	thumbnailKludge()
	{
		MetadataParsedURL	result = this.thumbnailKludge;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.thumbnailKludge = result;
		}
		return result;
	}

	public ParsedURL getThumbnailKludge()
	{
		return this.thumbnailKludge == null ? null : thumbnailKludge().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getThumbnailKludgeMetadata()
	{
		return thumbnailKludge;
	}

	public void setThumbnailKludge(ParsedURL thumbnailKludge)
	{
		if (thumbnailKludge != null)
			this.thumbnailKludge().setValue(thumbnailKludge);
	}

	public void setThumbnailKludgeMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL thumbnailKludge)
	{
		this.thumbnailKludge = thumbnailKludge;
	}

	public MetadataParsedURL	imageKludge()
	{
		MetadataParsedURL	result = this.imageKludge;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.imageKludge = result;
		}
		return result;
	}

	public ParsedURL getImageKludge()
	{
		return this.imageKludge == null ? null : imageKludge().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getImageKludgeMetadata()
	{
		return imageKludge;
	}

	public void setImageKludge(ParsedURL imageKludge)
	{
		if (imageKludge != null)
			this.imageKludge().setValue(imageKludge);
	}

	public void setImageKludgeMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL imageKludge)
	{
		this.imageKludge = imageKludge;
	}

	public List<FlickrTag> getFlickrTags()
	{
		return flickrTags;
	}

	public void setFlickrTags(List<FlickrTag> flickrTags)
	{
		this.flickrTags = flickrTags;
	}
}
