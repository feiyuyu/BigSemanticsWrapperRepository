package ecologylab.semantics.generated.library.creativeWork;

import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_other_tags;
import java.util.List;
import ecologylab.serialization.annotations.simpl_hints;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.Hint;
import ecologylab.semantics.generated.library.creativeWork.Author;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;

/**
*  CreativeWork.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/02/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class CreativeWork extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	@simpl_tag("abstract")	@simpl_hints(Hint.XML_LEAF)	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString abstractField;

	/** 
	 * Set of authors.
	 */ 
	@simpl_collection("author")	@mm_name("authors")
	private List<Author> authors;

	/** 
	 */ 
	@simpl_scalar	@simpl_other_tags({"year_of_publication"})	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataInteger year;

	public CreativeWork()
	{ }

	public CreativeWork(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	abstractField()
	{
		MetadataString	result = this.abstractField;
		if (result == null)
		{
			result = new MetadataString();
			this.abstractField = result;
		}
		return result;
	}

	public String getAbstractField()
	{
		return this.abstractField == null ? null : abstractField().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAbstractFieldMetadata()
	{
		return abstractField;
	}

	public void setAbstractField(String abstractField)
	{
		if (abstractField != null)
			this.abstractField().setValue(abstractField);
	}

	public void setAbstractFieldMetadata(ecologylab.semantics.metadata.scalar.MetadataString abstractField)
	{
		this.abstractField = abstractField;
	}

	public List<Author> getAuthors()
	{
		return authors;
	}

	public void setAuthors(List<Author> authors)
	{
		this.authors = authors;
	}

	public MetadataInteger	year()
	{
		MetadataInteger	result = this.year;
		if (result == null)
		{
			result = new MetadataInteger();
			this.year = result;
		}
		return result;
	}

	public Integer getYear()
	{
		return this.year == null ? 0 : year().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getYearMetadata()
	{
		return year;
	}

	public void setYear(Integer year)
	{
		if (year != 0)
			this.year().setValue(year);
	}

	public void setYearMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger year)
	{
		this.year = year;
	}
}
