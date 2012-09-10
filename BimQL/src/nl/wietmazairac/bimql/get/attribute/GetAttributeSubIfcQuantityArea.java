package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcQuantityArea;

public class GetAttributeSubIfcQuantityArea {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcQuantityArea(Object object, String string) {
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
		if (string.equals("AreaValue")) {
			resultList.add(((IfcQuantityArea) object).getAreaValue());
			 //1double
		}
		else if (string.equals("AreaValueAsString")) {
			resultList.add(((IfcQuantityArea) object).getAreaValueAsString());
			 //1String
		}
		else if (string.equals("Unit")) {
			resultList.add(((IfcQuantityArea) object).getUnit());
			 //2IfcNamedUnit
		}
		else if (string.equals("PartOfComplex")) {
			//3xxx
			for (int i = 0; i < ((IfcQuantityArea) object).getPartOfComplex().size(); i++) {
				resultList.add(((IfcQuantityArea) object).getPartOfComplex().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcQuantityArea) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcQuantityArea) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
