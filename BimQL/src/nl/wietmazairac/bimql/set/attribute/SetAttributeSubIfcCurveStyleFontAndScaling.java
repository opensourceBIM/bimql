package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcCurveStyleFontAndScaling {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcCurveStyleFontAndScaling() {
	}

	public SetAttributeSubIfcCurveStyleFontAndScaling(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("CurveFontScaling")) {
			//1NoEList
			((IfcCurveStyleFontAndScaling) object).setCurveFontScaling(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CurveFont")) {
			//1NoEList
			 //1void
			 //1IfcCurveStyleFontSelect
		}
		else if (attributeName.equals("CurveFontScalingAsString")) {
			//1NoEList
			((IfcCurveStyleFontAndScaling) object).setCurveFontScalingAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Name")) {
			//1NoEList
			((IfcCurveStyleFontAndScaling) object).setName(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
