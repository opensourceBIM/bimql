package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcBSplineCurve {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcBSplineCurve() {
	}

	public SetAttributeSubIfcBSplineCurve(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("SelfIntersect")) {
			//1NoEList
			((IfcBSplineCurve) object).setSelfIntersect(Boolean.parseBoolean(attributeNewValue));
			 //1void
			 //1boolean
		}
		else if (attributeName.equals("ClosedCurve")) {
			//1NoEList
			((IfcBSplineCurve) object).setClosedCurve(Boolean.parseBoolean(attributeNewValue));
			 //1void
			 //1boolean
		}
		else if (attributeName.equals("Degree")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("CurveForm")) {
			//1NoEList
			 //1void
			 //1IfcBSplineCurveForm
		}
		else if (attributeName.equals("Dim")) {
			//5NoEList
			 //5void
			 //5int
		}
		else {
		}
	}
}
