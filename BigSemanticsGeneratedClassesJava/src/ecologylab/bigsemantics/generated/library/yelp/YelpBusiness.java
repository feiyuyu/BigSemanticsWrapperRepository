package ecologylab.bigsemantics.generated.library.yelp;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.product_and_service.Service;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

/** 
 *Yelp local business description page
 */ 
@simpl_inherit
public class YelpBusiness extends Service
{
	/** 
	 *the type of business
	 */ 
	@simpl_scalar
	private MetadataString category;

	/** 
	 *the hours that the attraction is open
	 */ 
	@simpl_scalar
	private MetadataString openHours;

	@simpl_scalar
	private MetadataString priceRange;

	public YelpBusiness()
	{ super(); }

	public YelpBusiness(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	category()
	{
		MetadataString	result = this.category;
		if (result == null)
		{
			result = new MetadataString();
			this.category = result;
		}
		return result;
	}

	public String getCategory()
	{
		return this.category == null ? null : category().getValue();
	}

	public MetadataString getCategoryMetadata()
	{
		return category;
	}

	public void setCategory(String category)
	{
		if (category != null)
			this.category().setValue(category);
	}

	public void setCategoryMetadata(MetadataString category)
	{
		this.category = category;
	}

	public MetadataString	openHours()
	{
		MetadataString	result = this.openHours;
		if (result == null)
		{
			result = new MetadataString();
			this.openHours = result;
		}
		return result;
	}

	public String getOpenHours()
	{
		return this.openHours == null ? null : openHours().getValue();
	}

	public MetadataString getOpenHoursMetadata()
	{
		return openHours;
	}

	public void setOpenHours(String openHours)
	{
		if (openHours != null)
			this.openHours().setValue(openHours);
	}

	public void setOpenHoursMetadata(MetadataString openHours)
	{
		this.openHours = openHours;
	}

	public MetadataString	priceRange()
	{
		MetadataString	result = this.priceRange;
		if (result == null)
		{
			result = new MetadataString();
			this.priceRange = result;
		}
		return result;
	}

	public String getPriceRange()
	{
		return this.priceRange == null ? null : priceRange().getValue();
	}

	public MetadataString getPriceRangeMetadata()
	{
		return priceRange;
	}

	public void setPriceRange(String priceRange)
	{
		if (priceRange != null)
			this.priceRange().setValue(priceRange);
	}

	public void setPriceRangeMetadata(MetadataString priceRange)
	{
		this.priceRange = priceRange;
	}
}
