package ecologylab.semantics.generated.library.products;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;

/**
*  BestsellerList.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class BestsellerList extends Document
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString rank;

	public BestsellerList()
	{ }

	public BestsellerList(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	rank()
	{
		MetadataString	result = this.rank;
		if (result == null)
		{
			result = new MetadataString();
			this.rank = result;
		}
		return result;
	}

	public String getRank()
	{
		return this.rank == null ? null : rank().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getRankMetadata()
	{
		return rank;
	}

	public void setRank(String rank)
	{
		if (rank != null)
			this.rank().setValue(rank);
	}

	public void setRankMetadata(ecologylab.semantics.metadata.scalar.MetadataString rank)
	{
		this.rank = rank;
	}
}
