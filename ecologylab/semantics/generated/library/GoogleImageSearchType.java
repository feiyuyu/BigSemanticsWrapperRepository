package ecologylab.semantics.generated.library;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.annotations.simpl_nowrap;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.semantics.generated.library.ImageResult;

/**
*  GoogleImageSearchType.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Google image search type
 */ 
@simpl_inherit
public class GoogleImageSearchType extends CompoundDocument
{
	/** 
	 * Collection of results for google image search
	 */ 
	@simpl_nowrap	@simpl_collection("image_result")	@mm_name("image_results")
	private List<ImageResult> imageResults;

	public GoogleImageSearchType()
	{ }

	public GoogleImageSearchType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<ImageResult> getImageResults()
	{
		return imageResults;
	}

	public void setImageResults(List<ImageResult> imageResults)
	{
		this.imageResults = imageResults;
	}
}
