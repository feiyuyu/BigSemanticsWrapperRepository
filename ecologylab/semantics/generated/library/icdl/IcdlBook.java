package ecologylab.semantics.generated.library.icdl;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  IcdlBook.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class IcdlBook extends Document
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString id;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString languages;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL cover;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataInteger height;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataInteger width;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString booktitle;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL bookurl;

	public IcdlBook()
	{ }

	public IcdlBook(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	id()
	{
		MetadataString	result = this.id;
		if (result == null)
		{
			result = new MetadataString();
			this.id = result;
		}
		return result;
	}

	public String getId()
	{
		return this.id == null ? null : id().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getIdMetadata()
	{
		return id;
	}

	public void setId(String id)
	{
		if (id != null)
			this.id().setValue(id);
	}

	public void setIdMetadata(ecologylab.semantics.metadata.scalar.MetadataString id)
	{
		this.id = id;
	}

	public MetadataString	languages()
	{
		MetadataString	result = this.languages;
		if (result == null)
		{
			result = new MetadataString();
			this.languages = result;
		}
		return result;
	}

	public String getLanguages()
	{
		return this.languages == null ? null : languages().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getLanguagesMetadata()
	{
		return languages;
	}

	public void setLanguages(String languages)
	{
		if (languages != null)
			this.languages().setValue(languages);
	}

	public void setLanguagesMetadata(ecologylab.semantics.metadata.scalar.MetadataString languages)
	{
		this.languages = languages;
	}

	public MetadataParsedURL	cover()
	{
		MetadataParsedURL	result = this.cover;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.cover = result;
		}
		return result;
	}

	public ParsedURL getCover()
	{
		return this.cover == null ? null : cover().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getCoverMetadata()
	{
		return cover;
	}

	public void setCover(ParsedURL cover)
	{
		if (cover != null)
			this.cover().setValue(cover);
	}

	public void setCoverMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL cover)
	{
		this.cover = cover;
	}

	public MetadataInteger	height()
	{
		MetadataInteger	result = this.height;
		if (result == null)
		{
			result = new MetadataInteger();
			this.height = result;
		}
		return result;
	}

	public Integer getHeight()
	{
		return this.height == null ? 0 : height().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getHeightMetadata()
	{
		return height;
	}

	public void setHeight(Integer height)
	{
		if (height != 0)
			this.height().setValue(height);
	}

	public void setHeightMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger height)
	{
		this.height = height;
	}

	public MetadataInteger	width()
	{
		MetadataInteger	result = this.width;
		if (result == null)
		{
			result = new MetadataInteger();
			this.width = result;
		}
		return result;
	}

	public Integer getWidth()
	{
		return this.width == null ? 0 : width().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getWidthMetadata()
	{
		return width;
	}

	public void setWidth(Integer width)
	{
		if (width != 0)
			this.width().setValue(width);
	}

	public void setWidthMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger width)
	{
		this.width = width;
	}

	public MetadataString	booktitle()
	{
		MetadataString	result = this.booktitle;
		if (result == null)
		{
			result = new MetadataString();
			this.booktitle = result;
		}
		return result;
	}

	public String getBooktitle()
	{
		return this.booktitle == null ? null : booktitle().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getBooktitleMetadata()
	{
		return booktitle;
	}

	public void setBooktitle(String booktitle)
	{
		if (booktitle != null)
			this.booktitle().setValue(booktitle);
	}

	public void setBooktitleMetadata(ecologylab.semantics.metadata.scalar.MetadataString booktitle)
	{
		this.booktitle = booktitle;
	}

	public MetadataParsedURL	bookurl()
	{
		MetadataParsedURL	result = this.bookurl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.bookurl = result;
		}
		return result;
	}

	public ParsedURL getBookurl()
	{
		return this.bookurl == null ? null : bookurl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getBookurlMetadata()
	{
		return bookurl;
	}

	public void setBookurl(ParsedURL bookurl)
	{
		if (bookurl != null)
			this.bookurl().setValue(bookurl);
	}

	public void setBookurlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL bookurl)
	{
		this.bookurl = bookurl;
	}
}
