package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcFillAreaStyle;

public class GetAttributeSubIfcFillAreaStyle {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFillAreaStyle(Object object, String string) {
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
		if (string.equals("FillStyles")) {
			//3xxx
			for (int i = 0; i < ((IfcFillAreaStyle) object).getFillStyles().size(); i++) {
				resultList.add(((IfcFillAreaStyle) object).getFillStyles().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
