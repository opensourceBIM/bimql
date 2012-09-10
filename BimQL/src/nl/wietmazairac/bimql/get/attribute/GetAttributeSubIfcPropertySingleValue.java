package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPropertySingleValue;

public class GetAttributeSubIfcPropertySingleValue {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPropertySingleValue(Object object, String string) {
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
		if (string.equals("NominalValue")) {
			resultList.add(((IfcPropertySingleValue) object).getNominalValue());
			 //1IfcValue
		}
		else if (string.equals("Unit")) {
			resultList.add(((IfcPropertySingleValue) object).getUnit());
			 //1IfcUnit
		}
		else if (string.equals("PropertyForDependance")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertySingleValue) object).getPropertyForDependance().size(); i++) {
				resultList.add(((IfcPropertySingleValue) object).getPropertyForDependance().get(i));
			}
			 //3EList
		}
		else if (string.equals("PartOfComplex")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertySingleValue) object).getPartOfComplex().size(); i++) {
				resultList.add(((IfcPropertySingleValue) object).getPartOfComplex().get(i));
			}
			 //3EList
		}
		else if (string.equals("PropertyDependsOn")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertySingleValue) object).getPropertyDependsOn().size(); i++) {
				resultList.add(((IfcPropertySingleValue) object).getPropertyDependsOn().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPropertySingleValue) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPropertySingleValue) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
