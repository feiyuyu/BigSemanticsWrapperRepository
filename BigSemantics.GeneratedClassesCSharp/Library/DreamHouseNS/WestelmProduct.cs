//
// WestelmProduct.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
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
	public class WestelmProduct : Product
	{
		[SimplCollection("westelm_product")]
		[MmName("also_in_this_collection")]
		private List<WestelmProduct> alsoInThisCollection;

		[SimplCollection("westelm_product")]
		[MmName("people_also_shopped_for")]
		private List<WestelmProduct> peopleAlsoShoppedFor;

		public WestelmProduct()
		{ }

		public WestelmProduct(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<WestelmProduct> AlsoInThisCollection
		{
			get{return alsoInThisCollection;}
			set
			{
				if (this.alsoInThisCollection != value)
				{
					this.alsoInThisCollection = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<WestelmProduct> PeopleAlsoShoppedFor
		{
			get{return peopleAlsoShoppedFor;}
			set
			{
				if (this.peopleAlsoShoppedFor != value)
				{
					this.peopleAlsoShoppedFor = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
