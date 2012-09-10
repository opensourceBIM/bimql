package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDerivedUnit;

public class GetAttributeSubIfcDerivedUnit {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDerivedUnit(Object object, String string) {
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
		if (string.equals("UserDefinedType")) {
			resultList.add(((IfcDerivedUnit) object).getUserDefinedType());
			 //1String
		}
		else if (string.equals("UnitType")) {
			resultList.add(((IfcDerivedUnit) object).getUnitType());
			 //1IfcDerivedUnitEnum
		}
		else if (string.equals("Elements")) {
			//3xxx
			for (int i = 0; i < ((IfcDerivedUnit) object).getElements().size(); i++) {
				resultList.add(((IfcDerivedUnit) object).getElements().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
