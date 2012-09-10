package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcProject;

public class SetAttributeSubIfcProject {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcProject() {
	}

	public SetAttributeSubIfcProject(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Phase")) {
			//1NoEList
			((IfcProject) object).setPhase(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("UnitsInContext")) {
			//1NoEList
			 //1void
			 //1IfcUnitAssignment
		}
		else if (attributeName.equals("LongName")) {
			//1NoEList
			((IfcProject) object).setLongName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ObjectType")) {
			//2NoEList
			((IfcProject) object).setObjectType(attributeNewValue);
			 //2void
			 //2String
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
			((IfcProject) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcProject) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
