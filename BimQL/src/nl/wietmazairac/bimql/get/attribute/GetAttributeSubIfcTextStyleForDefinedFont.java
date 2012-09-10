package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTextStyleForDefinedFont;

public class GetAttributeSubIfcTextStyleForDefinedFont {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTextStyleForDefinedFont(Object object, String string) {
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
		if (string.equals("BackgroundColour")) {
			resultList.add(((IfcTextStyleForDefinedFont) object).getBackgroundColour());
			 //1IfcColour
		}
		else if (string.equals("Colour")) {
			resultList.add(((IfcTextStyleForDefinedFont) object).getColour());
			 //1IfcColour
		}
		return resultList;
	}
}
