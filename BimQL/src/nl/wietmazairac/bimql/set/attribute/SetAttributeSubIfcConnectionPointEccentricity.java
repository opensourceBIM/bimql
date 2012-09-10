package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcConnectionPointEccentricity;

public class SetAttributeSubIfcConnectionPointEccentricity {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcConnectionPointEccentricity() {
	}

	public SetAttributeSubIfcConnectionPointEccentricity(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("EccentricityInXAsString")) {
			//1NoEList
			((IfcConnectionPointEccentricity) object).setEccentricityInXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("EccentricityInYAsString")) {
			//1NoEList
			((IfcConnectionPointEccentricity) object).setEccentricityInYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("EccentricityInZAsString")) {
			//1NoEList
			((IfcConnectionPointEccentricity) object).setEccentricityInZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("EccentricityInX")) {
			//1NoEList
			((IfcConnectionPointEccentricity) object).setEccentricityInX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("EccentricityInY")) {
			//1NoEList
			((IfcConnectionPointEccentricity) object).setEccentricityInY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("EccentricityInZ")) {
			//1NoEList
			((IfcConnectionPointEccentricity) object).setEccentricityInZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PointOnRelatingElement")) {
			//2NoEList
			 //2void
			 //2IfcPointOrVertexPoint
		}
		else if (attributeName.equals("PointOnRelatedElement")) {
			//2NoEList
			 //2void
			 //2IfcPointOrVertexPoint
		}
		else {
		}
	}
}
