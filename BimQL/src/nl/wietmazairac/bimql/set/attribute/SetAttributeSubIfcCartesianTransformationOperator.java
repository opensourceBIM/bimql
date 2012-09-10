package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcCartesianTransformationOperator;

public class SetAttributeSubIfcCartesianTransformationOperator {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcCartesianTransformationOperator() {
	}

	public SetAttributeSubIfcCartesianTransformationOperator(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Dim")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("Axis1")) {
			//1NoEList
			 //1void
			 //1IfcDirection
		}
		else if (attributeName.equals("LocalOrigin")) {
			//1NoEList
			 //1void
			 //1IfcCartesianPoint
		}
		else if (attributeName.equals("ScaleAsString")) {
			//1NoEList
			((IfcCartesianTransformationOperator) object).setScaleAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Axis2")) {
			//1NoEList
			 //1void
			 //1IfcDirection
		}
		else if (attributeName.equals("Scale")) {
			//1NoEList
			((IfcCartesianTransformationOperator) object).setScale(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
