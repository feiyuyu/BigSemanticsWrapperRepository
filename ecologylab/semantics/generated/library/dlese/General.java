package ecologylab.semantics.generated.library.dlese;

import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;

/**
*  General.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class General extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString title;

	/** 
	 */ 
	@simpl_collection("subject")	@mm_name("subjects")
	private List<ecologylab.semantics.metadata.scalar.MetadataString> subjects;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString description;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString language;

	public General()
	{ }

	public General(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	title()
	{
		MetadataString	result = this.title;
		if (result == null)
		{
			result = new MetadataString();
			this.title = result;
		}
		return result;
	}

	public String getTitle()
	{
		return this.title == null ? null : title().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTitleMetadata()
	{
		return title;
	}

	public void setTitle(String title)
	{
		if (title != null)
			this.title().setValue(title);
	}

	public void setTitleMetadata(ecologylab.semantics.metadata.scalar.MetadataString title)
	{
		this.title = title;
	}

	public List<ecologylab.semantics.metadata.scalar.MetadataString> getSubjects()
	{
		return subjects;
	}

	public void setSubjects(List<ecologylab.semantics.metadata.scalar.MetadataString> subjects)
	{
		this.subjects = subjects;
	}

	public MetadataString	description()
	{
		MetadataString	result = this.description;
		if (result == null)
		{
			result = new MetadataString();
			this.description = result;
		}
		return result;
	}

	public String getDescription()
	{
		return this.description == null ? null : description().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getDescriptionMetadata()
	{
		return description;
	}

	public void setDescription(String description)
	{
		if (description != null)
			this.description().setValue(description);
	}

	public void setDescriptionMetadata(ecologylab.semantics.metadata.scalar.MetadataString description)
	{
		this.description = description;
	}

	public MetadataString	language()
	{
		MetadataString	result = this.language;
		if (result == null)
		{
			result = new MetadataString();
			this.language = result;
		}
		return result;
	}

	public String getLanguage()
	{
		return this.language == null ? null : language().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getLanguageMetadata()
	{
		return language;
	}

	public void setLanguage(String language)
	{
		if (language != null)
			this.language().setValue(language);
	}

	public void setLanguageMetadata(ecologylab.semantics.metadata.scalar.MetadataString language)
	{
		this.language = language;
	}
}
