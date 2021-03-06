package ecologylab.bigsemantics.generated.library.askNature;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class AskNatureExpert extends Document
{
	@simpl_scalar
	private MetadataString group;

	@simpl_scalar
	private MetadataString name;

	@simpl_scalar
	private MetadataString affiliation;

	public AskNatureExpert()
	{ super(); }

	public AskNatureExpert(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	group()
	{
		MetadataString	result = this.group;
		if (result == null)
		{
			result = new MetadataString();
			this.group = result;
		}
		return result;
	}

	public String getGroup()
	{
		return this.group == null ? null : group().getValue();
	}

	public MetadataString getGroupMetadata()
	{
		return group;
	}

	public void setGroup(String group)
	{
		if (group != null)
			this.group().setValue(group);
	}

	public void setGroupMetadata(MetadataString group)
	{
		this.group = group;
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

	public MetadataString	affiliation()
	{
		MetadataString	result = this.affiliation;
		if (result == null)
		{
			result = new MetadataString();
			this.affiliation = result;
		}
		return result;
	}

	public String getAffiliation()
	{
		return this.affiliation == null ? null : affiliation().getValue();
	}

	public MetadataString getAffiliationMetadata()
	{
		return affiliation;
	}

	public void setAffiliation(String affiliation)
	{
		if (affiliation != null)
			this.affiliation().setValue(affiliation);
	}

	public void setAffiliationMetadata(MetadataString affiliation)
	{
		this.affiliation = affiliation;
	}
}
