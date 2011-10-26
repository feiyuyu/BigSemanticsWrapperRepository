//
// Lolz.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 10/26/11.
// Copyright 2011 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library 
{
	/// <summary>
	/// The LOLZ class
	/// </summary>
	[SimplInherit]
	public class Lolz : CompoundDocument
	{
		[SimplScalar]
		private MetadataString caption;

		[SimplScalar]
		private MetadataParsedURL picture;

		[SimplScalar]
		private MetadataParsedURL mightLike;

		public Lolz()
		{ }

		public MetadataString Caption
		{
			get{return caption;}
			set{caption = value;}
		}

		public MetadataParsedURL Picture
		{
			get{return picture;}
			set{picture = value;}
		}

		public MetadataParsedURL MightLike
		{
			get{return mightLike;}
			set{mightLike = value;}
		}
	}
}
