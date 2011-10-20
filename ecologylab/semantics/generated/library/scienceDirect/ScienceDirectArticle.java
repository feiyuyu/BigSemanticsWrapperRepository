package ecologylab.semantics.generated.library.scienceDirect;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/20/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.scholarlyPublication.ScholarlyArticle;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;

/** 
 *Information about the article
 */ 
@simpl_inherit
public class ScienceDirectArticle extends ScholarlyArticle
{
	/** 
	 *The journal or other publication that the article comes from
	 */ 
	@simpl_scalar
	private MetadataString publicationName;

	@simpl_scalar
	private MetadataString volume;

	@simpl_scalar
	private MetadataString issue;

	/** 
	 *The digital object identifier of the article
	 */ 
	@simpl_scalar
	private MetadataString doi;

	public ScienceDirectArticle()
	{ }

	public ScienceDirectArticle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	publicationName()
	{
		MetadataString	result = this.publicationName;
		if (result == null)
		{
			result = new MetadataString();
			this.publicationName = result;
		}
		return result;
	}

	public String getPublicationName()
	{
		return this.publicationName == null ? null : publicationName().getValue();
	}

	public MetadataString getPublicationNameMetadata()
	{
		return publicationName;
	}

	public void setPublicationName(String publicationName)
	{
		if (publicationName != null)
			this.publicationName().setValue(publicationName);
	}

	public void setPublicationNameMetadata(MetadataString publicationName)
	{
		this.publicationName = publicationName;
	}

	public MetadataString	volume()
	{
		MetadataString	result = this.volume;
		if (result == null)
		{
			result = new MetadataString();
			this.volume = result;
		}
		return result;
	}

	public String getVolume()
	{
		return this.volume == null ? null : volume().getValue();
	}

	public MetadataString getVolumeMetadata()
	{
		return volume;
	}

	public void setVolume(String volume)
	{
		if (volume != null)
			this.volume().setValue(volume);
	}

	public void setVolumeMetadata(MetadataString volume)
	{
		this.volume = volume;
	}

	public MetadataString	issue()
	{
		MetadataString	result = this.issue;
		if (result == null)
		{
			result = new MetadataString();
			this.issue = result;
		}
		return result;
	}

	public String getIssue()
	{
		return this.issue == null ? null : issue().getValue();
	}

	public MetadataString getIssueMetadata()
	{
		return issue;
	}

	public void setIssue(String issue)
	{
		if (issue != null)
			this.issue().setValue(issue);
	}

	public void setIssueMetadata(MetadataString issue)
	{
		this.issue = issue;
	}

	public MetadataString	doi()
	{
		MetadataString	result = this.doi;
		if (result == null)
		{
			result = new MetadataString();
			this.doi = result;
		}
		return result;
	}

	public String getDoi()
	{
		return this.doi == null ? null : doi().getValue();
	}

	public MetadataString getDoiMetadata()
	{
		return doi;
	}

	public void setDoi(String doi)
	{
		if (doi != null)
			this.doi().setValue(doi);
	}

	public void setDoiMetadata(MetadataString doi)
	{
		this.doi = doi;
	}
}
