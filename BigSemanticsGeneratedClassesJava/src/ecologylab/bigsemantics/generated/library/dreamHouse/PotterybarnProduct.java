package ecologylab.bigsemantics.generated.library.dreamHouse;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.dreamHouse.PotterybarnProduct;
import ecologylab.bigsemantics.generated.library.product_and_service.Product;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class PotterybarnProduct extends Product
{
	@simpl_collection("potterybarn_product")
	@mm_name("customers_also_viewed")
	private List<PotterybarnProduct> customersAlsoViewed;

	public PotterybarnProduct()
	{ super(); }

	public PotterybarnProduct(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<PotterybarnProduct> getCustomersAlsoViewed()
	{
		return customersAlsoViewed;
	}

  // lazy evaluation:
  public List<PotterybarnProduct> customersAlsoViewed()
  {
    if (customersAlsoViewed == null)
      customersAlsoViewed = new ArrayList<PotterybarnProduct>();
    return customersAlsoViewed;
  }

  // addTo:
  public void addToCustomersAlsoViewed(PotterybarnProduct element)
  {
    customersAlsoViewed().add(element);
  }

  // size:
  public int customersAlsoViewedSize()
  {
    return customersAlsoViewed == null ? 0 : customersAlsoViewed.size();
  }

	public void setCustomersAlsoViewed(List<PotterybarnProduct> customersAlsoViewed)
	{
		this.customersAlsoViewed = customersAlsoViewed;
	}
}