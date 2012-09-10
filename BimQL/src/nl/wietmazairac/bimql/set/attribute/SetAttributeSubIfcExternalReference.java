package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcExternalReference;

public class SetAttributeSubIfcExternalReference {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcExternalReference() {
	}

	public SetAttributeSubIfcExternalReference(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ItemReference")) {
			//1NoEList
			((IfcExternalReference) object).setItemReference(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Name")) {
			//1NoEList
			((IfcExternalReference) object).setName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Location")) {
			//1NoEList
			((IfcExternalReference) object).setLocation(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
