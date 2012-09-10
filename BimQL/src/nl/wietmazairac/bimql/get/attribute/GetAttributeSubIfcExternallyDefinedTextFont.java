package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

public class GetAttributeSubIfcExternallyDefinedTextFont {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcExternallyDefinedTextFont(Object object, String string) {
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
		return resultList;
	}
}
