package ecologylab.semantics.generated.library.infocomp;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.builtins.Annotation;
import ecologylab.semantics.metadata.builtins.Clipping;
import ecologylab.semantics.metadata.scalar.MetadataFloat;

/**
*  InformationCompositionBase.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class InformationCompositionBase extends Document
{
	/** 
	 */ 
	@simpl_collection("clipping")	@simpl_scope("repository_clippings") @mm_name("clippings")	private ArrayList<Clipping> clippings;

	/** 
	 */ 
	@simpl_collection("annotation")	@simpl_classes({Annotation.class}) @mm_name("annotations")	private ArrayList<Annotation> annotations;

	/** 
	 */ 
	@simpl_collection("clippable_document")	@simpl_scope("repository_media") @mm_name("media")	private ArrayList<ClippableDocument> media;

	/** 
	 */ 
	@simpl_scalar	private MetadataFloat version;

	/** 
	 */ 
	@simpl_scalar	private MetadataFloat metadataVersion;

	/** 
	 */ 
	@simpl_scalar	private MetadataInteger width;

	/** 
	 */ 
	@simpl_scalar	private MetadataInteger height;

	public InformationCompositionBase()
	{ }

	public InformationCompositionBase(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<Clipping> getClippings()
	{
		return clippings;
	}

	public void setClippings(ArrayList<Clipping> clippings)
	{
		this.clippings = clippings;
	}

	public ArrayList<Annotation> getAnnotations()
	{
		return annotations;
	}

	public void setAnnotations(ArrayList<Annotation> annotations)
	{
		this.annotations = annotations;
	}

	public ArrayList<ClippableDocument> getMedia()
	{
		return media;
	}

	public void setMedia(ArrayList<ClippableDocument> media)
	{
		this.media = media;
	}
	public MetadataFloat	version()
	{
		MetadataFloat	result = this.version;
		if (result == null)
		{
			result = new MetadataFloat();
			this.version = result;
		}
		return result;
	}

	public float getVersion()
	{
		return this.version().getValue();
	}

	public void setVersion(float version)
	{
		this.version().setValue(version);
	}

	public MetadataFloat	metadataVersion()
	{
		MetadataFloat	result = this.metadataVersion;
		if (result == null)
		{
			result = new MetadataFloat();
			this.metadataVersion = result;
		}
		return result;
	}

	public float getMetadataVersion()
	{
		return this.metadataVersion().getValue();
	}

	public void setMetadataVersion(float metadataVersion)
	{
		this.metadataVersion().setValue(metadataVersion);
	}

	public MetadataInteger	width()
	{
		MetadataInteger	result = this.width;
		if (result == null)
		{
			result = new MetadataInteger();
			this.width = result;
		}
		return result;
	}

	public int getWidth()
	{
		return this.width().getValue();
	}

	public void setWidth(int width)
	{
		this.width().setValue(width);
	}

	public MetadataInteger	height()
	{
		MetadataInteger	result = this.height;
		if (result == null)
		{
			result = new MetadataInteger();
			this.height = result;
		}
		return result;
	}

	public int getHeight()
	{
		return this.height().getValue();
	}

	public void setHeight(int height)
	{
		this.height().setValue(height);
	}

}