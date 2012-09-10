package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcPropertyEnumeratedValue;

public class SetAttributeSubIfcPropertyEnumeratedValue {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcPropertyEnumeratedValue() {
	}

	public SetAttributeSubIfcPropertyEnumeratedValue(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("EnumerationReference")) {
			//1NoEList
			 //1void
			 //1IfcPropertyEnumeration
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcPropertyEnumeratedValue) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcPropertyEnumeratedValue) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
