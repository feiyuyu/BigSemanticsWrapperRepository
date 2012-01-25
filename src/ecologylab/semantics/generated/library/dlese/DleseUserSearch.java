package ecologylab.semantics.generated.library.dlese;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.dlese.SearchSection;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.List;
import java.util.Map;

@simpl_inherit
@simpl_tag("DDSWebService")
public class DleseUserSearch extends CompoundDocument
{
	@simpl_composite
	@simpl_tag("Search")
	@mm_name("search_section")
	private SearchSection searchSection;

	public DleseUserSearch()
	{ super(); }

	public DleseUserSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public SearchSection getSearchSection()
	{
		return searchSection;
	}

	public void setSearchSection(SearchSection searchSection)
	{
		this.searchSection = searchSection;
	}
}
