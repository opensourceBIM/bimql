package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcCurveStyleFontPattern {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCurveStyleFontPattern(Object object, String string) {
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
		if (string.equals("VisibleSegmentLength")) {
			resultList.add(((IfcCurveStyleFontPattern) object).getVisibleSegmentLength());
			 //1double
		}
		else if (string.equals("InvisibleSegmentLength")) {
			resultList.add(((IfcCurveStyleFontPattern) object).getInvisibleSegmentLength());
			 //1double
		}
		else if (string.equals("VisibleSegmentLengthAsString")) {
			resultList.add(((IfcCurveStyleFontPattern) object).getVisibleSegmentLengthAsString());
			 //1String
		}
		else if (string.equals("InvisibleSegmentLengthAsString")) {
			resultList.add(((IfcCurveStyleFontPattern) object).getInvisibleSegmentLengthAsString());
			 //1String
		}
		return resultList;
	}
}
