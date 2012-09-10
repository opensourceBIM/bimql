package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcApplication;

public class SetAttributeSubIfcApplication {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcApplication() {
	}

	public SetAttributeSubIfcApplication(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Version")) {
			//1NoEList
			((IfcApplication) object).setVersion(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ApplicationDeveloper")) {
			//1NoEList
			 //1void
			 //1IfcOrganization
		}
		else if (attributeName.equals("ApplicationFullName")) {
			//1NoEList
			((IfcApplication) object).setApplicationFullName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ApplicationIdentifier")) {
			//1NoEList
			((IfcApplication) object).setApplicationIdentifier(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
