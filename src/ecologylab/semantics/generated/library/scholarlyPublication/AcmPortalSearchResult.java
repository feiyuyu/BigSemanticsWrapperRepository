package ecologylab.semantics.generated.library.scholarlyPublication;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.search.SearchResult;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class AcmPortalSearchResult extends SearchResult
{
	@simpl_scalar
	private MetadataString authorList;

	@simpl_scalar
	private MetadataString publication;

	public AcmPortalSearchResult()
	{ super(); }

	public AcmPortalSearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	authorList()
	{
		MetadataString	result = this.authorList;
		if (result == null)
		{
			result = new MetadataString();
			this.authorList = result;
		}
		return result;
	}

	public String getAuthorList()
	{
		return this.authorList == null ? null : authorList().getValue();
	}

	public MetadataString getAuthorListMetadata()
	{
		return authorList;
	}

	public void setAuthorList(String authorList)
	{
		if (authorList != null)
			this.authorList().setValue(authorList);
	}

	public void setAuthorListMetadata(MetadataString authorList)
	{
		this.authorList = authorList;
	}

	public MetadataString	publication()
	{
		MetadataString	result = this.publication;
		if (result == null)
		{
			result = new MetadataString();
			this.publication = result;
		}
		return result;
	}

	public String getPublication()
	{
		return this.publication == null ? null : publication().getValue();
	}

	public MetadataString getPublicationMetadata()
	{
		return publication;
	}

	public void setPublication(String publication)
	{
		if (publication != null)
			this.publication().setValue(publication);
	}

	public void setPublicationMetadata(MetadataString publication)
	{
		this.publication = publication;
	}
}
