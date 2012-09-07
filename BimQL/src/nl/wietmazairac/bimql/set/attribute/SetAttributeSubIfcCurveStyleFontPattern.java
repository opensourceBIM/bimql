package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcCurveStyleFontPattern {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcCurveStyleFontPattern() {
	}

	public SetAttributeSubIfcCurveStyleFontPattern(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("VisibleSegmentLengthAsString")) {
			//1NoEList
			((IfcCurveStyleFontPattern) object).setVisibleSegmentLengthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("InvisibleSegmentLengthAsString")) {
			//1NoEList
			((IfcCurveStyleFontPattern) object).setInvisibleSegmentLengthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("VisibleSegmentLength")) {
			//1NoEList
			((IfcCurveStyleFontPattern) object).setVisibleSegmentLength(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("InvisibleSegmentLength")) {
			//1NoEList
			((IfcCurveStyleFontPattern) object).setInvisibleSegmentLength(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
