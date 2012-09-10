package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcArbitraryProfileDefWithVoids;

public class GetAttributeSubIfcArbitraryProfileDefWithVoids {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcArbitraryProfileDefWithVoids(Object object, String string) {
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
		if (string.equals("InnerCurves")) {
			//3xxx
			for (int i = 0; i < ((IfcArbitraryProfileDefWithVoids) object).getInnerCurves().size(); i++) {
				resultList.add(((IfcArbitraryProfileDefWithVoids) object).getInnerCurves().get(i));
			}
			 //1EList
		}
		else if (string.equals("OuterCurve")) {
			resultList.add(((IfcArbitraryProfileDefWithVoids) object).getOuterCurve());
			 //2IfcCurve
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcArbitraryProfileDefWithVoids) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcArbitraryProfileDefWithVoids) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
