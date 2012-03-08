package ecologylab.semantics.generated.library.wikipedia;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.wikipedia.Paragraph;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Section extends Metadata
{
	@simpl_scalar
	private MetadataString sectionTitle;

	@simpl_collection("paragraph")
	@mm_name("paragraphs")
	private List<Paragraph> paragraphs;

	public Section()
	{ super(); }

	public Section(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	sectionTitle()
	{
		MetadataString	result = this.sectionTitle;
		if (result == null)
		{
			result = new MetadataString();
			this.sectionTitle = result;
		}
		return result;
	}

	public String getSectionTitle()
	{
		return this.sectionTitle == null ? null : sectionTitle().getValue();
	}

	public MetadataString getSectionTitleMetadata()
	{
		return sectionTitle;
	}

	public void setSectionTitle(String sectionTitle)
	{
		if (sectionTitle != null)
			this.sectionTitle().setValue(sectionTitle);
	}

	public void setSectionTitleMetadata(MetadataString sectionTitle)
	{
		this.sectionTitle = sectionTitle;
	}

	public List<Paragraph> getParagraphs()
	{
		return paragraphs;
	}

	public void setParagraphs(List<Paragraph> paragraphs)
	{
		this.paragraphs = paragraphs;
	}
}
