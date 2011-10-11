package ecologylab.semantics.generated.library.hotel;

import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.generated.library.gps.ContactPoint;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  Hotel.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/06/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Hotel extends Document
{
	/** 
	 */ 
	@simpl_composite	@mm_name("place")
	private ContactPoint place;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString price;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString spaceSize;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString checkIn;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString checkOut;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString temp;

	public Hotel()
	{ }

	public Hotel(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ContactPoint getPlace()
	{
		return place;
	}

	public void setPlace(ContactPoint place)
	{
		this.place = place;
	}

	public MetadataString	price()
	{
		MetadataString	result = this.price;
		if (result == null)
		{
			result = new MetadataString();
			this.price = result;
		}
		return result;
	}

	public String getPrice()
	{
		return this.price == null ? null : price().getValue();
	}

	public MetadataString getPriceMetadata()
	{
		return price;
	}

	public void setPrice(String price)
	{
		if (price != null)
			this.price().setValue(price);
	}

	public void setPriceMetadata(MetadataString price)
	{
		this.price = price;
	}

	public MetadataString	spaceSize()
	{
		MetadataString	result = this.spaceSize;
		if (result == null)
		{
			result = new MetadataString();
			this.spaceSize = result;
		}
		return result;
	}

	public String getSpaceSize()
	{
		return this.spaceSize == null ? null : spaceSize().getValue();
	}

	public MetadataString getSpaceSizeMetadata()
	{
		return spaceSize;
	}

	public void setSpaceSize(String spaceSize)
	{
		if (spaceSize != null)
			this.spaceSize().setValue(spaceSize);
	}

	public void setSpaceSizeMetadata(MetadataString spaceSize)
	{
		this.spaceSize = spaceSize;
	}

	public MetadataString	checkIn()
	{
		MetadataString	result = this.checkIn;
		if (result == null)
		{
			result = new MetadataString();
			this.checkIn = result;
		}
		return result;
	}

	public String getCheckIn()
	{
		return this.checkIn == null ? null : checkIn().getValue();
	}

	public MetadataString getCheckInMetadata()
	{
		return checkIn;
	}

	public void setCheckIn(String checkIn)
	{
		if (checkIn != null)
			this.checkIn().setValue(checkIn);
	}

	public void setCheckInMetadata(MetadataString checkIn)
	{
		this.checkIn = checkIn;
	}

	public MetadataString	checkOut()
	{
		MetadataString	result = this.checkOut;
		if (result == null)
		{
			result = new MetadataString();
			this.checkOut = result;
		}
		return result;
	}

	public String getCheckOut()
	{
		return this.checkOut == null ? null : checkOut().getValue();
	}

	public MetadataString getCheckOutMetadata()
	{
		return checkOut;
	}

	public void setCheckOut(String checkOut)
	{
		if (checkOut != null)
			this.checkOut().setValue(checkOut);
	}

	public void setCheckOutMetadata(MetadataString checkOut)
	{
		this.checkOut = checkOut;
	}

	public MetadataString	temp()
	{
		MetadataString	result = this.temp;
		if (result == null)
		{
			result = new MetadataString();
			this.temp = result;
		}
		return result;
	}

	public String getTemp()
	{
		return this.temp == null ? null : temp().getValue();
	}

	public MetadataString getTempMetadata()
	{
		return temp;
	}

	public void setTemp(String temp)
	{
		if (temp != null)
			this.temp().setValue(temp);
	}

	public void setTempMetadata(MetadataString temp)
	{
		this.temp = temp;
	}
}
