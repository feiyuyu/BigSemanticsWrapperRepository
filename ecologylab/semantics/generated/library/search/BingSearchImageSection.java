package ecologylab.semantics.generated.library.search;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.semantics.generated.library.search.BingImageSearchResult;
import ecologylab.serialization.annotations.simpl_tag;

/**
*  BingSearchImageSection.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/06/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class BingSearchImageSection extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("mms:ImageResult")	@simpl_tag("mms:Results")	@mm_name("image_search_results")
	private List<BingImageSearchResult> imageSearchResults;

	public BingSearchImageSection()
	{ }

	public BingSearchImageSection(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<BingImageSearchResult> getImageSearchResults()
	{
		return imageSearchResults;
	}

	public void setImageSearchResults(List<BingImageSearchResult> imageSearchResults)
	{
		this.imageSearchResults = imageSearchResults;
	}
}
