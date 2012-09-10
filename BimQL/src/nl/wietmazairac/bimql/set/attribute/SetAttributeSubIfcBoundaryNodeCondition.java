package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcBoundaryNodeCondition;

public class SetAttributeSubIfcBoundaryNodeCondition {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcBoundaryNodeCondition() {
	}

	public SetAttributeSubIfcBoundaryNodeCondition(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("LinearStiffnessXAsString")) {
			//1NoEList
			((IfcBoundaryNodeCondition) object).setLinearStiffnessXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearStiffnessYAsString")) {
			//1NoEList
			((IfcBoundaryNodeCondition) object).setLinearStiffnessYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearStiffnessX")) {
			//1NoEList
			((IfcBoundaryNodeCondition) object).setLinearStiffnessX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearStiffnessY")) {
			//1NoEList
			((IfcBoundaryNodeCondition) object).setLinearStiffnessY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearStiffnessZ")) {
			//1NoEList
			((IfcBoundaryNodeCondition) object).setLinearStiffnessZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RotationalStiffnessXAsString")) {
			//1NoEList
			((IfcBoundaryNodeCondition) object).setRotationalStiffnessXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RotationalStiffnessYAsString")) {
			//1NoEList
			((IfcBoundaryNodeCondition) object).setRotationalStiffnessYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RotationalStiffnessZAsString")) {
			//1NoEList
			((IfcBoundaryNodeCondition) object).setRotationalStiffnessZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearStiffnessZAsString")) {
			//1NoEList
			((IfcBoundaryNodeCondition) object).setLinearStiffnessZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RotationalStiffnessX")) {
			//1NoEList
			((IfcBoundaryNodeCondition) object).setRotationalStiffnessX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RotationalStiffnessY")) {
			//1NoEList
			((IfcBoundaryNodeCondition) object).setRotationalStiffnessY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RotationalStiffnessZ")) {
			//1NoEList
			((IfcBoundaryNodeCondition) object).setRotationalStiffnessZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
