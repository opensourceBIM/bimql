package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.store.IfcEngine;


public class SetAttributeSubIfcEngine {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcEngine() {
	}

	public SetAttributeSubIfcEngine(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ClassName")) {
			//1NoEList
			((IfcEngine) object).setClassName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Settings")) {
			//1NoEList
			 //1void
			 //1Settings
		}
		else if (attributeName.equals("Name")) {
			//1NoEList
			((IfcEngine) object).setName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Enabled")) {
			//1NoEList
			((IfcEngine) object).setEnabled(Boolean.parseBoolean(attributeNewValue));
			 //1void
			 //1boolean
		}
		else if (attributeName.equals("Active")) {
			//1NoEList
			((IfcEngine) object).setActive(Boolean.parseBoolean(attributeNewValue));
			 //1void
			 //1boolean
		}
	}
}
