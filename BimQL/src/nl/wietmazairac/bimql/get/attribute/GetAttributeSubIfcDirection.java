package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcDirection {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDirection(Object object, String string) {
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
			resultList.add(((IfcDirection) object).getDim());
			 //1int
		}
		else if (string.equals("DirectionRatios")) {
			//3xxx
			for (int i = 0; i < ((IfcDirection) object).getDirectionRatios().size(); i++) {
				resultList.add(((IfcDirection) object).getDirectionRatios().get(i));
			}
			 //1EList
		}
		else if (string.equals("DirectionRatiosAsString")) {
			//3xxx
			for (int i = 0; i < ((IfcDirection) object).getDirectionRatiosAsString().size(); i++) {
				resultList.add(((IfcDirection) object).getDirectionRatiosAsString().get(i));
			}
			 //1EList
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcDirection) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcDirection) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDirection) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcDirection) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
