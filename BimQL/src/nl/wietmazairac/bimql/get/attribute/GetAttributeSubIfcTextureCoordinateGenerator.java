package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcTextureCoordinateGenerator {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTextureCoordinateGenerator(Object object, String string) {
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
		if (string.equals("Mode")) {
			resultList.add(((IfcTextureCoordinateGenerator) object).getMode());
			 //1String
		}
		else if (string.equals("Parameter")) {
			//3xxx
			for (int i = 0; i < ((IfcTextureCoordinateGenerator) object).getParameter().size(); i++) {
				resultList.add(((IfcTextureCoordinateGenerator) object).getParameter().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
