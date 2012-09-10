package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPropertyEnumeration;

public class GetAttributeSubIfcPropertyEnumeration {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPropertyEnumeration(Object object, String string) {
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
		if (string.equals("EnumerationValues")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyEnumeration) object).getEnumerationValues().size(); i++) {
				resultList.add(((IfcPropertyEnumeration) object).getEnumerationValues().get(i));
			}
			 //1EList
		}
		else if (string.equals("Unit")) {
			resultList.add(((IfcPropertyEnumeration) object).getUnit());
			 //1IfcUnit
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPropertyEnumeration) object).getName());
			 //1String
		}
		return resultList;
	}
}
