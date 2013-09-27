package ecologylab.bigsemantics.generated.library.creative_work;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creative_work.CreativeWork;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichArtifact;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Curation extends CreativeWork
{
	@simpl_collection
	@simpl_scope("rich_artifacts_scope")
	@mm_name("metadata_collection")
	private List<RichArtifact> metadataCollection;

	public Curation()
	{ super(); }

	public Curation(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<RichArtifact> getMetadataCollection()
	{
		return metadataCollection;
	}

  // lazy evaluation:
  public List<RichArtifact> metadataCollection()
  {
    if (metadataCollection == null)
      metadataCollection = new ArrayList<RichArtifact>();
    return metadataCollection;
  }

  // addTo:
  public void addToMetadataCollection(RichArtifact element)
  {
    metadataCollection().add(element);
  }

  // size:
  public int metadataCollectionSize()
  {
    return metadataCollection == null ? 0 : metadataCollection.size();
  }

	public void setMetadataCollection(List<RichArtifact> metadataCollection)
	{
		this.metadataCollection = metadataCollection;
	}
}
