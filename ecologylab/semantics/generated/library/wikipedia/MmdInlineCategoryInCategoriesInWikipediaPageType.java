package ecologylab.semantics.generated.library.wikipedia;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlineCategoryInCategoriesInWikipediaPageType.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineCategoryInCategoriesInWikipediaPageType extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString name;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL catLink;

	public MmdInlineCategoryInCategoriesInWikipediaPageType()
	{ }

	public MmdInlineCategoryInCategoriesInWikipediaPageType(MetaMetadataCompositeField mmd) {
		super(mmd);
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
		return this.name().getValue();
	}

	public void setName(String name)
	{
		this.name().setValue(name);
	}

	public MetadataParsedURL	catLink()
	{
		MetadataParsedURL	result = this.catLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.catLink = result;
		}
		return result;
	}

	public ParsedURL getCatLink()
	{
		return this.catLink().getValue();
	}

	public void setCatLink(ParsedURL catLink)
	{
		this.catLink().setValue(catLink);
	}

}