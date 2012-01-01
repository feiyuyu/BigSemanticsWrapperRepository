package ecologylab.semantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.search.BingWebSearchResult;
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
public class BingSearchWebSection extends CompoundDocument
{
	@simpl_collection("web:WebResult")
	@simpl_tag("web:Results")
	@mm_name("web_search_results")
	private List<BingWebSearchResult> webSearchResults;

	public BingSearchWebSection()
	{ }

	public BingSearchWebSection(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<BingWebSearchResult> getWebSearchResults()
	{
		return webSearchResults;
	}

	public void setWebSearchResults(List<BingWebSearchResult> webSearchResults)
	{
		this.webSearchResults = webSearchResults;
	}
}
