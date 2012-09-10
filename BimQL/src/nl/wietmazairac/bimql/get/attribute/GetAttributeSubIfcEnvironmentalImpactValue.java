package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcEnvironmentalImpactValue;

public class GetAttributeSubIfcEnvironmentalImpactValue {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcEnvironmentalImpactValue(Object object, String string) {
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
		if (string.equals("Category")) {
			resultList.add(((IfcEnvironmentalImpactValue) object).getCategory());
			 //1IfcEnvironmentalImpactCategoryEnum
		}
		else if (string.equals("UserDefinedCategory")) {
			resultList.add(((IfcEnvironmentalImpactValue) object).getUserDefinedCategory());
			 //1String
		}
		else if (string.equals("ImpactType")) {
			resultList.add(((IfcEnvironmentalImpactValue) object).getImpactType());
			 //1String
		}
		return resultList;
	}
}
