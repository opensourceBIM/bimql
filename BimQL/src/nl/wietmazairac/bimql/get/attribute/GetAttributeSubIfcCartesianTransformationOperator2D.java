package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcCartesianTransformationOperator2D {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCartesianTransformationOperator2D(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("Dim")) {
			resultList.add(((IfcCartesianTransformationOperator2D) object).getDim());
			 //2int
		}
		else if (string.equals("Axis1")) {
			resultList.add(((IfcCartesianTransformationOperator2D) object).getAxis1());
			 //2IfcDirection
		}
		else if (string.equals("Axis2")) {
			resultList.add(((IfcCartesianTransformationOperator2D) object).getAxis2());
			 //2IfcDirection
		}
		else if (string.equals("Scale")) {
			resultList.add(((IfcCartesianTransformationOperator2D) object).getScale());
			 //2double
		}
		else if (string.equals("LocalOrigin")) {
			resultList.add(((IfcCartesianTransformationOperator2D) object).getLocalOrigin());
			 //2IfcCartesianPoint
		}
		else if (string.equals("ScaleAsString")) {
			resultList.add(((IfcCartesianTransformationOperator2D) object).getScaleAsString());
			 //2String
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcCartesianTransformationOperator2D) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcCartesianTransformationOperator2D) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCartesianTransformationOperator2D) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcCartesianTransformationOperator2D) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
