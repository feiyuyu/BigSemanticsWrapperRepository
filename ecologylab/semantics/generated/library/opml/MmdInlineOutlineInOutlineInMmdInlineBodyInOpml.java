package ecologylab.semantics.generated.library.opml;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.generated.library.opml.MmdInlineOutlineInOutlineInMmdInlineBodyInOpml;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlineOutlineInOutlineInMmdInlineBodyInOpml.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineOutlineInOutlineInMmdInlineBodyInOpml extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString text;

	/** 
	 */ 
	@simpl_scalar	private MetadataString title;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("htmlUrl")	private MetadataParsedURL htmlUrl;

	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("outline") @mm_name("outlines")	private ArrayList<MmdInlineOutlineInOutlineInMmdInlineBodyInOpml> outlines;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("xmlUrl")	private MetadataParsedURL xmlUrl;

	/** 
	 */ 
	@simpl_scalar	private MetadataString type;

	public MmdInlineOutlineInOutlineInMmdInlineBodyInOpml()
	{ }

	public MmdInlineOutlineInOutlineInMmdInlineBodyInOpml(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	text()
	{
		MetadataString	result = this.text;
		if (result == null)
		{
			result = new MetadataString();
			this.text = result;
		}
		return result;
	}

	public String getText()
	{
		return this.text().getValue();
	}

	public void setText(String text)
	{
		this.text().setValue(text);
	}

	public MetadataString	title()
	{
		MetadataString	result = this.title;
		if (result == null)
		{
			result = new MetadataString();
			this.title = result;
		}
		return result;
	}

	public String getTitle()
	{
		return this.title().getValue();
	}

	public void setTitle(String title)
	{
		this.title().setValue(title);
	}

	public MetadataParsedURL	htmlUrl()
	{
		MetadataParsedURL	result = this.htmlUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.htmlUrl = result;
		}
		return result;
	}

	public ParsedURL getHtmlUrl()
	{
		return this.htmlUrl().getValue();
	}

	public void setHtmlUrl(ParsedURL htmlUrl)
	{
		this.htmlUrl().setValue(htmlUrl);
	}


	public ArrayList<MmdInlineOutlineInOutlineInMmdInlineBodyInOpml> getOutlines()
	{
		return outlines;
	}

	public void setOutlines(ArrayList<MmdInlineOutlineInOutlineInMmdInlineBodyInOpml> outlines)
	{
		this.outlines = outlines;
	}
	public MetadataParsedURL	xmlUrl()
	{
		MetadataParsedURL	result = this.xmlUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.xmlUrl = result;
		}
		return result;
	}

	public ParsedURL getXmlUrl()
	{
		return this.xmlUrl().getValue();
	}

	public void setXmlUrl(ParsedURL xmlUrl)
	{
		this.xmlUrl().setValue(xmlUrl);
	}

	public MetadataString	type()
	{
		MetadataString	result = this.type;
		if (result == null)
		{
			result = new MetadataString();
			this.type = result;
		}
		return result;
	}

	public String getType()
	{
		return this.type().getValue();
	}

	public void setType(String type)
	{
		this.type().setValue(type);
	}

}