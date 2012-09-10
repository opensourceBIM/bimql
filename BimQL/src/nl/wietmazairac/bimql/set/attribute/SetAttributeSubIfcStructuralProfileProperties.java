package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcStructuralProfileProperties;

public class SetAttributeSubIfcStructuralProfileProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralProfileProperties() {
	}

	public SetAttributeSubIfcStructuralProfileProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("CentreOfGravityInX")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setCentreOfGravityInX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CentreOfGravityInXAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setCentreOfGravityInXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TorsionalConstantXAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setTorsionalConstantXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ShearDeformationAreaZAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setShearDeformationAreaZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ShearDeformationAreaYAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setShearDeformationAreaYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MaximumSectionModulusYAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMaximumSectionModulusYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MinimumSectionModulusYAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMinimumSectionModulusYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MaximumSectionModulusZAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMaximumSectionModulusZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MinimumSectionModulusZAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMinimumSectionModulusZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TorsionalSectionModulusAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setTorsionalSectionModulusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MomentOfInertiaYZ")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMomentOfInertiaYZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MomentOfInertiaY")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMomentOfInertiaY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MomentOfInertiaZ")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMomentOfInertiaZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("WarpingConstant")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setWarpingConstant(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ShearCentreZ")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setShearCentreZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ShearCentreY")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setShearCentreY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TorsionalConstantX")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setTorsionalConstantX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MomentOfInertiaYZAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMomentOfInertiaYZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MomentOfInertiaYAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMomentOfInertiaYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MomentOfInertiaZAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMomentOfInertiaZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("WarpingConstantAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setWarpingConstantAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ShearCentreZAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setShearCentreZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ShearCentreYAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setShearCentreYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ShearDeformationAreaZ")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setShearDeformationAreaZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ShearDeformationAreaY")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setShearDeformationAreaY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MaximumSectionModulusY")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMaximumSectionModulusY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MinimumSectionModulusY")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMinimumSectionModulusY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MaximumSectionModulusZ")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMaximumSectionModulusZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MinimumSectionModulusZ")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setMinimumSectionModulusZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TorsionalSectionModulus")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setTorsionalSectionModulus(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CentreOfGravityInYAsString")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setCentreOfGravityInYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CentreOfGravityInY")) {
			//1NoEList
			((IfcStructuralProfileProperties) object).setCentreOfGravityInY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CrossSectionAreaAsString")) {
			//2NoEList
			((IfcStructuralProfileProperties) object).setCrossSectionAreaAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("CrossSectionArea")) {
			//2NoEList
			((IfcStructuralProfileProperties) object).setCrossSectionArea(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("MinimumPlateThicknessAsString")) {
			//2NoEList
			((IfcStructuralProfileProperties) object).setMinimumPlateThicknessAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("MaximumPlateThicknessAsString")) {
			//2NoEList
			((IfcStructuralProfileProperties) object).setMaximumPlateThicknessAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Perimeter")) {
			//2NoEList
			((IfcStructuralProfileProperties) object).setPerimeter(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("PhysicalWeight")) {
			//2NoEList
			((IfcStructuralProfileProperties) object).setPhysicalWeight(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("PerimeterAsString")) {
			//2NoEList
			((IfcStructuralProfileProperties) object).setPerimeterAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("PhysicalWeightAsString")) {
			//2NoEList
			((IfcStructuralProfileProperties) object).setPhysicalWeightAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("MinimumPlateThickness")) {
			//2NoEList
			((IfcStructuralProfileProperties) object).setMinimumPlateThickness(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("MaximumPlateThickness")) {
			//2NoEList
			((IfcStructuralProfileProperties) object).setMaximumPlateThickness(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("ProfileDefinition")) {
			//5NoEList
			 //5void
			 //5IfcProfileDef
		}
		else if (attributeName.equals("ProfileName")) {
			//5NoEList
			((IfcStructuralProfileProperties) object).setProfileName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
