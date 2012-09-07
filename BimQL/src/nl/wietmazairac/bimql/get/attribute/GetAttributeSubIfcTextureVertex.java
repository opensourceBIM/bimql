package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcTextureVertex {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTextureVertex(Object object, String string) {
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
		if (string.equals("Coordinates")) {
			//3xxx
			for (int i = 0; i < ((IfcTextureVertex) object).getCoordinates().size(); i++) {
				resultList.add(((IfcTextureVertex) object).getCoordinates().get(i));
			}
			 //1EList
		}
		else if (string.equals("CoordinatesAsString")) {
			//3xxx
			for (int i = 0; i < ((IfcTextureVertex) object).getCoordinatesAsString().size(); i++) {
				resultList.add(((IfcTextureVertex) object).getCoordinatesAsString().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
