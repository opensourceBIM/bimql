package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadPlanarForce;

public class SetAttributeSubIfcStructuralLoadPlanarForce {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralLoadPlanarForce() {
	}

	public SetAttributeSubIfcStructuralLoadPlanarForce(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("PlanarForceX")) {
			//1NoEList
			((IfcStructuralLoadPlanarForce) object).setPlanarForceX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PlanarForceY")) {
			//1NoEList
			((IfcStructuralLoadPlanarForce) object).setPlanarForceY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PlanarForceZ")) {
			//1NoEList
			((IfcStructuralLoadPlanarForce) object).setPlanarForceZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PlanarForceXAsString")) {
			//1NoEList
			((IfcStructuralLoadPlanarForce) object).setPlanarForceXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PlanarForceYAsString")) {
			//1NoEList
			((IfcStructuralLoadPlanarForce) object).setPlanarForceYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PlanarForceZAsString")) {
			//1NoEList
			((IfcStructuralLoadPlanarForce) object).setPlanarForceZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcStructuralLoadPlanarForce) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
