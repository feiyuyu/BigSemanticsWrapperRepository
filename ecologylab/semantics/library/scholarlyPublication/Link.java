package ecologylab.semantics.library.scholarlyPublication;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.Hint;
import ecologylab.xml.simpl_inherit;

@simpl_inherit

public class Link extends Metadata{


/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	heading;

/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataParsedURL	link;

/**
	Constructor
**/ 

public Link()
{
 super();
}

/**
	Constructor
**/ 

public Link(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for heading
**/ 

public MetadataString	heading()
{
MetadataString	result	=this.heading;
if(result == null)
{
result = new MetadataString();
this.heading	=	 result;
}
return result;
}

/**
	Gets the value of the field heading
**/ 

public String getHeading(){
return heading().getValue();
}

/**
	Sets the value of the field heading
**/ 

public void setHeading( String heading )
{
this.heading().setValue(heading);
}

/**
	The heavy weight setter method for field heading
**/ 

public void hwSetHeading( String heading )
{
this.heading().setValue(heading);
rebuildCompositeTermVector();
 }
/**
	 Sets the heading directly
**/ 

public void setHeadingMetadata(MetadataString heading)
{	this.heading = heading;
}
/**
	Heavy Weight Direct setter method for heading
**/ 

public void hwSetHeadingMetadata(MetadataString heading)
{	 if(this.heading!=null && this.heading.getValue()!=null && hasTermVector())
		 termVector().remove(this.heading.termVector());
	 this.heading = heading;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for link
**/ 

public MetadataParsedURL	link()
{
MetadataParsedURL	result	=this.link;
if(result == null)
{
result = new MetadataParsedURL();
this.link	=	 result;
}
return result;
}

/**
	Gets the value of the field link
**/ 

public ParsedURL getLink(){
return link().getValue();
}

/**
	Sets the value of the field link
**/ 

public void setLink( ParsedURL link )
{
this.link().setValue(link);
}

/**
	The heavy weight setter method for field link
**/ 

public void hwSetLink( ParsedURL link )
{
this.link().setValue(link);
rebuildCompositeTermVector();
 }
/**
	 Sets the link directly
**/ 

public void setLinkMetadata(MetadataParsedURL link)
{	this.link = link;
}
/**
	Heavy Weight Direct setter method for link
**/ 

public void hwSetLinkMetadata(MetadataParsedURL link)
{	 if(this.link!=null && this.link.getValue()!=null && hasTermVector())
		 termVector().remove(this.link.termVector());
	 this.link = link;
	rebuildCompositeTermVector();
}}