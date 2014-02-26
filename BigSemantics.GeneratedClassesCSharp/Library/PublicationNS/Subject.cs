//
// Subject.cs
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
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.PublicationNS 
{
	[SimplInherit]
	public class Subject : Metadata
	{
		[SimplScalar]
		private MetadataParsedURL location;

		[SimplScalar]
		[SimplCompositeAsScalar]
		private MetadataString subject;

		public Subject()
		{ }

		public Subject(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataParsedURL Location
		{
			get{return location;}
			set
			{
				if (this.location != value)
				{
					this.location = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString SubjectProp
		{
			get{return subject;}
			set
			{
				if (this.subject != value)
				{
					this.subject = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
