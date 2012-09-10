package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadGroup;

public class SetAttributeSubIfcStructuralLoadGroup {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralLoadGroup() {
	}

	public SetAttributeSubIfcStructuralLoadGroup(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ActionType")) {
			//1NoEList
			 //1void
			 //1IfcActionTypeEnum
		}
		else if (attributeName.equals("ActionSource")) {
			//1NoEList
			 //1void
			 //1IfcActionSourceTypeEnum
		}
		else if (attributeName.equals("Coefficient")) {
			//1NoEList
			((IfcStructuralLoadGroup) object).setCoefficient(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CoefficientAsString")) {
			//1NoEList
			((IfcStructuralLoadGroup) object).setCoefficientAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Purpose")) {
			//1NoEList
			((IfcStructuralLoadGroup) object).setPurpose(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PredefinedType")) {
			//1NoEList
			 //1void
			 //1IfcLoadGroupTypeEnum
		}
		else if (attributeName.equals("IsGroupedBy")) {
			//2NoEList
			 //2void
			 //2IfcRelAssignsToGroup
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcStructuralLoadGroup) object).setObjectType(attributeNewValue);
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
			((IfcStructuralLoadGroup) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcStructuralLoadGroup) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
