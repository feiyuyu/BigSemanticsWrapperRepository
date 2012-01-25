package ecologylab.semantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

/** 
 *A result from a search.
 */ 
@simpl_inherit
public class SearchResult extends Document
{
	/** 
	 *The search engine used for this result.
	 */ 
	@simpl_scalar
	private MetadataString engine;

	public SearchResult()
	{ super(); }

	public SearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	engine()
	{
		MetadataString	result = this.engine;
		if (result == null)
		{
			result = new MetadataString();
			this.engine = result;
		}
		return result;
	}

	public String getEngine()
	{
		return this.engine == null ? null : engine().getValue();
	}

	public MetadataString getEngineMetadata()
	{
		return engine;
	}

	public void setEngine(String engine)
	{
		if (engine != null)
			this.engine().setValue(engine);
	}

	public void setEngineMetadata(MetadataString engine)
	{
		this.engine = engine;
	}
}
