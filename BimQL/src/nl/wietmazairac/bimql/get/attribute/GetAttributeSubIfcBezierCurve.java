package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcBezierCurve {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBezierCurve(Object object, String string) {
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
		if (string.equals("Degree")) {
			resultList.add(((IfcBezierCurve) object).getDegree());
			 //2int
		}
		else if (string.equals("CurveForm")) {
			resultList.add(((IfcBezierCurve) object).getCurveForm());
			 //2IfcBSplineCurveForm
		}
		else if (string.equals("ControlPointsList")) {
			//3xxx
			for (int i = 0; i < ((IfcBezierCurve) object).getControlPointsList().size(); i++) {
				resultList.add(((IfcBezierCurve) object).getControlPointsList().get(i));
			}
			 //2EList
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcBezierCurve) object).getDim());
			 //3int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcBezierCurve) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcBezierCurve) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBezierCurve) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcBezierCurve) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
