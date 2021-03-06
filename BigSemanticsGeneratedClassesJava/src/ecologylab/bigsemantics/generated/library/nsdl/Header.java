package ecologylab.bigsemantics.generated.library.nsdl;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Header extends Metadata
{
	@simpl_scalar
	@simpl_tag("resourceIdentifier")
	private MetadataParsedURL resourceIdentifier;

	public Header()
	{ super(); }

	public Header(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	resourceIdentifier()
	{
		MetadataParsedURL	result = this.resourceIdentifier;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.resourceIdentifier = result;
		}
		return result;
	}

	public ParsedURL getResourceIdentifier()
	{
		return this.resourceIdentifier == null ? null : resourceIdentifier().getValue();
	}

	public MetadataParsedURL getResourceIdentifierMetadata()
	{
		return resourceIdentifier;
	}

	public void setResourceIdentifier(ParsedURL resourceIdentifier)
	{
		if (resourceIdentifier != null)
			this.resourceIdentifier().setValue(resourceIdentifier);
	}

	public void setResourceIdentifierMetadata(MetadataParsedURL resourceIdentifier)
	{
		this.resourceIdentifier = resourceIdentifier;
	}
}
