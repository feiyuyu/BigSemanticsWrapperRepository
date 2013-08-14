package ecologylab.bigsemantics.generated.library.primitives;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Html extends Metadata
{
	@simpl_scalar
	private MetadataString htmlString;

	@simpl_scalar
	private MetadataString encoding;

	@simpl_scalar
	private MetadataString dtd;

	public Html()
	{ super(); }

	public Html(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	htmlString()
	{
		MetadataString	result = this.htmlString;
		if (result == null)
		{
			result = new MetadataString();
			this.htmlString = result;
		}
		return result;
	}

	public String getHtmlString()
	{
		return this.htmlString == null ? null : htmlString().getValue();
	}

	public MetadataString getHtmlStringMetadata()
	{
		return htmlString;
	}

	public void setHtmlString(String htmlString)
	{
		if (htmlString != null)
			this.htmlString().setValue(htmlString);
	}

	public void setHtmlStringMetadata(MetadataString htmlString)
	{
		this.htmlString = htmlString;
	}

	public MetadataString	encoding()
	{
		MetadataString	result = this.encoding;
		if (result == null)
		{
			result = new MetadataString();
			this.encoding = result;
		}
		return result;
	}

	public String getEncoding()
	{
		return this.encoding == null ? null : encoding().getValue();
	}

	public MetadataString getEncodingMetadata()
	{
		return encoding;
	}

	public void setEncoding(String encoding)
	{
		if (encoding != null)
			this.encoding().setValue(encoding);
	}

	public void setEncodingMetadata(MetadataString encoding)
	{
		this.encoding = encoding;
	}

	public MetadataString	dtd()
	{
		MetadataString	result = this.dtd;
		if (result == null)
		{
			result = new MetadataString();
			this.dtd = result;
		}
		return result;
	}

	public String getDtd()
	{
		return this.dtd == null ? null : dtd().getValue();
	}

	public MetadataString getDtdMetadata()
	{
		return dtd;
	}

	public void setDtd(String dtd)
	{
		if (dtd != null)
			this.dtd().setValue(dtd);
	}

	public void setDtdMetadata(MetadataString dtd)
	{
		this.dtd = dtd;
	}
}
