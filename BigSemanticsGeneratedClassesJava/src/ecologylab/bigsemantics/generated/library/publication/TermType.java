package ecologylab.bigsemantics.generated.library.publication;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataInteger;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class TermType extends Document
{
	@simpl_scalar
	@simpl_composite_as_scalar
	private MetadataString term;

	@simpl_scalar
	private MetadataInteger frequency;

	public TermType()
	{ super(); }

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

	public MetadataString getTermMetadata()
	{
		return term;
	}

	public void setTerm(String term)
	{
		if (term != null)
			this.term().setValue(term);
	}

	public void setTermMetadata(MetadataString term)
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

	public MetadataInteger getFrequencyMetadata()
	{
		return frequency;
	}

	public void setFrequency(Integer frequency)
	{
		if (frequency != 0)
			this.frequency().setValue(frequency);
	}

	public void setFrequencyMetadata(MetadataInteger frequency)
	{
		this.frequency = frequency;
	}
}
