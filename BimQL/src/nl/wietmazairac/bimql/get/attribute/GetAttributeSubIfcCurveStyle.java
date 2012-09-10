package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCurveStyle;

public class GetAttributeSubIfcCurveStyle {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCurveStyle(Object object, String string) {
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
		if (string.equals("CurveFont")) {
			resultList.add(((IfcCurveStyle) object).getCurveFont());
			 //1IfcCurveFontOrScaledCurveFontSelect
		}
		else if (string.equals("CurveWidth")) {
			resultList.add(((IfcCurveStyle) object).getCurveWidth());
			 //1IfcSizeSelect
		}
		else if (string.equals("CurveColour")) {
			resultList.add(((IfcCurveStyle) object).getCurveColour());
			 //1IfcColour
		}
		return resultList;
	}
}
