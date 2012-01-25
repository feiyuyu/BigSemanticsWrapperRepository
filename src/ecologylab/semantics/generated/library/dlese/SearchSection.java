package ecologylab.semantics.generated.library.dlese;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.dlese.DleseRecord1;
import ecologylab.semantics.generated.library.dlese.ResultInfo;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class SearchSection extends Metadata
{
	@simpl_composite
	@simpl_tag("resultInfo")
	@mm_name("result_info")
	private ResultInfo resultInfo;

	@simpl_collection("record")
	@simpl_tag("results")
	@mm_name("search_results")
	private List<DleseRecord1> searchResults;

	public SearchSection()
	{ super(); }

	public SearchSection(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ResultInfo getResultInfo()
	{
		return resultInfo;
	}

	public void setResultInfo(ResultInfo resultInfo)
	{
		this.resultInfo = resultInfo;
	}

	public List<DleseRecord1> getSearchResults()
	{
		return searchResults;
	}

	public void setSearchResults(List<DleseRecord1> searchResults)
	{
		this.searchResults = searchResults;
	}
}
