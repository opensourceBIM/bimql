package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcOffsetCurve2D {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcOffsetCurve2D(Object object, String string) {
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
		if (string.equals("BasisCurve")) {
			resultList.add(((IfcOffsetCurve2D) object).getBasisCurve());
			 //1IfcCurve
		}
		else if (string.equals("DistanceAsString")) {
			resultList.add(((IfcOffsetCurve2D) object).getDistanceAsString());
			 //1String
		}
		else if (string.equals("Distance")) {
			resultList.add(((IfcOffsetCurve2D) object).getDistance());
			 //1double
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcOffsetCurve2D) object).getDim());
			 //2int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcOffsetCurve2D) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcOffsetCurve2D) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcOffsetCurve2D) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcOffsetCurve2D) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
