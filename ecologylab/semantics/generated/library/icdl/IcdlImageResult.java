package ecologylab.semantics.generated.library.icdl;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/20/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.icdl.IcdlBook;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.ArrayList;
import java.util.List;

/** 
 *Thumbnail Image
 */ 
@simpl_inherit
@simpl_tag("response")
public class IcdlImageResult extends Document
{
	@simpl_collection("book")
	@simpl_nowrap
	@mm_name("books")
	private List<IcdlBook> books;

	public IcdlImageResult()
	{ }

	public IcdlImageResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<IcdlBook> getBooks()
	{
		return books;
	}

	public void setBooks(List<IcdlBook> books)
	{
		this.books = books;
	}
}
