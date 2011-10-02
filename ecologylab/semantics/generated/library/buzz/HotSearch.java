package ecologylab.semantics.generated.library.buzz;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  HotSearch.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class HotSearch extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString search;

	public HotSearch()
	{ }

	public HotSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	search()
	{
		MetadataString	result = this.search;
		if (result == null)
		{
			result = new MetadataString();
			this.search = result;
		}
		return result;
	}

	public String getSearch()
	{
		return this.search == null ? null : search().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getSearchMetadata()
	{
		return search;
	}

	public void setSearch(String search)
	{
		if (search != null)
			this.search().setValue(search);
	}

	public void setSearchMetadata(ecologylab.semantics.metadata.scalar.MetadataString search)
	{
		this.search = search;
	}
}
