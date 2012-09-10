package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcPostalAddress;

public class SetAttributeSubIfcPostalAddress {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcPostalAddress() {
	}

	public SetAttributeSubIfcPostalAddress(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("PostalBox")) {
			//1NoEList
			((IfcPostalAddress) object).setPostalBox(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Town")) {
			//1NoEList
			((IfcPostalAddress) object).setTown(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Region")) {
			//1NoEList
			((IfcPostalAddress) object).setRegion(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Country")) {
			//1NoEList
			((IfcPostalAddress) object).setCountry(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("InternalLocation")) {
			//1NoEList
			((IfcPostalAddress) object).setInternalLocation(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PostalCode")) {
			//1NoEList
			((IfcPostalAddress) object).setPostalCode(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
