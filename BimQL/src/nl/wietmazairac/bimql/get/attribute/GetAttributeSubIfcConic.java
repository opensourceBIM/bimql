package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcConic {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcConic(Object object, String string) {
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
		if (string.equals("Position")) {
			resultList.add(((IfcConic) object).getPosition());
			 //1IfcAxis2Placement
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcConic) object).getDim());
			 //2int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcConic) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcConic) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcConic) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcConic) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
