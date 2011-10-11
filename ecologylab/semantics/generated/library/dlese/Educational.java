package ecologylab.semantics.generated.library.dlese;

import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.generated.library.dlese.Audience;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_tag;

/**
*  Educational.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/06/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Educational extends Metadata
{
	/** 
	 */ 
	@simpl_collection("audience")	@mm_name("audiences")
	private List<Audience> audiences;

	/** 
	 */ 
	@simpl_collection("resourceType")	@simpl_tag("resourceTypes")	@mm_name("resource_types")
	private List<MetadataString> resourceTypes;

	public Educational()
	{ }

	public Educational(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Audience> getAudiences()
	{
		return audiences;
	}

	public void setAudiences(List<Audience> audiences)
	{
		this.audiences = audiences;
	}

	public List<MetadataString> getResourceTypes()
	{
		return resourceTypes;
	}

	public void setResourceTypes(List<MetadataString> resourceTypes)
	{
		this.resourceTypes = resourceTypes;
	}
}