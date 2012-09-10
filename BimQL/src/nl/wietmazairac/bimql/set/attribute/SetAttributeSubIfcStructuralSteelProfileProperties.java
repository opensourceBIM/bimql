package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcStructuralSteelProfileProperties;

public class SetAttributeSubIfcStructuralSteelProfileProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralSteelProfileProperties() {
	}

	public SetAttributeSubIfcStructuralSteelProfileProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("PlasticShapeFactorYAsString")) {
			//1NoEList
			((IfcStructuralSteelProfileProperties) object).setPlasticShapeFactorYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PlasticShapeFactorZAsString")) {
			//1NoEList
			((IfcStructuralSteelProfileProperties) object).setPlasticShapeFactorZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ShearAreaZ")) {
			//1NoEList
			((IfcStructuralSteelProfileProperties) object).setShearAreaZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ShearAreaY")) {
			//1NoEList
			((IfcStructuralSteelProfileProperties) object).setShearAreaY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ShearAreaZAsString")) {
			//1NoEList
			((IfcStructuralSteelProfileProperties) object).setShearAreaZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ShearAreaYAsString")) {
			//1NoEList
			((IfcStructuralSteelProfileProperties) object).setShearAreaYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PlasticShapeFactorY")) {
			//1NoEList
			((IfcStructuralSteelProfileProperties) object).setPlasticShapeFactorY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PlasticShapeFactorZ")) {
			//1NoEList
			((IfcStructuralSteelProfileProperties) object).setPlasticShapeFactorZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CentreOfGravityInX")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setCentreOfGravityInX(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("CentreOfGravityInXAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setCentreOfGravityInXAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("TorsionalConstantXAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setTorsionalConstantXAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ShearDeformationAreaZAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setShearDeformationAreaZAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ShearDeformationAreaYAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setShearDeformationAreaYAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("MaximumSectionModulusYAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMaximumSectionModulusYAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("MinimumSectionModulusYAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMinimumSectionModulusYAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("MaximumSectionModulusZAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMaximumSectionModulusZAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("MinimumSectionModulusZAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMinimumSectionModulusZAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("TorsionalSectionModulusAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setTorsionalSectionModulusAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("MomentOfInertiaYZ")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMomentOfInertiaYZ(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("MomentOfInertiaY")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMomentOfInertiaY(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("MomentOfInertiaZ")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMomentOfInertiaZ(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("WarpingConstant")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setWarpingConstant(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("ShearCentreZ")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setShearCentreZ(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("ShearCentreY")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setShearCentreY(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("TorsionalConstantX")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setTorsionalConstantX(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("MomentOfInertiaYZAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMomentOfInertiaYZAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("MomentOfInertiaYAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMomentOfInertiaYAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("MomentOfInertiaZAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMomentOfInertiaZAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("WarpingConstantAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setWarpingConstantAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ShearCentreZAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setShearCentreZAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ShearCentreYAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setShearCentreYAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ShearDeformationAreaZ")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setShearDeformationAreaZ(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("ShearDeformationAreaY")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setShearDeformationAreaY(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("MaximumSectionModulusY")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMaximumSectionModulusY(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("MinimumSectionModulusY")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMinimumSectionModulusY(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("MaximumSectionModulusZ")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMaximumSectionModulusZ(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("MinimumSectionModulusZ")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setMinimumSectionModulusZ(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("TorsionalSectionModulus")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setTorsionalSectionModulus(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("CentreOfGravityInYAsString")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setCentreOfGravityInYAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("CentreOfGravityInY")) {
			//2NoEList
			((IfcStructuralSteelProfileProperties) object).setCentreOfGravityInY(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("CrossSectionAreaAsString")) {
			//5NoEList
			((IfcStructuralSteelProfileProperties) object).setCrossSectionAreaAsString(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("CrossSectionArea")) {
			//5NoEList
			((IfcStructuralSteelProfileProperties) object).setCrossSectionArea(Double.parseDouble(attributeNewValue));
			 //5void
			 //5double
		}
		else if (attributeName.equals("MinimumPlateThicknessAsString")) {
			//5NoEList
			((IfcStructuralSteelProfileProperties) object).setMinimumPlateThicknessAsString(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("MaximumPlateThicknessAsString")) {
			//5NoEList
			((IfcStructuralSteelProfileProperties) object).setMaximumPlateThicknessAsString(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Perimeter")) {
			//5NoEList
			((IfcStructuralSteelProfileProperties) object).setPerimeter(Double.parseDouble(attributeNewValue));
			 //5void
			 //5double
		}
		else if (attributeName.equals("PhysicalWeight")) {
			//5NoEList
			((IfcStructuralSteelProfileProperties) object).setPhysicalWeight(Double.parseDouble(attributeNewValue));
			 //5void
			 //5double
		}
		else if (attributeName.equals("PerimeterAsString")) {
			//5NoEList
			((IfcStructuralSteelProfileProperties) object).setPerimeterAsString(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("PhysicalWeightAsString")) {
			//5NoEList
			((IfcStructuralSteelProfileProperties) object).setPhysicalWeightAsString(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("MinimumPlateThickness")) {
			//5NoEList
			((IfcStructuralSteelProfileProperties) object).setMinimumPlateThickness(Double.parseDouble(attributeNewValue));
			 //5void
			 //5double
		}
		else if (attributeName.equals("MaximumPlateThickness")) {
			//5NoEList
			((IfcStructuralSteelProfileProperties) object).setMaximumPlateThickness(Double.parseDouble(attributeNewValue));
			 //5void
			 //5double
		}
		else if (attributeName.equals("ProfileDefinition")) {
			//5NoEList
			 //5void
			 //5IfcProfileDef
		}
		else if (attributeName.equals("ProfileName")) {
			//5NoEList
			((IfcStructuralSteelProfileProperties) object).setProfileName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
