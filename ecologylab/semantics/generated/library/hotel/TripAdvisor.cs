//
// TripAdvisor.cs
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
using ecologylab.semantics.generated.library.hotel;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.hotel 
{
	[SimplInherit]
	public class TripAdvisor : Hotel
	{
		[SimplScalar]
		private MetadataString overallRating;

		[SimplCollection("trip_advisor")]
		[MmName("similar_hotels")]
		private List<TripAdvisor> similarHotels;

		public TripAdvisor()
		{ }

		public TripAdvisor(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString OverallRating
		{
			get{return overallRating;}
			set
			{
				if (this.overallRating != value)
				{
					this.overallRating = value;
					this.RaisePropertyChanged( () => this.OverallRating );
				}
			}
		}

		public List<TripAdvisor> SimilarHotels
		{
			get{return similarHotels;}
			set
			{
				if (this.similarHotels != value)
				{
					this.similarHotels = value;
					this.RaisePropertyChanged( () => this.SimilarHotels );
				}
			}
		}
	}
}
