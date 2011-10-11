package ecologylab.semantics.generated.library.imdb;

import java.util.ArrayList;
import ecologylab.semantics.generated.library.imdb.ImdbTitle;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.serialization.annotations.simpl_collection;

/**
*  ImdbChart.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/06/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * IMDB chart
 */ 
@simpl_inherit
public class ImdbChart extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("imdb_title")	@mm_name("results")
	private List<ImdbTitle> results;

	public ImdbChart()
	{ }

	public ImdbChart(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<ImdbTitle> getResults()
	{
		return results;
	}

	public void setResults(List<ImdbTitle> results)
	{
		this.results = results;
	}
}
