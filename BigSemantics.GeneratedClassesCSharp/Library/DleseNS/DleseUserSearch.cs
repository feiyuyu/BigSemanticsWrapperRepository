//
// DleseUserSearch.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.DleseNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.DleseNS 
{
	[SimplInherit]
	[SimplTag("DDSWebService")]
	public class DleseUserSearch : CompoundDocument
	{
		[SimplComposite]
		[SimplTag("Search")]
		[MmName("search_section")]
		private SearchSection searchSection;

		public DleseUserSearch()
		{ }

		public DleseUserSearch(MetaMetadataCompositeField mmd) : base(mmd) { }


		public SearchSection SearchSection
		{
			get{return searchSection;}
			set
			{
				if (this.searchSection != value)
				{
					this.searchSection = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
