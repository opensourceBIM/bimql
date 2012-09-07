package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcPointOnCurve {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPointOnCurve(Object object, String string) {
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
			resultList.add(((IfcPointOnCurve) object).getDim());
			 //1int
		}
		else if (string.equals("BasisCurve")) {
			resultList.add(((IfcPointOnCurve) object).getBasisCurve());
			 //1IfcCurve
		}
		else if (string.equals("PointParameterAsString")) {
			resultList.add(((IfcPointOnCurve) object).getPointParameterAsString());
			 //1String
		}
		else if (string.equals("PointParameter")) {
			resultList.add(((IfcPointOnCurve) object).getPointParameter());
			 //1double
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcPointOnCurve) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcPointOnCurve) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcPointOnCurve) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcPointOnCurve) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
