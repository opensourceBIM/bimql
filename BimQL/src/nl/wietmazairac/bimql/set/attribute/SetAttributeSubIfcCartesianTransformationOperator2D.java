package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcCartesianTransformationOperator2D {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcCartesianTransformationOperator2D() {
	}

	public SetAttributeSubIfcCartesianTransformationOperator2D(Object object, String attributeName, String attributeNewValue) {
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
			((IfcCartesianTransformationOperator2D) object).setScaleAsString(attributeNewValue);
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
			((IfcCartesianTransformationOperator2D) object).setScale(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else {
		}
	}
}
