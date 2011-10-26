//
// Publication.cs
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
using ecologylab.semantics.generated.library.creativeWork;
using ecologylab.semantics.generated.library.publication;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.publication 
{
	/// <summary>
	/// A publication.
	/// </summary>
	[SimplInherit]
	public class Publication : BasicPublication
	{
		[SimplScalar]
		private MetadataString pages;

		[SimplCollection("subject")]
		[MmName("subjects")]
		private List<Subject> subjects;

		[SimplScalar]
		private MetadataString aboutTheAuthors;

		[SimplCollection("term_type")]
		[MmName("common_terms")]
		private List<TermType> commonTerms;

		public Publication()
		{ }

		public MetadataString Pages
		{
			get{return pages;}
			set{pages = value;}
		}

		public List<Subject> Subjects
		{
			get{return subjects;}
			set{subjects = value;}
		}

		public MetadataString AboutTheAuthors
		{
			get{return aboutTheAuthors;}
			set{aboutTheAuthors = value;}
		}

		public List<TermType> CommonTerms
		{
			get{return commonTerms;}
			set{commonTerms = value;}
		}
	}
}
