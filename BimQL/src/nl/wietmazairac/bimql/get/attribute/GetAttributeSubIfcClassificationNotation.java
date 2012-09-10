package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcClassificationNotation;

public class GetAttributeSubIfcClassificationNotation {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcClassificationNotation(Object object, String string) {
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
		if (string.equals("NotationFacets")) {
			//3xxx
			for (int i = 0; i < ((IfcClassificationNotation) object).getNotationFacets().size(); i++) {
				resultList.add(((IfcClassificationNotation) object).getNotationFacets().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
