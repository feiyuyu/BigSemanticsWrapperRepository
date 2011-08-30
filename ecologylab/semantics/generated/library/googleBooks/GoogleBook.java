package ecologylab.semantics.generated.library.googleBooks;

import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.generated.library.googleBooks.GoogleBook;
import java.util.List;
import ecologylab.semantics.generated.library.publication.Book;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.googleBooks.Page;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  GoogleBook.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class GoogleBook extends Book
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString category;

	/** 
	 */ 
	@simpl_collection("google_book")	@mm_name("references_from_books")
	private List<GoogleBook> referencesFromBooks;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL placesMentionedKml;

	/** 
	 */ 
	@simpl_collection("page")	@mm_name("selected_pages")
	private List<Page> selectedPages;

	public GoogleBook()
	{ }

	public GoogleBook(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	category()
	{
		MetadataString	result = this.category;
		if (result == null)
		{
			result = new MetadataString();
			this.category = result;
		}
		return result;
	}

	public String getCategory()
	{
		return this.category == null ? null : category().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getCategoryMetadata()
	{
		return category;
	}

	public void setCategory(String category)
	{
		if (category != null)
			this.category().setValue(category);
	}

	public void setCategoryMetadata(ecologylab.semantics.metadata.scalar.MetadataString category)
	{
		this.category = category;
	}

	public List<GoogleBook> getReferencesFromBooks()
	{
		return referencesFromBooks;
	}

	public void setReferencesFromBooks(List<GoogleBook> referencesFromBooks)
	{
		this.referencesFromBooks = referencesFromBooks;
	}

	public MetadataParsedURL	placesMentionedKml()
	{
		MetadataParsedURL	result = this.placesMentionedKml;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.placesMentionedKml = result;
		}
		return result;
	}

	public ParsedURL getPlacesMentionedKml()
	{
		return this.placesMentionedKml == null ? null : placesMentionedKml().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPlacesMentionedKmlMetadata()
	{
		return placesMentionedKml;
	}

	public void setPlacesMentionedKml(ParsedURL placesMentionedKml)
	{
		if (placesMentionedKml != null)
			this.placesMentionedKml().setValue(placesMentionedKml);
	}

	public void setPlacesMentionedKmlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL placesMentionedKml)
	{
		this.placesMentionedKml = placesMentionedKml;
	}

	public List<Page> getSelectedPages()
	{
		return selectedPages;
	}

	public void setSelectedPages(List<Page> selectedPages)
	{
		this.selectedPages = selectedPages;
	}
}
