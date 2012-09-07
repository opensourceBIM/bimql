package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcCsgPrimitive3D {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCsgPrimitive3D(Object object, String string) {
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
			resultList.add(((IfcCsgPrimitive3D) object).getDim());
			 //1int
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcCsgPrimitive3D) object).getPosition());
			 //1IfcAxis2Placement3D
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcCsgPrimitive3D) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcCsgPrimitive3D) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCsgPrimitive3D) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcCsgPrimitive3D) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
