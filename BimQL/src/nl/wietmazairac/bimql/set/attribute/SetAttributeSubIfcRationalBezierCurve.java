package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcRationalBezierCurve;

public class SetAttributeSubIfcRationalBezierCurve {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRationalBezierCurve() {
	}

	public SetAttributeSubIfcRationalBezierCurve(Object object, String attributeName, String attributeNewValue) {
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
			//5NoEList
			((IfcRationalBezierCurve) object).setSelfIntersect(Boolean.parseBoolean(attributeNewValue));
			 //5void
			 //5boolean
		}
		else if (attributeName.equals("ClosedCurve")) {
			//5NoEList
			((IfcRationalBezierCurve) object).setClosedCurve(Boolean.parseBoolean(attributeNewValue));
			 //5void
			 //5boolean
		}
		else if (attributeName.equals("Degree")) {
			//5NoEList
			 //5void
			 //5int
		}
		else if (attributeName.equals("CurveForm")) {
			//5NoEList
			 //5void
			 //5IfcBSplineCurveForm
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
