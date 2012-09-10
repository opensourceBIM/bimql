package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadSingleDisplacement;

public class SetAttributeSubIfcStructuralLoadSingleDisplacement {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralLoadSingleDisplacement() {
	}

	public SetAttributeSubIfcStructuralLoadSingleDisplacement(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("DisplacementX")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacement) object).setDisplacementX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DisplacementY")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacement) object).setDisplacementY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DisplacementZ")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacement) object).setDisplacementZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DisplacementXAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacement) object).setDisplacementXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DisplacementYAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacement) object).setDisplacementYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DisplacementZAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacement) object).setDisplacementZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RotationalDisplacementRX")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacement) object).setRotationalDisplacementRX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RotationalDisplacementRY")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacement) object).setRotationalDisplacementRY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RotationalDisplacementRZ")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacement) object).setRotationalDisplacementRZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RotationalDisplacementRXAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacement) object).setRotationalDisplacementRXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RotationalDisplacementRYAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacement) object).setRotationalDisplacementRYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RotationalDisplacementRZAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacement) object).setRotationalDisplacementRZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcStructuralLoadSingleDisplacement) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
