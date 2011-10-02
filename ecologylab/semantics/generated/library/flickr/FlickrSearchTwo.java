package ecologylab.semantics.generated.library.flickr;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.semantics.generated.library.flickr.FlickrImageDetail;

/**
*  FlickrSearchTwo.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * The flickr search class
 */ 
@simpl_inherit
public class FlickrSearchTwo extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("flickr_image_detail")	@mm_name("flickr_results")
	private List<FlickrImageDetail> flickrResults;

	public FlickrSearchTwo()
	{ }

	public FlickrSearchTwo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrImageDetail> getFlickrResults()
	{
		return flickrResults;
	}

	public void setFlickrResults(List<FlickrImageDetail> flickrResults)
	{
		this.flickrResults = flickrResults;
	}
}
