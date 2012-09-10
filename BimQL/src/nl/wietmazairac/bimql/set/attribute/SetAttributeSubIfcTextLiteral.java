package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcTextLiteral;

public class SetAttributeSubIfcTextLiteral {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcTextLiteral() {
	}

	public SetAttributeSubIfcTextLiteral(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Placement")) {
			//1NoEList
			 //1void
			 //1IfcAxis2Placement
		}
		else if (attributeName.equals("Literal")) {
			//1NoEList
			((IfcTextLiteral) object).setLiteral(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Path")) {
			//1NoEList
			 //1void
			 //1IfcTextPath
		}
	}
}
