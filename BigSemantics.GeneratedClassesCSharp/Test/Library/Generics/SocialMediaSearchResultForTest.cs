//
// SocialMediaSearchResultForTest.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Test.Library.Generics 
{
	[SimplInherit]
	public class SocialMediaSearchResultForTest : Document
	{
		[SimplScalar]
		private MetadataString author;

		[SimplCollection("tag")]
		[MmName("tags")]
		private List<Ecologylab.Semantics.MetadataNS.Scalar.MetadataString> tags;

		public SocialMediaSearchResultForTest()
		{ }

		public SocialMediaSearchResultForTest(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Author
		{
			get{return author;}
			set
			{
				if (this.author != value)
				{
					this.author = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.Semantics.MetadataNS.Scalar.MetadataString> Tags
		{
			get{return tags;}
			set
			{
				if (this.tags != value)
				{
					this.tags = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
