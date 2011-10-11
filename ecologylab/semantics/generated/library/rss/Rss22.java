package ecologylab.semantics.generated.library.rss;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.generated.library.rss.Item;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.serialization.annotations.simpl_nowrap;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_tag;

/**
*  Rss22.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/06/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * A news feed, yucky style.
 */ 
@simpl_inherit
@simpl_tag("rss_2_2")
public class Rss22 extends CompoundDocument
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("item")	@mm_name("items")
	private List<Item> items;

	public Rss22()
	{ }

	public Rss22(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Item> getItems()
	{
		return items;
	}

	public void setItems(List<Item> items)
	{
		this.items = items;
	}
}
