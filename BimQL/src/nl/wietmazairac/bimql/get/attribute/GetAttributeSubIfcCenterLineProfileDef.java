package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCenterLineProfileDef;

public class GetAttributeSubIfcCenterLineProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCenterLineProfileDef(Object object, String string) {
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
		if (string.equals("ThicknessAsString")) {
			resultList.add(((IfcCenterLineProfileDef) object).getThicknessAsString());
			 //1String
		}
		else if (string.equals("Thickness")) {
			resultList.add(((IfcCenterLineProfileDef) object).getThickness());
			 //1double
		}
		else if (string.equals("Curve")) {
			resultList.add(((IfcCenterLineProfileDef) object).getCurve());
			 //2IfcBoundedCurve
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcCenterLineProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcCenterLineProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
