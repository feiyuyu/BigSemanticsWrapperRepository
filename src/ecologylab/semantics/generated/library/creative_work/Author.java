package ecologylab.semantics.generated.library.creative_work;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.creative_work.CreativeWork;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *An author of an article or creative work.
 */ 
@simpl_inherit
public class Author<CW extends CreativeWork> extends Document
{
	@simpl_scalar
	private MetadataString affiliation;

	@simpl_scalar
	private MetadataString city;

	@simpl_collection("publication")
	@mm_name("publications")
	private List<CW> publications;

	public Author()
	{ super(); }

	public Author(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	affiliation()
	{
		MetadataString	result = this.affiliation;
		if (result == null)
		{
			result = new MetadataString();
			this.affiliation = result;
		}
		return result;
	}

	public String getAffiliation()
	{
		return this.affiliation == null ? null : affiliation().getValue();
	}

	public MetadataString getAffiliationMetadata()
	{
		return affiliation;
	}

	public void setAffiliation(String affiliation)
	{
		if (affiliation != null)
			this.affiliation().setValue(affiliation);
	}

	public void setAffiliationMetadata(MetadataString affiliation)
	{
		this.affiliation = affiliation;
	}

	public MetadataString	city()
	{
		MetadataString	result = this.city;
		if (result == null)
		{
			result = new MetadataString();
			this.city = result;
		}
		return result;
	}

	public String getCity()
	{
		return this.city == null ? null : city().getValue();
	}

	public MetadataString getCityMetadata()
	{
		return city;
	}

	public void setCity(String city)
	{
		if (city != null)
			this.city().setValue(city);
	}

	public void setCityMetadata(MetadataString city)
	{
		this.city = city;
	}

	public List<CW> getPublications()
	{
		return publications;
	}

  // lazy evaluation:
  public List<CW> publications()
  {
    if (publications == null)
      publications = new ArrayList<CW>();
    return publications;
  }

  // addTo:
  public void addToPublications(CW element)
  {
    publications().add(element);
  }

  // size:
  public int publicationsSize()
  {
    return publications == null ? 0 : publications.size();
  }

	public void setPublications(List<CW> publications)
	{
		this.publications = publications;
	}
}
