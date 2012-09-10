package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.Ifc2DCompositeCurve;

public class SetAttributeSubIfc2DCompositeCurve {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfc2DCompositeCurve() {
	}

	public SetAttributeSubIfc2DCompositeCurve(Object object, String attributeName, String attributeNewValue) {
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
			//2NoEList
			((Ifc2DCompositeCurve) object).setSelfIntersect(Boolean.parseBoolean(attributeNewValue));
			 //2void
			 //2boolean
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
