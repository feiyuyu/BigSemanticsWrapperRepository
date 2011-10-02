package ecologylab.semantics.generated.library;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  Tag.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Tag extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString tagName;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL link;

	public Tag()
	{ }

	public Tag(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	tagName()
	{
		MetadataString	result = this.tagName;
		if (result == null)
		{
			result = new MetadataString();
			this.tagName = result;
		}
		return result;
	}

	public String getTagName()
	{
		return this.tagName == null ? null : tagName().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTagNameMetadata()
	{
		return tagName;
	}

	public void setTagName(String tagName)
	{
		if (tagName != null)
			this.tagName().setValue(tagName);
	}

	public void setTagNameMetadata(ecologylab.semantics.metadata.scalar.MetadataString tagName)
	{
		this.tagName = tagName;
	}

	public MetadataParsedURL	link()
	{
		MetadataParsedURL	result = this.link;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.link = result;
		}
		return result;
	}

	public ParsedURL getLink()
	{
		return this.link == null ? null : link().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getLinkMetadata()
	{
		return link;
	}

	public void setLink(ParsedURL link)
	{
		if (link != null)
			this.link().setValue(link);
	}

	public void setLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL link)
	{
		this.link = link;
	}
}
