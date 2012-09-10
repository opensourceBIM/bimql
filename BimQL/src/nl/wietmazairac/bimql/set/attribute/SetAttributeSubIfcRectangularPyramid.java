package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcRectangularPyramid;

public class SetAttributeSubIfcRectangularPyramid {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRectangularPyramid() {
	}

	public SetAttributeSubIfcRectangularPyramid(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("XLengthAsString")) {
			//1NoEList
			((IfcRectangularPyramid) object).setXLengthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("YLengthAsString")) {
			//1NoEList
			((IfcRectangularPyramid) object).setYLengthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Height")) {
			//1NoEList
			((IfcRectangularPyramid) object).setHeight(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("HeightAsString")) {
			//1NoEList
			((IfcRectangularPyramid) object).setHeightAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("XLength")) {
			//1NoEList
			((IfcRectangularPyramid) object).setXLength(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("YLength")) {
			//1NoEList
			((IfcRectangularPyramid) object).setYLength(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Dim")) {
			//2NoEList
			 //2void
			 //2int
		}
		else if (attributeName.equals("Position")) {
			//2NoEList
			 //2void
			 //2IfcAxis2Placement3D
		}
		else {
		}
	}
}
