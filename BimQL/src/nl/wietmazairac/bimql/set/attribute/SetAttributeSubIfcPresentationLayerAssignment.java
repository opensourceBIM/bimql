package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcPresentationLayerAssignment;

public class SetAttributeSubIfcPresentationLayerAssignment {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcPresentationLayerAssignment() {
	}

	public SetAttributeSubIfcPresentationLayerAssignment(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Name")) {
			//1NoEList
			((IfcPresentationLayerAssignment) object).setName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Description")) {
			//1NoEList
			((IfcPresentationLayerAssignment) object).setDescription(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Identifier")) {
			//1NoEList
			((IfcPresentationLayerAssignment) object).setIdentifier(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
