package ecologylab.semantics.generated.library.flickr;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.flickr.FlickrLink;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *All flickr photos of a particular user
 */ 
@simpl_inherit
public class FlickrAuthor extends CompoundDocument
{
	/** 
	 *Collection of all images of a user
	 */ 
	@simpl_collection("flickr_link")
	@mm_name("flickr_link_set")
	private List<FlickrLink> flickrLinkSet;

	public FlickrAuthor()
	{ }

	public FlickrAuthor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrLink> getFlickrLinkSet()
	{
		return flickrLinkSet;
	}

	public void setFlickrLinkSet(List<FlickrLink> flickrLinkSet)
	{
		this.flickrLinkSet = flickrLinkSet;
	}
}
