package ecologylab.semantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/20/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.search.YahooResult;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.ArrayList;
import java.util.List;

/** 
 *Yahoo Web Search Service
 */ 
@simpl_inherit
@simpl_tag("ResultSet")
public class YahooResultSet extends Document
{
	/** 
	 *Collection of results for yahoo search
	 */ 
	@simpl_collection("Result")
	@simpl_nowrap
	@mm_name("results")
	private List<YahooResult> results;

	public YahooResultSet()
	{ }

	public YahooResultSet(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<YahooResult> getResults()
	{
		return results;
	}

	public void setResults(List<YahooResult> results)
	{
		this.results = results;
	}
}
