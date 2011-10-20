package ecologylab.semantics.generated.library.uva;

/**
 * Automatically generated by MetaMetadataJavaTranslator on 10/20/11
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2011) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.uva.TopicCluster;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.SimplTypesScope;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;

@simpl_inherit
public class Model extends Metadata
{
	@simpl_collection("topic_cluster")
	@mm_name("topic_clusters")
	private List<TopicCluster> topicClusters;

	public Model()
	{ }

	public Model(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<TopicCluster> getTopicClusters()
	{
		return topicClusters;
	}

	public void setTopicClusters(List<TopicCluster> topicClusters)
	{
		this.topicClusters = topicClusters;
	}
}
