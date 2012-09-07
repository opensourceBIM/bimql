package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcCompositeCurveSegment {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCompositeCurveSegment(Object object, String string) {
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
			resultList.add(((IfcCompositeCurveSegment) object).getDim());
			 //1int
		}
		else if (string.equals("SameSense")) {
			resultList.add(((IfcCompositeCurveSegment) object).getSameSense());
			 //1Tristate
		}
		else if (string.equals("Transition")) {
			resultList.add(((IfcCompositeCurveSegment) object).getTransition());
			 //1IfcTransitionCode
		}
		else if (string.equals("ParentCurve")) {
			resultList.add(((IfcCompositeCurveSegment) object).getParentCurve());
			 //1IfcCurve
		}
		else if (string.equals("UsingCurves")) {
			//3xxx
			for (int i = 0; i < ((IfcCompositeCurveSegment) object).getUsingCurves().size(); i++) {
				resultList.add(((IfcCompositeCurveSegment) object).getUsingCurves().get(i));
			}
			 //1EList
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcCompositeCurveSegment) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcCompositeCurveSegment) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCompositeCurveSegment) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcCompositeCurveSegment) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
