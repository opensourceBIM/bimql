package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCurveStyleFont;

public class GetAttributeSubIfcCurveStyleFont {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCurveStyleFont(Object object, String string) {
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
		if (string.equals("PatternList")) {
			//3xxx
			for (int i = 0; i < ((IfcCurveStyleFont) object).getPatternList().size(); i++) {
				resultList.add(((IfcCurveStyleFont) object).getPatternList().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcCurveStyleFont) object).getName());
			 //1String
		}
		return resultList;
	}
}
