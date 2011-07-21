package ecologylab.semantics.generated.library.artwork;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.artwork.MomaArtwork;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MomaList.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/21/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MomaList extends CompoundDocument
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("moma_artwork") @mm_name("artworks")	private List<MomaArtwork> artworks;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL nextList;

	public MomaList()
	{ }

	public MomaList(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<MomaArtwork> getArtworks()
	{
		return artworks;
	}

	public void setArtworks(List<MomaArtwork> artworks)
	{
		this.artworks = artworks;
	}

	public MetadataParsedURL	nextList()
	{
		MetadataParsedURL	result = this.nextList;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.nextList = result;
		}
		return result;
	}

	public ParsedURL getNextList()
	{
		return this.nextList().getValue();
	}

	public MetadataParsedURL getNextListMetadata()
	{
		return nextList;
	}

	public void setNextList(ParsedURL nextList)
	{
		this.nextList().setValue(nextList);
	}

	public void setNextListMetadata(MetadataParsedURL nextList)
	{
		this.nextList = nextList;
	}
}
