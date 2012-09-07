package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcStructuralProfileProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralProfileProperties(Object object, String string) {
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
		if (string.equals("CentreOfGravityInX")) {
			resultList.add(((IfcStructuralProfileProperties) object).getCentreOfGravityInX());
			 //1double
		}
		else if (string.equals("TorsionalConstantXAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getTorsionalConstantXAsString());
			 //1String
		}
		else if (string.equals("ShearDeformationAreaZAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getShearDeformationAreaZAsString());
			 //1String
		}
		else if (string.equals("ShearDeformationAreaYAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getShearDeformationAreaYAsString());
			 //1String
		}
		else if (string.equals("MaximumSectionModulusYAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMaximumSectionModulusYAsString());
			 //1String
		}
		else if (string.equals("MinimumSectionModulusYAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMinimumSectionModulusYAsString());
			 //1String
		}
		else if (string.equals("MaximumSectionModulusZAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMaximumSectionModulusZAsString());
			 //1String
		}
		else if (string.equals("MinimumSectionModulusZAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMinimumSectionModulusZAsString());
			 //1String
		}
		else if (string.equals("TorsionalSectionModulusAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getTorsionalSectionModulusAsString());
			 //1String
		}
		else if (string.equals("MomentOfInertiaYZ")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMomentOfInertiaYZ());
			 //1double
		}
		else if (string.equals("MomentOfInertiaY")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMomentOfInertiaY());
			 //1double
		}
		else if (string.equals("MomentOfInertiaZ")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMomentOfInertiaZ());
			 //1double
		}
		else if (string.equals("WarpingConstant")) {
			resultList.add(((IfcStructuralProfileProperties) object).getWarpingConstant());
			 //1double
		}
		else if (string.equals("ShearCentreZ")) {
			resultList.add(((IfcStructuralProfileProperties) object).getShearCentreZ());
			 //1double
		}
		else if (string.equals("ShearCentreY")) {
			resultList.add(((IfcStructuralProfileProperties) object).getShearCentreY());
			 //1double
		}
		else if (string.equals("TorsionalConstantX")) {
			resultList.add(((IfcStructuralProfileProperties) object).getTorsionalConstantX());
			 //1double
		}
		else if (string.equals("MomentOfInertiaYZAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMomentOfInertiaYZAsString());
			 //1String
		}
		else if (string.equals("MomentOfInertiaYAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMomentOfInertiaYAsString());
			 //1String
		}
		else if (string.equals("MomentOfInertiaZAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMomentOfInertiaZAsString());
			 //1String
		}
		else if (string.equals("WarpingConstantAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getWarpingConstantAsString());
			 //1String
		}
		else if (string.equals("ShearCentreZAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getShearCentreZAsString());
			 //1String
		}
		else if (string.equals("ShearCentreYAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getShearCentreYAsString());
			 //1String
		}
		else if (string.equals("ShearDeformationAreaZ")) {
			resultList.add(((IfcStructuralProfileProperties) object).getShearDeformationAreaZ());
			 //1double
		}
		else if (string.equals("ShearDeformationAreaY")) {
			resultList.add(((IfcStructuralProfileProperties) object).getShearDeformationAreaY());
			 //1double
		}
		else if (string.equals("MaximumSectionModulusY")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMaximumSectionModulusY());
			 //1double
		}
		else if (string.equals("MinimumSectionModulusY")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMinimumSectionModulusY());
			 //1double
		}
		else if (string.equals("MaximumSectionModulusZ")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMaximumSectionModulusZ());
			 //1double
		}
		else if (string.equals("MinimumSectionModulusZ")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMinimumSectionModulusZ());
			 //1double
		}
		else if (string.equals("TorsionalSectionModulus")) {
			resultList.add(((IfcStructuralProfileProperties) object).getTorsionalSectionModulus());
			 //1double
		}
		else if (string.equals("CentreOfGravityInYAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getCentreOfGravityInYAsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInXAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getCentreOfGravityInXAsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInY")) {
			resultList.add(((IfcStructuralProfileProperties) object).getCentreOfGravityInY());
			 //1double
		}
		else if (string.equals("PhysicalWeightAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getPhysicalWeightAsString());
			 //2String
		}
		else if (string.equals("MinimumPlateThickness")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMinimumPlateThickness());
			 //2double
		}
		else if (string.equals("MaximumPlateThickness")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMaximumPlateThickness());
			 //2double
		}
		else if (string.equals("CrossSectionAreaAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getCrossSectionAreaAsString());
			 //2String
		}
		else if (string.equals("MinimumPlateThicknessAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMinimumPlateThicknessAsString());
			 //2String
		}
		else if (string.equals("MaximumPlateThicknessAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getMaximumPlateThicknessAsString());
			 //2String
		}
		else if (string.equals("PhysicalWeight")) {
			resultList.add(((IfcStructuralProfileProperties) object).getPhysicalWeight());
			 //2double
		}
		else if (string.equals("PerimeterAsString")) {
			resultList.add(((IfcStructuralProfileProperties) object).getPerimeterAsString());
			 //2String
		}
		else if (string.equals("CrossSectionArea")) {
			resultList.add(((IfcStructuralProfileProperties) object).getCrossSectionArea());
			 //2double
		}
		else if (string.equals("Perimeter")) {
			resultList.add(((IfcStructuralProfileProperties) object).getPerimeter());
			 //2double
		}
		else if (string.equals("ProfileDefinition")) {
			resultList.add(((IfcStructuralProfileProperties) object).getProfileDefinition());
			 //3IfcProfileDef
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcStructuralProfileProperties) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
