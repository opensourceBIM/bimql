package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralMember;

public class GetAttributeSubIfcRelConnectsStructuralMember {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelConnectsStructuralMember(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("RelatingStructuralMember")) {
			resultList.add(((IfcRelConnectsStructuralMember) object).getRelatingStructuralMember());
			 //1IfcStructuralMember
		}
		else if (string.equals("AdditionalConditions")) {
			resultList.add(((IfcRelConnectsStructuralMember) object).getAdditionalConditions());
			 //1IfcStructuralConnectionCondition
		}
		else if (string.equals("SupportedLengthAsString")) {
			resultList.add(((IfcRelConnectsStructuralMember) object).getSupportedLengthAsString());
			 //1String
		}
		else if (string.equals("ConditionCoordinateSystem")) {
			resultList.add(((IfcRelConnectsStructuralMember) object).getConditionCoordinateSystem());
			 //1IfcAxis2Placement3D
		}
		else if (string.equals("RelatedStructuralConnection")) {
			resultList.add(((IfcRelConnectsStructuralMember) object).getRelatedStructuralConnection());
			 //1IfcStructuralConnection
		}
		else if (string.equals("AppliedCondition")) {
			resultList.add(((IfcRelConnectsStructuralMember) object).getAppliedCondition());
			 //1IfcBoundaryCondition
		}
		else if (string.equals("SupportedLength")) {
			resultList.add(((IfcRelConnectsStructuralMember) object).getSupportedLength());
			 //1double
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelConnectsStructuralMember) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelConnectsStructuralMember) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelConnectsStructuralMember) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelConnectsStructuralMember) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelConnectsStructuralMember) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
