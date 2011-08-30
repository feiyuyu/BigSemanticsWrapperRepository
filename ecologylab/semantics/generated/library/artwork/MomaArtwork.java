package ecologylab.semantics.generated.library.artwork;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.generated.library.artwork.TempFieldValueHolder;
import ecologylab.semantics.generated.library.artwork.Artwork;

/**
*  MomaArtwork.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MomaArtwork extends Artwork
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString status;

	/** 
	 */ 
	@simpl_composite	@mm_name("moma_deparment")
	private CompoundDocument momaDeparment;

	/** 
	 */ 
	@simpl_composite	@mm_name("moma_classification")
	private CompoundDocument momaClassification;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL permalink;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL databaseLink;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString momaId;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL imageUrl;

	/** 
	 */ 
	@simpl_composite	@mm_name("temp_field_value_holder")
	private TempFieldValueHolder tempFieldValueHolder;

	public MomaArtwork()
	{ }

	public MomaArtwork(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	status()
	{
		MetadataString	result = this.status;
		if (result == null)
		{
			result = new MetadataString();
			this.status = result;
		}
		return result;
	}

	public String getStatus()
	{
		return this.status == null ? null : status().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getStatusMetadata()
	{
		return status;
	}

	public void setStatus(String status)
	{
		if (status != null)
			this.status().setValue(status);
	}

	public void setStatusMetadata(ecologylab.semantics.metadata.scalar.MetadataString status)
	{
		this.status = status;
	}

	public CompoundDocument getMomaDeparment()
	{
		return momaDeparment;
	}

	public void setMomaDeparment(CompoundDocument momaDeparment)
	{
		this.momaDeparment = momaDeparment;
	}

	public CompoundDocument getMomaClassification()
	{
		return momaClassification;
	}

	public void setMomaClassification(CompoundDocument momaClassification)
	{
		this.momaClassification = momaClassification;
	}

	public MetadataParsedURL	permalink()
	{
		MetadataParsedURL	result = this.permalink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.permalink = result;
		}
		return result;
	}

	public ParsedURL getPermalink()
	{
		return this.permalink == null ? null : permalink().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPermalinkMetadata()
	{
		return permalink;
	}

	public void setPermalink(ParsedURL permalink)
	{
		if (permalink != null)
			this.permalink().setValue(permalink);
	}

	public void setPermalinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL permalink)
	{
		this.permalink = permalink;
	}

	public MetadataParsedURL	databaseLink()
	{
		MetadataParsedURL	result = this.databaseLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.databaseLink = result;
		}
		return result;
	}

	public ParsedURL getDatabaseLink()
	{
		return this.databaseLink == null ? null : databaseLink().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getDatabaseLinkMetadata()
	{
		return databaseLink;
	}

	public void setDatabaseLink(ParsedURL databaseLink)
	{
		if (databaseLink != null)
			this.databaseLink().setValue(databaseLink);
	}

	public void setDatabaseLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL databaseLink)
	{
		this.databaseLink = databaseLink;
	}

	public MetadataString	momaId()
	{
		MetadataString	result = this.momaId;
		if (result == null)
		{
			result = new MetadataString();
			this.momaId = result;
		}
		return result;
	}

	public String getMomaId()
	{
		return this.momaId == null ? null : momaId().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getMomaIdMetadata()
	{
		return momaId;
	}

	public void setMomaId(String momaId)
	{
		if (momaId != null)
			this.momaId().setValue(momaId);
	}

	public void setMomaIdMetadata(ecologylab.semantics.metadata.scalar.MetadataString momaId)
	{
		this.momaId = momaId;
	}

	public MetadataParsedURL	imageUrl()
	{
		MetadataParsedURL	result = this.imageUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.imageUrl = result;
		}
		return result;
	}

	public ParsedURL getImageUrl()
	{
		return this.imageUrl == null ? null : imageUrl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getImageUrlMetadata()
	{
		return imageUrl;
	}

	public void setImageUrl(ParsedURL imageUrl)
	{
		if (imageUrl != null)
			this.imageUrl().setValue(imageUrl);
	}

	public void setImageUrlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL imageUrl)
	{
		this.imageUrl = imageUrl;
	}

	public TempFieldValueHolder getTempFieldValueHolder()
	{
		return tempFieldValueHolder;
	}

	public void setTempFieldValueHolder(TempFieldValueHolder tempFieldValueHolder)
	{
		this.tempFieldValueHolder = tempFieldValueHolder;
	}
}
