package ecologylab.semantics.generated.library.publication;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;

/**
*  TermType.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class TermType extends Document
{
	/** 
	 */ 
	@simpl_scalar	@simpl_composite_as_scalar
	private MetadataString term;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataInteger frequency;

	public TermType()
	{ }

	public TermType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	term()
	{
		MetadataString	result = this.term;
		if (result == null)
		{
			result = new MetadataString();
			this.term = result;
		}
		return result;
	}

	public String getTerm()
	{
		return this.term == null ? null : term().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTermMetadata()
	{
		return term;
	}

	public void setTerm(String term)
	{
		if (term != null)
			this.term().setValue(term);
	}

	public void setTermMetadata(ecologylab.semantics.metadata.scalar.MetadataString term)
	{
		this.term = term;
	}

	public MetadataInteger	frequency()
	{
		MetadataInteger	result = this.frequency;
		if (result == null)
		{
			result = new MetadataInteger();
			this.frequency = result;
		}
		return result;
	}

	public Integer getFrequency()
	{
		return this.frequency == null ? 0 : frequency().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getFrequencyMetadata()
	{
		return frequency;
	}

	public void setFrequency(Integer frequency)
	{
		if (frequency != 0)
			this.frequency().setValue(frequency);
	}

	public void setFrequencyMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger frequency)
	{
		this.frequency = frequency;
	}
}
