package ecologylab.semantics.generated.library.patents;

import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.Date;
import ecologylab.semantics.metadata.scalar.MetadataDate;
import ecologylab.semantics.generated.library.creativeWork.CreativeWork;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  Patent.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Patents Class
 */ 
@simpl_inherit
public class Patent extends CreativeWork
{
	/** 
	 */ 
	@simpl_collection("claim")	@mm_name("claims")
	private List<MetadataString> claims;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString inventor;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataDate filingDate;

	/** 
	 */ 
	@simpl_collection("document")	@mm_name("classifications")
	private List<Document> classifications;

	public Patent()
	{ }

	public Patent(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<MetadataString> getClaims()
	{
		return claims;
	}

	public void setClaims(List<MetadataString> claims)
	{
		this.claims = claims;
	}

	public MetadataString	inventor()
	{
		MetadataString	result = this.inventor;
		if (result == null)
		{
			result = new MetadataString();
			this.inventor = result;
		}
		return result;
	}

	public String getInventor()
	{
		return this.inventor == null ? null : inventor().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getInventorMetadata()
	{
		return inventor;
	}

	public void setInventor(String inventor)
	{
		if (inventor != null)
			this.inventor().setValue(inventor);
	}

	public void setInventorMetadata(ecologylab.semantics.metadata.scalar.MetadataString inventor)
	{
		this.inventor = inventor;
	}

	public MetadataDate	filingDate()
	{
		MetadataDate	result = this.filingDate;
		if (result == null)
		{
			result = new MetadataDate();
			this.filingDate = result;
		}
		return result;
	}

	public Date getFilingDate()
	{
		return this.filingDate == null ? null : filingDate().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataDate getFilingDateMetadata()
	{
		return filingDate;
	}

	public void setFilingDate(Date filingDate)
	{
		if (filingDate != null)
			this.filingDate().setValue(filingDate);
	}

	public void setFilingDateMetadata(ecologylab.semantics.metadata.scalar.MetadataDate filingDate)
	{
		this.filingDate = filingDate;
	}

	public List<Document> getClassifications()
	{
		return classifications;
	}

	public void setClassifications(List<Document> classifications)
	{
		this.classifications = classifications;
	}
}
