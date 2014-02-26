//
// LandofnodProduct.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.DreamHouseNS;
using Ecologylab.Semantics.Generated.Library.ProductAndServiceNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.DreamHouseNS 
{
	[SimplInherit]
	public class LandofnodProduct : Product
	{
		[SimplCollection("landofnod_product")]
		[MmName("customers_also_viewed")]
		private List<LandofnodProduct> customersAlsoViewed;

		[SimplCollection("landofnod_product")]
		[MmName("accessories")]
		private List<LandofnodProduct> accessories;

		public LandofnodProduct()
		{ }

		public LandofnodProduct(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<LandofnodProduct> CustomersAlsoViewed
		{
			get{return customersAlsoViewed;}
			set
			{
				if (this.customersAlsoViewed != value)
				{
					this.customersAlsoViewed = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<LandofnodProduct> Accessories
		{
			get{return accessories;}
			set
			{
				if (this.accessories != value)
				{
					this.accessories = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
