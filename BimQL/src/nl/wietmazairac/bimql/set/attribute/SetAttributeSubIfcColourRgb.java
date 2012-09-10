package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcColourRgb;

public class SetAttributeSubIfcColourRgb {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcColourRgb() {
	}

	public SetAttributeSubIfcColourRgb(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("RedAsString")) {
			//1NoEList
			((IfcColourRgb) object).setRedAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("GreenAsString")) {
			//1NoEList
			((IfcColourRgb) object).setGreenAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BlueAsString")) {
			//1NoEList
			((IfcColourRgb) object).setBlueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Red")) {
			//1NoEList
			((IfcColourRgb) object).setRed(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Green")) {
			//1NoEList
			((IfcColourRgb) object).setGreen(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Blue")) {
			//1NoEList
			((IfcColourRgb) object).setBlue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
