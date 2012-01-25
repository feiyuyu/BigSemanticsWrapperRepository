package ecologylab.semantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.search.BingImageSearchResult;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class BingSearchImageSection extends CompoundDocument
{
	@simpl_collection("mms:ImageResult")
	@simpl_tag("mms:Results")
	@mm_name("image_search_results")
	private List<BingImageSearchResult> imageSearchResults;

	public BingSearchImageSection()
	{ super(); }

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
