//
// GeneralSearch.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Test.Library.Generics 
{
	[SimplInherit]
	public class GeneralSearch<SR> : Document where SR : Document
	{
		[SimplCollection("SR")]
		[SimplNoWrap]
		[MmName("search_results")]
		private List<Document> searchResults;

		public GeneralSearch()
		{ }

		public GeneralSearch(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Document> SearchResults
		{
			get{return searchResults;}
			set
			{
				if (this.searchResults != value)
				{
					this.searchResults = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
