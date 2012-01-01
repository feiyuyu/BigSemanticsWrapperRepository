package ecologylab.semantics.generated.library.opml;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.opml.Body;
import ecologylab.semantics.generated.library.opml.Head;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Opml extends CompoundDocument
{
	@simpl_composite
	@mm_name("head")
	private Head head;

	@simpl_composite
	@mm_name("body")
	private Body body;

	public Opml()
	{ }

	public Opml(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Head getHead()
	{
		return head;
	}

	public void setHead(Head head)
	{
		this.head = head;
	}

	public Body getBody()
	{
		return body;
	}

	public void setBody(Body body)
	{
		this.body = body;
	}
}
