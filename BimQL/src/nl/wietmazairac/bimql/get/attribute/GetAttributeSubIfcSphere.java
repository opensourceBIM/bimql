package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcSphere {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSphere(Object object, String string) {
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
		if (string.equals("RadiusAsString")) {
			resultList.add(((IfcSphere) object).getRadiusAsString());
			 //1String
		}
		else if (string.equals("Radius")) {
			resultList.add(((IfcSphere) object).getRadius());
			 //1double
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcSphere) object).getDim());
			 //2int
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcSphere) object).getPosition());
			 //2IfcAxis2Placement3D
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcSphere) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcSphere) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSphere) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcSphere) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
