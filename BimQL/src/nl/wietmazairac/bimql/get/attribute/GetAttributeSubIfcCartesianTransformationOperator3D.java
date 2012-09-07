package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcCartesianTransformationOperator3D {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCartesianTransformationOperator3D(Object object, String string) {
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
		if (string.equals("Axis3")) {
			resultList.add(((IfcCartesianTransformationOperator3D) object).getAxis3());
			 //1IfcDirection
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcCartesianTransformationOperator3D) object).getDim());
			 //2int
		}
		else if (string.equals("Axis1")) {
			resultList.add(((IfcCartesianTransformationOperator3D) object).getAxis1());
			 //2IfcDirection
		}
		else if (string.equals("Axis2")) {
			resultList.add(((IfcCartesianTransformationOperator3D) object).getAxis2());
			 //2IfcDirection
		}
		else if (string.equals("Scale")) {
			resultList.add(((IfcCartesianTransformationOperator3D) object).getScale());
			 //2double
		}
		else if (string.equals("LocalOrigin")) {
			resultList.add(((IfcCartesianTransformationOperator3D) object).getLocalOrigin());
			 //2IfcCartesianPoint
		}
		else if (string.equals("ScaleAsString")) {
			resultList.add(((IfcCartesianTransformationOperator3D) object).getScaleAsString());
			 //2String
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcCartesianTransformationOperator3D) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcCartesianTransformationOperator3D) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCartesianTransformationOperator3D) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcCartesianTransformationOperator3D) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
