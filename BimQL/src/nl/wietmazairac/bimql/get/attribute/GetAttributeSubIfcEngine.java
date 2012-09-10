package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.store.IfcEngine;

public class GetAttributeSubIfcEngine {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcEngine(Object object, String string) {
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
		if (string.equals("Serializers")) {
			//3xxx
			for (int i = 0; i < ((IfcEngine) object).getSerializers().size(); i++) {
				resultList.add(((IfcEngine) object).getSerializers().get(i));
			}
			 //1EList
		}
		else if (string.equals("Settings")) {
			resultList.add(((IfcEngine) object).getSettings());
			 //1Settings
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcEngine) object).getName());
			 //1String
		}
		else if (string.equals("ClassName")) {
			resultList.add(((IfcEngine) object).getClassName());
			 //1String
		}
		return resultList;
	}
}
