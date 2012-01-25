package ecologylab.semantics.generated.library.truman_library_1948_campaign_cartoons;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.String;
import java.util.List;
import java.util.Map;

/** 
 *This MMD was initially generated by the browser authoring tool
 */ 
@simpl_inherit
@simpl_tag("truman_library_1948_campaign_cartoons")
public class TrumanLibrary1948CampaignCartoons extends Document
{
	/** 
	 *Artist
	 */ 
	@simpl_scalar
	private MetadataString artist;

	/** 
	 *Location of the image
	 */ 
	@simpl_scalar
	private MetadataParsedURL imgPurl;

	public TrumanLibrary1948CampaignCartoons()
	{ super(); }

	public TrumanLibrary1948CampaignCartoons(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	artist()
	{
		MetadataString	result = this.artist;
		if (result == null)
		{
			result = new MetadataString();
			this.artist = result;
		}
		return result;
	}

	public String getArtist()
	{
		return this.artist == null ? null : artist().getValue();
	}

	public MetadataString getArtistMetadata()
	{
		return artist;
	}

	public void setArtist(String artist)
	{
		if (artist != null)
			this.artist().setValue(artist);
	}

	public void setArtistMetadata(MetadataString artist)
	{
		this.artist = artist;
	}

	public MetadataParsedURL	imgPurl()
	{
		MetadataParsedURL	result = this.imgPurl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.imgPurl = result;
		}
		return result;
	}

	public ParsedURL getImgPurl()
	{
		return this.imgPurl == null ? null : imgPurl().getValue();
	}

	public MetadataParsedURL getImgPurlMetadata()
	{
		return imgPurl;
	}

	public void setImgPurl(ParsedURL imgPurl)
	{
		if (imgPurl != null)
			this.imgPurl().setValue(imgPurl);
	}

	public void setImgPurlMetadata(MetadataParsedURL imgPurl)
	{
		this.imgPurl = imgPurl;
	}
}
