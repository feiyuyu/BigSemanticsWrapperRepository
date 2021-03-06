//
// Book.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.CreativeWorkNS;
using Ecologylab.Semantics.Generated.Library.PublicationNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.PublicationNS 
{
	[SimplInherit]
	public class Book : Publication
	{
		[SimplCollection("author")]
		[MmName("editors")]
		private List<Author> editors;

		[SimplScalar]
		private MetadataString edition;

		[SimplCollection("publication")]
		[MmName("table_of_contents")]
		private List<Publication> tableOfContents;

		[SimplScalar]
		private MetadataParsedURL coverImage;

		public Book()
		{ }

		public Book(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Author> Editors
		{
			get{return editors;}
			set
			{
				if (this.editors != value)
				{
					this.editors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Edition
		{
			get{return edition;}
			set
			{
				if (this.edition != value)
				{
					this.edition = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Publication> TableOfContents
		{
			get{return tableOfContents;}
			set
			{
				if (this.tableOfContents != value)
				{
					this.tableOfContents = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL CoverImage
		{
			get{return coverImage;}
			set
			{
				if (this.coverImage != value)
				{
					this.coverImage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
