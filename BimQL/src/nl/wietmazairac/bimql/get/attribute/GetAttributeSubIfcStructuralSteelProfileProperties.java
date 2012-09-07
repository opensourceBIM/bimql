package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcStructuralSteelProfileProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralSteelProfileProperties(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("PlasticShapeFactorYAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getPlasticShapeFactorYAsString());
			 //1String
		}
		else if (string.equals("PlasticShapeFactorZAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getPlasticShapeFactorZAsString());
			 //1String
		}
		else if (string.equals("ShearAreaZ")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getShearAreaZ());
			 //1double
		}
		else if (string.equals("ShearAreaY")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getShearAreaY());
			 //1double
		}
		else if (string.equals("ShearAreaZAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getShearAreaZAsString());
			 //1String
		}
		else if (string.equals("ShearAreaYAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getShearAreaYAsString());
			 //1String
		}
		else if (string.equals("PlasticShapeFactorY")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getPlasticShapeFactorY());
			 //1double
		}
		else if (string.equals("PlasticShapeFactorZ")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getPlasticShapeFactorZ());
			 //1double
		}
		else if (string.equals("CentreOfGravityInX")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getCentreOfGravityInX());
			 //2double
		}
		else if (string.equals("TorsionalConstantXAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getTorsionalConstantXAsString());
			 //2String
		}
		else if (string.equals("ShearDeformationAreaZAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getShearDeformationAreaZAsString());
			 //2String
		}
		else if (string.equals("ShearDeformationAreaYAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getShearDeformationAreaYAsString());
			 //2String
		}
		else if (string.equals("MaximumSectionModulusYAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMaximumSectionModulusYAsString());
			 //2String
		}
		else if (string.equals("MinimumSectionModulusYAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMinimumSectionModulusYAsString());
			 //2String
		}
		else if (string.equals("MaximumSectionModulusZAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMaximumSectionModulusZAsString());
			 //2String
		}
		else if (string.equals("MinimumSectionModulusZAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMinimumSectionModulusZAsString());
			 //2String
		}
		else if (string.equals("TorsionalSectionModulusAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getTorsionalSectionModulusAsString());
			 //2String
		}
		else if (string.equals("MomentOfInertiaYZ")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMomentOfInertiaYZ());
			 //2double
		}
		else if (string.equals("MomentOfInertiaY")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMomentOfInertiaY());
			 //2double
		}
		else if (string.equals("MomentOfInertiaZ")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMomentOfInertiaZ());
			 //2double
		}
		else if (string.equals("WarpingConstant")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getWarpingConstant());
			 //2double
		}
		else if (string.equals("ShearCentreZ")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getShearCentreZ());
			 //2double
		}
		else if (string.equals("ShearCentreY")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getShearCentreY());
			 //2double
		}
		else if (string.equals("TorsionalConstantX")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getTorsionalConstantX());
			 //2double
		}
		else if (string.equals("MomentOfInertiaYZAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMomentOfInertiaYZAsString());
			 //2String
		}
		else if (string.equals("MomentOfInertiaYAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMomentOfInertiaYAsString());
			 //2String
		}
		else if (string.equals("MomentOfInertiaZAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMomentOfInertiaZAsString());
			 //2String
		}
		else if (string.equals("WarpingConstantAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getWarpingConstantAsString());
			 //2String
		}
		else if (string.equals("ShearCentreZAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getShearCentreZAsString());
			 //2String
		}
		else if (string.equals("ShearCentreYAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getShearCentreYAsString());
			 //2String
		}
		else if (string.equals("ShearDeformationAreaZ")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getShearDeformationAreaZ());
			 //2double
		}
		else if (string.equals("ShearDeformationAreaY")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getShearDeformationAreaY());
			 //2double
		}
		else if (string.equals("MaximumSectionModulusY")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMaximumSectionModulusY());
			 //2double
		}
		else if (string.equals("MinimumSectionModulusY")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMinimumSectionModulusY());
			 //2double
		}
		else if (string.equals("MaximumSectionModulusZ")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMaximumSectionModulusZ());
			 //2double
		}
		else if (string.equals("MinimumSectionModulusZ")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMinimumSectionModulusZ());
			 //2double
		}
		else if (string.equals("TorsionalSectionModulus")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getTorsionalSectionModulus());
			 //2double
		}
		else if (string.equals("CentreOfGravityInYAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getCentreOfGravityInYAsString());
			 //2String
		}
		else if (string.equals("CentreOfGravityInXAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getCentreOfGravityInXAsString());
			 //2String
		}
		else if (string.equals("CentreOfGravityInY")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getCentreOfGravityInY());
			 //2double
		}
		else if (string.equals("PhysicalWeightAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getPhysicalWeightAsString());
			 //3String
		}
		else if (string.equals("MinimumPlateThickness")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMinimumPlateThickness());
			 //3double
		}
		else if (string.equals("MaximumPlateThickness")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMaximumPlateThickness());
			 //3double
		}
		else if (string.equals("CrossSectionAreaAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getCrossSectionAreaAsString());
			 //3String
		}
		else if (string.equals("MinimumPlateThicknessAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMinimumPlateThicknessAsString());
			 //3String
		}
		else if (string.equals("MaximumPlateThicknessAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getMaximumPlateThicknessAsString());
			 //3String
		}
		else if (string.equals("PhysicalWeight")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getPhysicalWeight());
			 //3double
		}
		else if (string.equals("PerimeterAsString")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getPerimeterAsString());
			 //3String
		}
		else if (string.equals("CrossSectionArea")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getCrossSectionArea());
			 //3double
		}
		else if (string.equals("Perimeter")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getPerimeter());
			 //3double
		}
		else if (string.equals("ProfileDefinition")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getProfileDefinition());
			 //3IfcProfileDef
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcStructuralSteelProfileProperties) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
