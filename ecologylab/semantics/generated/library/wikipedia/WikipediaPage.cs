//
// WikipediaPage.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.wikipedia;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.wikipedia 
{
	/// <summary>
	/// An article on wikipedia
	/// </summary>
	[SimplInherit]
	public class WikipediaPage : WikipediaPageType
	{
		[SimplScalar]
		private MetadataParsedURL mainImageSrc;

		public WikipediaPage()
		{ }

		public WikipediaPage(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataParsedURL MainImageSrc
		{
			get{return mainImageSrc;}
			set
			{
				if (this.mainImageSrc != value)
				{
					this.mainImageSrc = value;
					this.RaisePropertyChanged( () => this.MainImageSrc );
				}
			}
		}
	}
}
