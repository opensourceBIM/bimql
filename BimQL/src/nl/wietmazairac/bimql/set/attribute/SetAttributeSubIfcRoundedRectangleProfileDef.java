package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcRoundedRectangleProfileDef;

public class SetAttributeSubIfcRoundedRectangleProfileDef {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRoundedRectangleProfileDef() {
	}

	public SetAttributeSubIfcRoundedRectangleProfileDef(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("RoundingRadiusAsString")) {
			//1NoEList
			((IfcRoundedRectangleProfileDef) object).setRoundingRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RoundingRadius")) {
			//1NoEList
			((IfcRoundedRectangleProfileDef) object).setRoundingRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("XDimAsString")) {
			//2NoEList
			((IfcRoundedRectangleProfileDef) object).setXDimAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("YDimAsString")) {
			//2NoEList
			((IfcRoundedRectangleProfileDef) object).setYDimAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("XDim")) {
			//2NoEList
			((IfcRoundedRectangleProfileDef) object).setXDim(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("YDim")) {
			//2NoEList
			((IfcRoundedRectangleProfileDef) object).setYDim(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("Position")) {
			//5NoEList
			 //5void
			 //5IfcAxis2Placement2D
		}
		else if (attributeName.equals("ProfileName")) {
			//5NoEList
			((IfcRoundedRectangleProfileDef) object).setProfileName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("ProfileType")) {
			//5NoEList
			 //5void
			 //5IfcProfileTypeEnum
		}
		else {
		}
	}
}
