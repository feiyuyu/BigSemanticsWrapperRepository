package ecologylab.semantics.generated.library.dlese;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/20/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.dlese.AdditionalMetadata;
import ecologylab.semantics.generated.library.dlese.SearchAdditionalMetadataAdn;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.List;

@simpl_inherit
public class UserSearchAdditionalMetadata extends AdditionalMetadata
{
	@simpl_composite
	@simpl_tag("adn")
	@mm_name("search_additional_metadata_adn")
	private SearchAdditionalMetadataAdn searchAdditionalMetadataAdn;

	public UserSearchAdditionalMetadata()
	{ }

	public UserSearchAdditionalMetadata(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public SearchAdditionalMetadataAdn getSearchAdditionalMetadataAdn()
	{
		return searchAdditionalMetadataAdn;
	}

	public void setSearchAdditionalMetadataAdn(SearchAdditionalMetadataAdn searchAdditionalMetadataAdn)
	{
		this.searchAdditionalMetadataAdn = searchAdditionalMetadataAdn;
	}
}
