package ecologylab.semantics.generated.library;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.generated.library.search.SearchResult;

/**
*  GooglePatent.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/21/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Google Patents Class
 */ 
@simpl_inherit
public class GooglePatent extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString inventor;

	/** 
	 */ 
	@simpl_scalar	private MetadataString abstractField;

	/** 
	 */ 
	@simpl_scalar	private MetadataString claims;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL picLink;

	/** 
	 */ 
	@simpl_collection("search_result") @mm_name("referenced_bys")	private List<SearchResult> referencedBys;

	/** 
	 */ 
	@simpl_collection("search_result") @mm_name("citations")	private List<SearchResult> citations;

	/** 
	 */ 
	@simpl_collection("search_result") @mm_name("pic_links")	private List<SearchResult> picLinks;

	public GooglePatent()
	{ }

	public GooglePatent(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	inventor()
	{
		MetadataString	result = this.inventor;
		if (result == null)
		{
			result = new MetadataString();
			this.inventor = result;
		}
		return result;
	}

	public String getInventor()
	{
		return this.inventor().getValue();
	}

	public MetadataString getInventorMetadata()
	{
		return inventor;
	}

	public void setInventor(String inventor)
	{
		this.inventor().setValue(inventor);
	}

	public void setInventorMetadata(MetadataString inventor)
	{
		this.inventor = inventor;
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
		return this.abstractField().getValue();
	}

	public MetadataString getAbstractFieldMetadata()
	{
		return abstractField;
	}

	public void setAbstractField(String abstractField)
	{
		this.abstractField().setValue(abstractField);
	}

	public void setAbstractFieldMetadata(MetadataString abstractField)
	{
		this.abstractField = abstractField;
	}

	public MetadataString	claims()
	{
		MetadataString	result = this.claims;
		if (result == null)
		{
			result = new MetadataString();
			this.claims = result;
		}
		return result;
	}

	public String getClaims()
	{
		return this.claims().getValue();
	}

	public MetadataString getClaimsMetadata()
	{
		return claims;
	}

	public void setClaims(String claims)
	{
		this.claims().setValue(claims);
	}

	public void setClaimsMetadata(MetadataString claims)
	{
		this.claims = claims;
	}

	public MetadataParsedURL	picLink()
	{
		MetadataParsedURL	result = this.picLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.picLink = result;
		}
		return result;
	}

	public ParsedURL getPicLink()
	{
		return this.picLink().getValue();
	}

	public MetadataParsedURL getPicLinkMetadata()
	{
		return picLink;
	}

	public void setPicLink(ParsedURL picLink)
	{
		this.picLink().setValue(picLink);
	}

	public void setPicLinkMetadata(MetadataParsedURL picLink)
	{
		this.picLink = picLink;
	}

	public List<SearchResult> getReferencedBys()
	{
		return referencedBys;
	}

	public void setReferencedBys(List<SearchResult> referencedBys)
	{
		this.referencedBys = referencedBys;
	}

	public List<SearchResult> getCitations()
	{
		return citations;
	}

	public void setCitations(List<SearchResult> citations)
	{
		this.citations = citations;
	}

	public List<SearchResult> getPicLinks()
	{
		return picLinks;
	}

	public void setPicLinks(List<SearchResult> picLinks)
	{
		this.picLinks = picLinks;
	}
}
