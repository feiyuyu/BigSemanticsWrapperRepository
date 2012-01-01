package ecologylab.semantics.generated.library.gps;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataDouble;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class GisLocation extends Metadata
{
	@simpl_scalar
	private MetadataDouble latitude;

	@simpl_scalar
	private MetadataDouble longitude;

	@simpl_scalar
	private MetadataDouble altitude;

	@simpl_scalar
	private MetadataDouble direction;

	@simpl_scalar
	private MetadataString satellites;

	public GisLocation()
	{ }

	public GisLocation(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataDouble	latitude()
	{
		MetadataDouble	result = this.latitude;
		if (result == null)
		{
			result = new MetadataDouble();
			this.latitude = result;
		}
		return result;
	}

	public Double getLatitude()
	{
		return this.latitude == null ? 0.0 : latitude().getValue();
	}

	public MetadataDouble getLatitudeMetadata()
	{
		return latitude;
	}

	public void setLatitude(Double latitude)
	{
		if (latitude != 0.0)
			this.latitude().setValue(latitude);
	}

	public void setLatitudeMetadata(MetadataDouble latitude)
	{
		this.latitude = latitude;
	}

	public MetadataDouble	longitude()
	{
		MetadataDouble	result = this.longitude;
		if (result == null)
		{
			result = new MetadataDouble();
			this.longitude = result;
		}
		return result;
	}

	public Double getLongitude()
	{
		return this.longitude == null ? 0.0 : longitude().getValue();
	}

	public MetadataDouble getLongitudeMetadata()
	{
		return longitude;
	}

	public void setLongitude(Double longitude)
	{
		if (longitude != 0.0)
			this.longitude().setValue(longitude);
	}

	public void setLongitudeMetadata(MetadataDouble longitude)
	{
		this.longitude = longitude;
	}

	public MetadataDouble	altitude()
	{
		MetadataDouble	result = this.altitude;
		if (result == null)
		{
			result = new MetadataDouble();
			this.altitude = result;
		}
		return result;
	}

	public Double getAltitude()
	{
		return this.altitude == null ? 0.0 : altitude().getValue();
	}

	public MetadataDouble getAltitudeMetadata()
	{
		return altitude;
	}

	public void setAltitude(Double altitude)
	{
		if (altitude != 0.0)
			this.altitude().setValue(altitude);
	}

	public void setAltitudeMetadata(MetadataDouble altitude)
	{
		this.altitude = altitude;
	}

	public MetadataDouble	direction()
	{
		MetadataDouble	result = this.direction;
		if (result == null)
		{
			result = new MetadataDouble();
			this.direction = result;
		}
		return result;
	}

	public Double getDirection()
	{
		return this.direction == null ? 0.0 : direction().getValue();
	}

	public MetadataDouble getDirectionMetadata()
	{
		return direction;
	}

	public void setDirection(Double direction)
	{
		if (direction != 0.0)
			this.direction().setValue(direction);
	}

	public void setDirectionMetadata(MetadataDouble direction)
	{
		this.direction = direction;
	}

	public MetadataString	satellites()
	{
		MetadataString	result = this.satellites;
		if (result == null)
		{
			result = new MetadataString();
			this.satellites = result;
		}
		return result;
	}

	public String getSatellites()
	{
		return this.satellites == null ? null : satellites().getValue();
	}

	public MetadataString getSatellitesMetadata()
	{
		return satellites;
	}

	public void setSatellites(String satellites)
	{
		if (satellites != null)
			this.satellites().setValue(satellites);
	}

	public void setSatellitesMetadata(MetadataString satellites)
	{
		this.satellites = satellites;
	}
}
