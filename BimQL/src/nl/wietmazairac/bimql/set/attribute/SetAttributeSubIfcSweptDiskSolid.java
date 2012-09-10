package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcSweptDiskSolid;

public class SetAttributeSubIfcSweptDiskSolid {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcSweptDiskSolid() {
	}

	public SetAttributeSubIfcSweptDiskSolid(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Directrix")) {
			//1NoEList
			 //1void
			 //1IfcCurve
		}
		else if (attributeName.equals("EndParam")) {
			//1NoEList
			((IfcSweptDiskSolid) object).setEndParam(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("InnerRadius")) {
			//1NoEList
			((IfcSweptDiskSolid) object).setInnerRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("StartParam")) {
			//1NoEList
			((IfcSweptDiskSolid) object).setStartParam(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("InnerRadiusAsString")) {
			//1NoEList
			((IfcSweptDiskSolid) object).setInnerRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("StartParamAsString")) {
			//1NoEList
			((IfcSweptDiskSolid) object).setStartParamAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("EndParamAsString")) {
			//1NoEList
			((IfcSweptDiskSolid) object).setEndParamAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Radius")) {
			//1NoEList
			((IfcSweptDiskSolid) object).setRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RadiusAsString")) {
			//1NoEList
			((IfcSweptDiskSolid) object).setRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Dim")) {
			//2NoEList
			 //2void
			 //2int
		}
		else {
		}
	}
}
