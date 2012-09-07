package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcAxis2Placement3D {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAxis2Placement3D(Object object, String string) {
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
		if (string.equals("RefDirection")) {
			resultList.add(((IfcAxis2Placement3D) object).getRefDirection());
			 //1IfcDirection
		}
		else if (string.equals("Axis")) {
			resultList.add(((IfcAxis2Placement3D) object).getAxis());
			 //1IfcDirection
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcAxis2Placement3D) object).getDim());
			 //2int
		}
		else if (string.equals("Location")) {
			resultList.add(((IfcAxis2Placement3D) object).getLocation());
			 //2IfcCartesianPoint
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcAxis2Placement3D) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcAxis2Placement3D) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcAxis2Placement3D) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcAxis2Placement3D) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
