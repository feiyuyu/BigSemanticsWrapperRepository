package ecologylab.semantics.generated.library.buzz;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.generated.library.buzz.MmdInlineHotSearchInHotSearchesInGoogleTrends;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  GoogleTrends.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/21/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Google trends
 */ 
@simpl_inherit
public class GoogleTrends extends CompoundDocument
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("hot_search") @mm_name("hot_searches")	private List<MmdInlineHotSearchInHotSearchesInGoogleTrends> hotSearches;

	public GoogleTrends()
	{ }

	public GoogleTrends(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<MmdInlineHotSearchInHotSearchesInGoogleTrends> getHotSearches()
	{
		return hotSearches;
	}

	public void setHotSearches(List<MmdInlineHotSearchInHotSearchesInGoogleTrends> hotSearches)
	{
		this.hotSearches = hotSearches;
	}
}
