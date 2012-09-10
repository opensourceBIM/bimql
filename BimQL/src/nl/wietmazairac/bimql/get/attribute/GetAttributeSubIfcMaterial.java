package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcMaterial;

public class GetAttributeSubIfcMaterial {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMaterial(Object object, String string) {
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
		if (string.equals("ClassifiedAs")) {
			//3xxx
			for (int i = 0; i < ((IfcMaterial) object).getClassifiedAs().size(); i++) {
				resultList.add(((IfcMaterial) object).getClassifiedAs().get(i));
			}
			 //1EList
		}
		else if (string.equals("HasRepresentation")) {
			//3xxx
			for (int i = 0; i < ((IfcMaterial) object).getHasRepresentation().size(); i++) {
				resultList.add(((IfcMaterial) object).getHasRepresentation().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcMaterial) object).getName());
			 //1String
		}
		return resultList;
	}
}
