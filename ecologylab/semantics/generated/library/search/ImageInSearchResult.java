package ecologylab.semantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;

/** 
 *Def of an image in a Bing image search result.
 */ 
@simpl_inherit
public class ImageInSearchResult extends Image
{
	@simpl_scalar
	@simpl_tag("mms:ContentType")
	private MetadataString contentType;

	@simpl_scalar
	private MetadataParsedURL referrerUrl;

	@simpl_scalar
	@simpl_tag("mms:FileSize")
	private MetadataInteger fileSize;

	public ImageInSearchResult()
	{ }

	public ImageInSearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	contentType()
	{
		MetadataString	result = this.contentType;
		if (result == null)
		{
			result = new MetadataString();
			this.contentType = result;
		}
		return result;
	}

	public String getContentType()
	{
		return this.contentType == null ? null : contentType().getValue();
	}

	public MetadataString getContentTypeMetadata()
	{
		return contentType;
	}

	public void setContentType(String contentType)
	{
		if (contentType != null)
			this.contentType().setValue(contentType);
	}

	public void setContentTypeMetadata(MetadataString contentType)
	{
		this.contentType = contentType;
	}

	public MetadataParsedURL	referrerUrl()
	{
		MetadataParsedURL	result = this.referrerUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.referrerUrl = result;
		}
		return result;
	}

	public ParsedURL getReferrerUrl()
	{
		return this.referrerUrl == null ? null : referrerUrl().getValue();
	}

	public MetadataParsedURL getReferrerUrlMetadata()
	{
		return referrerUrl;
	}

	public void setReferrerUrl(ParsedURL referrerUrl)
	{
		if (referrerUrl != null)
			this.referrerUrl().setValue(referrerUrl);
	}

	public void setReferrerUrlMetadata(MetadataParsedURL referrerUrl)
	{
		this.referrerUrl = referrerUrl;
	}

	public MetadataInteger	fileSize()
	{
		MetadataInteger	result = this.fileSize;
		if (result == null)
		{
			result = new MetadataInteger();
			this.fileSize = result;
		}
		return result;
	}

	public Integer getFileSize()
	{
		return this.fileSize == null ? 0 : fileSize().getValue();
	}

	public MetadataInteger getFileSizeMetadata()
	{
		return fileSize;
	}

	public void setFileSize(Integer fileSize)
	{
		if (fileSize != 0)
			this.fileSize().setValue(fileSize);
	}

	public void setFileSizeMetadata(MetadataInteger fileSize)
	{
		this.fileSize = fileSize;
	}
}
