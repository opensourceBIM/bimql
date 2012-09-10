package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcStructuralResultGroup;

public class SetAttributeSubIfcStructuralResultGroup {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralResultGroup() {
	}

	public SetAttributeSubIfcStructuralResultGroup(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("IsLinear")) {
			//1NoEList
			 //1void
			 //1Tristate
		}
		else if (attributeName.equals("TheoryType")) {
			//1NoEList
			 //1void
			 //1IfcAnalysisTheoryTypeEnum
		}
		else if (attributeName.equals("ResultForLoadGroup")) {
			//1NoEList
			 //1void
			 //1IfcStructuralLoadGroup
		}
		else if (attributeName.equals("IsGroupedBy")) {
			//2NoEList
			 //2void
			 //2IfcRelAssignsToGroup
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcStructuralResultGroup) object).setObjectType(attributeNewValue);
			 //5void
			 //5String
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
			((IfcStructuralResultGroup) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcStructuralResultGroup) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
