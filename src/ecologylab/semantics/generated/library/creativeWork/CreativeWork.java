package ecologylab.semantics.generated.library.creativeWork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.creativeWork.Author;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.Hint;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_hints;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_other_tags;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class CreativeWork extends CompoundDocument
{
	@simpl_scalar
	@simpl_hints({Hint.XML_LEAF})
	@simpl_tag("abstract")
	private MetadataString abstractField;

	/** 
	 *Set of authors.
	 */ 
	@simpl_collection("author")
	@mm_name("authors")
	private List<Author> authors;

	@simpl_scalar
	@simpl_other_tags({"year_of_publication"})
	private MetadataInteger year;

	public CreativeWork()
	{ super(); }

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

	public MetadataString getAbstractFieldMetadata()
	{
		return abstractField;
	}

	public void setAbstractField(String abstractField)
	{
		if (abstractField != null)
			this.abstractField().setValue(abstractField);
	}

	public void setAbstractFieldMetadata(MetadataString abstractField)
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

	public MetadataInteger getYearMetadata()
	{
		return year;
	}

	public void setYear(Integer year)
	{
		if (year != 0)
			this.year().setValue(year);
	}

	public void setYearMetadata(MetadataInteger year)
	{
		this.year = year;
	}
}
