package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcProfileProperties;

public class SetAttributeSubIfcProfileProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcProfileProperties() {
	}

	public SetAttributeSubIfcProfileProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ProfileDefinition")) {
			//1NoEList
			 //1void
			 //1IfcProfileDef
		}
		else if (attributeName.equals("ProfileName")) {
			//1NoEList
			((IfcProfileProperties) object).setProfileName(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
