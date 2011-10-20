package ecologylab.semantics.generated.library.uva;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/20/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.util.List;

/** 
 *For Collabartion with UVA's Cluster formation project.
 */ 
@simpl_inherit
public class Topic extends CompoundDocument
{
	@simpl_scalar
	private MetadataStringBuilder contentKeywords;

	@simpl_scalar
	private MetadataStringBuilder anchorKeywords;

	@simpl_scalar
	private MetadataStringBuilder urlKeywords;

	@simpl_scalar
	private MetadataStringBuilder titleKeywords;

	@simpl_scalar
	private MetadataInteger id;

	public Topic()
	{ }

	public Topic(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataStringBuilder	contentKeywords()
	{
		MetadataStringBuilder	result = this.contentKeywords;
		if (result == null)
		{
			result = new MetadataStringBuilder();
			this.contentKeywords = result;
		}
		return result;
	}

	public StringBuilder getContentKeywords()
	{
		return this.contentKeywords == null ? null : contentKeywords().getValue();
	}

	public MetadataStringBuilder getContentKeywordsMetadata()
	{
		return contentKeywords;
	}

	public void setContentKeywords(StringBuilder contentKeywords)
	{
		if (contentKeywords != null)
			this.contentKeywords().setValue(contentKeywords);
	}

	public void setContentKeywordsMetadata(MetadataStringBuilder contentKeywords)
	{
		this.contentKeywords = contentKeywords;
	}

	public MetadataStringBuilder	anchorKeywords()
	{
		MetadataStringBuilder	result = this.anchorKeywords;
		if (result == null)
		{
			result = new MetadataStringBuilder();
			this.anchorKeywords = result;
		}
		return result;
	}

	public StringBuilder getAnchorKeywords()
	{
		return this.anchorKeywords == null ? null : anchorKeywords().getValue();
	}

	public MetadataStringBuilder getAnchorKeywordsMetadata()
	{
		return anchorKeywords;
	}

	public void setAnchorKeywords(StringBuilder anchorKeywords)
	{
		if (anchorKeywords != null)
			this.anchorKeywords().setValue(anchorKeywords);
	}

	public void setAnchorKeywordsMetadata(MetadataStringBuilder anchorKeywords)
	{
		this.anchorKeywords = anchorKeywords;
	}

	public MetadataStringBuilder	urlKeywords()
	{
		MetadataStringBuilder	result = this.urlKeywords;
		if (result == null)
		{
			result = new MetadataStringBuilder();
			this.urlKeywords = result;
		}
		return result;
	}

	public StringBuilder getUrlKeywords()
	{
		return this.urlKeywords == null ? null : urlKeywords().getValue();
	}

	public MetadataStringBuilder getUrlKeywordsMetadata()
	{
		return urlKeywords;
	}

	public void setUrlKeywords(StringBuilder urlKeywords)
	{
		if (urlKeywords != null)
			this.urlKeywords().setValue(urlKeywords);
	}

	public void setUrlKeywordsMetadata(MetadataStringBuilder urlKeywords)
	{
		this.urlKeywords = urlKeywords;
	}

	public MetadataStringBuilder	titleKeywords()
	{
		MetadataStringBuilder	result = this.titleKeywords;
		if (result == null)
		{
			result = new MetadataStringBuilder();
			this.titleKeywords = result;
		}
		return result;
	}

	public StringBuilder getTitleKeywords()
	{
		return this.titleKeywords == null ? null : titleKeywords().getValue();
	}

	public MetadataStringBuilder getTitleKeywordsMetadata()
	{
		return titleKeywords;
	}

	public void setTitleKeywords(StringBuilder titleKeywords)
	{
		if (titleKeywords != null)
			this.titleKeywords().setValue(titleKeywords);
	}

	public void setTitleKeywordsMetadata(MetadataStringBuilder titleKeywords)
	{
		this.titleKeywords = titleKeywords;
	}

	public MetadataInteger	id()
	{
		MetadataInteger	result = this.id;
		if (result == null)
		{
			result = new MetadataInteger();
			this.id = result;
		}
		return result;
	}

	public Integer getId()
	{
		return this.id == null ? 0 : id().getValue();
	}

	public MetadataInteger getIdMetadata()
	{
		return id;
	}

	public void setId(Integer id)
	{
		if (id != 0)
			this.id().setValue(id);
	}

	public void setIdMetadata(MetadataInteger id)
	{
		this.id = id;
	}
}
