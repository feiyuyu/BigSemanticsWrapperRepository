//
// NsfInvestigator.cs
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
using ecologylab.semantics.generated.library.nsf;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.nsf 
{
	[SimplInherit]
	public class NsfInvestigator : Investigator
	{
		[SimplScalar]
		private MetadataString firstName;

		[SimplScalar]
		private MetadataString lastName;

		public NsfInvestigator()
		{ }

		public NsfInvestigator(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString FirstName
		{
			get{return firstName;}
			set
			{
				if (this.firstName != value)
				{
					this.firstName = value;
					this.RaisePropertyChanged( () => this.FirstName );
				}
			}
		}

		public MetadataString LastName
		{
			get{return lastName;}
			set
			{
				if (this.lastName != value)
				{
					this.lastName = value;
					this.RaisePropertyChanged( () => this.LastName );
				}
			}
		}
	}
}
