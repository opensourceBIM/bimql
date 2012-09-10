package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcProductRepresentation;

public class GetAttributeSubIfcProductRepresentation {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProductRepresentation(Object object, String string) {
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
		if (string.equals("Representations")) {
			//3xxx
			for (int i = 0; i < ((IfcProductRepresentation) object).getRepresentations().size(); i++) {
				resultList.add(((IfcProductRepresentation) object).getRepresentations().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcProductRepresentation) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcProductRepresentation) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
