package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcCartesianTransformationOperator3D;

public class SetAttributeSubIfcCartesianTransformationOperator3D {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcCartesianTransformationOperator3D() {
	}

	public SetAttributeSubIfcCartesianTransformationOperator3D(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Axis3")) {
			//1NoEList
			 //1void
			 //1IfcDirection
		}
		else if (attributeName.equals("Dim")) {
			//2NoEList
			 //2void
			 //2int
		}
		else if (attributeName.equals("Axis1")) {
			//2NoEList
			 //2void
			 //2IfcDirection
		}
		else if (attributeName.equals("LocalOrigin")) {
			//2NoEList
			 //2void
			 //2IfcCartesianPoint
		}
		else if (attributeName.equals("ScaleAsString")) {
			//2NoEList
			((IfcCartesianTransformationOperator3D) object).setScaleAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Axis2")) {
			//2NoEList
			 //2void
			 //2IfcDirection
		}
		else if (attributeName.equals("Scale")) {
			//2NoEList
			((IfcCartesianTransformationOperator3D) object).setScale(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else {
		}
	}
}
