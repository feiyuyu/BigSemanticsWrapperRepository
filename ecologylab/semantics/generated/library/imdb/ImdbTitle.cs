//
// ImdbTitle.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.movie;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.imdb 
{
	/// <summary>
	/// IMDB metadata
	/// </summary>
	[SimplInherit]
	public class ImdbTitle : MovieInfo
	{
		[SimplScalar]
		private MetadataString gist;

		[SimplScalar]
		private MetadataString tagline;

		[SimplCollection("image")]
		[MmName("title_photos")]
		private List<Image> titlePhotos;

		public ImdbTitle()
		{ }

		public ImdbTitle(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Gist
		{
			get{return gist;}
			set
			{
				if (this.gist != value)
				{
					this.gist = value;
					this.RaisePropertyChanged( () => this.Gist );
				}
			}
		}

		public MetadataString Tagline
		{
			get{return tagline;}
			set
			{
				if (this.tagline != value)
				{
					this.tagline = value;
					this.RaisePropertyChanged( () => this.Tagline );
				}
			}
		}

		public List<Image> TitlePhotos
		{
			get{return titlePhotos;}
			set
			{
				if (this.titlePhotos != value)
				{
					this.titlePhotos = value;
					this.RaisePropertyChanged( () => this.TitlePhotos );
				}
			}
		}
	}
}
