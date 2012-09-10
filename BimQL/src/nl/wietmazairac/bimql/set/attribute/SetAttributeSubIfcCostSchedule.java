package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcCostSchedule;

public class SetAttributeSubIfcCostSchedule {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcCostSchedule() {
	}

	public SetAttributeSubIfcCostSchedule(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("SubmittedBy")) {
			//1NoEList
			 //1void
			 //1IfcActorSelect
		}
		else if (attributeName.equals("PreparedBy")) {
			//1NoEList
			 //1void
			 //1IfcActorSelect
		}
		else if (attributeName.equals("SubmittedOn")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("UpdateDate")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("PredefinedType")) {
			//1NoEList
			 //1void
			 //1IfcCostScheduleTypeEnum
		}
		else if (attributeName.equals("Status")) {
			//1NoEList
			((IfcCostSchedule) object).setStatus(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ID")) {
			//1NoEList
			((IfcCostSchedule) object).setID(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcCostSchedule) object).setObjectType(attributeNewValue);
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
			((IfcCostSchedule) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcCostSchedule) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
