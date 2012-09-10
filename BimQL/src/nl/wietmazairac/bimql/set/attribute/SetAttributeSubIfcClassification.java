package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcClassification;

public class SetAttributeSubIfcClassification {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcClassification() {
	}

	public SetAttributeSubIfcClassification(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("EditionDate")) {
			//1NoEList
			 //1void
			 //1IfcCalendarDate
		}
		else if (attributeName.equals("Edition")) {
			//1NoEList
			((IfcClassification) object).setEdition(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Name")) {
			//1NoEList
			((IfcClassification) object).setName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Source")) {
			//1NoEList
			((IfcClassification) object).setSource(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
