package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.models.ifc2x3tc1.IfcBSplineCurve;
import org.eclipse.emf.ecore.EObject;

public class GetAttributeSubIfcBSplineCurve {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBSplineCurve(Object object, String string) {
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

	public List<Object> getResult() {
	List<Object> resultList = new ArrayList<Object>();
		if (string.equals("Degree")) {
			resultList.add(((IfcBSplineCurve) object).getDegree());
			 //1int
		}
		else if (string.equals("CurveForm")) {
			resultList.add(((IfcBSplineCurve) object).getCurveForm());
			 //1IfcBSplineCurveForm
		}
		else if (string.equals("ControlPointsList")) {
			//3xxx
			for (int i = 0; i < ((IfcBSplineCurve) object).getControlPointsList().size(); i++) {
				resultList.add(((IfcBSplineCurve) object).getControlPointsList().get(i));
			}
			 //1EList
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcBSplineCurve) object).getDim());
			 //3int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcBSplineCurve) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcBSplineCurve) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBSplineCurve) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcBSplineCurve) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
