package ecologylab.semantics.generated.library.opml;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.generated.library.opml.MmdInlineOutlineInOutlineInMmdInlineBodyInOpml;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlineOutlineInOutlineInMmdInlineBodyInOpml.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/21/11.
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
	@simpl_nowrap	@simpl_collection("outline") @mm_name("outlines")	private List<MmdInlineOutlineInOutlineInMmdInlineBodyInOpml> outlines;

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

	public MetadataString getTextMetadata()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text().setValue(text);
	}

	public void setTextMetadata(MetadataString text)
	{
		this.text = text;
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

	public MetadataString getTitleMetadata()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title().setValue(title);
	}

	public void setTitleMetadata(MetadataString title)
	{
		this.title = title;
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

	public MetadataParsedURL getHtmlUrlMetadata()
	{
		return htmlUrl;
	}

	public void setHtmlUrl(ParsedURL htmlUrl)
	{
		this.htmlUrl().setValue(htmlUrl);
	}

	public void setHtmlUrlMetadata(MetadataParsedURL htmlUrl)
	{
		this.htmlUrl = htmlUrl;
	}

	public List<MmdInlineOutlineInOutlineInMmdInlineBodyInOpml> getOutlines()
	{
		return outlines;
	}

	public void setOutlines(List<MmdInlineOutlineInOutlineInMmdInlineBodyInOpml> outlines)
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

	public MetadataParsedURL getXmlUrlMetadata()
	{
		return xmlUrl;
	}

	public void setXmlUrl(ParsedURL xmlUrl)
	{
		this.xmlUrl().setValue(xmlUrl);
	}

	public void setXmlUrlMetadata(MetadataParsedURL xmlUrl)
	{
		this.xmlUrl = xmlUrl;
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

	public MetadataString getTypeMetadata()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type().setValue(type);
	}

	public void setTypeMetadata(MetadataString type)
	{
		this.type = type;
	}
}
