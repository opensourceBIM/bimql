package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcFaceOuterBound {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFaceOuterBound(Object object, String string) {
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
		if (string.equals("Bound")) {
			resultList.add(((IfcFaceOuterBound) object).getBound());
			 //2IfcLoop
		}
		else if (string.equals("Orientation")) {
			resultList.add(((IfcFaceOuterBound) object).getOrientation());
			 //2Tristate
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcFaceOuterBound) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcFaceOuterBound) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFaceOuterBound) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcFaceOuterBound) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
