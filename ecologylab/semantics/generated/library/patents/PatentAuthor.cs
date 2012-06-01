//
// PatentAuthor.cs
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
using ecologylab.semantics.generated.library.creative_work;
using ecologylab.semantics.generated.library.patents;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.patents 
{
	/// <summary>
	/// Authors of Patents; really this should be a mix-in to author
	/// </summary>
	[SimplInherit]
	public class PatentAuthor : Author
	{
		[SimplCollection("patent")]
		[MmName("patents")]
		private List<Patent> patents;

		public PatentAuthor()
		{ }

		public PatentAuthor(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Patent> Patents
		{
			get{return patents;}
			set
			{
				if (this.patents != value)
				{
					this.patents = value;
					this.RaisePropertyChanged( () => this.Patents );
				}
			}
		}
	}
}
