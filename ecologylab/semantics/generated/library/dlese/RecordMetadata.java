package ecologylab.semantics.generated.library.dlese;

import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.generated.library.dlese.ItemRecord;
import ecologylab.serialization.annotations.simpl_tag;

/**
*  RecordMetadata.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class RecordMetadata extends Metadata
{
	/** 
	 */ 
	@simpl_composite	@simpl_tag("itemRecord")	@mm_name("item_record")
	private ItemRecord itemRecord;

	public RecordMetadata()
	{ }

	public RecordMetadata(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ItemRecord getItemRecord()
	{
		return itemRecord;
	}

	public void setItemRecord(ItemRecord itemRecord)
	{
		this.itemRecord = itemRecord;
	}
}
