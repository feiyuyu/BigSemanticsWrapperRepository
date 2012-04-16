package ecologylab.semantics.generated.library.nsf;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.nsf.GrantStaff;
import ecologylab.semantics.generated.library.nsf.NsfDivisionStaffList;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class NsfStaff extends GrantStaff
{
	@simpl_scalar
	private MetadataString room;

	@simpl_scalar
	private MetadataString affiliation;

	@simpl_composite
	@mm_name("division_staffs")
	private NsfDivisionStaffList divisionStaffs;

	public NsfStaff()
	{ super(); }

	public NsfStaff(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	room()
	{
		MetadataString	result = this.room;
		if (result == null)
		{
			result = new MetadataString();
			this.room = result;
		}
		return result;
	}

	public String getRoom()
	{
		return this.room == null ? null : room().getValue();
	}

	public MetadataString getRoomMetadata()
	{
		return room;
	}

	public void setRoom(String room)
	{
		if (room != null)
			this.room().setValue(room);
	}

	public void setRoomMetadata(MetadataString room)
	{
		this.room = room;
	}

	public MetadataString	affiliation()
	{
		MetadataString	result = this.affiliation;
		if (result == null)
		{
			result = new MetadataString();
			this.affiliation = result;
		}
		return result;
	}

	public String getAffiliation()
	{
		return this.affiliation == null ? null : affiliation().getValue();
	}

	public MetadataString getAffiliationMetadata()
	{
		return affiliation;
	}

	public void setAffiliation(String affiliation)
	{
		if (affiliation != null)
			this.affiliation().setValue(affiliation);
	}

	public void setAffiliationMetadata(MetadataString affiliation)
	{
		this.affiliation = affiliation;
	}

	public NsfDivisionStaffList getDivisionStaffs()
	{
		return divisionStaffs;
	}

	public void setDivisionStaffs(NsfDivisionStaffList divisionStaffs)
	{
		this.divisionStaffs = divisionStaffs;
	}
}
