//
// FlickrGroups.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 10/26/11.
// Copyright 2011 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.flickr;
using ecologylab.semantics.generated.library.search;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.flickr 
{
	/// <summary>
	/// Searching from a photo for nearby photos
	/// </summary>
	[SimplInherit]
	public class FlickrGroups : Search
	{
		[SimplCollection("flickr_tag")]
		[MmName("flickr_tags")]
		private List<FlickrTag> flickrTags;

		public FlickrGroups()
		{ }

		public List<FlickrTag> FlickrTags
		{
			get{return flickrTags;}
			set{flickrTags = value;}
		}
	}
}
