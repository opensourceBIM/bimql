package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcWindowStyle;

public class SetAttributeSubIfcWindowStyle {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcWindowStyle() {
	}

	public SetAttributeSubIfcWindowStyle(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("OperationType")) {
			//1NoEList
			 //1void
			 //1IfcWindowStyleOperationEnum
		}
		else if (attributeName.equals("ConstructionType")) {
			//1NoEList
			 //1void
			 //1IfcWindowStyleConstructionEnum
		}
		else if (attributeName.equals("Sizeable")) {
			//1NoEList
			 //1void
			 //1Tristate
		}
		else if (attributeName.equals("ParameterTakesPrecedence")) {
			//1NoEList
			 //1void
			 //1Tristate
		}
		else if (attributeName.equals("Tag")) {
			//2NoEList
			((IfcWindowStyle) object).setTag(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ApplicableOccurrence")) {
			//5NoEList
			((IfcWindowStyle) object).setApplicableOccurrence(attributeNewValue);
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
			((IfcWindowStyle) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcWindowStyle) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
