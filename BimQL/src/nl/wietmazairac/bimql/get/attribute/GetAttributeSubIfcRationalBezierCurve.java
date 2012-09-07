package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRationalBezierCurve {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRationalBezierCurve(Object object, String string) {
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
		if (string.equals("WeightsData")) {
			//3xxx
			for (int i = 0; i < ((IfcRationalBezierCurve) object).getWeightsData().size(); i++) {
				resultList.add(((IfcRationalBezierCurve) object).getWeightsData().get(i));
			}
			 //1EList
		}
		else if (string.equals("WeightsDataAsString")) {
			//3xxx
			for (int i = 0; i < ((IfcRationalBezierCurve) object).getWeightsDataAsString().size(); i++) {
				resultList.add(((IfcRationalBezierCurve) object).getWeightsDataAsString().get(i));
			}
			 //1EList
		}
		else if (string.equals("Degree")) {
			resultList.add(((IfcRationalBezierCurve) object).getDegree());
			 //3int
		}
		else if (string.equals("CurveForm")) {
			resultList.add(((IfcRationalBezierCurve) object).getCurveForm());
			 //3IfcBSplineCurveForm
		}
		else if (string.equals("ControlPointsList")) {
			//3xxx
			for (int i = 0; i < ((IfcRationalBezierCurve) object).getControlPointsList().size(); i++) {
				resultList.add(((IfcRationalBezierCurve) object).getControlPointsList().get(i));
			}
			 //3EList
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcRationalBezierCurve) object).getDim());
			 //3int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcRationalBezierCurve) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcRationalBezierCurve) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcRationalBezierCurve) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcRationalBezierCurve) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
