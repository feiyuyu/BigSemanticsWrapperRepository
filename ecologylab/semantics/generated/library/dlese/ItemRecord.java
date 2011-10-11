package ecologylab.semantics.generated.library.dlese;

import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_other_tags;
import ecologylab.semantics.generated.library.dlese.RecordMetaMetadata;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.dlese.General;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.generated.library.dlese.Educational;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import ecologylab.semantics.generated.library.dlese.Lifecycle;

/**
*  ItemRecord.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/06/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class ItemRecord extends Metadata
{
	/** 
	 */ 
	@simpl_composite	@simpl_tag("metaMetadata")	@mm_name("record_meta_metadata")
	private RecordMetaMetadata recordMetaMetadata;

	/** 
	 */ 
	@simpl_scalar	@simpl_tag("schemaLocation")	@simpl_other_tags({"xsi:schemaLocation"})	
	private MetadataParsedURL location;

	/** 
	 */ 
	@simpl_composite	@mm_name("lifecycle")
	private Lifecycle lifecycle;

	/** 
	 */ 
	@simpl_composite	@mm_name("educational")
	private Educational educational;

	/** 
	 */ 
	@simpl_composite	@mm_name("general")
	private General general;

	public ItemRecord()
	{ }

	public ItemRecord(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public RecordMetaMetadata getRecordMetaMetadata()
	{
		return recordMetaMetadata;
	}

	public void setRecordMetaMetadata(RecordMetaMetadata recordMetaMetadata)
	{
		this.recordMetaMetadata = recordMetaMetadata;
	}

	public MetadataParsedURL	location()
	{
		MetadataParsedURL	result = this.location;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.location = result;
		}
		return result;
	}

	public ParsedURL getLocation()
	{
		return this.location == null ? null : location().getValue();
	}

	public MetadataParsedURL getLocationMetadata()
	{
		return location;
	}

	public void setLocation(ParsedURL location)
	{
		if (location != null)
			this.location().setValue(location);
	}

	public void setLocationMetadata(MetadataParsedURL location)
	{
		this.location = location;
	}

	public Lifecycle getLifecycle()
	{
		return lifecycle;
	}

	public void setLifecycle(Lifecycle lifecycle)
	{
		this.lifecycle = lifecycle;
	}

	public Educational getEducational()
	{
		return educational;
	}

	public void setEducational(Educational educational)
	{
		this.educational = educational;
	}

	public General getGeneral()
	{
		return general;
	}

	public void setGeneral(General general)
	{
		this.general = general;
	}
}
