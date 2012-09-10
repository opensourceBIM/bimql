package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcNamedUnit;

public class GetAttributeSubIfcNamedUnit {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcNamedUnit(Object object, String string) {
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
		if (string.equals("UnitType")) {
			resultList.add(((IfcNamedUnit) object).getUnitType());
			 //1IfcUnitEnum
		}
		else if (string.equals("Dimensions")) {
			resultList.add(((IfcNamedUnit) object).getDimensions());
			 //1IfcDimensionalExponents
		}
		return resultList;
	}
}
