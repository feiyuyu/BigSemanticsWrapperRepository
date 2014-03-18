//
// AskNatureFunction.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.AskNatureNS;
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

namespace Ecologylab.Semantics.Generated.Library.AskNatureNS 
{
	[SimplInherit]
	public class AskNatureFunction : CompoundDocument
	{
		[SimplScalar]
		private MetadataString functionId;

		[SimplCollection("ask_nature_strategy")]
		[MmName("strategies")]
		private List<AskNatureStrategy> strategies;

		public AskNatureFunction()
		{ }

		public AskNatureFunction(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString FunctionId
		{
			get{return functionId;}
			set
			{
				if (this.functionId != value)
				{
					this.functionId = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<AskNatureStrategy> Strategies
		{
			get{return strategies;}
			set
			{
				if (this.strategies != value)
				{
					this.strategies = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}