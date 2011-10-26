//
// CitationInfo.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 10/26/11.
// Copyright 2011 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.bibManaging 
{
	/// <summary>
	/// Citation numbers.
	/// </summary>
	[SimplInherit]
	public class CitationInfo : Metadata
	{
		[SimplScalar]
		private MetadataInteger totalCitation;

		[SimplScalar]
		private MetadataInteger selfCitation;

		public CitationInfo()
		{ }

		public MetadataInteger TotalCitation
		{
			get{return totalCitation;}
			set{totalCitation = value;}
		}

		public MetadataInteger SelfCitation
		{
			get{return selfCitation;}
			set{selfCitation = value;}
		}
	}
}
