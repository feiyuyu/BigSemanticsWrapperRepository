package ecologylab.semantics.generated.library.dlese;

import java.util.ArrayList;
import ecologylab.semantics.generated.library.dlese.DleseRecord2;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_tag;

/**
*  DleseGetRecord.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
@simpl_tag("DDSWebService")
public class DleseGetRecord extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("record")	@simpl_tag("GetRecord")	@mm_name("records")
	private List<DleseRecord2> records;

	public DleseGetRecord()
	{ }

	public DleseGetRecord(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<DleseRecord2> getRecords()
	{
		return records;
	}

	public void setRecords(List<DleseRecord2> records)
	{
		this.records = records;
	}
}
