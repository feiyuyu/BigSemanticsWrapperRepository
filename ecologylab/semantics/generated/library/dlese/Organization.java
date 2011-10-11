package ecologylab.semantics.generated.library.dlese;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;

/**
*  Organization.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/06/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Organization extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	@simpl_tag("instEmail")	
	private MetadataString email;

	/** 
	 */ 
	@simpl_scalar	@simpl_tag("instName")	
	private MetadataString name;

	public Organization()
	{ }

	public Organization(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	email()
	{
		MetadataString	result = this.email;
		if (result == null)
		{
			result = new MetadataString();
			this.email = result;
		}
		return result;
	}

	public String getEmail()
	{
		return this.email == null ? null : email().getValue();
	}

	public MetadataString getEmailMetadata()
	{
		return email;
	}

	public void setEmail(String email)
	{
		if (email != null)
			this.email().setValue(email);
	}

	public void setEmailMetadata(MetadataString email)
	{
		this.email = email;
	}

	public MetadataString	name()
	{
		MetadataString	result = this.name;
		if (result == null)
		{
			result = new MetadataString();
			this.name = result;
		}
		return result;
	}

	public String getName()
	{
		return this.name == null ? null : name().getValue();
	}

	public MetadataString getNameMetadata()
	{
		return name;
	}

	public void setName(String name)
	{
		if (name != null)
			this.name().setValue(name);
	}

	public void setNameMetadata(MetadataString name)
	{
		this.name = name;
	}
}