//
// WeatherReport.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library;
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

namespace Ecologylab.Semantics.Generated.Library 
{
	/// <summary>
	/// The definition of weather report class.
	/// </summary>
	[SimplInherit]
	public class WeatherReport : CompoundDocument
	{
		/// <summary>
		/// The name of the city.
		/// </summary>
		[SimplScalar]
		private MetadataString city;

		/// <summary>
		/// The time of this weather
		/// </summary>
		[SimplScalar]
		private MetadataString time;

		/// <summary>
		/// The weather condition of the city, like sunny or cloudy.
		/// </summary>
		[SimplScalar]
		private MetadataString weather;

		/// <summary>
		/// The URL of the picture indicating weather condition.
		/// </summary>
		[SimplComposite]
		[MmName("weather_image")]
		private Image weatherImage;

		/// <summary>
		/// The temperature.
		/// </summary>
		[SimplScalar]
		private MetadataString temperature;

		/// <summary>
		/// The humidity of the air.
		/// </summary>
		[SimplScalar]
		private MetadataString humidity;

		/// <summary>
		/// The wind speed.
		/// </summary>
		[SimplScalar]
		private MetadataString wind;

		/// <summary>
		/// The dew point.
		/// </summary>
		[SimplScalar]
		private MetadataString dewPoint;

		/// <summary>
		/// chances of rain in percentage
		/// </summary>
		[SimplScalar]
		private MetadataString chanceOfRain;

		/// <summary>
		/// the size of the rain
		/// </summary>
		[SimplScalar]
		private MetadataString rainfall;

		/// <summary>
		/// weather forecasts for the near future
		/// </summary>
		[SimplCollection("weather_report")]
		[MmName("forecasts")]
		private List<WeatherReport> forecasts;

		public WeatherReport()
		{ }

		public WeatherReport(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString City
		{
			get{return city;}
			set
			{
				if (this.city != value)
				{
					this.city = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Time
		{
			get{return time;}
			set
			{
				if (this.time != value)
				{
					this.time = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Weather
		{
			get{return weather;}
			set
			{
				if (this.weather != value)
				{
					this.weather = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Image WeatherImage
		{
			get{return weatherImage;}
			set
			{
				if (this.weatherImage != value)
				{
					this.weatherImage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Temperature
		{
			get{return temperature;}
			set
			{
				if (this.temperature != value)
				{
					this.temperature = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Humidity
		{
			get{return humidity;}
			set
			{
				if (this.humidity != value)
				{
					this.humidity = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Wind
		{
			get{return wind;}
			set
			{
				if (this.wind != value)
				{
					this.wind = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString DewPoint
		{
			get{return dewPoint;}
			set
			{
				if (this.dewPoint != value)
				{
					this.dewPoint = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString ChanceOfRain
		{
			get{return chanceOfRain;}
			set
			{
				if (this.chanceOfRain != value)
				{
					this.chanceOfRain = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Rainfall
		{
			get{return rainfall;}
			set
			{
				if (this.rainfall != value)
				{
					this.rainfall = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<WeatherReport> Forecasts
		{
			get{return forecasts;}
			set
			{
				if (this.forecasts != value)
				{
					this.forecasts = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
