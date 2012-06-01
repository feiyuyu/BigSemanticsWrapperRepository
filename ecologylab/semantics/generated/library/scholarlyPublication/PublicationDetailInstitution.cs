//
// PublicationDetailInstitution.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.scholarlyPublication 
{
	[SimplInherit]
	public class PublicationDetailInstitution : Metadata
	{
		[SimplScalar]
		private MetadataString publicationYears;

		[SimplScalar]
		private MetadataInteger publicationCount;

		[SimplScalar]
		private MetadataInteger citationCount;

		[SimplScalar]
		private MetadataInteger sixWeekDownloadCount;

		[SimplScalar]
		private MetadataInteger yearDownloadCount;

		[SimplScalar]
		private MetadataInteger downloadCount;

		[SimplScalar]
		private MetadataFloat downloadsPerArticle;

		[SimplScalar]
		private MetadataFloat citationsPerArticle;

		public PublicationDetailInstitution()
		{ }

		public PublicationDetailInstitution(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString PublicationYears
		{
			get{return publicationYears;}
			set
			{
				if (this.publicationYears != value)
				{
					this.publicationYears = value;
					this.RaisePropertyChanged( () => this.PublicationYears );
				}
			}
		}

		public MetadataInteger PublicationCount
		{
			get{return publicationCount;}
			set
			{
				if (this.publicationCount != value)
				{
					this.publicationCount = value;
					this.RaisePropertyChanged( () => this.PublicationCount );
				}
			}
		}

		public MetadataInteger CitationCount
		{
			get{return citationCount;}
			set
			{
				if (this.citationCount != value)
				{
					this.citationCount = value;
					this.RaisePropertyChanged( () => this.CitationCount );
				}
			}
		}

		public MetadataInteger SixWeekDownloadCount
		{
			get{return sixWeekDownloadCount;}
			set
			{
				if (this.sixWeekDownloadCount != value)
				{
					this.sixWeekDownloadCount = value;
					this.RaisePropertyChanged( () => this.SixWeekDownloadCount );
				}
			}
		}

		public MetadataInteger YearDownloadCount
		{
			get{return yearDownloadCount;}
			set
			{
				if (this.yearDownloadCount != value)
				{
					this.yearDownloadCount = value;
					this.RaisePropertyChanged( () => this.YearDownloadCount );
				}
			}
		}

		public MetadataInteger DownloadCount
		{
			get{return downloadCount;}
			set
			{
				if (this.downloadCount != value)
				{
					this.downloadCount = value;
					this.RaisePropertyChanged( () => this.DownloadCount );
				}
			}
		}

		public MetadataFloat DownloadsPerArticle
		{
			get{return downloadsPerArticle;}
			set
			{
				if (this.downloadsPerArticle != value)
				{
					this.downloadsPerArticle = value;
					this.RaisePropertyChanged( () => this.DownloadsPerArticle );
				}
			}
		}

		public MetadataFloat CitationsPerArticle
		{
			get{return citationsPerArticle;}
			set
			{
				if (this.citationsPerArticle != value)
				{
					this.citationsPerArticle = value;
					this.RaisePropertyChanged( () => this.CitationsPerArticle );
				}
			}
		}
	}
}
