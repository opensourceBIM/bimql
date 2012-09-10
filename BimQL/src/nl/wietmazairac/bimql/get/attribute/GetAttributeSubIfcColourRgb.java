package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcColourRgb;

public class GetAttributeSubIfcColourRgb {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcColourRgb(Object object, String string) {
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
		if (string.equals("RedAsString")) {
			resultList.add(((IfcColourRgb) object).getRedAsString());
			 //1String
		}
		else if (string.equals("GreenAsString")) {
			resultList.add(((IfcColourRgb) object).getGreenAsString());
			 //1String
		}
		else if (string.equals("BlueAsString")) {
			resultList.add(((IfcColourRgb) object).getBlueAsString());
			 //1String
		}
		else if (string.equals("Blue")) {
			resultList.add(((IfcColourRgb) object).getBlue());
			 //1double
		}
		else if (string.equals("Green")) {
			resultList.add(((IfcColourRgb) object).getGreen());
			 //1double
		}
		else if (string.equals("Red")) {
			resultList.add(((IfcColourRgb) object).getRed());
			 //1double
		}
		return resultList;
	}
}
