package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcTask;

public class SetAttributeSubIfcTask {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcTask() {
	}

	public SetAttributeSubIfcTask(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("WorkMethod")) {
			//1NoEList
			((IfcTask) object).setWorkMethod(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("IsMilestone")) {
			//1NoEList
			 //1void
			 //1Tristate
		}
		else if (attributeName.equals("TaskId")) {
			//1NoEList
			((IfcTask) object).setTaskId(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Priority")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("Status")) {
			//1NoEList
			((IfcTask) object).setStatus(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcTask) object).setObjectType(attributeNewValue);
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
			((IfcTask) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcTask) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
