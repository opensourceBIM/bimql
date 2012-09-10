package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPropertyEnumeratedValue;

public class GetAttributeSubIfcPropertyEnumeratedValue {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPropertyEnumeratedValue(Object object, String string) {
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
		if (string.equals("EnumerationReference")) {
			resultList.add(((IfcPropertyEnumeratedValue) object).getEnumerationReference());
			 //1IfcPropertyEnumeration
		}
		else if (string.equals("EnumerationValues")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyEnumeratedValue) object).getEnumerationValues().size(); i++) {
				resultList.add(((IfcPropertyEnumeratedValue) object).getEnumerationValues().get(i));
			}
			 //1EList
		}
		else if (string.equals("PropertyForDependance")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyEnumeratedValue) object).getPropertyForDependance().size(); i++) {
				resultList.add(((IfcPropertyEnumeratedValue) object).getPropertyForDependance().get(i));
			}
			 //3EList
		}
		else if (string.equals("PartOfComplex")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyEnumeratedValue) object).getPartOfComplex().size(); i++) {
				resultList.add(((IfcPropertyEnumeratedValue) object).getPartOfComplex().get(i));
			}
			 //3EList
		}
		else if (string.equals("PropertyDependsOn")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyEnumeratedValue) object).getPropertyDependsOn().size(); i++) {
				resultList.add(((IfcPropertyEnumeratedValue) object).getPropertyDependsOn().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPropertyEnumeratedValue) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPropertyEnumeratedValue) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
