//
// CiteulikeTag.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.CiteulikeNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.CiteulikeNS 
{
	[SimplInherit]
	public class CiteulikeTag : CompoundDocument
	{
		[SimplCollection("citeulike_paper")]
		[MmName("articles")]
		private List<CiteulikePaper> articles;

		public CiteulikeTag()
		{ }

		public CiteulikeTag(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<CiteulikePaper> Articles
		{
			get{return articles;}
			set
			{
				if (this.articles != value)
				{
					this.articles = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
