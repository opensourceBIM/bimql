package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcVector {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcVector(Object object, String string) {
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
			resultList.add(((IfcVector) object).getDim());
			 //1int
		}
		else if (string.equals("MagnitudeAsString")) {
			resultList.add(((IfcVector) object).getMagnitudeAsString());
			 //1String
		}
		else if (string.equals("Magnitude")) {
			resultList.add(((IfcVector) object).getMagnitude());
			 //1double
		}
		else if (string.equals("Orientation")) {
			resultList.add(((IfcVector) object).getOrientation());
			 //1IfcDirection
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcVector) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcVector) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcVector) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcVector) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
