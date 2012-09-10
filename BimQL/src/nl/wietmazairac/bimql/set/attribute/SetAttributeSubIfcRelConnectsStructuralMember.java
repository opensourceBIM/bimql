package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralMember;

public class SetAttributeSubIfcRelConnectsStructuralMember {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRelConnectsStructuralMember() {
	}

	public SetAttributeSubIfcRelConnectsStructuralMember(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("AppliedCondition")) {
			//1NoEList
			 //1void
			 //1IfcBoundaryCondition
		}
		else if (attributeName.equals("SupportedLength")) {
			//1NoEList
			((IfcRelConnectsStructuralMember) object).setSupportedLength(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RelatedStructuralConnection")) {
			//1NoEList
			 //1void
			 //1IfcStructuralConnection
		}
		else if (attributeName.equals("RelatingStructuralMember")) {
			//1NoEList
			 //1void
			 //1IfcStructuralMember
		}
		else if (attributeName.equals("AdditionalConditions")) {
			//1NoEList
			 //1void
			 //1IfcStructuralConnectionCondition
		}
		else if (attributeName.equals("SupportedLengthAsString")) {
			//1NoEList
			((IfcRelConnectsStructuralMember) object).setSupportedLengthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ConditionCoordinateSystem")) {
			//1NoEList
			 //1void
			 //1IfcAxis2Placement3D
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcRelConnectsStructuralMember) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcRelConnectsStructuralMember) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
