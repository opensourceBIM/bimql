package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcPlanarExtent;

public class SetAttributeSubIfcPlanarExtent {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcPlanarExtent() {
	}

	public SetAttributeSubIfcPlanarExtent(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("SizeInX")) {
			//1NoEList
			((IfcPlanarExtent) object).setSizeInX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SizeInY")) {
			//1NoEList
			((IfcPlanarExtent) object).setSizeInY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SizeInXAsString")) {
			//1NoEList
			((IfcPlanarExtent) object).setSizeInXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("SizeInYAsString")) {
			//1NoEList
			((IfcPlanarExtent) object).setSizeInYAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
