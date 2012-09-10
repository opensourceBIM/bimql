package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcAnnotationOccurrence;

public class SetAttributeSubIfcAnnotationOccurrence {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcAnnotationOccurrence() {
	}

	public SetAttributeSubIfcAnnotationOccurrence(Object object, String attributeName, String attributeNewValue) {
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
			//2NoEList
			((IfcAnnotationOccurrence) object).setName(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Item")) {
			//2NoEList
			 //2void
			 //2IfcRepresentationItem
		}
		else {
		}
	}
}
