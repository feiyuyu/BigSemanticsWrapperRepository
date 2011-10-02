package ecologylab.semantics.generated.library.truman_library_1948_campaign_cartoons;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;

/**
*  TrumanLibrary1948CampaignCartoons.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * This MMD was initially generated by the browser authoring tool
 */ 
@simpl_inherit
@simpl_tag("truman_library_1948_campaign_cartoons")
public class TrumanLibrary1948CampaignCartoons extends Document
{
	/** 
	 * Artist
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString artist;

	/** 
	 * Location of the image
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL imgPurl;

	public TrumanLibrary1948CampaignCartoons()
	{ }

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

	public ecologylab.semantics.metadata.scalar.MetadataString getArtistMetadata()
	{
		return artist;
	}

	public void setArtist(String artist)
	{
		if (artist != null)
			this.artist().setValue(artist);
	}

	public void setArtistMetadata(ecologylab.semantics.metadata.scalar.MetadataString artist)
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

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getImgPurlMetadata()
	{
		return imgPurl;
	}

	public void setImgPurl(ParsedURL imgPurl)
	{
		if (imgPurl != null)
			this.imgPurl().setValue(imgPurl);
	}

	public void setImgPurlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL imgPurl)
	{
		this.imgPurl = imgPurl;
	}
}
