//
// TripAdvisorThingsToDo.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.HotelNS;
using Ecologylab.Semantics.Generated.Library.TravelNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.TripAdvisorNS 
{
	/// <summary>
	/// Trip advisor travel suggestions
	/// </summary>
	[SimplInherit]
	public class TripAdvisorThingsToDo : Attraction
	{
		[SimplComposite]
		[MmName("image")]
		private Image image;

		[SimplCollection("hotel")]
		[MmName("popular_hotels")]
		private List<Hotel> popularHotels;

		public TripAdvisorThingsToDo()
		{ }

		public TripAdvisorThingsToDo(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Image Image
		{
			get{return image;}
			set
			{
				if (this.image != value)
				{
					this.image = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Hotel> PopularHotels
		{
			get{return popularHotels;}
			set
			{
				if (this.popularHotels != value)
				{
					this.popularHotels = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
