package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfc2x3Package {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfc2x3Package(Object object, String string) {
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
		if (string.equals("WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getWrappedValue());
			 //1EClass
		}
		else if (string.equals("IfcRoot")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoot());
			 //1EClass
		}
		else if (string.equals("IfcLabel")) {
			resultList.add(((Ifc2x3Package) object).getIfcLabel());
			 //1EClass
		}
		else if (string.equals("IfcReal")) {
			resultList.add(((Ifc2x3Package) object).getIfcReal());
			 //1EClass
		}
		else if (string.equals("IfcText")) {
			resultList.add(((Ifc2x3Package) object).getIfcText());
			 //1EClass
		}
		else if (string.equals("IfcActor")) {
			resultList.add(((Ifc2x3Package) object).getIfcActor());
			 //1EClass
		}
		else if (string.equals("IfcAsset")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsset());
			 //1EClass
		}
		else if (string.equals("IfcBeam")) {
			resultList.add(((Ifc2x3Package) object).getIfcBeam());
			 //1EClass
		}
		else if (string.equals("IfcBlock")) {
			resultList.add(((Ifc2x3Package) object).getIfcBlock());
			 //1EClass
		}
		else if (string.equals("IfcCircle")) {
			resultList.add(((Ifc2x3Package) object).getIfcCircle());
			 //1EClass
		}
		else if (string.equals("IfcColumn")) {
			resultList.add(((Ifc2x3Package) object).getIfcColumn());
			 //1EClass
		}
		else if (string.equals("IfcConic")) {
			resultList.add(((Ifc2x3Package) object).getIfcConic());
			 //1EClass
		}
		else if (string.equals("IfcCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurve());
			 //1EClass
		}
		else if (string.equals("IfcDoor")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoor());
			 //1EClass
		}
		else if (string.equals("IfcEdge")) {
			resultList.add(((Ifc2x3Package) object).getIfcEdge());
			 //1EClass
		}
		else if (string.equals("IfcFace")) {
			resultList.add(((Ifc2x3Package) object).getIfcFace());
			 //1EClass
		}
		else if (string.equals("IfcGrid")) {
			resultList.add(((Ifc2x3Package) object).getIfcGrid());
			 //1EClass
		}
		else if (string.equals("IfcGroup")) {
			resultList.add(((Ifc2x3Package) object).getIfcGroup());
			 //1EClass
		}
		else if (string.equals("IfcLine")) {
			resultList.add(((Ifc2x3Package) object).getIfcLine());
			 //1EClass
		}
		else if (string.equals("IfcLoop")) {
			resultList.add(((Ifc2x3Package) object).getIfcLoop());
			 //1EClass
		}
		else if (string.equals("IfcMember")) {
			resultList.add(((Ifc2x3Package) object).getIfcMember());
			 //1EClass
		}
		else if (string.equals("IfcMetric")) {
			resultList.add(((Ifc2x3Package) object).getIfcMetric());
			 //1EClass
		}
		else if (string.equals("IfcMove")) {
			resultList.add(((Ifc2x3Package) object).getIfcMove());
			 //1EClass
		}
		else if (string.equals("IfcObject")) {
			resultList.add(((Ifc2x3Package) object).getIfcObject());
			 //1EClass
		}
		else if (string.equals("IfcPath")) {
			resultList.add(((Ifc2x3Package) object).getIfcPath());
			 //1EClass
		}
		else if (string.equals("IfcPermit")) {
			resultList.add(((Ifc2x3Package) object).getIfcPermit());
			 //1EClass
		}
		else if (string.equals("IfcPerson")) {
			resultList.add(((Ifc2x3Package) object).getIfcPerson());
			 //1EClass
		}
		else if (string.equals("IfcPile")) {
			resultList.add(((Ifc2x3Package) object).getIfcPile());
			 //1EClass
		}
		else if (string.equals("IfcPlane")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlane());
			 //1EClass
		}
		else if (string.equals("IfcPlate")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlate());
			 //1EClass
		}
		else if (string.equals("IfcPoint")) {
			resultList.add(((Ifc2x3Package) object).getIfcPoint());
			 //1EClass
		}
		else if (string.equals("IfcPort")) {
			resultList.add(((Ifc2x3Package) object).getIfcPort());
			 //1EClass
		}
		else if (string.equals("IfcProxy")) {
			resultList.add(((Ifc2x3Package) object).getIfcProxy());
			 //1EClass
		}
		else if (string.equals("IfcRamp")) {
			resultList.add(((Ifc2x3Package) object).getIfcRamp());
			 //1EClass
		}
		else if (string.equals("IfcRoof")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoof());
			 //1EClass
		}
		else if (string.equals("IfcSIUnit")) {
			resultList.add(((Ifc2x3Package) object).getIfcSIUnit());
			 //1EClass
		}
		else if (string.equals("IfcSite")) {
			resultList.add(((Ifc2x3Package) object).getIfcSite());
			 //1EClass
		}
		else if (string.equals("IfcSlab")) {
			resultList.add(((Ifc2x3Package) object).getIfcSlab());
			 //1EClass
		}
		else if (string.equals("IfcSpace")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpace());
			 //1EClass
		}
		else if (string.equals("IfcSphere")) {
			resultList.add(((Ifc2x3Package) object).getIfcSphere());
			 //1EClass
		}
		else if (string.equals("IfcStair")) {
			resultList.add(((Ifc2x3Package) object).getIfcStair());
			 //1EClass
		}
		else if (string.equals("IfcSystem")) {
			resultList.add(((Ifc2x3Package) object).getIfcSystem());
			 //1EClass
		}
		else if (string.equals("IfcTable")) {
			resultList.add(((Ifc2x3Package) object).getIfcTable());
			 //1EClass
		}
		else if (string.equals("IfcTask")) {
			resultList.add(((Ifc2x3Package) object).getIfcTask());
			 //1EClass
		}
		else if (string.equals("IfcTendon")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon());
			 //1EClass
		}
		else if (string.equals("IfcVector")) {
			resultList.add(((Ifc2x3Package) object).getIfcVector());
			 //1EClass
		}
		else if (string.equals("IfcVertex")) {
			resultList.add(((Ifc2x3Package) object).getIfcVertex());
			 //1EClass
		}
		else if (string.equals("IfcWall")) {
			resultList.add(((Ifc2x3Package) object).getIfcWall());
			 //1EClass
		}
		else if (string.equals("IfcWindow")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindow());
			 //1EClass
		}
		else if (string.equals("IfcZone")) {
			resultList.add(((Ifc2x3Package) object).getIfcZone());
			 //1EClass
		}
		else if (string.equals("IfcColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcColour());
			 //1EClass
		}
		else if (string.equals("IfcShell")) {
			resultList.add(((Ifc2x3Package) object).getIfcShell());
			 //1EClass
		}
		else if (string.equals("IfcUnit")) {
			resultList.add(((Ifc2x3Package) object).getIfcUnit());
			 //1EClass
		}
		else if (string.equals("IfcValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcValue());
			 //1EClass
		}
		else if (string.equals("Tristate")) {
			resultList.add(((Ifc2x3Package) object).getTristate());
			 //1EEnum
		}
		else if (string.equals("IfcModulusOfRotationalSubgradeReactionMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcModulusOfRotationalSubgradeReactionMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcHygroscopicMaterialProperties_UpperVaporResistanceFactorAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactorAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcHygroscopicMaterialProperties_LowerVaporResistanceFactorAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactorAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcHygroscopicMaterialProperties_IsothermalMoistureCapacityAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacityAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalConcreteMaterialProperties_CompressiveStrengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalConcreteMaterialProperties_CompressiveStrengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalConcreteMaterialProperties_ProtectivePoreRatioAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatioAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalMaterialProperties_ThermalExpansionCoefficientAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalMaterialProperties_ThermalExpansionCoefficientAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcementDefinitionProperties_ReinforcementSectionDefinitions")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementDefinitionProperties_ReinforcementSectionDefinitions());
			 //1EReference
		}
		else if (string.equals("IfcSectionReinforcementProperties_LongitudinalStartPositionAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionReinforcementProperties_LongitudinalStartPositionAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionReinforcementProperties_CrossSectionReinforcementDefinitions")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionReinforcementProperties_CrossSectionReinforcementDefinitions());
			 //1EReference
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacement_RotationalDisplacementRXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacement_RotationalDisplacementRYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacement_RotationalDisplacementRZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLuminousIntensityDistributionMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLuminousIntensityDistributionMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcModulusOfLinearSubgradeReactionMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcModulusOfLinearSubgradeReactionMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcModulusOfRotationalSubgradeReactionMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcModulusOfRotationalSubgradeReactionMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalExpansionCoefficientMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalExpansionCoefficientMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcAsymmetricIShapeProfileDef_TopFlangeFilletRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsymmetricIShapeProfileDef_TopFlangeFilletRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryEdgeCondition_RotationalStiffnessByLengthXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryEdgeCondition_RotationalStiffnessByLengthYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryEdgeCondition_RotationalStiffnessByLengthZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCartesianTransformationOperator2DnonUniform_Scale2AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator2DnonUniform_Scale2AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCartesianTransformationOperator3DnonUniform_Scale2AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator3DnonUniform_Scale2AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCartesianTransformationOperator3DnonUniform_Scale3AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator3DnonUniform_Scale3AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcConstraintClassificationRelationship_ClassifiedConstraint")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintClassificationRelationship_ClassifiedConstraint());
			 //1EReference
		}
		else if (string.equals("IfcConstraintClassificationRelationship_RelatedClassifications")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintClassificationRelationship_RelatedClassifications());
			 //1EReference
		}
		else if (string.equals("IfcAreaMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcAreaMeasure());
			 //1EClass
		}
		else if (string.equals("IfcBoolean")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoolean());
			 //1EClass
		}
		else if (string.equals("IfcCountMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcCountMeasure());
			 //1EClass
		}
		else if (string.equals("IfcEnergyMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnergyMeasure());
			 //1EClass
		}
		else if (string.equals("IfcForceMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcForceMeasure());
			 //1EClass
		}
		else if (string.equals("IfcIdentifier")) {
			resultList.add(((Ifc2x3Package) object).getIfcIdentifier());
			 //1EClass
		}
		else if (string.equals("IfcInteger")) {
			resultList.add(((Ifc2x3Package) object).getIfcInteger());
			 //1EClass
		}
		else if (string.equals("IfcLengthMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcLengthMeasure());
			 //1EClass
		}
		else if (string.equals("IfcLogical")) {
			resultList.add(((Ifc2x3Package) object).getIfcLogical());
			 //1EClass
		}
		else if (string.equals("IfcMassMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcMassMeasure());
			 //1EClass
		}
		else if (string.equals("IfcNumericMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcNumericMeasure());
			 //1EClass
		}
		else if (string.equals("IfcPHMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcPHMeasure());
			 //1EClass
		}
		else if (string.equals("IfcParameterValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcParameterValue());
			 //1EClass
		}
		else if (string.equals("IfcPowerMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcPowerMeasure());
			 //1EClass
		}
		else if (string.equals("IfcRatioMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcRatioMeasure());
			 //1EClass
		}
		else if (string.equals("IfcTimeMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeMeasure());
			 //1EClass
		}
		else if (string.equals("IfcTimeStamp")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeStamp());
			 //1EClass
		}
		else if (string.equals("IfcTorqueMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcTorqueMeasure());
			 //1EClass
		}
		else if (string.equals("IfcVolumeMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcVolumeMeasure());
			 //1EClass
		}
		else if (string.equals("IfcActionRequest")) {
			resultList.add(((Ifc2x3Package) object).getIfcActionRequest());
			 //1EClass
		}
		else if (string.equals("IfcActor_TheActor")) {
			resultList.add(((Ifc2x3Package) object).getIfcActor_TheActor());
			 //1EReference
		}
		else if (string.equals("IfcActorRole")) {
			resultList.add(((Ifc2x3Package) object).getIfcActorRole());
			 //1EClass
		}
		else if (string.equals("IfcActorRole_Role")) {
			resultList.add(((Ifc2x3Package) object).getIfcActorRole_Role());
			 //1EAttribute
		}
		else if (string.equals("IfcActuatorType")) {
			resultList.add(((Ifc2x3Package) object).getIfcActuatorType());
			 //1EClass
		}
		else if (string.equals("IfcAddress")) {
			resultList.add(((Ifc2x3Package) object).getIfcAddress());
			 //1EClass
		}
		else if (string.equals("IfcAlarmType")) {
			resultList.add(((Ifc2x3Package) object).getIfcAlarmType());
			 //1EClass
		}
		else if (string.equals("IfcAnnotation")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotation());
			 //1EClass
		}
		else if (string.equals("IfcApplication")) {
			resultList.add(((Ifc2x3Package) object).getIfcApplication());
			 //1EClass
		}
		else if (string.equals("IfcAppliedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValue());
			 //1EClass
		}
		else if (string.equals("IfcApproval")) {
			resultList.add(((Ifc2x3Package) object).getIfcApproval());
			 //1EClass
		}
		else if (string.equals("IfcApproval_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcApproval_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcAsset_AssetID")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsset_AssetID());
			 //1EAttribute
		}
		else if (string.equals("IfcAsset_Owner")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsset_Owner());
			 //1EReference
		}
		else if (string.equals("IfcAsset_User")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsset_User());
			 //1EReference
		}
		else if (string.equals("IfcAxis1Placement")) {
			resultList.add(((Ifc2x3Package) object).getIfcAxis1Placement());
			 //1EClass
		}
		else if (string.equals("IfcBSplineCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcBSplineCurve());
			 //1EClass
		}
		else if (string.equals("IfcBeamType")) {
			resultList.add(((Ifc2x3Package) object).getIfcBeamType());
			 //1EClass
		}
		else if (string.equals("IfcBezierCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcBezierCurve());
			 //1EClass
		}
		else if (string.equals("IfcBlobTexture")) {
			resultList.add(((Ifc2x3Package) object).getIfcBlobTexture());
			 //1EClass
		}
		else if (string.equals("IfcBlock_XLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcBlock_XLength());
			 //1EAttribute
		}
		else if (string.equals("IfcBlock_YLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcBlock_YLength());
			 //1EAttribute
		}
		else if (string.equals("IfcBlock_ZLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcBlock_ZLength());
			 //1EAttribute
		}
		else if (string.equals("IfcBoilerType")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoilerType());
			 //1EClass
		}
		else if (string.equals("IfcBooleanResult")) {
			resultList.add(((Ifc2x3Package) object).getIfcBooleanResult());
			 //1EClass
		}
		else if (string.equals("IfcBoundedCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundedCurve());
			 //1EClass
		}
		else if (string.equals("IfcBoundedSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundedSurface());
			 //1EClass
		}
		else if (string.equals("IfcBoundingBox")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundingBox());
			 //1EClass
		}
		else if (string.equals("IfcBoxedHalfSpace")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoxedHalfSpace());
			 //1EClass
		}
		else if (string.equals("IfcBuilding")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuilding());
			 //1EClass
		}
		else if (string.equals("IfcBuildingStorey")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuildingStorey());
			 //1EClass
		}
		else if (string.equals("IfcCalendarDate")) {
			resultList.add(((Ifc2x3Package) object).getIfcCalendarDate());
			 //1EClass
		}
		else if (string.equals("IfcCartesianPoint")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianPoint());
			 //1EClass
		}
		else if (string.equals("IfcChillerType")) {
			resultList.add(((Ifc2x3Package) object).getIfcChillerType());
			 //1EClass
		}
		else if (string.equals("IfcCircle_Radius")) {
			resultList.add(((Ifc2x3Package) object).getIfcCircle_Radius());
			 //1EAttribute
		}
		else if (string.equals("IfcClassification")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassification());
			 //1EClass
		}
		else if (string.equals("IfcClosedShell")) {
			resultList.add(((Ifc2x3Package) object).getIfcClosedShell());
			 //1EClass
		}
		else if (string.equals("IfcCoilType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCoilType());
			 //1EClass
		}
		else if (string.equals("IfcColourRgb")) {
			resultList.add(((Ifc2x3Package) object).getIfcColourRgb());
			 //1EClass
		}
		else if (string.equals("IfcColourRgb_Red")) {
			resultList.add(((Ifc2x3Package) object).getIfcColourRgb_Red());
			 //1EAttribute
		}
		else if (string.equals("IfcColourRgb_Blue")) {
			resultList.add(((Ifc2x3Package) object).getIfcColourRgb_Blue());
			 //1EAttribute
		}
		else if (string.equals("IfcColumnType")) {
			resultList.add(((Ifc2x3Package) object).getIfcColumnType());
			 //1EClass
		}
		else if (string.equals("IfcCompositeCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompositeCurve());
			 //1EClass
		}
		else if (string.equals("IfcCompressorType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompressorType());
			 //1EClass
		}
		else if (string.equals("IfcCondenserType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCondenserType());
			 //1EClass
		}
		else if (string.equals("IfcCondition")) {
			resultList.add(((Ifc2x3Package) object).getIfcCondition());
			 //1EClass
		}
		else if (string.equals("IfcConic_Position")) {
			resultList.add(((Ifc2x3Package) object).getIfcConic_Position());
			 //1EReference
		}
		else if (string.equals("IfcConstraint")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint());
			 //1EClass
		}
		else if (string.equals("IfcControl")) {
			resultList.add(((Ifc2x3Package) object).getIfcControl());
			 //1EClass
		}
		else if (string.equals("IfcControllerType")) {
			resultList.add(((Ifc2x3Package) object).getIfcControllerType());
			 //1EClass
		}
		else if (string.equals("IfcCooledBeamType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCooledBeamType());
			 //1EClass
		}
		else if (string.equals("IfcCostItem")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostItem());
			 //1EClass
		}
		else if (string.equals("IfcCostSchedule")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostSchedule());
			 //1EClass
		}
		else if (string.equals("IfcCostValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostValue());
			 //1EClass
		}
		else if (string.equals("IfcCovering")) {
			resultList.add(((Ifc2x3Package) object).getIfcCovering());
			 //1EClass
		}
		else if (string.equals("IfcCoveringType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCoveringType());
			 //1EClass
		}
		else if (string.equals("IfcCrewResource")) {
			resultList.add(((Ifc2x3Package) object).getIfcCrewResource());
			 //1EClass
		}
		else if (string.equals("IfcCsgPrimitive3D")) {
			resultList.add(((Ifc2x3Package) object).getIfcCsgPrimitive3D());
			 //1EClass
		}
		else if (string.equals("IfcCsgSolid")) {
			resultList.add(((Ifc2x3Package) object).getIfcCsgSolid());
			 //1EClass
		}
		else if (string.equals("IfcCurtainWall")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurtainWall());
			 //1EClass
		}
		else if (string.equals("IfcCurve_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurve_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcCurveStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyle());
			 //1EClass
		}
		else if (string.equals("IfcCurveStyleFont")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFont());
			 //1EClass
		}
		else if (string.equals("IfcDamperType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDamperType());
			 //1EClass
		}
		else if (string.equals("IfcDateAndTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcDateAndTime());
			 //1EClass
		}
		else if (string.equals("IfcDefinedSymbol")) {
			resultList.add(((Ifc2x3Package) object).getIfcDefinedSymbol());
			 //1EClass
		}
		else if (string.equals("IfcDerivedUnit")) {
			resultList.add(((Ifc2x3Package) object).getIfcDerivedUnit());
			 //1EClass
		}
		else if (string.equals("IfcDimensionCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionCurve());
			 //1EClass
		}
		else if (string.equals("IfcDimensionPair")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionPair());
			 //1EClass
		}
		else if (string.equals("IfcDirection")) {
			resultList.add(((Ifc2x3Package) object).getIfcDirection());
			 //1EClass
		}
		else if (string.equals("IfcDirection_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcDirection_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorStyle());
			 //1EClass
		}
		else if (string.equals("IfcEdge_EdgeStart")) {
			resultList.add(((Ifc2x3Package) object).getIfcEdge_EdgeStart());
			 //1EReference
		}
		else if (string.equals("IfcEdge_EdgeEnd")) {
			resultList.add(((Ifc2x3Package) object).getIfcEdge_EdgeEnd());
			 //1EReference
		}
		else if (string.equals("IfcEdgeCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcEdgeCurve());
			 //1EClass
		}
		else if (string.equals("IfcEdgeFeature")) {
			resultList.add(((Ifc2x3Package) object).getIfcEdgeFeature());
			 //1EClass
		}
		else if (string.equals("IfcEdgeLoop")) {
			resultList.add(((Ifc2x3Package) object).getIfcEdgeLoop());
			 //1EClass
		}
		else if (string.equals("IfcElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement());
			 //1EClass
		}
		else if (string.equals("IfcElement_Tag")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement_Tag());
			 //1EAttribute
		}
		else if (string.equals("IfcElementType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementType());
			 //1EClass
		}
		else if (string.equals("IfcEllipse")) {
			resultList.add(((Ifc2x3Package) object).getIfcEllipse());
			 //1EClass
		}
		else if (string.equals("IfcEvaporatorType")) {
			resultList.add(((Ifc2x3Package) object).getIfcEvaporatorType());
			 //1EClass
		}
		else if (string.equals("IfcFace_Bounds")) {
			resultList.add(((Ifc2x3Package) object).getIfcFace_Bounds());
			 //1EReference
		}
		else if (string.equals("IfcFaceBound")) {
			resultList.add(((Ifc2x3Package) object).getIfcFaceBound());
			 //1EClass
		}
		else if (string.equals("IfcFaceOuterBound")) {
			resultList.add(((Ifc2x3Package) object).getIfcFaceOuterBound());
			 //1EClass
		}
		else if (string.equals("IfcFaceSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcFaceSurface());
			 //1EClass
		}
		else if (string.equals("IfcFacetedBrep")) {
			resultList.add(((Ifc2x3Package) object).getIfcFacetedBrep());
			 //1EClass
		}
		else if (string.equals("IfcFanType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFanType());
			 //1EClass
		}
		else if (string.equals("IfcFastener")) {
			resultList.add(((Ifc2x3Package) object).getIfcFastener());
			 //1EClass
		}
		else if (string.equals("IfcFastenerType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFastenerType());
			 //1EClass
		}
		else if (string.equals("IfcFeatureElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcFeatureElement());
			 //1EClass
		}
		else if (string.equals("IfcFillAreaStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyle());
			 //1EClass
		}
		else if (string.equals("IfcFilterType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFilterType());
			 //1EClass
		}
		else if (string.equals("IfcFlowController")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowController());
			 //1EClass
		}
		else if (string.equals("IfcFlowFitting")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowFitting());
			 //1EClass
		}
		else if (string.equals("IfcFlowMeterType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowMeterType());
			 //1EClass
		}
		else if (string.equals("IfcFlowSegment")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowSegment());
			 //1EClass
		}
		else if (string.equals("IfcFlowTerminal")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowTerminal());
			 //1EClass
		}
		else if (string.equals("IfcFooting")) {
			resultList.add(((Ifc2x3Package) object).getIfcFooting());
			 //1EClass
		}
		else if (string.equals("IfcFuelProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcFuelProperties());
			 //1EClass
		}
		else if (string.equals("IfcFurnitureType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFurnitureType());
			 //1EClass
		}
		else if (string.equals("IfcGeometricSet")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricSet());
			 //1EClass
		}
		else if (string.equals("IfcGrid_UAxes")) {
			resultList.add(((Ifc2x3Package) object).getIfcGrid_UAxes());
			 //1EReference
		}
		else if (string.equals("IfcGrid_VAxes")) {
			resultList.add(((Ifc2x3Package) object).getIfcGrid_VAxes());
			 //1EReference
		}
		else if (string.equals("IfcGrid_WAxes")) {
			resultList.add(((Ifc2x3Package) object).getIfcGrid_WAxes());
			 //1EReference
		}
		else if (string.equals("IfcGridAxis")) {
			resultList.add(((Ifc2x3Package) object).getIfcGridAxis());
			 //1EClass
		}
		else if (string.equals("IfcGridPlacement")) {
			resultList.add(((Ifc2x3Package) object).getIfcGridPlacement());
			 //1EClass
		}
		else if (string.equals("IfcHalfSpaceSolid")) {
			resultList.add(((Ifc2x3Package) object).getIfcHalfSpaceSolid());
			 //1EClass
		}
		else if (string.equals("IfcHumidifierType")) {
			resultList.add(((Ifc2x3Package) object).getIfcHumidifierType());
			 //1EClass
		}
		else if (string.equals("IfcImageTexture")) {
			resultList.add(((Ifc2x3Package) object).getIfcImageTexture());
			 //1EClass
		}
		else if (string.equals("IfcInventory")) {
			resultList.add(((Ifc2x3Package) object).getIfcInventory());
			 //1EClass
		}
		else if (string.equals("IfcLaborResource")) {
			resultList.add(((Ifc2x3Package) object).getIfcLaborResource());
			 //1EClass
		}
		else if (string.equals("IfcLampType")) {
			resultList.add(((Ifc2x3Package) object).getIfcLampType());
			 //1EClass
		}
		else if (string.equals("IfcLightSource")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSource());
			 //1EClass
		}
		else if (string.equals("IfcLine_Pnt")) {
			resultList.add(((Ifc2x3Package) object).getIfcLine_Pnt());
			 //1EReference
		}
		else if (string.equals("IfcLine_Dir")) {
			resultList.add(((Ifc2x3Package) object).getIfcLine_Dir());
			 //1EReference
		}
		else if (string.equals("IfcLocalPlacement")) {
			resultList.add(((Ifc2x3Package) object).getIfcLocalPlacement());
			 //1EClass
		}
		else if (string.equals("IfcLocalTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcLocalTime());
			 //1EClass
		}
		else if (string.equals("IfcLocalTime_Zone")) {
			resultList.add(((Ifc2x3Package) object).getIfcLocalTime_Zone());
			 //1EReference
		}
		else if (string.equals("IfcMappedItem")) {
			resultList.add(((Ifc2x3Package) object).getIfcMappedItem());
			 //1EClass
		}
		else if (string.equals("IfcMaterial")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterial());
			 //1EClass
		}
		else if (string.equals("IfcMaterial_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterial_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcMaterialLayer")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayer());
			 //1EClass
		}
		else if (string.equals("IfcMaterialList")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialList());
			 //1EClass
		}
		else if (string.equals("IfcMemberType")) {
			resultList.add(((Ifc2x3Package) object).getIfcMemberType());
			 //1EClass
		}
		else if (string.equals("IfcMonetaryUnit")) {
			resultList.add(((Ifc2x3Package) object).getIfcMonetaryUnit());
			 //1EClass
		}
		else if (string.equals("IfcMove_MoveFrom")) {
			resultList.add(((Ifc2x3Package) object).getIfcMove_MoveFrom());
			 //1EReference
		}
		else if (string.equals("IfcMove_MoveTo")) {
			resultList.add(((Ifc2x3Package) object).getIfcMove_MoveTo());
			 //1EReference
		}
		else if (string.equals("IfcMove_PunchList")) {
			resultList.add(((Ifc2x3Package) object).getIfcMove_PunchList());
			 //1EAttribute
		}
		else if (string.equals("IfcNamedUnit")) {
			resultList.add(((Ifc2x3Package) object).getIfcNamedUnit());
			 //1EClass
		}
		else if (string.equals("IfcObjective")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjective());
			 //1EClass
		}
		else if (string.equals("IfcOccupant")) {
			resultList.add(((Ifc2x3Package) object).getIfcOccupant());
			 //1EClass
		}
		else if (string.equals("IfcOffsetCurve2D")) {
			resultList.add(((Ifc2x3Package) object).getIfcOffsetCurve2D());
			 //1EClass
		}
		else if (string.equals("IfcOffsetCurve3D")) {
			resultList.add(((Ifc2x3Package) object).getIfcOffsetCurve3D());
			 //1EClass
		}
		else if (string.equals("IfcOpenShell")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpenShell());
			 //1EClass
		}
		else if (string.equals("IfcOpeningElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpeningElement());
			 //1EClass
		}
		else if (string.equals("IfcOrderAction")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrderAction());
			 //1EClass
		}
		else if (string.equals("IfcOrganization")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganization());
			 //1EClass
		}
		else if (string.equals("IfcOrientedEdge")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrientedEdge());
			 //1EClass
		}
		else if (string.equals("IfcOutletType")) {
			resultList.add(((Ifc2x3Package) object).getIfcOutletType());
			 //1EClass
		}
		else if (string.equals("IfcOwnerHistory")) {
			resultList.add(((Ifc2x3Package) object).getIfcOwnerHistory());
			 //1EClass
		}
		else if (string.equals("IfcPath_EdgeList")) {
			resultList.add(((Ifc2x3Package) object).getIfcPath_EdgeList());
			 //1EReference
		}
		else if (string.equals("IfcPerson_Id")) {
			resultList.add(((Ifc2x3Package) object).getIfcPerson_Id());
			 //1EAttribute
		}
		else if (string.equals("IfcPerson_Roles")) {
			resultList.add(((Ifc2x3Package) object).getIfcPerson_Roles());
			 //1EReference
		}
		else if (string.equals("IfcPixelTexture")) {
			resultList.add(((Ifc2x3Package) object).getIfcPixelTexture());
			 //1EClass
		}
		else if (string.equals("IfcPlacement")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlacement());
			 //1EClass
		}
		else if (string.equals("IfcPlacement_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlacement_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcPlanarBox")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlanarBox());
			 //1EClass
		}
		else if (string.equals("IfcPlanarExtent")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlanarExtent());
			 //1EClass
		}
		else if (string.equals("IfcPlateType")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlateType());
			 //1EClass
		}
		else if (string.equals("IfcPointOnCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcPointOnCurve());
			 //1EClass
		}
		else if (string.equals("IfcPointOnSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcPointOnSurface());
			 //1EClass
		}
		else if (string.equals("IfcPolyLoop")) {
			resultList.add(((Ifc2x3Package) object).getIfcPolyLoop());
			 //1EClass
		}
		else if (string.equals("IfcPolyline")) {
			resultList.add(((Ifc2x3Package) object).getIfcPolyline());
			 //1EClass
		}
		else if (string.equals("IfcPostalAddress")) {
			resultList.add(((Ifc2x3Package) object).getIfcPostalAddress());
			 //1EClass
		}
		else if (string.equals("IfcPreDefinedItem")) {
			resultList.add(((Ifc2x3Package) object).getIfcPreDefinedItem());
			 //1EClass
		}
		else if (string.equals("IfcProcedure")) {
			resultList.add(((Ifc2x3Package) object).getIfcProcedure());
			 //1EClass
		}
		else if (string.equals("IfcProcess")) {
			resultList.add(((Ifc2x3Package) object).getIfcProcess());
			 //1EClass
		}
		else if (string.equals("IfcProduct")) {
			resultList.add(((Ifc2x3Package) object).getIfcProduct());
			 //1EClass
		}
		else if (string.equals("IfcProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcProject")) {
			resultList.add(((Ifc2x3Package) object).getIfcProject());
			 //1EClass
		}
		else if (string.equals("IfcProject_Phase")) {
			resultList.add(((Ifc2x3Package) object).getIfcProject_Phase());
			 //1EAttribute
		}
		else if (string.equals("IfcProjectOrder")) {
			resultList.add(((Ifc2x3Package) object).getIfcProjectOrder());
			 //1EClass
		}
		else if (string.equals("IfcProperty")) {
			resultList.add(((Ifc2x3Package) object).getIfcProperty());
			 //1EClass
		}
		else if (string.equals("IfcProperty_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcProperty_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcPropertySet")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertySet());
			 //1EClass
		}
		else if (string.equals("IfcProxy_Tag")) {
			resultList.add(((Ifc2x3Package) object).getIfcProxy_Tag());
			 //1EAttribute
		}
		else if (string.equals("IfcPumpType")) {
			resultList.add(((Ifc2x3Package) object).getIfcPumpType());
			 //1EClass
		}
		else if (string.equals("IfcQuantityArea")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityArea());
			 //1EClass
		}
		else if (string.equals("IfcQuantityCount")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityCount());
			 //1EClass
		}
		else if (string.equals("IfcQuantityLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityLength());
			 //1EClass
		}
		else if (string.equals("IfcQuantityTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityTime());
			 //1EClass
		}
		else if (string.equals("IfcQuantityVolume")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityVolume());
			 //1EClass
		}
		else if (string.equals("IfcQuantityWeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityWeight());
			 //1EClass
		}
		else if (string.equals("IfcRailing")) {
			resultList.add(((Ifc2x3Package) object).getIfcRailing());
			 //1EClass
		}
		else if (string.equals("IfcRailingType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRailingType());
			 //1EClass
		}
		else if (string.equals("IfcRamp_ShapeType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRamp_ShapeType());
			 //1EAttribute
		}
		else if (string.equals("IfcRampFlight")) {
			resultList.add(((Ifc2x3Package) object).getIfcRampFlight());
			 //1EClass
		}
		else if (string.equals("IfcRampFlightType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRampFlightType());
			 //1EClass
		}
		else if (string.equals("IfcReinforcingBar")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingBar());
			 //1EClass
		}
		else if (string.equals("IfcRelAggregates")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAggregates());
			 //1EClass
		}
		else if (string.equals("IfcRelAssigns")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssigns());
			 //1EClass
		}
		else if (string.equals("IfcRelAssociates")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociates());
			 //1EClass
		}
		else if (string.equals("IfcRelConnects")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnects());
			 //1EClass
		}
		else if (string.equals("IfcRelDecomposes")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelDecomposes());
			 //1EClass
		}
		else if (string.equals("IfcRelDefines")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelDefines());
			 //1EClass
		}
		else if (string.equals("IfcRelNests")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelNests());
			 //1EClass
		}
		else if (string.equals("IfcRelSequence")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelSequence());
			 //1EClass
		}
		else if (string.equals("IfcRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelationship());
			 //1EClass
		}
		else if (string.equals("IfcRelaxation")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelaxation());
			 //1EClass
		}
		else if (string.equals("IfcRepresentation")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentation());
			 //1EClass
		}
		else if (string.equals("IfcResource")) {
			resultList.add(((Ifc2x3Package) object).getIfcResource());
			 //1EClass
		}
		else if (string.equals("IfcRoof_ShapeType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoof_ShapeType());
			 //1EAttribute
		}
		else if (string.equals("IfcRoot_GlobalId")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoot_GlobalId());
			 //1EReference
		}
		else if (string.equals("IfcRoot_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoot_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcSIUnit_Prefix")) {
			resultList.add(((Ifc2x3Package) object).getIfcSIUnit_Prefix());
			 //1EAttribute
		}
		else if (string.equals("IfcSIUnit_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcSIUnit_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionedSpine")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionedSpine());
			 //1EClass
		}
		else if (string.equals("IfcSensorType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSensorType());
			 //1EClass
		}
		else if (string.equals("IfcServiceLife")) {
			resultList.add(((Ifc2x3Package) object).getIfcServiceLife());
			 //1EClass
		}
		else if (string.equals("IfcShapeAspect")) {
			resultList.add(((Ifc2x3Package) object).getIfcShapeAspect());
			 //1EClass
		}
		else if (string.equals("IfcShapeModel")) {
			resultList.add(((Ifc2x3Package) object).getIfcShapeModel());
			 //1EClass
		}
		else if (string.equals("IfcSimpleProperty")) {
			resultList.add(((Ifc2x3Package) object).getIfcSimpleProperty());
			 //1EClass
		}
		else if (string.equals("IfcSlabType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSlabType());
			 //1EClass
		}
		else if (string.equals("IfcSolidModel")) {
			resultList.add(((Ifc2x3Package) object).getIfcSolidModel());
			 //1EClass
		}
		else if (string.equals("IfcSolidModel_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcSolidModel_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcSoundValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundValue());
			 //1EClass
		}
		else if (string.equals("IfcSpaceProgram")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceProgram());
			 //1EClass
		}
		else if (string.equals("IfcSpaceType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceType());
			 //1EClass
		}
		else if (string.equals("IfcSphere_Radius")) {
			resultList.add(((Ifc2x3Package) object).getIfcSphere_Radius());
			 //1EAttribute
		}
		else if (string.equals("IfcStairFlight")) {
			resultList.add(((Ifc2x3Package) object).getIfcStairFlight());
			 //1EClass
		}
		else if (string.equals("IfcStructuralItem")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralItem());
			 //1EClass
		}
		else if (string.equals("IfcStructuralLoad")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoad());
			 //1EClass
		}
		else if (string.equals("IfcStyleModel")) {
			resultList.add(((Ifc2x3Package) object).getIfcStyleModel());
			 //1EClass
		}
		else if (string.equals("IfcStyledItem")) {
			resultList.add(((Ifc2x3Package) object).getIfcStyledItem());
			 //1EClass
		}
		else if (string.equals("IfcSubedge")) {
			resultList.add(((Ifc2x3Package) object).getIfcSubedge());
			 //1EClass
		}
		else if (string.equals("IfcSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurface());
			 //1EClass
		}
		else if (string.equals("IfcSurfaceStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyle());
			 //1EClass
		}
		else if (string.equals("IfcSurfaceTexture")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceTexture());
			 //1EClass
		}
		else if (string.equals("IfcSweptAreaSolid")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptAreaSolid());
			 //1EClass
		}
		else if (string.equals("IfcSweptDiskSolid")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptDiskSolid());
			 //1EClass
		}
		else if (string.equals("IfcSweptSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptSurface());
			 //1EClass
		}
		else if (string.equals("IfcSymbolStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcSymbolStyle());
			 //1EClass
		}
		else if (string.equals("IfcTable_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcTable_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcTable_Rows")) {
			resultList.add(((Ifc2x3Package) object).getIfcTable_Rows());
			 //1EReference
		}
		else if (string.equals("IfcTableRow")) {
			resultList.add(((Ifc2x3Package) object).getIfcTableRow());
			 //1EClass
		}
		else if (string.equals("IfcTankType")) {
			resultList.add(((Ifc2x3Package) object).getIfcTankType());
			 //1EClass
		}
		else if (string.equals("IfcTask_TaskId")) {
			resultList.add(((Ifc2x3Package) object).getIfcTask_TaskId());
			 //1EAttribute
		}
		else if (string.equals("IfcTask_Status")) {
			resultList.add(((Ifc2x3Package) object).getIfcTask_Status());
			 //1EAttribute
		}
		else if (string.equals("IfcTask_Priority")) {
			resultList.add(((Ifc2x3Package) object).getIfcTask_Priority());
			 //1EAttribute
		}
		else if (string.equals("IfcTelecomAddress")) {
			resultList.add(((Ifc2x3Package) object).getIfcTelecomAddress());
			 //1EClass
		}
		else if (string.equals("IfcTendonAnchor")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendonAnchor());
			 //1EClass
		}
		else if (string.equals("IfcTextLiteral")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextLiteral());
			 //1EClass
		}
		else if (string.equals("IfcTextStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyle());
			 //1EClass
		}
		else if (string.equals("IfcTextureMap")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextureMap());
			 //1EClass
		}
		else if (string.equals("IfcTextureVertex")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextureVertex());
			 //1EClass
		}
		else if (string.equals("IfcTimeSeries")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeries());
			 //1EClass
		}
		else if (string.equals("IfcTrimmedCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrimmedCurve());
			 //1EClass
		}
		else if (string.equals("IfcTubeBundleType")) {
			resultList.add(((Ifc2x3Package) object).getIfcTubeBundleType());
			 //1EClass
		}
		else if (string.equals("IfcTypeObject")) {
			resultList.add(((Ifc2x3Package) object).getIfcTypeObject());
			 //1EClass
		}
		else if (string.equals("IfcTypeProduct")) {
			resultList.add(((Ifc2x3Package) object).getIfcTypeProduct());
			 //1EClass
		}
		else if (string.equals("IfcUnitAssignment")) {
			resultList.add(((Ifc2x3Package) object).getIfcUnitAssignment());
			 //1EClass
		}
		else if (string.equals("IfcValveType")) {
			resultList.add(((Ifc2x3Package) object).getIfcValveType());
			 //1EClass
		}
		else if (string.equals("IfcVector_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcVector_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcVertexLoop")) {
			resultList.add(((Ifc2x3Package) object).getIfcVertexLoop());
			 //1EClass
		}
		else if (string.equals("IfcVertexPoint")) {
			resultList.add(((Ifc2x3Package) object).getIfcVertexPoint());
			 //1EClass
		}
		else if (string.equals("IfcVirtualElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcVirtualElement());
			 //1EClass
		}
		else if (string.equals("IfcWallType")) {
			resultList.add(((Ifc2x3Package) object).getIfcWallType());
			 //1EClass
		}
		else if (string.equals("IfcWindowStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowStyle());
			 //1EClass
		}
		else if (string.equals("IfcWorkControl")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControl());
			 //1EClass
		}
		else if (string.equals("IfcWorkPlan")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkPlan());
			 //1EClass
		}
		else if (string.equals("IfcWorkSchedule")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkSchedule());
			 //1EClass
		}
		else if (string.equals("IfcActorSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcActorSelect());
			 //1EClass
		}
		else if (string.equals("IfcAxis2Placement")) {
			resultList.add(((Ifc2x3Package) object).getIfcAxis2Placement());
			 //1EClass
		}
		else if (string.equals("IfcBooleanOperand")) {
			resultList.add(((Ifc2x3Package) object).getIfcBooleanOperand());
			 //1EClass
		}
		else if (string.equals("IfcColourOrFactor")) {
			resultList.add(((Ifc2x3Package) object).getIfcColourOrFactor());
			 //1EClass
		}
		else if (string.equals("IfcCsgSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcCsgSelect());
			 //1EClass
		}
		else if (string.equals("IfcDateTimeSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcDateTimeSelect());
			 //1EClass
		}
		else if (string.equals("IfcDocumentSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentSelect());
			 //1EClass
		}
		else if (string.equals("IfcLayeredItem")) {
			resultList.add(((Ifc2x3Package) object).getIfcLayeredItem());
			 //1EClass
		}
		else if (string.equals("IfcLibrarySelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcLibrarySelect());
			 //1EClass
		}
		else if (string.equals("IfcMaterialSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialSelect());
			 //1EClass
		}
		else if (string.equals("IfcMeasureValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcMeasureValue());
			 //1EClass
		}
		else if (string.equals("IfcSimpleValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcSimpleValue());
			 //1EClass
		}
		else if (string.equals("IfcSizeSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcSizeSelect());
			 //1EClass
		}
		else if (string.equals("IfcTextFontSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextFontSelect());
			 //1EClass
		}
		else if (string.equals("IfcTrimmingSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrimmingSelect());
			 //1EClass
		}
		else if (string.equals("IfcActionTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcActionTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcAheadOrBehind")) {
			resultList.add(((Ifc2x3Package) object).getIfcAheadOrBehind());
			 //1EEnum
		}
		else if (string.equals("IfcAlarmTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcAlarmTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcAbsorbedDoseMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcAbsorbedDoseMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcAccelerationMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcAccelerationMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcAmountOfSubstanceMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcAmountOfSubstanceMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcAngularVelocityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcAngularVelocityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcContextDependentMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcContextDependentMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDoseEquivalentMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoseEquivalentMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDynamicViscosityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDynamicViscosityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricCapacitanceMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricCapacitanceMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricChargeMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricChargeMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricConductanceMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricConductanceMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricCurrentMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricCurrentMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricResistanceMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricResistanceMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricVoltageMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricVoltageMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcHeatFluxDensityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcHeatFluxDensityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcHeatingValueMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcHeatingValueMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcIlluminanceMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcIlluminanceMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcIonConcentrationMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcIonConcentrationMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcIsothermalMoistureCapacityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcIsothermalMoistureCapacityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcKinematicViscosityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcKinematicViscosityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLinearForceMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLinearForceMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLinearMomentMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLinearMomentMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLinearStiffnessMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLinearStiffnessMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLinearVelocityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLinearVelocityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLuminousFluxMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLuminousFluxMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLuminousIntensityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLuminousIntensityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMagneticFluxDensityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcMagneticFluxDensityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcMagneticFluxMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMagneticFluxMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMassDensityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMassDensityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMassFlowRateMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMassFlowRateMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMassPerLengthMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMassPerLengthMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcModulusOfElasticityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcModulusOfElasticityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcModulusOfRotationalSubgradeReactionMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcModulusOfRotationalSubgradeReactionMeasure());
			 //1EClass
		}
		else if (string.equals("IfcModulusOfSubgradeReactionMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcModulusOfSubgradeReactionMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcMoistureDiffusivityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcMoistureDiffusivityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcMolecularWeightMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMolecularWeightMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMomentOfInertiaMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMomentOfInertiaMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcPlanarForceMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlanarForceMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRadioActivityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRadioActivityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRotationalFrequencyMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcRotationalFrequencyMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcRotationalMassMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRotationalMassMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRotationalStiffnessMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcRotationalStiffnessMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionModulusMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionModulusMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionalAreaIntegralMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionalAreaIntegralMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcShearModulusMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcShearModulusMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSoundPressureMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundPressureMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSpecificHeatCapacityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpecificHeatCapacityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcTemperatureGradientMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcTemperatureGradientMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalAdmittanceMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalAdmittanceMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalConductivityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalConductivityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalResistanceMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalResistanceMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalTransmittanceMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalTransmittanceMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcThermodynamicTemperatureMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermodynamicTemperatureMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcVaporPermeabilityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcVaporPermeabilityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcVolumetricFlowRateMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcVolumetricFlowRateMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWarpingConstantMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWarpingConstantMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWarpingMomentMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWarpingMomentMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcAirToAirHeatRecoveryType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcAirToAirHeatRecoveryType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcAnnotationFillAreaOccurrence_FillStyleTarget")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationFillAreaOccurrence_FillStyleTarget());
			 //1EReference
		}
		else if (string.equals("IfcAnnotationFillAreaOccurrence_GlobalOrLocal")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationFillAreaOccurrence_GlobalOrLocal());
			 //1EAttribute
		}
		else if (string.equals("IfcAppliedValueRelationship_ComponentOfTotal")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValueRelationship_ComponentOfTotal());
			 //1EReference
		}
		else if (string.equals("IfcAppliedValueRelationship_ArithmeticOperator")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValueRelationship_ArithmeticOperator());
			 //1EAttribute
		}
		else if (string.equals("IfcArbitraryProfileDefWithVoids_InnerCurves")) {
			resultList.add(((Ifc2x3Package) object).getIfcArbitraryProfileDefWithVoids_InnerCurves());
			 //1EReference
		}
		else if (string.equals("IfcAsymmetricIShapeProfileDef_TopFlangeWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsymmetricIShapeProfileDef_TopFlangeWidth());
			 //1EAttribute
		}
		else if (string.equals("IfcAsymmetricIShapeProfileDef_TopFlangeThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsymmetricIShapeProfileDef_TopFlangeThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcAsymmetricIShapeProfileDef_CentreOfGravityInY")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsymmetricIShapeProfileDef_CentreOfGravityInY());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryEdgeCondition_LinearStiffnessByLengthX")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryEdgeCondition_LinearStiffnessByLengthY")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryEdgeCondition_LinearStiffnessByLengthZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryFaceCondition_LinearStiffnessByAreaX")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryFaceCondition_LinearStiffnessByAreaX());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryFaceCondition_LinearStiffnessByAreaY")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryFaceCondition_LinearStiffnessByAreaY());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryFaceCondition_LinearStiffnessByAreaZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryNodeCondition_LinearStiffnessXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeCondition_LinearStiffnessXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricCapacitanceMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricCapacitanceMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricConductanceMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricConductanceMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcIsothermalMoistureCapacityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcIsothermalMoistureCapacityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLuminousIntensityDistributionMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcLuminousIntensityDistributionMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcMagneticFluxDensityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMagneticFluxDensityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcModulusOfElasticityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcModulusOfElasticityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcModulusOfLinearSubgradeReactionMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcModulusOfLinearSubgradeReactionMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcModulusOfSubgradeReactionMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcModulusOfSubgradeReactionMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMoistureDiffusivityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMoistureDiffusivityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRotationalFrequencyMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRotationalFrequencyMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRotationalStiffnessMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRotationalStiffnessMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionalAreaIntegralMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionalAreaIntegralMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSpecificHeatCapacityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpecificHeatCapacityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTemperatureGradientMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTemperatureGradientMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalConductivityMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalConductivityMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalExpansionCoefficientMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalExpansionCoefficientMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalTransmittanceMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalTransmittanceMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcThermodynamicTemperatureMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermodynamicTemperatureMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcApprovalPropertyRelationship_ApprovedProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcApprovalPropertyRelationship_ApprovedProperties());
			 //1EReference
		}
		else if (string.equals("IfcAsymmetricIShapeProfileDef_TopFlangeWidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsymmetricIShapeProfileDef_TopFlangeWidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcAsymmetricIShapeProfileDef_TopFlangeThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsymmetricIShapeProfileDef_TopFlangeThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcAsymmetricIShapeProfileDef_TopFlangeFilletRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsymmetricIShapeProfileDef_TopFlangeFilletRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcAsymmetricIShapeProfileDef_CentreOfGravityInYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsymmetricIShapeProfileDef_CentreOfGravityInYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryEdgeCondition_LinearStiffnessByLengthXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryEdgeCondition_LinearStiffnessByLengthXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryEdgeCondition_LinearStiffnessByLengthYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryEdgeCondition_LinearStiffnessByLengthYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryEdgeCondition_LinearStiffnessByLengthZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryEdgeCondition_RotationalStiffnessByLengthX")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryEdgeCondition_RotationalStiffnessByLengthY")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryFaceCondition_LinearStiffnessByAreaXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryFaceCondition_LinearStiffnessByAreaXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryFaceCondition_LinearStiffnessByAreaYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryFaceCondition_LinearStiffnessByAreaYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryFaceCondition_LinearStiffnessByAreaZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryFaceCondition_LinearStiffnessByAreaZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryNodeCondition_RotationalStiffnessXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeCondition_RotationalStiffnessXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryNodeCondition_RotationalStiffnessYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeCondition_RotationalStiffnessYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryNodeCondition_RotationalStiffnessZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeCondition_RotationalStiffnessZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryNodeConditionWarping_WarpingStiffnessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeConditionWarping_WarpingStiffnessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCartesianTransformationOperator2DnonUniform_Scale2")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator2DnonUniform_Scale2());
			 //1EAttribute
		}
		else if (string.equals("IfcCartesianTransformationOperator3DnonUniform_Scale2")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator3DnonUniform_Scale2());
			 //1EAttribute
		}
		else if (string.equals("IfcCartesianTransformationOperator3DnonUniform_Scale3")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator3DnonUniform_Scale3());
			 //1EAttribute
		}
		else if (string.equals("IfcConnectionPointEccentricity_EccentricityInXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPointEccentricity_EccentricityInXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcConnectionPointEccentricity_EccentricityInYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPointEccentricity_EccentricityInYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcConnectionPointEccentricity_EccentricityInZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPointEccentricity_EccentricityInZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcConnectionPortGeometry_LocationAtRelatingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPortGeometry_LocationAtRelatingElement());
			 //1EReference
		}
		else if (string.equals("IfcConnectionPortGeometry_LocationAtRelatedElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPortGeometry_LocationAtRelatedElement());
			 //1EReference
		}
		else if (string.equals("IfcConnectionSurfaceGeometry_SurfaceOnRelatingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionSurfaceGeometry_SurfaceOnRelatingElement());
			 //1EReference
		}
		else if (string.equals("IfcConnectionSurfaceGeometry_SurfaceOnRelatedElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionSurfaceGeometry_SurfaceOnRelatedElement());
			 //1EReference
		}
		else if (string.equals("IfcConstraintAggregationRelationship_RelatingConstraint")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintAggregationRelationship_RelatingConstraint());
			 //1EReference
		}
		else if (string.equals("IfcConstraintAggregationRelationship_RelatedConstraints")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintAggregationRelationship_RelatedConstraints());
			 //1EReference
		}
		else if (string.equals("IfcConstraintAggregationRelationship_LogicalAggregator")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintAggregationRelationship_LogicalAggregator());
			 //1EAttribute
		}
		else if (string.equals("IfcConstructionMaterialResource_UsageRatioAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstructionMaterialResource_UsageRatioAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_OverallHeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_OverallHeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_CentreOfGravityInYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_CentreOfGravityInYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_OverallHeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_OverallHeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_CentreOfGravityInYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_CentreOfGravityInYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCurveStyleFontAndScaling_CurveFontScalingAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFontAndScaling_CurveFontScalingAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCurveStyleFontPattern_VisibleSegmentLengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFontPattern_VisibleSegmentLengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCurveStyleFontPattern_InvisibleSegmentLengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFontPattern_InvisibleSegmentLengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDimensionalExponents_ThermodynamicTemperatureExponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionalExponents_ThermodynamicTemperatureExponent());
			 //1EAttribute
		}
		else if (string.equals("IfcDistributionControlElement_AssignedToFlowElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionControlElement_AssignedToFlowElement());
			 //1EReference
		}
		else if (string.equals("IfcDocumentInformationRelationship_RelatingDocument")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformationRelationship_RelatingDocument());
			 //1EReference
		}
		else if (string.equals("IfcDocumentInformationRelationship_RelatedDocuments")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformationRelationship_RelatedDocuments());
			 //1EReference
		}
		else if (string.equals("IfcDocumentInformationRelationship_RelationshipType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformationRelationship_RelationshipType());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_ThresholdThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_ThresholdThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDraughtingCalloutRelationship_RelatedDraughtingCallout")) {
			resultList.add(((Ifc2x3Package) object).getIfcDraughtingCalloutRelationship_RelatedDraughtingCallout());
			 //1EReference
		}
		else if (string.equals("IfcElectricDistributionPoint_DistributionPointFunction")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricDistributionPoint_DistributionPointFunction());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_InputFrequencyAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_InputFrequencyAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_FullLoadCurrentAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_FullLoadCurrentAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_MinimumCircuitCurrentAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_MinimumCircuitCurrentAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_MaximumPowerInputAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_MaximumPowerInputAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_RatedPowerInputAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_RatedPowerInputAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFailureConnectionCondition_TensionFailureXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFailureConnectionCondition_TensionFailureXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFailureConnectionCondition_TensionFailureYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFailureConnectionCondition_TensionFailureYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFailureConnectionCondition_TensionFailureZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFailureConnectionCondition_TensionFailureZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFailureConnectionCondition_CompressionFailureXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFailureConnectionCondition_CompressionFailureXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFailureConnectionCondition_CompressionFailureYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFailureConnectionCondition_CompressionFailureYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFailureConnectionCondition_CompressionFailureZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFailureConnectionCondition_CompressionFailureZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFillAreaStyleHatching_PointOfReferenceHatchLine")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleHatching_PointOfReferenceHatchLine());
			 //1EReference
		}
		else if (string.equals("IfcFluidFlowProperties_TemperatureSingleValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_TemperatureSingleValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFluidFlowProperties_WetBulbTemperatureSingleValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_WetBulbTemperatureSingleValue());
			 //1EAttribute
		}
		else if (string.equals("IfcFluidFlowProperties_WetBulbTemperatureTimeSeries")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_WetBulbTemperatureTimeSeries());
			 //1EReference
		}
		else if (string.equals("IfcFluidFlowProperties_FlowConditionSingleValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_FlowConditionSingleValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFluidFlowProperties_VelocitySingleValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_VelocitySingleValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFluidFlowProperties_PressureSingleValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_PressureSingleValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralMaterialProperties_MolecularWeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralMaterialProperties_MolecularWeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralProfileProperties_PhysicalWeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralProfileProperties_PhysicalWeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralProfileProperties_MinimumPlateThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralProfileProperties_MinimumPlateThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralProfileProperties_MaximumPlateThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralProfileProperties_MaximumPlateThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralProfileProperties_CrossSectionAreaAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralProfileProperties_CrossSectionAreaAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcGeometricRepresentationContext_PrecisionAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationContext_PrecisionAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcGeometricRepresentationContext_WorldCoordinateSystem")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationContext_WorldCoordinateSystem());
			 //1EReference
		}
		else if (string.equals("IfcGeometricRepresentationSubContext_ParentContext")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationSubContext_ParentContext());
			 //1EReference
		}
		else if (string.equals("IfcGeometricRepresentationSubContext_TargetScaleAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationSubContext_TargetScaleAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcHygroscopicMaterialProperties_VaporPermeability")) {
			resultList.add(((Ifc2x3Package) object).getIfcHygroscopicMaterialProperties_VaporPermeability());
			 //1EAttribute
		}
		else if (string.equals("IfcHygroscopicMaterialProperties_MoistureDiffusivity")) {
			resultList.add(((Ifc2x3Package) object).getIfcHygroscopicMaterialProperties_MoistureDiffusivity());
			 //1EAttribute
		}
		else if (string.equals("IfcLightDistributionData_SecondaryPlaneAngleAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightDistributionData_SecondaryPlaneAngleAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLightDistributionData_LuminousIntensityAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightDistributionData_LuminousIntensityAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLightIntensityDistribution_LightDistributionCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightIntensityDistribution_LightDistributionCurve());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourceGoniometric_ColourTemperatureAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceGoniometric_ColourTemperatureAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourceGoniometric_LightDistributionDataSource")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceGoniometric_LightDistributionDataSource());
			 //1EReference
		}
		else if (string.equals("IfcLightSourcePositional_ConstantAttenuationAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourcePositional_ConstantAttenuationAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourcePositional_DistanceAttenuationAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourcePositional_DistanceAttenuationAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourcePositional_QuadricAttenuationAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourcePositional_QuadricAttenuationAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMaterialClassificationRelationship_ClassifiedMaterial")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialClassificationRelationship_ClassifiedMaterial());
			 //1EReference
		}
		else if (string.equals("IfcMaterialDefinitionRepresentation_RepresentedMaterial")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialDefinitionRepresentation_RepresentedMaterial());
			 //1EReference
		}
		else if (string.equals("IfcMaterialLayerSetUsage_OffsetFromReferenceLineAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayerSetUsage_OffsetFromReferenceLineAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalConcreteMaterialProperties_MaxAggregateSize")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalConcreteMaterialProperties_Workability")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalConcreteMaterialProperties_Workability());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalMaterialProperties_DynamicViscosityAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalMaterialProperties_DynamicViscosityAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalMaterialProperties_YoungModulusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalMaterialProperties_YoungModulusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalMaterialProperties_ShearModulusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalMaterialProperties_ShearModulusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalMaterialProperties_PoissonRatioAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalMaterialProperties_PoissonRatioAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties_YieldStressAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties_YieldStressAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties_UltimateStress")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties_UltimateStress());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties_UltimateStrain")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties_UltimateStrain());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties_HardeningModule")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties_HardeningModule());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties_ProportionalStress")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties_ProportionalStress());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties_PlasticStrain")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties_PlasticStrain());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_VisibleTransmittanceAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_VisibleTransmittanceAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_SolarTransmittanceAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_SolarTransmittanceAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_ThermalIrTransmittance")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_ThermalIrTransmittance());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_ThermalIrEmissivityBack")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_ThermalIrEmissivityBack());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_ThermalIrEmissivityFront")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_ThermalIrEmissivityFront());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_VisibleReflectanceBack")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_VisibleReflectanceBack());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_VisibleReflectanceFront")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_VisibleReflectanceFront());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_SolarReflectanceFront")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_SolarReflectanceFront());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_SolarReflectanceBackAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_SolarReflectanceBackAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcPermeableCoveringProperties_FrameThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcPermeableCoveringProperties_FrameThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcProductsOfCombustionProperties_SpecificHeatCapacity")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductsOfCombustionProperties_SpecificHeatCapacity());
			 //1EAttribute
		}
		else if (string.equals("IfcProductsOfCombustionProperties_N20ContentAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductsOfCombustionProperties_N20ContentAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcProductsOfCombustionProperties_COContentAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductsOfCombustionProperties_COContentAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcProductsOfCombustionProperties_CO2ContentAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductsOfCombustionProperties_CO2ContentAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcPropertyConstraintRelationship_RelatingConstraint")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyConstraintRelationship_RelatingConstraint());
			 //1EReference
		}
		else if (string.equals("IfcPropertyConstraintRelationship_RelatedProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyConstraintRelationship_RelatedProperties());
			 //1EReference
		}
		else if (string.equals("IfcPropertyDependencyRelationship_DependingProperty")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyDependencyRelationship_DependingProperty());
			 //1EReference
		}
		else if (string.equals("IfcPropertyDependencyRelationship_DependantProperty")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyDependencyRelationship_DependantProperty());
			 //1EReference
		}
		else if (string.equals("IfcRectangleHollowProfileDef_WallThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangleHollowProfileDef_WallThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangleHollowProfileDef_InnerFilletRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangleHollowProfileDef_InnerFilletRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangleHollowProfileDef_OuterFilletRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangleHollowProfileDef_OuterFilletRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcementBarProperties_TotalCrossSectionArea")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementBarProperties_TotalCrossSectionArea());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcementBarProperties_EffectiveDepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementBarProperties_EffectiveDepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcementBarProperties_NominalBarDiameterAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementBarProperties_NominalBarDiameterAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcementDefinitionProperties_DefinitionType")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementDefinitionProperties_DefinitionType());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_LongitudinalBarNominalDiameterAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_LongitudinalBarNominalDiameterAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_TransverseBarNominalDiameterAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_TransverseBarNominalDiameterAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_LongitudinalBarCrossSectionArea")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_LongitudinalBarCrossSectionArea());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_TransverseBarCrossSectionAreaAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_TransverseBarCrossSectionAreaAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRelAssociatesClassification_RelatingClassification")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesClassification_RelatingClassification());
			 //1EReference
		}
		else if (string.equals("IfcRelAssociatesProfileProperties_ProfileSectionLocation")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesProfileProperties_ProfileSectionLocation());
			 //1EReference
		}
		else if (string.equals("IfcRelAssociatesProfileProperties_ProfileOrientation")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesProfileProperties_ProfileOrientation());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsStructuralElement_RelatedStructuralMember")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralElement_RelatedStructuralMember());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsStructuralMember_RelatingStructuralMember")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralMember_RelatingStructuralMember());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsStructuralMember_AdditionalConditions")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralMember_AdditionalConditions());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsStructuralMember_SupportedLengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralMember_SupportedLengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRelConnectsStructuralMember_ConditionCoordinateSystem")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralMember_ConditionCoordinateSystem());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsWithEccentricity_ConnectionConstraint")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsWithEccentricity_ConnectionConstraint());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsWithRealizingElements_RealizingElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsWithRealizingElements_RealizingElements());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsWithRealizingElements_ConnectionType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsWithRealizingElements_ConnectionType());
			 //1EAttribute
		}
		else if (string.equals("IfcRelContainedInSpatialStructure_RelatingStructure")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelContainedInSpatialStructure_RelatingStructure());
			 //1EReference
		}
		else if (string.equals("IfcRelDefinesByProperties_RelatingPropertyDefinition")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelDefinesByProperties_RelatingPropertyDefinition());
			 //1EReference
		}
		else if (string.equals("IfcRelInteractionRequirements_DailyInteractionAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelInteractionRequirements_DailyInteractionAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRelInteractionRequirements_ImportanceRatingAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelInteractionRequirements_ImportanceRatingAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRelInteractionRequirements_LocationOfInteraction")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelInteractionRequirements_LocationOfInteraction());
			 //1EReference
		}
		else if (string.equals("IfcRelInteractionRequirements_RelatingSpaceProgram")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelInteractionRequirements_RelatingSpaceProgram());
			 //1EReference
		}
		else if (string.equals("IfcRelReferencedInSpatialStructure_RelatedElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelReferencedInSpatialStructure_RelatedElements());
			 //1EReference
		}
		else if (string.equals("IfcRelReferencedInSpatialStructure_RelatingStructure")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelReferencedInSpatialStructure_RelatingStructure());
			 //1EReference
		}
		else if (string.equals("IfcRoundedRectangleProfileDef_RoundingRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoundedRectangleProfileDef_RoundingRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_ScheduleTimeControlAssigned")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_ScheduleTimeControlAssigned());
			 //1EReference
		}
		else if (string.equals("IfcSectionReinforcementProperties_LongitudinalEndPosition")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionReinforcementProperties_LongitudinalEndPosition());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionReinforcementProperties_TransversePosition")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionReinforcementProperties_TransversePosition());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionReinforcementProperties_ReinforcementRole")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionReinforcementProperties_ReinforcementRole());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionReinforcementProperties_SectionDefinition")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionReinforcementProperties_SectionDefinition());
			 //1EReference
		}
		else if (string.equals("IfcSpaceThermalLoadProperties_ApplicableValueRatio")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties_ApplicableValueRatio());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceThermalLoadProperties_MaximumValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties_MaximumValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceThermalLoadProperties_MinimumValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties_MinimumValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues());
			 //1EReference
		}
		else if (string.equals("IfcSpaceThermalLoadProperties_UserDefinedPropertySource")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties_UserDefinedPropertySource());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLinearActionVarying_SubsequentAppliedLoads")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLinearActionVarying_SubsequentAppliedLoads());
			 //1EReference
		}
		else if (string.equals("IfcStructuralLoadLinearForce_LinearMomentXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadLinearForce_LinearMomentXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadLinearForce_LinearMomentYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadLinearForce_LinearMomentYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadLinearForce_LinearMomentZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadLinearForce_LinearMomentZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacement_DisplacementXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacement_DisplacementXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacement_DisplacementYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacement_DisplacementYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacement_DisplacementZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacement_DisplacementZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacementDistortion_Distortion")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacementDistortion_Distortion());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleForceWarping_WarpingMomentAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForceWarping_WarpingMomentAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadTemperature_DeltaT_ConstantAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadTemperature_DeltaT_ConstantAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralPlanarActionVarying_SubsequentAppliedLoads")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralPlanarActionVarying_SubsequentAppliedLoads());
			 //1EReference
		}
		else if (string.equals("IfcAbsorbedDoseMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcAbsorbedDoseMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcAccelerationMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcAccelerationMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcAmountOfSubstanceMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcAmountOfSubstanceMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcAngularVelocityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcAngularVelocityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcAreaMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcAreaMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcContextDependentMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcContextDependentMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcCountMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCountMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCurvatureMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurvatureMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDescriptiveMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcDescriptiveMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcDoseEquivalentMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoseEquivalentMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcDynamicViscosityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcDynamicViscosityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricChargeMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricChargeMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricCurrentMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricCurrentMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricResistanceMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricResistanceMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricVoltageMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricVoltageMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcEnergyMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnergyMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcForceMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcForceMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFrequencyMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFrequencyMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcHeatFluxDensityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcHeatFluxDensityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcHeatingValueMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcHeatingValueMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcIlluminanceMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcIlluminanceMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcInductanceMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcInductanceMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcIntegerCountRateMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcIntegerCountRateMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcIonConcentrationMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcIonConcentrationMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcIsothermalMoistureCapacityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcIsothermalMoistureCapacityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcKinematicViscosityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcKinematicViscosityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcLengthMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLengthMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLinearForceMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcLinearForceMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcLinearMomentMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcLinearMomentMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcLinearStiffnessMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcLinearStiffnessMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcLinearVelocityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcLinearVelocityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcLuminousFluxMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcLuminousFluxMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcLuminousIntensityDistributionMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcLuminousIntensityDistributionMeasure());
			 //1EClass
		}
		else if (string.equals("IfcLuminousIntensityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcLuminousIntensityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcMagneticFluxMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcMagneticFluxMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcMassDensityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcMassDensityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcMassFlowRateMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcMassFlowRateMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcMassMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMassMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMassPerLengthMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcMassPerLengthMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcModulusOfLinearSubgradeReactionMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcModulusOfLinearSubgradeReactionMeasure());
			 //1EClass
		}
		else if (string.equals("IfcModulusOfSubgradeReactionMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcModulusOfSubgradeReactionMeasure());
			 //1EClass
		}
		else if (string.equals("IfcMolecularWeightMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcMolecularWeightMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcMomentOfInertiaMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcMomentOfInertiaMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcMonetaryMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMonetaryMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcNumericMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcNumericMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcParameterValue_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcParameterValue_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcPlanarForceMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlanarForceMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcPlaneAngleMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlaneAngleMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcPowerMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcPowerMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcPressureMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcPressureMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRadioActivityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcRadioActivityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcRatioMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRatioMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRotationalMassMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcRotationalMassMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionModulusMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionModulusMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcShearModulusMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcShearModulusMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcSolidAngleMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSolidAngleMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSoundPowerMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundPowerMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSoundPressureMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundPressureMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcSpecularExponent_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpecularExponent_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSpecularRoughness_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpecularRoughness_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalAdmittanceMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalAdmittanceMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalExpansionCoefficientMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalExpansionCoefficientMeasure());
			 //1EClass
		}
		else if (string.equals("IfcThermalResistanceMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalResistanceMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcThermodynamicTemperatureMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermodynamicTemperatureMeasure());
			 //1EClass
		}
		else if (string.equals("IfcTimeMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTorqueMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTorqueMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcVaporPermeabilityMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcVaporPermeabilityMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcVolumeMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcVolumeMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcVolumetricFlowRateMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcVolumetricFlowRateMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcWarpingConstantMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcWarpingConstantMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcWarpingMomentMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcWarpingMomentMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcAirTerminalBoxType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcAirTerminalBoxType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcAnnotation_ContainedInStructure")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotation_ContainedInStructure());
			 //1EReference
		}
		else if (string.equals("IfcAnnotationFillArea_OuterBoundary")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationFillArea_OuterBoundary());
			 //1EReference
		}
		else if (string.equals("IfcAnnotationFillArea_InnerBoundaries")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationFillArea_InnerBoundaries());
			 //1EReference
		}
		else if (string.equals("IfcAnnotationSurface_TextureCoordinates")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationSurface_TextureCoordinates());
			 //1EReference
		}
		else if (string.equals("IfcApplication_ApplicationDeveloper")) {
			resultList.add(((Ifc2x3Package) object).getIfcApplication_ApplicationDeveloper());
			 //1EReference
		}
		else if (string.equals("IfcApplication_ApplicationFullName")) {
			resultList.add(((Ifc2x3Package) object).getIfcApplication_ApplicationFullName());
			 //1EAttribute
		}
		else if (string.equals("IfcApplication_ApplicationIdentifier")) {
			resultList.add(((Ifc2x3Package) object).getIfcApplication_ApplicationIdentifier());
			 //1EAttribute
		}
		else if (string.equals("IfcAppliedValueRelationship_Components")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValueRelationship_Components());
			 //1EReference
		}
		else if (string.equals("IfcAppliedValueRelationship_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValueRelationship_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcApprovalActorRelationship_Actor")) {
			resultList.add(((Ifc2x3Package) object).getIfcApprovalActorRelationship_Actor());
			 //1EReference
		}
		else if (string.equals("IfcApprovalActorRelationship_Approval")) {
			resultList.add(((Ifc2x3Package) object).getIfcApprovalActorRelationship_Approval());
			 //1EReference
		}
		else if (string.equals("IfcApprovalPropertyRelationship_Approval")) {
			resultList.add(((Ifc2x3Package) object).getIfcApprovalPropertyRelationship_Approval());
			 //1EReference
		}
		else if (string.equals("IfcApprovalRelationship_RelatedApproval")) {
			resultList.add(((Ifc2x3Package) object).getIfcApprovalRelationship_RelatedApproval());
			 //1EReference
		}
		else if (string.equals("IfcApprovalRelationship_RelatingApproval")) {
			resultList.add(((Ifc2x3Package) object).getIfcApprovalRelationship_RelatingApproval());
			 //1EReference
		}
		else if (string.equals("IfcApprovalRelationship_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcApprovalRelationship_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcArbitraryClosedProfileDef_OuterCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcArbitraryClosedProfileDef_OuterCurve());
			 //1EReference
		}
		else if (string.equals("IfcBoundaryNodeCondition_LinearStiffnessX")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeCondition_LinearStiffnessX());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryNodeCondition_LinearStiffnessY")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeCondition_LinearStiffnessY());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryNodeCondition_LinearStiffnessZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeCondition_LinearStiffnessZ());
			 //1EAttribute
		}
		else if (string.equals("IfcBuilding_ElevationOfRefHeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuilding_ElevationOfRefHeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBuilding_ElevationOfTerrainAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuilding_ElevationOfTerrainAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBuildingElementProxy_CompositionType")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuildingElementProxy_CompositionType());
			 //1EAttribute
		}
		else if (string.equals("IfcBuildingStorey_ElevationAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuildingStorey_ElevationAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCShapeProfileDef_WallThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCShapeProfileDef_WallThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCShapeProfileDef_InternalFilletRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcCShapeProfileDef_InternalFilletRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcCShapeProfileDef_CentreOfGravityInX")) {
			resultList.add(((Ifc2x3Package) object).getIfcCShapeProfileDef_CentreOfGravityInX());
			 //1EAttribute
		}
		else if (string.equals("IfcCableCarrierFittingType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCableCarrierFittingType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcCableCarrierSegmentType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCableCarrierSegmentType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcCableSegmentType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCableSegmentType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcCartesianPoint_CoordinatesAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianPoint_CoordinatesAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCartesianTransformationOperator")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator());
			 //1EClass
		}
		else if (string.equals("IfcCartesianTransformationOperator_Axis1")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator_Axis1());
			 //1EReference
		}
		else if (string.equals("IfcCartesianTransformationOperator_Axis2")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator_Axis2());
			 //1EReference
		}
		else if (string.equals("IfcCartesianTransformationOperator_Scale")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator_Scale());
			 //1EAttribute
		}
		else if (string.equals("IfcCartesianTransformationOperator_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcCartesianTransformationOperator2D")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator2D());
			 //1EClass
		}
		else if (string.equals("IfcCartesianTransformationOperator3D")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator3D());
			 //1EClass
		}
		else if (string.equals("IfcCenterLineProfileDef_ThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCenterLineProfileDef_ThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcChamferEdgeFeature_WidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcChamferEdgeFeature_WidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcChamferEdgeFeature_HeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcChamferEdgeFeature_HeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCircleHollowProfileDef_WallThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcCircleHollowProfileDef_WallThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcCircleProfileDef_RadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCircleProfileDef_RadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcClassificationItem_IsClassifiedItemIn")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationItem_IsClassifiedItemIn());
			 //1EReference
		}
		else if (string.equals("IfcClassificationItem_IsClassifyingItemIn")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationItem_IsClassifyingItemIn());
			 //1EReference
		}
		else if (string.equals("IfcClassificationNotation_NotationFacets")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationNotation_NotationFacets());
			 //1EReference
		}
		else if (string.equals("IfcCompositeCurveSegment_Transition")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompositeCurveSegment_Transition());
			 //1EAttribute
		}
		else if (string.equals("IfcCompositeCurveSegment_SameSense")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompositeCurveSegment_SameSense());
			 //1EAttribute
		}
		else if (string.equals("IfcCompositeCurveSegment_ParentCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompositeCurveSegment_ParentCurve());
			 //1EReference
		}
		else if (string.equals("IfcCompositeCurveSegment_UsingCurves")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompositeCurveSegment_UsingCurves());
			 //1EReference
		}
		else if (string.equals("IfcConditionCriterion_CriterionDateTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcConditionCriterion_CriterionDateTime());
			 //1EReference
		}
		else if (string.equals("IfcConnectionPortGeometry_ProfileOfPort")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPortGeometry_ProfileOfPort());
			 //1EReference
		}
		else if (string.equals("IfcConstraint_PropertiesForConstraint")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint_PropertiesForConstraint());
			 //1EReference
		}
		else if (string.equals("IfcConstraintAggregationRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintAggregationRelationship());
			 //1EClass
		}
		else if (string.equals("IfcConstraintAggregationRelationship_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintAggregationRelationship_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcConstraintClassificationRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintClassificationRelationship());
			 //1EClass
		}
		else if (string.equals("IfcConstraintRelationship_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintRelationship_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcConstructionMaterialResource_Suppliers")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstructionMaterialResource_Suppliers());
			 //1EReference
		}
		else if (string.equals("IfcConstructionResource_ResourceGroup")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstructionResource_ResourceGroup());
			 //1EAttribute
		}
		else if (string.equals("IfcConstructionResource_BaseQuantity")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstructionResource_BaseQuantity());
			 //1EReference
		}
		else if (string.equals("IfcConversionBasedUnit_ConversionFactor")) {
			resultList.add(((Ifc2x3Package) object).getIfcConversionBasedUnit_ConversionFactor());
			 //1EReference
		}
		else if (string.equals("IfcCoolingTowerType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCoolingTowerType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcCoordinatedUniversalTimeOffset_Sense")) {
			resultList.add(((Ifc2x3Package) object).getIfcCoordinatedUniversalTimeOffset_Sense());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_BaseWidth2")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_BaseWidth2());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_Radius")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_Radius());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_HeadWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_HeadWidth());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_HeadDepth2")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_HeadDepth2());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_HeadDepth3")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_HeadDepth3());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_WebThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_WebThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_BaseWidth4")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_BaseWidth4());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_BaseDepth1")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_BaseDepth1());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_BaseDepth2")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_BaseDepth2());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_BaseDepth3")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_BaseDepth3());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_HeadWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_HeadWidth());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_Radius")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_Radius());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_HeadDepth2")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_HeadDepth2());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_HeadDepth3")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_HeadDepth3());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_WebThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_WebThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_BaseDepth1")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_BaseDepth1());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_BaseDepth2")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_BaseDepth2());
			 //1EAttribute
		}
		else if (string.equals("IfcCurrencyRelationship_ExchangeRate")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurrencyRelationship_ExchangeRate());
			 //1EAttribute
		}
		else if (string.equals("IfcCurrencyRelationship_RateDateTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurrencyRelationship_RateDateTime());
			 //1EReference
		}
		else if (string.equals("IfcCurrencyRelationship_RateSource")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurrencyRelationship_RateSource());
			 //1EReference
		}
		else if (string.equals("IfcCurveBoundedPlane_OuterBoundary")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveBoundedPlane_OuterBoundary());
			 //1EReference
		}
		else if (string.equals("IfcCurveBoundedPlane_InnerBoundaries")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveBoundedPlane_InnerBoundaries());
			 //1EReference
		}
		else if (string.equals("IfcCurveStyleFontAndScaling_CurveFont")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFontAndScaling_CurveFont());
			 //1EReference
		}
		else if (string.equals("IfcDerivedProfileDef_ParentProfile")) {
			resultList.add(((Ifc2x3Package) object).getIfcDerivedProfileDef_ParentProfile());
			 //1EReference
		}
		else if (string.equals("IfcDimensionCurve_AnnotatedBySymbols")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionCurve_AnnotatedBySymbols());
			 //1EReference
		}
		else if (string.equals("IfcDimensionalExponents_LengthExponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionalExponents_LengthExponent());
			 //1EAttribute
		}
		else if (string.equals("IfcDimensionalExponents_MassExponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionalExponents_MassExponent());
			 //1EAttribute
		}
		else if (string.equals("IfcDimensionalExponents_TimeExponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionalExponents_TimeExponent());
			 //1EAttribute
		}
		else if (string.equals("IfcDirection_DirectionRatiosAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDirection_DirectionRatiosAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDocumentElectronicFormat_FileExtension")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentElectronicFormat_FileExtension());
			 //1EAttribute
		}
		else if (string.equals("IfcDocumentElectronicFormat_MimeSubtype")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentElectronicFormat_MimeSubtype());
			 //1EAttribute
		}
		else if (string.equals("IfcDocumentInformation_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcDocumentInformation_DocumentReferences")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_DocumentReferences());
			 //1EReference
		}
		else if (string.equals("IfcDocumentInformation_IntendedUse")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_IntendedUse());
			 //1EAttribute
		}
		else if (string.equals("IfcDocumentInformation_DocumentOwner")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_DocumentOwner());
			 //1EReference
		}
		else if (string.equals("IfcDocumentInformation_CreationTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_CreationTime());
			 //1EReference
		}
		else if (string.equals("IfcDocumentInformation_LastRevisionTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_LastRevisionTime());
			 //1EReference
		}
		else if (string.equals("IfcDocumentInformation_ElectronicFormat")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_ElectronicFormat());
			 //1EReference
		}
		else if (string.equals("IfcDocumentInformation_Confidentiality")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_Confidentiality());
			 //1EAttribute
		}
		else if (string.equals("IfcDocumentInformation_IsPointedTo")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_IsPointedTo());
			 //1EReference
		}
		else if (string.equals("IfcDocumentInformationRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformationRelationship());
			 //1EClass
		}
		else if (string.equals("IfcDocumentReference_ReferenceToDocument")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentReference_ReferenceToDocument());
			 //1EReference
		}
		else if (string.equals("IfcDoorLiningProperties_LiningDepth")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_LiningDepth());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_LiningThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_LiningThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_ThresholdDepth")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_ThresholdDepth());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_TransomThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_TransomThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_TransomOffset")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_TransomOffset());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_LiningOffset")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_LiningOffset());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_ThresholdOffset")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_ThresholdOffset());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_CasingThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_CasingThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_CasingDepth")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_CasingDepth());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_ShapeAspectStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_ShapeAspectStyle());
			 //1EReference
		}
		else if (string.equals("IfcDoorPanelProperties_PanelDepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorPanelProperties_PanelDepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorPanelProperties_PanelOperation")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorPanelProperties_PanelOperation());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorPanelProperties_PanelWidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorPanelProperties_PanelWidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorPanelProperties_PanelPosition")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorPanelProperties_PanelPosition());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorPanelProperties_ShapeAspectStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorPanelProperties_ShapeAspectStyle());
			 //1EReference
		}
		else if (string.equals("IfcDoorStyle_ParameterTakesPrecedence")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorStyle_ParameterTakesPrecedence());
			 //1EAttribute
		}
		else if (string.equals("IfcDraughtingCallout_IsRelatedFromCallout")) {
			resultList.add(((Ifc2x3Package) object).getIfcDraughtingCallout_IsRelatedFromCallout());
			 //1EReference
		}
		else if (string.equals("IfcDraughtingCallout_IsRelatedToCallout")) {
			resultList.add(((Ifc2x3Package) object).getIfcDraughtingCallout_IsRelatedToCallout());
			 //1EReference
		}
		else if (string.equals("IfcDraughtingCalloutRelationship_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcDraughtingCalloutRelationship_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcDuctSilencerType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDuctSilencerType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcEdgeFeature_FeatureLengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcEdgeFeature_FeatureLengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricApplianceType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricApplianceType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricGeneratorType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricGeneratorType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricHeaterType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricHeaterType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricMotorType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricMotorType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricTimeControlType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricTimeControlType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_InputVoltage")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_InputVoltage());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_InputPhase")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_InputPhase());
			 //1EAttribute
		}
		else if (string.equals("IfcElement_IsConnectionRealization")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement_IsConnectionRealization());
			 //1EReference
		}
		else if (string.equals("IfcElementQuantity_MethodOfMeasurement")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementQuantity_MethodOfMeasurement());
			 //1EAttribute
		}
		else if (string.equals("IfcEllipseProfileDef_SemiAxis1AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcEllipseProfileDef_SemiAxis1AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcEllipseProfileDef_SemiAxis2AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcEllipseProfileDef_SemiAxis2AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcEnergyProperties_EnergySequence")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnergyProperties_EnergySequence());
			 //1EAttribute
		}
		else if (string.equals("IfcEnvironmentalImpactValue_ImpactType")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnvironmentalImpactValue_ImpactType());
			 //1EAttribute
		}
		else if (string.equals("IfcEnvironmentalImpactValue_Category")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnvironmentalImpactValue_Category());
			 //1EAttribute
		}
		else if (string.equals("IfcAbsorbedDoseMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcAbsorbedDoseMeasure());
			 //1EClass
		}
		else if (string.equals("IfcAccelerationMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcAccelerationMeasure());
			 //1EClass
		}
		else if (string.equals("IfcAngularVelocityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcAngularVelocityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcBoolean_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoolean_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcCurvatureMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurvatureMeasure());
			 //1EClass
		}
		else if (string.equals("IfcDescriptiveMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcDescriptiveMeasure());
			 //1EClass
		}
		else if (string.equals("IfcDoseEquivalentMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoseEquivalentMeasure());
			 //1EClass
		}
		else if (string.equals("IfcElectricChargeMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricChargeMeasure());
			 //1EClass
		}
		else if (string.equals("IfcElectricCurrentMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricCurrentMeasure());
			 //1EClass
		}
		else if (string.equals("IfcElectricVoltageMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricVoltageMeasure());
			 //1EClass
		}
		else if (string.equals("IfcFrequencyMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcFrequencyMeasure());
			 //1EClass
		}
		else if (string.equals("IfcGloballyUniqueId")) {
			resultList.add(((Ifc2x3Package) object).getIfcGloballyUniqueId());
			 //1EClass
		}
		else if (string.equals("IfcHeatFluxDensityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcHeatFluxDensityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcHeatingValueMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcHeatingValueMeasure());
			 //1EClass
		}
		else if (string.equals("IfcIlluminanceMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcIlluminanceMeasure());
			 //1EClass
		}
		else if (string.equals("IfcInductanceMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcInductanceMeasure());
			 //1EClass
		}
		else if (string.equals("IfcInteger_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcInteger_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcLabel_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcLabel_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcLinearForceMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcLinearForceMeasure());
			 //1EClass
		}
		else if (string.equals("IfcLinearMomentMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcLinearMomentMeasure());
			 //1EClass
		}
		else if (string.equals("IfcLinearStiffnessMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcLinearStiffnessMeasure());
			 //1EClass
		}
		else if (string.equals("IfcLinearVelocityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcLinearVelocityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcLogical_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcLogical_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcLuminousFluxMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcLuminousFluxMeasure());
			 //1EClass
		}
		else if (string.equals("IfcMagneticFluxMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcMagneticFluxMeasure());
			 //1EClass
		}
		else if (string.equals("IfcMassDensityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcMassDensityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcMassFlowRateMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcMassFlowRateMeasure());
			 //1EClass
		}
		else if (string.equals("IfcMassPerLengthMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcMassPerLengthMeasure());
			 //1EClass
		}
		else if (string.equals("IfcMolecularWeightMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcMolecularWeightMeasure());
			 //1EClass
		}
		else if (string.equals("IfcMomentOfInertiaMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcMomentOfInertiaMeasure());
			 //1EClass
		}
		else if (string.equals("IfcMonetaryMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcMonetaryMeasure());
			 //1EClass
		}
		else if (string.equals("IfcPHMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPHMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcPlanarForceMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlanarForceMeasure());
			 //1EClass
		}
		else if (string.equals("IfcPlaneAngleMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlaneAngleMeasure());
			 //1EClass
		}
		else if (string.equals("IfcPressureMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcPressureMeasure());
			 //1EClass
		}
		else if (string.equals("IfcRadioActivityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcRadioActivityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcReal_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcReal_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcRotationalMassMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcRotationalMassMeasure());
			 //1EClass
		}
		else if (string.equals("IfcSectionModulusMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionModulusMeasure());
			 //1EClass
		}
		else if (string.equals("IfcShearModulusMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcShearModulusMeasure());
			 //1EClass
		}
		else if (string.equals("IfcSolidAngleMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcSolidAngleMeasure());
			 //1EClass
		}
		else if (string.equals("IfcSoundPowerMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundPowerMeasure());
			 //1EClass
		}
		else if (string.equals("IfcSoundPressureMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundPressureMeasure());
			 //1EClass
		}
		else if (string.equals("IfcSpecularExponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpecularExponent());
			 //1EClass
		}
		else if (string.equals("IfcSpecularRoughness")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpecularRoughness());
			 //1EClass
		}
		else if (string.equals("IfcText_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcText_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcTimeStamp_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeStamp_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcWarpingConstantMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcWarpingConstantMeasure());
			 //1EClass
		}
		else if (string.equals("IfcWarpingMomentMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcWarpingMomentMeasure());
			 //1EClass
		}
		else if (string.equals("IfcNormalisedRatioMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcNormalisedRatioMeasure());
			 //1EClass
		}
		else if (string.equals("IfcPositiveLengthMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcPositiveLengthMeasure());
			 //1EClass
		}
		else if (string.equals("IfcPositiveRatioMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcPositiveRatioMeasure());
			 //1EClass
		}
		else if (string.equals("Ifc2DCompositeCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfc2DCompositeCurve());
			 //1EClass
		}
		else if (string.equals("IfcActor_IsActingUpon")) {
			resultList.add(((Ifc2x3Package) object).getIfcActor_IsActingUpon());
			 //1EReference
		}
		else if (string.equals("IfcActorRole_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcActorRole_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcAddress_Purpose")) {
			resultList.add(((Ifc2x3Package) object).getIfcAddress_Purpose());
			 //1EAttribute
		}
		else if (string.equals("IfcAddress_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcAddress_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcAddress_OfPerson")) {
			resultList.add(((Ifc2x3Package) object).getIfcAddress_OfPerson());
			 //1EReference
		}
		else if (string.equals("IfcAddress_OfOrganization")) {
			resultList.add(((Ifc2x3Package) object).getIfcAddress_OfOrganization());
			 //1EReference
		}
		else if (string.equals("IfcAirTerminalBoxType")) {
			resultList.add(((Ifc2x3Package) object).getIfcAirTerminalBoxType());
			 //1EClass
		}
		else if (string.equals("IfcAirTerminalType")) {
			resultList.add(((Ifc2x3Package) object).getIfcAirTerminalType());
			 //1EClass
		}
		else if (string.equals("IfcAngularDimension")) {
			resultList.add(((Ifc2x3Package) object).getIfcAngularDimension());
			 //1EClass
		}
		else if (string.equals("IfcAnnotationFillArea")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationFillArea());
			 //1EClass
		}
		else if (string.equals("IfcAnnotationOccurrence")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationOccurrence());
			 //1EClass
		}
		else if (string.equals("IfcAnnotationSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationSurface());
			 //1EClass
		}
		else if (string.equals("IfcAnnotationSurface_Item")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationSurface_Item());
			 //1EReference
		}
		else if (string.equals("IfcApplication_Version")) {
			resultList.add(((Ifc2x3Package) object).getIfcApplication_Version());
			 //1EAttribute
		}
		else if (string.equals("IfcAppliedValue_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValue_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcAppliedValue_UnitBasis")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValue_UnitBasis());
			 //1EReference
		}
		else if (string.equals("IfcApproval_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcApproval_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcApproval_ApprovalLevel")) {
			resultList.add(((Ifc2x3Package) object).getIfcApproval_ApprovalLevel());
			 //1EAttribute
		}
		else if (string.equals("IfcApproval_Identifier")) {
			resultList.add(((Ifc2x3Package) object).getIfcApproval_Identifier());
			 //1EAttribute
		}
		else if (string.equals("IfcApproval_Actors")) {
			resultList.add(((Ifc2x3Package) object).getIfcApproval_Actors());
			 //1EReference
		}
		else if (string.equals("IfcApproval_IsRelatedWith")) {
			resultList.add(((Ifc2x3Package) object).getIfcApproval_IsRelatedWith());
			 //1EReference
		}
		else if (string.equals("IfcApproval_Relates")) {
			resultList.add(((Ifc2x3Package) object).getIfcApproval_Relates());
			 //1EReference
		}
		else if (string.equals("IfcApprovalRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcApprovalRelationship());
			 //1EClass
		}
		else if (string.equals("IfcAsset_OriginalValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsset_OriginalValue());
			 //1EReference
		}
		else if (string.equals("IfcAsset_CurrentValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsset_CurrentValue());
			 //1EReference
		}
		else if (string.equals("IfcAsset_DepreciatedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsset_DepreciatedValue());
			 //1EReference
		}
		else if (string.equals("IfcAxis1Placement_Axis")) {
			resultList.add(((Ifc2x3Package) object).getIfcAxis1Placement_Axis());
			 //1EReference
		}
		else if (string.equals("IfcAxis2Placement2D")) {
			resultList.add(((Ifc2x3Package) object).getIfcAxis2Placement2D());
			 //1EClass
		}
		else if (string.equals("IfcAxis2Placement3D")) {
			resultList.add(((Ifc2x3Package) object).getIfcAxis2Placement3D());
			 //1EClass
		}
		else if (string.equals("IfcAxis2Placement3D_Axis")) {
			resultList.add(((Ifc2x3Package) object).getIfcAxis2Placement3D_Axis());
			 //1EReference
		}
		else if (string.equals("IfcBSplineCurve_Degree")) {
			resultList.add(((Ifc2x3Package) object).getIfcBSplineCurve_Degree());
			 //1EAttribute
		}
		else if (string.equals("IfcBSplineCurve_CurveForm")) {
			resultList.add(((Ifc2x3Package) object).getIfcBSplineCurve_CurveForm());
			 //1EAttribute
		}
		else if (string.equals("IfcBlobTexture_RasterCode")) {
			resultList.add(((Ifc2x3Package) object).getIfcBlobTexture_RasterCode());
			 //1EAttribute
		}
		else if (string.equals("IfcBlock_XLengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBlock_XLengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBlock_YLengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBlock_YLengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBlock_ZLengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBlock_ZLengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBooleanClippingResult")) {
			resultList.add(((Ifc2x3Package) object).getIfcBooleanClippingResult());
			 //1EClass
		}
		else if (string.equals("IfcBooleanResult_Operator")) {
			resultList.add(((Ifc2x3Package) object).getIfcBooleanResult_Operator());
			 //1EAttribute
		}
		else if (string.equals("IfcBooleanResult_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcBooleanResult_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryCondition")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryCondition());
			 //1EClass
		}
		else if (string.equals("IfcBoundaryCondition_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryCondition_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryEdgeCondition")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryEdgeCondition());
			 //1EClass
		}
		else if (string.equals("IfcBoundaryFaceCondition")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryFaceCondition());
			 //1EClass
		}
		else if (string.equals("IfcBoundaryNodeCondition")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeCondition());
			 //1EClass
		}
		else if (string.equals("IfcBoundingBox_Corner")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundingBox_Corner());
			 //1EReference
		}
		else if (string.equals("IfcBoundingBox_XDim")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundingBox_XDim());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundingBox_YDim")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundingBox_YDim());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundingBox_ZDim")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundingBox_ZDim());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundingBox_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundingBox_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcBuildingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuildingElement());
			 //1EClass
		}
		else if (string.equals("IfcBuildingElementPart")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuildingElementPart());
			 //1EClass
		}
		else if (string.equals("IfcBuildingElementProxy")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuildingElementProxy());
			 //1EClass
		}
		else if (string.equals("IfcBuildingElementType")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuildingElementType());
			 //1EClass
		}
		else if (string.equals("IfcCShapeProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcCShapeProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcCShapeProfileDef_Depth")) {
			resultList.add(((Ifc2x3Package) object).getIfcCShapeProfileDef_Depth());
			 //1EAttribute
		}
		else if (string.equals("IfcCShapeProfileDef_Width")) {
			resultList.add(((Ifc2x3Package) object).getIfcCShapeProfileDef_Width());
			 //1EAttribute
		}
		else if (string.equals("IfcCShapeProfileDef_Girth")) {
			resultList.add(((Ifc2x3Package) object).getIfcCShapeProfileDef_Girth());
			 //1EAttribute
		}
		else if (string.equals("IfcCableSegmentType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCableSegmentType());
			 //1EClass
		}
		else if (string.equals("IfcCartesianPoint_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianPoint_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcCenterLineProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcCenterLineProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcChamferEdgeFeature")) {
			resultList.add(((Ifc2x3Package) object).getIfcChamferEdgeFeature());
			 //1EClass
		}
		else if (string.equals("IfcCircle_RadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCircle_RadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCircleHollowProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcCircleHollowProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcCircleProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcCircleProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcClassification_Source")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassification_Source());
			 //1EAttribute
		}
		else if (string.equals("IfcClassification_Edition")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassification_Edition());
			 //1EAttribute
		}
		else if (string.equals("IfcClassification_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassification_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcClassificationItem")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationItem());
			 //1EClass
		}
		else if (string.equals("IfcClassificationNotation")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationNotation());
			 //1EClass
		}
		else if (string.equals("IfcColourRgb_RedAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcColourRgb_RedAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcColourRgb_Green")) {
			resultList.add(((Ifc2x3Package) object).getIfcColourRgb_Green());
			 //1EAttribute
		}
		else if (string.equals("IfcColourRgb_BlueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcColourRgb_BlueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcColourSpecification")) {
			resultList.add(((Ifc2x3Package) object).getIfcColourSpecification());
			 //1EClass
		}
		else if (string.equals("IfcComplexProperty")) {
			resultList.add(((Ifc2x3Package) object).getIfcComplexProperty());
			 //1EClass
		}
		else if (string.equals("IfcCompositeCurveSegment")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompositeCurveSegment());
			 //1EClass
		}
		else if (string.equals("IfcCompositeProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompositeProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcConditionCriterion")) {
			resultList.add(((Ifc2x3Package) object).getIfcConditionCriterion());
			 //1EClass
		}
		else if (string.equals("IfcConnectedFaceSet")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectedFaceSet());
			 //1EClass
		}
		else if (string.equals("IfcConnectionGeometry")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionGeometry());
			 //1EClass
		}
		else if (string.equals("IfcConnectionPortGeometry")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPortGeometry());
			 //1EClass
		}
		else if (string.equals("IfcConstraint_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcConstraint_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcConstraint_Aggregates")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint_Aggregates());
			 //1EReference
		}
		else if (string.equals("IfcConstraintRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintRelationship());
			 //1EClass
		}
		else if (string.equals("IfcConstructionResource")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstructionResource());
			 //1EClass
		}
		else if (string.equals("IfcContextDependentUnit")) {
			resultList.add(((Ifc2x3Package) object).getIfcContextDependentUnit());
			 //1EClass
		}
		else if (string.equals("IfcControl_Controls")) {
			resultList.add(((Ifc2x3Package) object).getIfcControl_Controls());
			 //1EReference
		}
		else if (string.equals("IfcConversionBasedUnit")) {
			resultList.add(((Ifc2x3Package) object).getIfcConversionBasedUnit());
			 //1EClass
		}
		else if (string.equals("IfcCoolingTowerType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCoolingTowerType());
			 //1EClass
		}
		else if (string.equals("IfcCostSchedule_Status")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostSchedule_Status());
			 //1EAttribute
		}
		else if (string.equals("IfcCostSchedule_ID")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostSchedule_ID());
			 //1EAttribute
		}
		else if (string.equals("IfcCostValue_CostType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostValue_CostType());
			 //1EAttribute
		}
		else if (string.equals("IfcCostValue_Condition")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostValue_Condition());
			 //1EAttribute
		}
		else if (string.equals("IfcCovering_CoversSpaces")) {
			resultList.add(((Ifc2x3Package) object).getIfcCovering_CoversSpaces());
			 //1EReference
		}
		else if (string.equals("IfcCovering_Covers")) {
			resultList.add(((Ifc2x3Package) object).getIfcCovering_Covers());
			 //1EReference
		}
		else if (string.equals("IfcCsgPrimitive3D_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcCsgPrimitive3D_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcCurrencyRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurrencyRelationship());
			 //1EClass
		}
		else if (string.equals("IfcCurtainWallType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurtainWallType());
			 //1EClass
		}
		else if (string.equals("IfcCurveBoundedPlane")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveBoundedPlane());
			 //1EClass
		}
		else if (string.equals("IfcCurveBoundedPlane_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveBoundedPlane_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcCurveStyle_CurveFont")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyle_CurveFont());
			 //1EReference
		}
		else if (string.equals("IfcCurveStyle_CurveWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyle_CurveWidth());
			 //1EReference
		}
		else if (string.equals("IfcCurveStyle_CurveColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyle_CurveColour());
			 //1EReference
		}
		else if (string.equals("IfcCurveStyleFont_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFont_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcCurveStyleFontPattern")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFontPattern());
			 //1EClass
		}
		else if (string.equals("IfcDefinedSymbol_Target")) {
			resultList.add(((Ifc2x3Package) object).getIfcDefinedSymbol_Target());
			 //1EReference
		}
		else if (string.equals("IfcDerivedProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcDerivedProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcDerivedUnit_Elements")) {
			resultList.add(((Ifc2x3Package) object).getIfcDerivedUnit_Elements());
			 //1EReference
		}
		else if (string.equals("IfcDerivedUnit_UnitType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDerivedUnit_UnitType());
			 //1EAttribute
		}
		else if (string.equals("IfcDerivedUnitElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcDerivedUnitElement());
			 //1EClass
		}
		else if (string.equals("IfcDiameterDimension")) {
			resultList.add(((Ifc2x3Package) object).getIfcDiameterDimension());
			 //1EClass
		}
		else if (string.equals("IfcDimensionalExponents")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionalExponents());
			 //1EClass
		}
		else if (string.equals("IfcDiscreteAccessory")) {
			resultList.add(((Ifc2x3Package) object).getIfcDiscreteAccessory());
			 //1EClass
		}
		else if (string.equals("IfcDiscreteAccessoryType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDiscreteAccessoryType());
			 //1EClass
		}
		else if (string.equals("IfcDistributionElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionElement());
			 //1EClass
		}
		else if (string.equals("IfcDistributionPort")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionPort());
			 //1EClass
		}
		else if (string.equals("IfcDocumentInformation")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation());
			 //1EClass
		}
		else if (string.equals("IfcDocumentReference")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentReference());
			 //1EClass
		}
		else if (string.equals("IfcDoor_OverallHeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoor_OverallHeight());
			 //1EAttribute
		}
		else if (string.equals("IfcDoor_OverallWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoor_OverallWidth());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties());
			 //1EClass
		}
		else if (string.equals("IfcDoorPanelProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorPanelProperties());
			 //1EClass
		}
		else if (string.equals("IfcDoorStyle_Sizeable")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorStyle_Sizeable());
			 //1EAttribute
		}
		else if (string.equals("IfcDraughtingCallout")) {
			resultList.add(((Ifc2x3Package) object).getIfcDraughtingCallout());
			 //1EClass
		}
		else if (string.equals("IfcDuctFittingType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDuctFittingType());
			 //1EClass
		}
		else if (string.equals("IfcDuctSegmentType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDuctSegmentType());
			 //1EClass
		}
		else if (string.equals("IfcDuctSilencerType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDuctSilencerType());
			 //1EClass
		}
		else if (string.equals("IfcEdgeCurve_EdgeGeometry")) {
			resultList.add(((Ifc2x3Package) object).getIfcEdgeCurve_EdgeGeometry());
			 //1EReference
		}
		else if (string.equals("IfcEdgeCurve_SameSense")) {
			resultList.add(((Ifc2x3Package) object).getIfcEdgeCurve_SameSense());
			 //1EAttribute
		}
		else if (string.equals("IfcEdgeLoop_EdgeList")) {
			resultList.add(((Ifc2x3Package) object).getIfcEdgeLoop_EdgeList());
			 //1EReference
		}
		else if (string.equals("IfcElectricApplianceType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricApplianceType());
			 //1EClass
		}
		else if (string.equals("IfcElectricGeneratorType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricGeneratorType());
			 //1EClass
		}
		else if (string.equals("IfcElectricHeaterType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricHeaterType());
			 //1EClass
		}
		else if (string.equals("IfcElectricMotorType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricMotorType());
			 //1EClass
		}
		else if (string.equals("IfcElectricalCircuit")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalCircuit());
			 //1EClass
		}
		else if (string.equals("IfcElectricalElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalElement());
			 //1EClass
		}
		else if (string.equals("IfcElement_FillsVoids")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement_FillsVoids());
			 //1EReference
		}
		else if (string.equals("IfcElement_ConnectedTo")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement_ConnectedTo());
			 //1EReference
		}
		else if (string.equals("IfcElement_HasCoverings")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement_HasCoverings());
			 //1EReference
		}
		else if (string.equals("IfcElement_HasProjections")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement_HasProjections());
			 //1EReference
		}
		else if (string.equals("IfcElement_HasPorts")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement_HasPorts());
			 //1EReference
		}
		else if (string.equals("IfcElement_HasOpenings")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement_HasOpenings());
			 //1EReference
		}
		else if (string.equals("IfcElement_ConnectedFrom")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement_ConnectedFrom());
			 //1EReference
		}
		else if (string.equals("IfcElementAssembly")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementAssembly());
			 //1EClass
		}
		else if (string.equals("IfcElementComponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementComponent());
			 //1EClass
		}
		else if (string.equals("IfcElementComponentType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementComponentType());
			 //1EClass
		}
		else if (string.equals("IfcElementQuantity")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementQuantity());
			 //1EClass
		}
		else if (string.equals("IfcElementarySurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementarySurface());
			 //1EClass
		}
		else if (string.equals("IfcElementarySurface_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementarySurface_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcEllipse_SemiAxis1")) {
			resultList.add(((Ifc2x3Package) object).getIfcEllipse_SemiAxis1());
			 //1EAttribute
		}
		else if (string.equals("IfcEllipse_SemiAxis2")) {
			resultList.add(((Ifc2x3Package) object).getIfcEllipse_SemiAxis2());
			 //1EAttribute
		}
		else if (string.equals("IfcEllipseProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcEllipseProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcEnergyConversionDevice")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnergyConversionDevice());
			 //1EClass
		}
		else if (string.equals("IfcEnergyProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnergyProperties());
			 //1EClass
		}
		else if (string.equals("IfcEquipmentElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcEquipmentElement());
			 //1EClass
		}
		else if (string.equals("IfcEquipmentStandard")) {
			resultList.add(((Ifc2x3Package) object).getIfcEquipmentStandard());
			 //1EClass
		}
		else if (string.equals("IfcEvaporativeCoolerType")) {
			resultList.add(((Ifc2x3Package) object).getIfcEvaporativeCoolerType());
			 //1EClass
		}
		else if (string.equals("IfcExternalReference")) {
			resultList.add(((Ifc2x3Package) object).getIfcExternalReference());
			 //1EClass
		}
		else if (string.equals("IfcExternalReference_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcExternalReference_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcExtrudedAreaSolid")) {
			resultList.add(((Ifc2x3Package) object).getIfcExtrudedAreaSolid());
			 //1EClass
		}
		else if (string.equals("IfcFaceBasedSurfaceModel")) {
			resultList.add(((Ifc2x3Package) object).getIfcFaceBasedSurfaceModel());
			 //1EClass
		}
		else if (string.equals("IfcFaceBound_Bound")) {
			resultList.add(((Ifc2x3Package) object).getIfcFaceBound_Bound());
			 //1EReference
		}
		else if (string.equals("IfcFaceBound_Orientation")) {
			resultList.add(((Ifc2x3Package) object).getIfcFaceBound_Orientation());
			 //1EAttribute
		}
		else if (string.equals("IfcFaceSurface_SameSense")) {
			resultList.add(((Ifc2x3Package) object).getIfcFaceSurface_SameSense());
			 //1EAttribute
		}
		else if (string.equals("IfcFacetedBrepWithVoids")) {
			resultList.add(((Ifc2x3Package) object).getIfcFacetedBrepWithVoids());
			 //1EClass
		}
		else if (string.equals("IfcFanType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFanType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcAmountOfSubstanceMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcAmountOfSubstanceMeasure());
			 //1EClass
		}
		else if (string.equals("IfcAreaMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcAreaMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcContextDependentMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcContextDependentMeasure());
			 //1EClass
		}
		else if (string.equals("IfcCountMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcCountMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcCurvatureMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurvatureMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcDynamicViscosityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcDynamicViscosityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcElectricCapacitanceMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricCapacitanceMeasure());
			 //1EClass
		}
		else if (string.equals("IfcElectricConductanceMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricConductanceMeasure());
			 //1EClass
		}
		else if (string.equals("IfcElectricResistanceMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricResistanceMeasure());
			 //1EClass
		}
		else if (string.equals("IfcEnergyMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnergyMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcForceMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcForceMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcFrequencyMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcFrequencyMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcGloballyUniqueId_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcGloballyUniqueId_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcGloballyUniqueId_IfcRoot")) {
			resultList.add(((Ifc2x3Package) object).getIfcGloballyUniqueId_IfcRoot());
			 //1EReference
		}
		else if (string.equals("IfcIdentifier_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcIdentifier_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcInductanceMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcInductanceMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcIntegerCountRateMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcIntegerCountRateMeasure());
			 //1EClass
		}
		else if (string.equals("IfcIonConcentrationMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcIonConcentrationMeasure());
			 //1EClass
		}
		else if (string.equals("IfcKinematicViscosityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcKinematicViscosityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcLengthMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcLengthMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcLuminousIntensityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcLuminousIntensityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcMagneticFluxDensityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcMagneticFluxDensityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcMassMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcMassMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcModulusOfElasticityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcModulusOfElasticityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcMoistureDiffusivityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcMoistureDiffusivityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcMonetaryMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcMonetaryMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcNumericMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcNumericMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcPHMeasure_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcPHMeasure_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcParameterValue_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcParameterValue_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcPlaneAngleMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlaneAngleMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcPowerMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPowerMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcPressureMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPressureMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcRatioMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcRatioMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcReal_WrappedValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReal_WrappedValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRotationalFrequencyMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcRotationalFrequencyMeasure());
			 //1EClass
		}
		else if (string.equals("IfcRotationalStiffnessMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcRotationalStiffnessMeasure());
			 //1EClass
		}
		else if (string.equals("IfcSectionalAreaIntegralMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionalAreaIntegralMeasure());
			 //1EClass
		}
		else if (string.equals("IfcSolidAngleMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcSolidAngleMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcSoundPowerMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundPowerMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcSpecificHeatCapacityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpecificHeatCapacityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcSpecularExponent_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpecularExponent_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcSpecularRoughness_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpecularRoughness_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcTemperatureGradientMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcTemperatureGradientMeasure());
			 //1EClass
		}
		else if (string.equals("IfcThermalAdmittanceMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalAdmittanceMeasure());
			 //1EClass
		}
		else if (string.equals("IfcThermalConductivityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalConductivityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcThermalResistanceMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalResistanceMeasure());
			 //1EClass
		}
		else if (string.equals("IfcThermalTransmittanceMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalTransmittanceMeasure());
			 //1EClass
		}
		else if (string.equals("IfcTimeMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcTorqueMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcTorqueMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcVaporPermeabilityMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcVaporPermeabilityMeasure());
			 //1EClass
		}
		else if (string.equals("IfcVolumeMeasure_WrappedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcVolumeMeasure_WrappedValue());
			 //1EAttribute
		}
		else if (string.equals("IfcVolumetricFlowRateMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcVolumetricFlowRateMeasure());
			 //1EClass
		}
		else if (string.equals("IfcPositivePlaneAngleMeasure")) {
			resultList.add(((Ifc2x3Package) object).getIfcPositivePlaneAngleMeasure());
			 //1EClass
		}
		else if (string.equals("IfcActionRequest_RequestID")) {
			resultList.add(((Ifc2x3Package) object).getIfcActionRequest_RequestID());
			 //1EAttribute
		}
		else if (string.equals("IfcActorRole_UserDefinedRole")) {
			resultList.add(((Ifc2x3Package) object).getIfcActorRole_UserDefinedRole());
			 //1EAttribute
		}
		else if (string.equals("IfcActuatorType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcActuatorType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcAddress_UserDefinedPurpose")) {
			resultList.add(((Ifc2x3Package) object).getIfcAddress_UserDefinedPurpose());
			 //1EAttribute
		}
		else if (string.equals("IfcAirTerminalType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcAirTerminalType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcAirToAirHeatRecoveryType")) {
			resultList.add(((Ifc2x3Package) object).getIfcAirToAirHeatRecoveryType());
			 //1EClass
		}
		else if (string.equals("IfcAlarmType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcAlarmType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcAnnotationCurveOccurrence")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationCurveOccurrence());
			 //1EClass
		}
		else if (string.equals("IfcAnnotationFillAreaOccurrence")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationFillAreaOccurrence());
			 //1EClass
		}
		else if (string.equals("IfcAnnotationSurfaceOccurrence")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationSurfaceOccurrence());
			 //1EClass
		}
		else if (string.equals("IfcAnnotationSymbolOccurrence")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationSymbolOccurrence());
			 //1EClass
		}
		else if (string.equals("IfcAnnotationTextOccurrence")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnnotationTextOccurrence());
			 //1EClass
		}
		else if (string.equals("IfcAppliedValue_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValue_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcAppliedValue_AppliedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValue_AppliedValue());
			 //1EReference
		}
		else if (string.equals("IfcAppliedValue_ApplicableDate")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValue_ApplicableDate());
			 //1EReference
		}
		else if (string.equals("IfcAppliedValue_FixedUntilDate")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValue_FixedUntilDate());
			 //1EReference
		}
		else if (string.equals("IfcAppliedValue_ValuesReferenced")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValue_ValuesReferenced());
			 //1EReference
		}
		else if (string.equals("IfcAppliedValue_ValueOfComponents")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValue_ValueOfComponents());
			 //1EReference
		}
		else if (string.equals("IfcAppliedValue_IsComponentIn")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValue_IsComponentIn());
			 //1EReference
		}
		else if (string.equals("IfcAppliedValueRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValueRelationship());
			 //1EClass
		}
		else if (string.equals("IfcAppliedValueRelationship_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValueRelationship_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcApproval_ApprovalDateTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcApproval_ApprovalDateTime());
			 //1EReference
		}
		else if (string.equals("IfcApproval_ApprovalStatus")) {
			resultList.add(((Ifc2x3Package) object).getIfcApproval_ApprovalStatus());
			 //1EAttribute
		}
		else if (string.equals("IfcApproval_ApprovalQualifier")) {
			resultList.add(((Ifc2x3Package) object).getIfcApproval_ApprovalQualifier());
			 //1EAttribute
		}
		else if (string.equals("IfcApprovalActorRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcApprovalActorRelationship());
			 //1EClass
		}
		else if (string.equals("IfcApprovalActorRelationship_Role")) {
			resultList.add(((Ifc2x3Package) object).getIfcApprovalActorRelationship_Role());
			 //1EReference
		}
		else if (string.equals("IfcApprovalPropertyRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcApprovalPropertyRelationship());
			 //1EClass
		}
		else if (string.equals("IfcApprovalRelationship_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcApprovalRelationship_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcArbitraryClosedProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcArbitraryClosedProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcArbitraryOpenProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcArbitraryOpenProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcArbitraryOpenProfileDef_Curve")) {
			resultList.add(((Ifc2x3Package) object).getIfcArbitraryOpenProfileDef_Curve());
			 //1EReference
		}
		else if (string.equals("IfcArbitraryProfileDefWithVoids")) {
			resultList.add(((Ifc2x3Package) object).getIfcArbitraryProfileDefWithVoids());
			 //1EClass
		}
		else if (string.equals("IfcAsset_TotalReplacementCost")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsset_TotalReplacementCost());
			 //1EReference
		}
		else if (string.equals("IfcAsset_ResponsiblePerson")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsset_ResponsiblePerson());
			 //1EReference
		}
		else if (string.equals("IfcAsset_IncorporationDate")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsset_IncorporationDate());
			 //1EReference
		}
		else if (string.equals("IfcAsymmetricIShapeProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcAsymmetricIShapeProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcAxis2Placement2D_RefDirection")) {
			resultList.add(((Ifc2x3Package) object).getIfcAxis2Placement2D_RefDirection());
			 //1EReference
		}
		else if (string.equals("IfcAxis2Placement3D_RefDirection")) {
			resultList.add(((Ifc2x3Package) object).getIfcAxis2Placement3D_RefDirection());
			 //1EReference
		}
		else if (string.equals("IfcBSplineCurve_ControlPointsList")) {
			resultList.add(((Ifc2x3Package) object).getIfcBSplineCurve_ControlPointsList());
			 //1EReference
		}
		else if (string.equals("IfcBSplineCurve_ClosedCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcBSplineCurve_ClosedCurve());
			 //1EAttribute
		}
		else if (string.equals("IfcBSplineCurve_SelfIntersect")) {
			resultList.add(((Ifc2x3Package) object).getIfcBSplineCurve_SelfIntersect());
			 //1EAttribute
		}
		else if (string.equals("IfcBeamType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcBeamType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcBlobTexture_RasterFormat")) {
			resultList.add(((Ifc2x3Package) object).getIfcBlobTexture_RasterFormat());
			 //1EAttribute
		}
		else if (string.equals("IfcBoilerType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoilerType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcBooleanResult_FirstOperand")) {
			resultList.add(((Ifc2x3Package) object).getIfcBooleanResult_FirstOperand());
			 //1EReference
		}
		else if (string.equals("IfcBooleanResult_SecondOperand")) {
			resultList.add(((Ifc2x3Package) object).getIfcBooleanResult_SecondOperand());
			 //1EReference
		}
		else if (string.equals("IfcBoundaryNodeConditionWarping")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeConditionWarping());
			 //1EClass
		}
		else if (string.equals("IfcBoundingBox_XDimAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundingBox_XDimAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundingBox_YDimAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundingBox_YDimAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundingBox_ZDimAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundingBox_ZDimAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoxedHalfSpace_Enclosure")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoxedHalfSpace_Enclosure());
			 //1EReference
		}
		else if (string.equals("IfcBuilding_ElevationOfRefHeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuilding_ElevationOfRefHeight());
			 //1EAttribute
		}
		else if (string.equals("IfcBuilding_ElevationOfTerrain")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuilding_ElevationOfTerrain());
			 //1EAttribute
		}
		else if (string.equals("IfcBuilding_BuildingAddress")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuilding_BuildingAddress());
			 //1EReference
		}
		else if (string.equals("IfcBuildingElementComponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuildingElementComponent());
			 //1EClass
		}
		else if (string.equals("IfcBuildingElementProxyType")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuildingElementProxyType());
			 //1EClass
		}
		else if (string.equals("IfcBuildingStorey_Elevation")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuildingStorey_Elevation());
			 //1EAttribute
		}
		else if (string.equals("IfcCShapeProfileDef_DepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCShapeProfileDef_DepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCShapeProfileDef_WidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCShapeProfileDef_WidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCShapeProfileDef_WallThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcCShapeProfileDef_WallThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcCShapeProfileDef_GirthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCShapeProfileDef_GirthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCableCarrierFittingType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCableCarrierFittingType());
			 //1EClass
		}
		else if (string.equals("IfcCableCarrierSegmentType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCableCarrierSegmentType());
			 //1EClass
		}
		else if (string.equals("IfcCalendarDate_DayComponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcCalendarDate_DayComponent());
			 //1EAttribute
		}
		else if (string.equals("IfcCalendarDate_MonthComponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcCalendarDate_MonthComponent());
			 //1EAttribute
		}
		else if (string.equals("IfcCalendarDate_YearComponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcCalendarDate_YearComponent());
			 //1EAttribute
		}
		else if (string.equals("IfcCartesianPoint_Coordinates")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianPoint_Coordinates());
			 //1EAttribute
		}
		else if (string.equals("IfcCenterLineProfileDef_Thickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcCenterLineProfileDef_Thickness());
			 //1EAttribute
		}
		else if (string.equals("IfcChamferEdgeFeature_Width")) {
			resultList.add(((Ifc2x3Package) object).getIfcChamferEdgeFeature_Width());
			 //1EAttribute
		}
		else if (string.equals("IfcChamferEdgeFeature_Height")) {
			resultList.add(((Ifc2x3Package) object).getIfcChamferEdgeFeature_Height());
			 //1EAttribute
		}
		else if (string.equals("IfcChillerType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcChillerType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcCircleProfileDef_Radius")) {
			resultList.add(((Ifc2x3Package) object).getIfcCircleProfileDef_Radius());
			 //1EAttribute
		}
		else if (string.equals("IfcClassification_EditionDate")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassification_EditionDate());
			 //1EReference
		}
		else if (string.equals("IfcClassification_Contains")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassification_Contains());
			 //1EReference
		}
		else if (string.equals("IfcClassificationItem_Notation")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationItem_Notation());
			 //1EReference
		}
		else if (string.equals("IfcClassificationItem_ItemOf")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationItem_ItemOf());
			 //1EReference
		}
		else if (string.equals("IfcClassificationItem_Title")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationItem_Title());
			 //1EAttribute
		}
		else if (string.equals("IfcClassificationItemRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationItemRelationship());
			 //1EClass
		}
		else if (string.equals("IfcClassificationNotationFacet")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationNotationFacet());
			 //1EClass
		}
		else if (string.equals("IfcClassificationReference")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationReference());
			 //1EClass
		}
		else if (string.equals("IfcCoilType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCoilType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcColourRgb_GreenAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcColourRgb_GreenAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcColourSpecification_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcColourSpecification_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcColumnType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcColumnType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcComplexProperty_UsageName")) {
			resultList.add(((Ifc2x3Package) object).getIfcComplexProperty_UsageName());
			 //1EAttribute
		}
		else if (string.equals("IfcComplexProperty_HasProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcComplexProperty_HasProperties());
			 //1EReference
		}
		else if (string.equals("IfcCompositeCurve_Segments")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompositeCurve_Segments());
			 //1EReference
		}
		else if (string.equals("IfcCompositeCurve_SelfIntersect")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompositeCurve_SelfIntersect());
			 //1EAttribute
		}
		else if (string.equals("IfcCompositeCurveSegment_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompositeCurveSegment_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcCompositeProfileDef_Profiles")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompositeProfileDef_Profiles());
			 //1EReference
		}
		else if (string.equals("IfcCompositeProfileDef_Label")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompositeProfileDef_Label());
			 //1EAttribute
		}
		else if (string.equals("IfcCompressorType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompressorType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcCondenserType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCondenserType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcConditionCriterion_Criterion")) {
			resultList.add(((Ifc2x3Package) object).getIfcConditionCriterion_Criterion());
			 //1EReference
		}
		else if (string.equals("IfcConnectedFaceSet_CfsFaces")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectedFaceSet_CfsFaces());
			 //1EReference
		}
		else if (string.equals("IfcConnectionCurveGeometry")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionCurveGeometry());
			 //1EClass
		}
		else if (string.equals("IfcConnectionPointEccentricity")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPointEccentricity());
			 //1EClass
		}
		else if (string.equals("IfcConnectionPointGeometry")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPointGeometry());
			 //1EClass
		}
		else if (string.equals("IfcConnectionSurfaceGeometry")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionSurfaceGeometry());
			 //1EClass
		}
		else if (string.equals("IfcConstraint_ConstraintGrade")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint_ConstraintGrade());
			 //1EAttribute
		}
		else if (string.equals("IfcConstraint_ConstraintSource")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint_ConstraintSource());
			 //1EAttribute
		}
		else if (string.equals("IfcConstraint_CreatingActor")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint_CreatingActor());
			 //1EReference
		}
		else if (string.equals("IfcConstraint_CreationTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint_CreationTime());
			 //1EReference
		}
		else if (string.equals("IfcConstraint_UserDefinedGrade")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint_UserDefinedGrade());
			 //1EAttribute
		}
		else if (string.equals("IfcConstraint_ClassifiedAs")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint_ClassifiedAs());
			 //1EReference
		}
		else if (string.equals("IfcConstraint_RelatesConstraints")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint_RelatesConstraints());
			 //1EReference
		}
		else if (string.equals("IfcConstraint_IsRelatedWith")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint_IsRelatedWith());
			 //1EReference
		}
		else if (string.equals("IfcConstraint_IsAggregatedIn")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraint_IsAggregatedIn());
			 //1EReference
		}
		else if (string.equals("IfcConstraintRelationship_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintRelationship_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcConstructionEquipmentResource")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstructionEquipmentResource());
			 //1EClass
		}
		else if (string.equals("IfcConstructionMaterialResource")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstructionMaterialResource());
			 //1EClass
		}
		else if (string.equals("IfcConstructionProductResource")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstructionProductResource());
			 //1EClass
		}
		else if (string.equals("IfcContextDependentUnit_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcContextDependentUnit_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcControllerType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcControllerType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcConversionBasedUnit_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcConversionBasedUnit_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcCooledBeamType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCooledBeamType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcCoordinatedUniversalTimeOffset")) {
			resultList.add(((Ifc2x3Package) object).getIfcCoordinatedUniversalTimeOffset());
			 //1EClass
		}
		else if (string.equals("IfcCostSchedule_SubmittedBy")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostSchedule_SubmittedBy());
			 //1EReference
		}
		else if (string.equals("IfcCostSchedule_PreparedBy")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostSchedule_PreparedBy());
			 //1EReference
		}
		else if (string.equals("IfcCostSchedule_SubmittedOn")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostSchedule_SubmittedOn());
			 //1EReference
		}
		else if (string.equals("IfcCostSchedule_TargetUsers")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostSchedule_TargetUsers());
			 //1EReference
		}
		else if (string.equals("IfcCostSchedule_UpdateDate")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostSchedule_UpdateDate());
			 //1EReference
		}
		else if (string.equals("IfcCostSchedule_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostSchedule_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcCovering_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCovering_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcCoveringType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCoveringType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcCsgPrimitive3D_Position")) {
			resultList.add(((Ifc2x3Package) object).getIfcCsgPrimitive3D_Position());
			 //1EReference
		}
		else if (string.equals("IfcCsgSolid_TreeRootExpression")) {
			resultList.add(((Ifc2x3Package) object).getIfcCsgSolid_TreeRootExpression());
			 //1EReference
		}
		else if (string.equals("IfcCurtainWallType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurtainWallType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcCurveBoundedPlane_BasisSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveBoundedPlane_BasisSurface());
			 //1EReference
		}
		else if (string.equals("IfcCurveStyleFont_PatternList")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFont_PatternList());
			 //1EReference
		}
		else if (string.equals("IfcCurveStyleFontAndScaling")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFontAndScaling());
			 //1EClass
		}
		else if (string.equals("IfcCurveStyleFontAndScaling_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFontAndScaling_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcDamperType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDamperType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcDateAndTime_DateComponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcDateAndTime_DateComponent());
			 //1EReference
		}
		else if (string.equals("IfcDateAndTime_TimeComponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcDateAndTime_TimeComponent());
			 //1EReference
		}
		else if (string.equals("IfcDefinedSymbol_Definition")) {
			resultList.add(((Ifc2x3Package) object).getIfcDefinedSymbol_Definition());
			 //1EReference
		}
		else if (string.equals("IfcDerivedProfileDef_Operator")) {
			resultList.add(((Ifc2x3Package) object).getIfcDerivedProfileDef_Operator());
			 //1EReference
		}
		else if (string.equals("IfcDerivedProfileDef_Label")) {
			resultList.add(((Ifc2x3Package) object).getIfcDerivedProfileDef_Label());
			 //1EAttribute
		}
		else if (string.equals("IfcDerivedUnit_UserDefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDerivedUnit_UserDefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcDerivedUnitElement_Unit")) {
			resultList.add(((Ifc2x3Package) object).getIfcDerivedUnitElement_Unit());
			 //1EReference
		}
		else if (string.equals("IfcDerivedUnitElement_Exponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcDerivedUnitElement_Exponent());
			 //1EAttribute
		}
		else if (string.equals("IfcDimensionCalloutRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionCalloutRelationship());
			 //1EClass
		}
		else if (string.equals("IfcDimensionCurveDirectedCallout")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionCurveDirectedCallout());
			 //1EClass
		}
		else if (string.equals("IfcDimensionCurveTerminator")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionCurveTerminator());
			 //1EClass
		}
		else if (string.equals("IfcDimensionCurveTerminator_Role")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionCurveTerminator_Role());
			 //1EAttribute
		}
		else if (string.equals("IfcDirection_DirectionRatios")) {
			resultList.add(((Ifc2x3Package) object).getIfcDirection_DirectionRatios());
			 //1EAttribute
		}
		else if (string.equals("IfcDistributionChamberElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionChamberElement());
			 //1EClass
		}
		else if (string.equals("IfcDistributionChamberElementType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionChamberElementType());
			 //1EClass
		}
		else if (string.equals("IfcDistributionControlElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionControlElement());
			 //1EClass
		}
		else if (string.equals("IfcDistributionControlElementType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionControlElementType());
			 //1EClass
		}
		else if (string.equals("IfcDistributionElementType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionElementType());
			 //1EClass
		}
		else if (string.equals("IfcDistributionFlowElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionFlowElement());
			 //1EClass
		}
		else if (string.equals("IfcDistributionFlowElementType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionFlowElementType());
			 //1EClass
		}
		else if (string.equals("IfcDistributionPort_FlowDirection")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionPort_FlowDirection());
			 //1EAttribute
		}
		else if (string.equals("IfcDocumentElectronicFormat")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentElectronicFormat());
			 //1EClass
		}
		else if (string.equals("IfcDocumentInformation_DocumentId")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_DocumentId());
			 //1EAttribute
		}
		else if (string.equals("IfcDocumentInformation_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcDocumentInformation_Purpose")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_Purpose());
			 //1EAttribute
		}
		else if (string.equals("IfcDocumentInformation_Scope")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_Scope());
			 //1EAttribute
		}
		else if (string.equals("IfcDocumentInformation_Revision")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_Revision());
			 //1EAttribute
		}
		else if (string.equals("IfcDocumentInformation_Editors")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_Editors());
			 //1EReference
		}
		else if (string.equals("IfcDocumentInformation_ValidFrom")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_ValidFrom());
			 //1EReference
		}
		else if (string.equals("IfcDocumentInformation_ValidUntil")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_ValidUntil());
			 //1EReference
		}
		else if (string.equals("IfcDocumentInformation_Status")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_Status());
			 //1EAttribute
		}
		else if (string.equals("IfcDocumentInformation_IsPointer")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentInformation_IsPointer());
			 //1EReference
		}
		else if (string.equals("IfcDoor_OverallHeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoor_OverallHeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDoor_OverallWidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoor_OverallWidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorPanelProperties_PanelDepth")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorPanelProperties_PanelDepth());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorPanelProperties_PanelWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorPanelProperties_PanelWidth());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorStyle_OperationType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorStyle_OperationType());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorStyle_ConstructionType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorStyle_ConstructionType());
			 //1EAttribute
		}
		else if (string.equals("IfcDraughtingCallout_Contents")) {
			resultList.add(((Ifc2x3Package) object).getIfcDraughtingCallout_Contents());
			 //1EReference
		}
		else if (string.equals("IfcDraughtingCalloutRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcDraughtingCalloutRelationship());
			 //1EClass
		}
		else if (string.equals("IfcDraughtingPreDefinedColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcDraughtingPreDefinedColour());
			 //1EClass
		}
		else if (string.equals("IfcDraughtingPreDefinedCurveFont")) {
			resultList.add(((Ifc2x3Package) object).getIfcDraughtingPreDefinedCurveFont());
			 //1EClass
		}
		else if (string.equals("IfcDraughtingPreDefinedTextFont")) {
			resultList.add(((Ifc2x3Package) object).getIfcDraughtingPreDefinedTextFont());
			 //1EClass
		}
		else if (string.equals("IfcDuctFittingType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDuctFittingType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcDuctSegmentType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDuctSegmentType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcEdgeFeature_FeatureLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcEdgeFeature_FeatureLength());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricDistributionPoint")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricDistributionPoint());
			 //1EClass
		}
		else if (string.equals("IfcElectricFlowStorageDeviceType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricFlowStorageDeviceType());
			 //1EClass
		}
		else if (string.equals("IfcElectricTimeControlType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricTimeControlType());
			 //1EClass
		}
		else if (string.equals("IfcElectricalBaseProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties());
			 //1EClass
		}
		else if (string.equals("IfcElement_HasStructuralMember")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement_HasStructuralMember());
			 //1EReference
		}
		else if (string.equals("IfcElement_ReferencedInStructures")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement_ReferencedInStructures());
			 //1EReference
		}
		else if (string.equals("IfcElement_ProvidesBoundaries")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement_ProvidesBoundaries());
			 //1EReference
		}
		else if (string.equals("IfcElement_ContainedInStructure")) {
			resultList.add(((Ifc2x3Package) object).getIfcElement_ContainedInStructure());
			 //1EReference
		}
		else if (string.equals("IfcElementAssembly_AssemblyPlace")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementAssembly_AssemblyPlace());
			 //1EAttribute
		}
		else if (string.equals("IfcElementAssembly_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementAssembly_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcElementQuantity_Quantities")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementQuantity_Quantities());
			 //1EReference
		}
		else if (string.equals("IfcElementType_ElementType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementType_ElementType());
			 //1EAttribute
		}
		else if (string.equals("IfcElementarySurface_Position")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementarySurface_Position());
			 //1EReference
		}
		else if (string.equals("IfcEllipse_SemiAxis1AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcEllipse_SemiAxis1AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcEllipse_SemiAxis2AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcEllipse_SemiAxis2AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcEllipseProfileDef_SemiAxis1")) {
			resultList.add(((Ifc2x3Package) object).getIfcEllipseProfileDef_SemiAxis1());
			 //1EAttribute
		}
		else if (string.equals("IfcEllipseProfileDef_SemiAxis2")) {
			resultList.add(((Ifc2x3Package) object).getIfcEllipseProfileDef_SemiAxis2());
			 //1EAttribute
		}
		else if (string.equals("IfcEnergyConversionDeviceType")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnergyConversionDeviceType());
			 //1EClass
		}
		else if (string.equals("IfcEnvironmentalImpactValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnvironmentalImpactValue());
			 //1EClass
		}
		else if (string.equals("IfcEvaporatorType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcEvaporatorType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcExtendedMaterialProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcExtendedMaterialProperties());
			 //1EClass
		}
		else if (string.equals("IfcExternalReference_Location")) {
			resultList.add(((Ifc2x3Package) object).getIfcExternalReference_Location());
			 //1EAttribute
		}
		else if (string.equals("IfcExternallyDefinedHatchStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcExternallyDefinedHatchStyle());
			 //1EClass
		}
		else if (string.equals("IfcExternallyDefinedSurfaceStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcExternallyDefinedSurfaceStyle());
			 //1EClass
		}
		else if (string.equals("IfcExternallyDefinedSymbol")) {
			resultList.add(((Ifc2x3Package) object).getIfcExternallyDefinedSymbol());
			 //1EClass
		}
		else if (string.equals("IfcExternallyDefinedTextFont")) {
			resultList.add(((Ifc2x3Package) object).getIfcExternallyDefinedTextFont());
			 //1EClass
		}
		else if (string.equals("IfcExtrudedAreaSolid_Depth")) {
			resultList.add(((Ifc2x3Package) object).getIfcExtrudedAreaSolid_Depth());
			 //1EAttribute
		}
		else if (string.equals("IfcFaceBasedSurfaceModel_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcFaceBasedSurfaceModel_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcFaceSurface_FaceSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcFaceSurface_FaceSurface());
			 //1EReference
		}
		else if (string.equals("IfcFacetedBrepWithVoids_Voids")) {
			resultList.add(((Ifc2x3Package) object).getIfcFacetedBrepWithVoids_Voids());
			 //1EReference
		}
		else if (string.equals("IfcFailureConnectionCondition")) {
			resultList.add(((Ifc2x3Package) object).getIfcFailureConnectionCondition());
			 //1EClass
		}
		else if (string.equals("IfcFeatureElementSubtraction")) {
			resultList.add(((Ifc2x3Package) object).getIfcFeatureElementSubtraction());
			 //1EClass
		}
		else if (string.equals("IfcFillAreaStyle_FillStyles")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyle_FillStyles());
			 //1EReference
		}
		else if (string.equals("IfcFillAreaStyleTiles_Tiles")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleTiles_Tiles());
			 //1EReference
		}
		else if (string.equals("IfcFillAreaStyleTiles_TilingScale")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleTiles_TilingScale());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryNodeCondition_LinearStiffnessYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeCondition_LinearStiffnessYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryNodeCondition_LinearStiffnessZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeCondition_LinearStiffnessZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryNodeCondition_RotationalStiffnessX")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeCondition_RotationalStiffnessX());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryNodeCondition_RotationalStiffnessY")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeCondition_RotationalStiffnessY());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryNodeCondition_RotationalStiffnessZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeCondition_RotationalStiffnessZ());
			 //1EAttribute
		}
		else if (string.equals("IfcBoundaryNodeConditionWarping_WarpingStiffness")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoundaryNodeConditionWarping_WarpingStiffness());
			 //1EAttribute
		}
		else if (string.equals("IfcBuildingElementProxyType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuildingElementProxyType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcCShapeProfileDef_InternalFilletRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCShapeProfileDef_InternalFilletRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCShapeProfileDef_CentreOfGravityInXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCShapeProfileDef_CentreOfGravityInXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCartesianTransformationOperator_LocalOrigin")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator_LocalOrigin());
			 //1EReference
		}
		else if (string.equals("IfcCartesianTransformationOperator_ScaleAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator_ScaleAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCartesianTransformationOperator2DnonUniform")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator2DnonUniform());
			 //1EClass
		}
		else if (string.equals("IfcCartesianTransformationOperator3D_Axis3")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator3D_Axis3());
			 //1EReference
		}
		else if (string.equals("IfcCartesianTransformationOperator3DnonUniform")) {
			resultList.add(((Ifc2x3Package) object).getIfcCartesianTransformationOperator3DnonUniform());
			 //1EClass
		}
		else if (string.equals("IfcCircleHollowProfileDef_WallThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCircleHollowProfileDef_WallThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcClassificationItemRelationship_RelatingItem")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationItemRelationship_RelatingItem());
			 //1EReference
		}
		else if (string.equals("IfcClassificationItemRelationship_RelatedItems")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationItemRelationship_RelatedItems());
			 //1EReference
		}
		else if (string.equals("IfcClassificationNotationFacet_NotationValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationNotationFacet_NotationValue());
			 //1EAttribute
		}
		else if (string.equals("IfcClassificationReference_ReferencedSource")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationReference_ReferencedSource());
			 //1EReference
		}
		else if (string.equals("IfcConnectionCurveGeometry_CurveOnRelatingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionCurveGeometry_CurveOnRelatingElement());
			 //1EReference
		}
		else if (string.equals("IfcConnectionCurveGeometry_CurveOnRelatedElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionCurveGeometry_CurveOnRelatedElement());
			 //1EReference
		}
		else if (string.equals("IfcConnectionPointEccentricity_EccentricityInX")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPointEccentricity_EccentricityInX());
			 //1EAttribute
		}
		else if (string.equals("IfcConnectionPointEccentricity_EccentricityInY")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPointEccentricity_EccentricityInY());
			 //1EAttribute
		}
		else if (string.equals("IfcConnectionPointEccentricity_EccentricityInZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPointEccentricity_EccentricityInZ());
			 //1EAttribute
		}
		else if (string.equals("IfcConnectionPointGeometry_PointOnRelatingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPointGeometry_PointOnRelatingElement());
			 //1EReference
		}
		else if (string.equals("IfcConnectionPointGeometry_PointOnRelatedElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionPointGeometry_PointOnRelatedElement());
			 //1EReference
		}
		else if (string.equals("IfcConstraintAggregationRelationship_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintAggregationRelationship_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcConstraintRelationship_RelatingConstraint")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintRelationship_RelatingConstraint());
			 //1EReference
		}
		else if (string.equals("IfcConstraintRelationship_RelatedConstraints")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintRelationship_RelatedConstraints());
			 //1EReference
		}
		else if (string.equals("IfcConstructionMaterialResource_UsageRatio")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstructionMaterialResource_UsageRatio());
			 //1EAttribute
		}
		else if (string.equals("IfcConstructionResource_ResourceIdentifier")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstructionResource_ResourceIdentifier());
			 //1EAttribute
		}
		else if (string.equals("IfcConstructionResource_ResourceConsumption")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstructionResource_ResourceConsumption());
			 //1EAttribute
		}
		else if (string.equals("IfcCoordinatedUniversalTimeOffset_HourOffset")) {
			resultList.add(((Ifc2x3Package) object).getIfcCoordinatedUniversalTimeOffset_HourOffset());
			 //1EAttribute
		}
		else if (string.equals("IfcCoordinatedUniversalTimeOffset_MinuteOffset")) {
			resultList.add(((Ifc2x3Package) object).getIfcCoordinatedUniversalTimeOffset_MinuteOffset());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_OverallHeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_OverallHeight());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_BaseWidth2AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_BaseWidth2AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_RadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_RadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_HeadWidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_HeadWidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_HeadDepth2AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_HeadDepth2AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_HeadDepth3AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_HeadDepth3AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_WebThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_WebThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_BaseWidth4AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_BaseWidth4AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_BaseDepth1AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_BaseDepth1AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_BaseDepth2AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_BaseDepth2AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_BaseDepth3AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_BaseDepth3AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailAShapeProfileDef_CentreOfGravityInY")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailAShapeProfileDef_CentreOfGravityInY());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_OverallHeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_OverallHeight());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_HeadWidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_HeadWidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_RadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_RadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_HeadDepth2AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_HeadDepth2AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_HeadDepth3AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_HeadDepth3AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_WebThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_WebThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_BaseDepth1AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_BaseDepth1AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_BaseDepth2AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_BaseDepth2AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCraneRailFShapeProfileDef_CentreOfGravityInY")) {
			resultList.add(((Ifc2x3Package) object).getIfcCraneRailFShapeProfileDef_CentreOfGravityInY());
			 //1EAttribute
		}
		else if (string.equals("IfcCurrencyRelationship_RelatingMonetaryUnit")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurrencyRelationship_RelatingMonetaryUnit());
			 //1EReference
		}
		else if (string.equals("IfcCurrencyRelationship_RelatedMonetaryUnit")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurrencyRelationship_RelatedMonetaryUnit());
			 //1EReference
		}
		else if (string.equals("IfcCurrencyRelationship_ExchangeRateAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurrencyRelationship_ExchangeRateAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCurveStyleFontAndScaling_CurveFontScaling")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFontAndScaling_CurveFontScaling());
			 //1EAttribute
		}
		else if (string.equals("IfcCurveStyleFontPattern_VisibleSegmentLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFontPattern_VisibleSegmentLength());
			 //1EAttribute
		}
		else if (string.equals("IfcCurveStyleFontPattern_InvisibleSegmentLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFontPattern_InvisibleSegmentLength());
			 //1EAttribute
		}
		else if (string.equals("IfcDimensionalExponents_ElectricCurrentExponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionalExponents_ElectricCurrentExponent());
			 //1EAttribute
		}
		else if (string.equals("IfcDimensionalExponents_AmountOfSubstanceExponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionalExponents_AmountOfSubstanceExponent());
			 //1EAttribute
		}
		else if (string.equals("IfcDimensionalExponents_LuminousIntensityExponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionalExponents_LuminousIntensityExponent());
			 //1EAttribute
		}
		else if (string.equals("IfcDistributionChamberElementType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionChamberElementType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcDistributionControlElement_ControlElementId")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionControlElement_ControlElementId());
			 //1EAttribute
		}
		else if (string.equals("IfcDistributionFlowElement_HasControlElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionFlowElement_HasControlElements());
			 //1EReference
		}
		else if (string.equals("IfcDocumentElectronicFormat_MimeContentType")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentElectronicFormat_MimeContentType());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_LiningDepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_LiningDepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_LiningThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_LiningThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_ThresholdDepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_ThresholdDepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_ThresholdThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_ThresholdThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_TransomThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_TransomThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_TransomOffsetAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_TransomOffsetAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_LiningOffsetAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_LiningOffsetAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_ThresholdOffsetAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_ThresholdOffsetAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_CasingThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_CasingThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDoorLiningProperties_CasingDepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorLiningProperties_CasingDepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDraughtingCalloutRelationship_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcDraughtingCalloutRelationship_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricDistributionPoint_UserDefinedFunction")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricDistributionPoint_UserDefinedFunction());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricFlowStorageDeviceType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricFlowStorageDeviceType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_ElectricCurrentType")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_ElectricCurrentType());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_InputVoltageAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_InputVoltageAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_InputFrequency")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_InputFrequency());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_FullLoadCurrent")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_FullLoadCurrent());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_MinimumCircuitCurrent")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_MinimumCircuitCurrent());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_MaximumPowerInput")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_MaximumPowerInput());
			 //1EAttribute
		}
		else if (string.equals("IfcElectricalBaseProperties_RatedPowerInput")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricalBaseProperties_RatedPowerInput());
			 //1EAttribute
		}
		else if (string.equals("IfcEnergyProperties_UserDefinedEnergySequence")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnergyProperties_UserDefinedEnergySequence());
			 //1EAttribute
		}
		else if (string.equals("IfcEnvironmentalImpactValue_UserDefinedCategory")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnvironmentalImpactValue_UserDefinedCategory());
			 //1EAttribute
		}
		else if (string.equals("IfcExtendedMaterialProperties_ExtendedProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcExtendedMaterialProperties_ExtendedProperties());
			 //1EReference
		}
		else if (string.equals("IfcFailureConnectionCondition_TensionFailureX")) {
			resultList.add(((Ifc2x3Package) object).getIfcFailureConnectionCondition_TensionFailureX());
			 //1EAttribute
		}
		else if (string.equals("IfcFailureConnectionCondition_TensionFailureY")) {
			resultList.add(((Ifc2x3Package) object).getIfcFailureConnectionCondition_TensionFailureY());
			 //1EAttribute
		}
		else if (string.equals("IfcFailureConnectionCondition_TensionFailureZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcFailureConnectionCondition_TensionFailureZ());
			 //1EAttribute
		}
		else if (string.equals("IfcFailureConnectionCondition_CompressionFailureX")) {
			resultList.add(((Ifc2x3Package) object).getIfcFailureConnectionCondition_CompressionFailureX());
			 //1EAttribute
		}
		else if (string.equals("IfcFailureConnectionCondition_CompressionFailureY")) {
			resultList.add(((Ifc2x3Package) object).getIfcFailureConnectionCondition_CompressionFailureY());
			 //1EAttribute
		}
		else if (string.equals("IfcFailureConnectionCondition_CompressionFailureZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcFailureConnectionCondition_CompressionFailureZ());
			 //1EAttribute
		}
		else if (string.equals("IfcFeatureElementAddition_ProjectsElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcFeatureElementAddition_ProjectsElements());
			 //1EReference
		}
		else if (string.equals("IfcFeatureElementSubtraction_VoidsElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcFeatureElementSubtraction_VoidsElements());
			 //1EReference
		}
		else if (string.equals("IfcFillAreaStyleHatching_HatchLineAppearance")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleHatching_HatchLineAppearance());
			 //1EReference
		}
		else if (string.equals("IfcFillAreaStyleHatching_StartOfNextHatchLine")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleHatching_StartOfNextHatchLine());
			 //1EReference
		}
		else if (string.equals("IfcFillAreaStyleHatching_HatchLineAngleAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleHatching_HatchLineAngleAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFillAreaStyleTileSymbolWithStyle_Symbol")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleTileSymbolWithStyle_Symbol());
			 //1EReference
		}
		else if (string.equals("IfcFireSuppressionTerminalType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFireSuppressionTerminalType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcFluidFlowProperties_FlowConditionTimeSeries")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_FlowConditionTimeSeries());
			 //1EReference
		}
		else if (string.equals("IfcFluidFlowProperties_UserDefinedPropertySource")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_UserDefinedPropertySource());
			 //1EAttribute
		}
		else if (string.equals("IfcFluidFlowProperties_TemperatureSingleValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_TemperatureSingleValue());
			 //1EAttribute
		}
		else if (string.equals("IfcFluidFlowProperties_TemperatureTimeSeries")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_TemperatureTimeSeries());
			 //1EReference
		}
		else if (string.equals("IfcFluidFlowProperties_FlowrateSingleValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_FlowrateSingleValue());
			 //1EReference
		}
		else if (string.equals("IfcFluidFlowProperties_FlowConditionSingleValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_FlowConditionSingleValue());
			 //1EAttribute
		}
		else if (string.equals("IfcFluidFlowProperties_VelocitySingleValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_VelocitySingleValue());
			 //1EAttribute
		}
		else if (string.equals("IfcFluidFlowProperties_PressureSingleValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_PressureSingleValue());
			 //1EAttribute
		}
		else if (string.equals("IfcFuelProperties_CombustionTemperatureAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFuelProperties_CombustionTemperatureAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFuelProperties_LowerHeatingValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFuelProperties_LowerHeatingValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFuelProperties_HigherHeatingValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFuelProperties_HigherHeatingValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralMaterialProperties_MolecularWeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralMaterialProperties_MolecularWeight());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralMaterialProperties_PorosityAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralMaterialProperties_PorosityAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralMaterialProperties_MassDensityAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralMaterialProperties_MassDensityAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralProfileProperties_PhysicalWeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralProfileProperties_PhysicalWeight());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralProfileProperties_PerimeterAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralProfileProperties_PerimeterAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralProfileProperties_MinimumPlateThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralProfileProperties_MinimumPlateThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralProfileProperties_MaximumPlateThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralProfileProperties_MaximumPlateThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralProfileProperties_CrossSectionArea")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralProfileProperties_CrossSectionArea());
			 //1EAttribute
		}
		else if (string.equals("IfcGeometricRepresentationContext_Precision")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationContext_Precision());
			 //1EAttribute
		}
		else if (string.equals("IfcGeometricRepresentationContext_TrueNorth")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationContext_TrueNorth());
			 //1EReference
		}
		else if (string.equals("IfcGeometricRepresentationContext_HasSubContexts")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationContext_HasSubContexts());
			 //1EReference
		}
		else if (string.equals("IfcGeometricRepresentationSubContext_TargetScale")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationSubContext_TargetScale());
			 //1EAttribute
		}
		else if (string.equals("IfcGeometricRepresentationSubContext_TargetView")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationSubContext_TargetView());
			 //1EAttribute
		}
		else if (string.equals("IfcIShapeProfileDef_FlangeThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcIShapeProfileDef_FlangeThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_CentreOfGravityInXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_CentreOfGravityInXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_CentreOfGravityInYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_CentreOfGravityInYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLightDistributionData_MainPlaneAngleAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightDistributionData_MainPlaneAngleAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLightDistributionData_SecondaryPlaneAngle")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightDistributionData_SecondaryPlaneAngle());
			 //1EAttribute
		}
		else if (string.equals("IfcLightDistributionData_LuminousIntensity")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightDistributionData_LuminousIntensity());
			 //1EAttribute
		}
		else if (string.equals("IfcLightIntensityDistribution_DistributionData")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightIntensityDistribution_DistributionData());
			 //1EReference
		}
		else if (string.equals("IfcLightSourceGoniometric_ColourAppearance")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceGoniometric_ColourAppearance());
			 //1EReference
		}
		else if (string.equals("IfcLightSourceGoniometric_ColourTemperature")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceGoniometric_ColourTemperature());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourceGoniometric_LuminousFluxAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceGoniometric_LuminousFluxAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourceGoniometric_LightEmissionSource")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceGoniometric_LightEmissionSource());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourcePositional_ConstantAttenuation")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourcePositional_ConstantAttenuation());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourcePositional_DistanceAttenuation")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourcePositional_DistanceAttenuation());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourcePositional_QuadricAttenuation")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourcePositional_QuadricAttenuation());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourceSpot_ConcentrationExponentAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceSpot_ConcentrationExponentAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMaterialLayerSet_TotalThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayerSet_TotalThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMaterialLayerSetUsage_LayerSetDirection")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayerSetUsage_LayerSetDirection());
			 //1EAttribute
		}
		else if (string.equals("IfcMaterialLayerSetUsage_OffsetFromReferenceLine")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayerSetUsage_OffsetFromReferenceLine());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalFastener_NominalDiameterAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalFastener_NominalDiameterAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalFastener_NominalLengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalFastener_NominalLengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalMaterialProperties_DynamicViscosity")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalMaterialProperties_DynamicViscosity());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalMaterialProperties_YoungModulus")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalMaterialProperties_YoungModulus());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalMaterialProperties_ShearModulus")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalMaterialProperties_ShearModulus());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalMaterialProperties_PoissonRatio")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalMaterialProperties_PoissonRatio());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties_YieldStress")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties_YieldStress());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties_Relaxations")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties_Relaxations());
			 //1EReference
		}
		else if (string.equals("IfcOpticalMaterialProperties_VisibleTransmittance")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_VisibleTransmittance());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_SolarTransmittance")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_SolarTransmittance());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_SolarReflectanceBack")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_SolarReflectanceBack());
			 //1EAttribute
		}
		else if (string.equals("IfcOrganizationRelationship_RelatingOrganization")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganizationRelationship_RelatingOrganization());
			 //1EReference
		}
		else if (string.equals("IfcOrganizationRelationship_RelatedOrganizations")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganizationRelationship_RelatedOrganizations());
			 //1EReference
		}
		else if (string.equals("IfcPermeableCoveringProperties_OperationType")) {
			resultList.add(((Ifc2x3Package) object).getIfcPermeableCoveringProperties_OperationType());
			 //1EAttribute
		}
		else if (string.equals("IfcPermeableCoveringProperties_PanelPosition")) {
			resultList.add(((Ifc2x3Package) object).getIfcPermeableCoveringProperties_PanelPosition());
			 //1EAttribute
		}
		else if (string.equals("IfcPermeableCoveringProperties_FrameDepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcPermeableCoveringProperties_FrameDepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcPermeableCoveringProperties_FrameThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcPermeableCoveringProperties_FrameThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcPermeableCoveringProperties_ShapeAspectStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcPermeableCoveringProperties_ShapeAspectStyle());
			 //1EReference
		}
		else if (string.equals("IfcPolygonalBoundedHalfSpace_PolygonalBoundary")) {
			resultList.add(((Ifc2x3Package) object).getIfcPolygonalBoundedHalfSpace_PolygonalBoundary());
			 //1EReference
		}
		else if (string.equals("IfcPresentationLayerAssignment_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationLayerAssignment_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcPresentationLayerAssignment_AssignedItems")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationLayerAssignment_AssignedItems());
			 //1EReference
		}
		else if (string.equals("IfcPresentationLayerWithStyle_LayerBlocked")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationLayerWithStyle_LayerBlocked());
			 //1EAttribute
		}
		else if (string.equals("IfcProductsOfCombustionProperties_N20Content")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductsOfCombustionProperties_N20Content());
			 //1EAttribute
		}
		else if (string.equals("IfcProductsOfCombustionProperties_COContent")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductsOfCombustionProperties_COContent());
			 //1EAttribute
		}
		else if (string.equals("IfcProductsOfCombustionProperties_CO2Content")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductsOfCombustionProperties_CO2Content());
			 //1EAttribute
		}
		else if (string.equals("IfcPropertyConstraintRelationship_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyConstraintRelationship_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcPropertyDependencyRelationship_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyDependencyRelationship_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcPropertyDependencyRelationship_Expression")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyDependencyRelationship_Expression());
			 //1EAttribute
		}
		else if (string.equals("IfcPropertyEnumeratedValue_EnumerationValues")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyEnumeratedValue_EnumerationValues());
			 //1EReference
		}
		else if (string.equals("IfcPropertyEnumeratedValue_EnumerationReference")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyEnumeratedValue_EnumerationReference());
			 //1EReference
		}
		else if (string.equals("IfcPropertyReferenceValue_PropertyReference")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyReferenceValue_PropertyReference());
			 //1EReference
		}
		else if (string.equals("IfcPropertySetDefinition_PropertyDefinitionOf")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertySetDefinition_PropertyDefinitionOf());
			 //1EReference
		}
		else if (string.equals("IfcRationalBezierCurve_WeightsDataAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRationalBezierCurve_WeightsDataAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangleHollowProfileDef_WallThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangleHollowProfileDef_WallThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangleHollowProfileDef_InnerFilletRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangleHollowProfileDef_InnerFilletRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangleHollowProfileDef_OuterFilletRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangleHollowProfileDef_OuterFilletRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcReferencesValueDocument_ReferencedDocument")) {
			resultList.add(((Ifc2x3Package) object).getIfcReferencesValueDocument_ReferencedDocument());
			 //1EReference
		}
		else if (string.equals("IfcReferencesValueDocument_ReferencingValues")) {
			resultList.add(((Ifc2x3Package) object).getIfcReferencesValueDocument_ReferencingValues());
			 //1EReference
		}
		else if (string.equals("IfcReinforcementBarProperties_EffectiveDepth")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementBarProperties_EffectiveDepth());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcementBarProperties_NominalBarDiameter")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementBarProperties_NominalBarDiameter());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcementBarProperties_BarCountAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementBarProperties_BarCountAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingBar_CrossSectionAreaAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingBar_CrossSectionAreaAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_LongitudinalBarNominalDiameter")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_LongitudinalBarNominalDiameter());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_TransverseBarNominalDiameter")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_TransverseBarNominalDiameter());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_TransverseBarCrossSectionArea")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_TransverseBarCrossSectionArea());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_LongitudinalBarSpacingAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_LongitudinalBarSpacingAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_TransverseBarSpacingAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_TransverseBarSpacingAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRelAssociatesAppliedValue_RelatingAppliedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesAppliedValue_RelatingAppliedValue());
			 //1EReference
		}
		else if (string.equals("IfcRelAssociatesConstraint_RelatingConstraint")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesConstraint_RelatingConstraint());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsPathElements_RelatingPriorities")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsPathElements_RelatingPriorities());
			 //1EAttribute
		}
		else if (string.equals("IfcRelConnectsPathElements_RelatedPriorities")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsPathElements_RelatedPriorities());
			 //1EAttribute
		}
		else if (string.equals("IfcRelConnectsPathElements_RelatedConnectionType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsPathElements_RelatedConnectionType());
			 //1EAttribute
		}
		else if (string.equals("IfcRelConnectsPathElements_RelatingConnectionType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsPathElements_RelatingConnectionType());
			 //1EAttribute
		}
		else if (string.equals("IfcRelConnectsPortToElement_RelatedElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsPortToElement_RelatedElement());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsStructuralActivity_RelatingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralActivity_RelatingElement());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsStructuralElement_RelatingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralElement_RelatingElement());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsStructuralMember_AppliedCondition")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralMember_AppliedCondition());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsStructuralMember_SupportedLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralMember_SupportedLength());
			 //1EAttribute
		}
		else if (string.equals("IfcRelContainedInSpatialStructure_RelatedElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelContainedInSpatialStructure_RelatedElements());
			 //1EReference
		}
		else if (string.equals("IfcRelCoversBldgElements_RelatingBuildingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelCoversBldgElements_RelatingBuildingElement());
			 //1EReference
		}
		else if (string.equals("IfcRelFlowControlElements_RelatedControlElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelFlowControlElements_RelatedControlElements());
			 //1EReference
		}
		else if (string.equals("IfcRelFlowControlElements_RelatingFlowElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelFlowControlElements_RelatingFlowElement());
			 //1EReference
		}
		else if (string.equals("IfcRelInteractionRequirements_DailyInteraction")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelInteractionRequirements_DailyInteraction());
			 //1EAttribute
		}
		else if (string.equals("IfcRelInteractionRequirements_ImportanceRating")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelInteractionRequirements_ImportanceRating());
			 //1EAttribute
		}
		else if (string.equals("IfcRelInteractionRequirements_RelatedSpaceProgram")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelInteractionRequirements_RelatedSpaceProgram());
			 //1EReference
		}
		else if (string.equals("IfcRelOverridesProperties_OverridingProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelOverridesProperties_OverridingProperties());
			 //1EReference
		}
		else if (string.equals("IfcRelProjectsElement_RelatedFeatureElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelProjectsElement_RelatedFeatureElement());
			 //1EReference
		}
		else if (string.equals("IfcRelSpaceBoundary_RelatedBuildingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelSpaceBoundary_RelatedBuildingElement());
			 //1EReference
		}
		else if (string.equals("IfcRelSpaceBoundary_PhysicalOrVirtualBoundary")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelSpaceBoundary_PhysicalOrVirtualBoundary());
			 //1EAttribute
		}
		else if (string.equals("IfcRelSpaceBoundary_InternalOrExternalBoundary")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelSpaceBoundary_InternalOrExternalBoundary());
			 //1EAttribute
		}
		else if (string.equals("IfcRelVoidsElement_RelatingBuildingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelVoidsElement_RelatingBuildingElement());
			 //1EReference
		}
		else if (string.equals("IfcRepresentation_RepresentationIdentifier")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentation_RepresentationIdentifier());
			 //1EAttribute
		}
		else if (string.equals("IfcRepresentationContext_ContextIdentifier")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentationContext_ContextIdentifier());
			 //1EAttribute
		}
		else if (string.equals("IfcRepresentationContext_RepresentationsInContext")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentationContext_RepresentationsInContext());
			 //1EReference
		}
		else if (string.equals("IfcRibPlateProfileProperties_ThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRibPlateProfileProperties_ThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRibPlateProfileProperties_RibHeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRibPlateProfileProperties_RibHeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRibPlateProfileProperties_RibWidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRibPlateProfileProperties_RibWidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRibPlateProfileProperties_RibSpacingAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRibPlateProfileProperties_RibSpacingAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRoundedRectangleProfileDef_RoundingRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoundedRectangleProfileDef_RoundingRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_ScheduleDurationAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_ScheduleDurationAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_ActualDurationAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_ActualDurationAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcDraughtingCalloutRelationship_RelatingDraughtingCallout")) {
			resultList.add(((Ifc2x3Package) object).getIfcDraughtingCalloutRelationship_RelatingDraughtingCallout());
			 //1EReference
		}
		else if (string.equals("IfcFluidFlowProperties_WetBulbTemperatureSingleValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_WetBulbTemperatureSingleValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcGeometricRepresentationContext_CoordinateSpaceDimension")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationContext_CoordinateSpaceDimension());
			 //1EAttribute
		}
		else if (string.equals("IfcGeometricRepresentationSubContext_UserDefinedTargetView")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationSubContext_UserDefinedTargetView());
			 //1EAttribute
		}
		else if (string.equals("IfcHygroscopicMaterialProperties_UpperVaporResistanceFactor")) {
			resultList.add(((Ifc2x3Package) object).getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor());
			 //1EAttribute
		}
		else if (string.equals("IfcHygroscopicMaterialProperties_LowerVaporResistanceFactor")) {
			resultList.add(((Ifc2x3Package) object).getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor());
			 //1EAttribute
		}
		else if (string.equals("IfcHygroscopicMaterialProperties_IsothermalMoistureCapacity")) {
			resultList.add(((Ifc2x3Package) object).getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity());
			 //1EAttribute
		}
		else if (string.equals("IfcHygroscopicMaterialProperties_VaporPermeabilityAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcHygroscopicMaterialProperties_VaporPermeabilityAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcHygroscopicMaterialProperties_MoistureDiffusivityAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcHygroscopicMaterialProperties_MoistureDiffusivityAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMaterialClassificationRelationship_MaterialClassifications")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialClassificationRelationship_MaterialClassifications());
			 //1EReference
		}
		else if (string.equals("IfcMechanicalConcreteMaterialProperties_CompressiveStrength")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalConcreteMaterialProperties_CompressiveStrength());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalConcreteMaterialProperties_MaxAggregateSizeAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalConcreteMaterialProperties_MaxAggregateSizeAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalConcreteMaterialProperties_AdmixturesDescription")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalConcreteMaterialProperties_WaterImpermeability")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalConcreteMaterialProperties_WaterImpermeability());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalMaterialProperties_ThermalExpansionCoefficient")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalMaterialProperties_ThermalExpansionCoefficient());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties_UltimateStressAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties_UltimateStressAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties_UltimateStrainAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties_UltimateStrainAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties_HardeningModuleAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties_HardeningModuleAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties_ProportionalStressAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties_ProportionalStressAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties_PlasticStrainAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties_PlasticStrainAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_ThermalIrTransmittanceAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_ThermalIrTransmittanceAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_ThermalIrEmissivityBackAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_ThermalIrEmissivityBackAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_ThermalIrEmissivityFrontAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_ThermalIrEmissivityFrontAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_VisibleReflectanceBackAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_VisibleReflectanceBackAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_VisibleReflectanceFrontAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_VisibleReflectanceFrontAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcOpticalMaterialProperties_SolarReflectanceFrontAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties_SolarReflectanceFrontAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcProductsOfCombustionProperties_SpecificHeatCapacityAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductsOfCombustionProperties_SpecificHeatCapacityAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcementBarProperties_TotalCrossSectionAreaAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementBarProperties_TotalCrossSectionAreaAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_LongitudinalBarCrossSectionAreaAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_LongitudinalBarCrossSectionAreaAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRelAssociatesProfileProperties_RelatingProfileProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesProfileProperties_RelatingProfileProperties());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsStructuralActivity_RelatedStructuralActivity")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralActivity_RelatedStructuralActivity());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsStructuralMember_RelatedStructuralConnection")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralMember_RelatedStructuralConnection());
			 //1EReference
		}
		else if (string.equals("IfcSectionReinforcementProperties_LongitudinalStartPosition")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionReinforcementProperties_LongitudinalStartPosition());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionReinforcementProperties_LongitudinalEndPositionAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionReinforcementProperties_LongitudinalEndPositionAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionReinforcementProperties_TransversePositionAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionReinforcementProperties_TransversePositionAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceThermalLoadProperties_ApplicableValueRatioAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties_ApplicableValueRatioAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLinearActionVarying_VaryingAppliedLoadLocation")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLinearActionVarying_VaryingAppliedLoadLocation());
			 //1EReference
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacement_RotationalDisplacementRX")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRX());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacement_RotationalDisplacementRY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacementDistortion_DistortionAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacementDistortion_DistortionAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralPlanarActionVarying_VaryingAppliedLoadLocation")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralPlanarActionVarying_VaryingAppliedLoadLocation());
			 //1EReference
		}
		else if (string.equals("IfcStructuralProfileProperties_ShearDeformationAreaZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_ShearDeformationAreaZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_ShearDeformationAreaYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_ShearDeformationAreaYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MaximumSectionModulusYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MaximumSectionModulusYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MinimumSectionModulusYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MinimumSectionModulusYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MaximumSectionModulusZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MaximumSectionModulusZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MinimumSectionModulusZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MinimumSectionModulusZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_TorsionalSectionModulusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_TorsionalSectionModulusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSteelProfileProperties_PlasticShapeFactorYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSteelProfileProperties_PlasticShapeFactorYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSteelProfileProperties_PlasticShapeFactorZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSteelProfileProperties_PlasticShapeFactorZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSurfaceMemberVarying_SubsequentThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSurfaceMemberVarying_SubsequentThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSurfaceMemberVarying_VaryingThicknessLocation")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSurfaceMemberVarying_VaryingThicknessLocation());
			 //1EReference
		}
		else if (string.equals("IfcStructuralSurfaceMemberVarying_VaryingThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSurfaceMemberVarying_VaryingThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcEvaporativeCoolerType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcEvaporativeCoolerType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcExtendedMaterialProperties_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcExtendedMaterialProperties_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcExtendedMaterialProperties_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcExtendedMaterialProperties_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcExternalReference_ItemReference")) {
			resultList.add(((Ifc2x3Package) object).getIfcExternalReference_ItemReference());
			 //1EAttribute
		}
		else if (string.equals("IfcExtrudedAreaSolid_ExtrudedDirection")) {
			resultList.add(((Ifc2x3Package) object).getIfcExtrudedAreaSolid_ExtrudedDirection());
			 //1EReference
		}
		else if (string.equals("IfcExtrudedAreaSolid_DepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcExtrudedAreaSolid_DepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFaceBasedSurfaceModel_FbsmFaces")) {
			resultList.add(((Ifc2x3Package) object).getIfcFaceBasedSurfaceModel_FbsmFaces());
			 //1EReference
		}
		else if (string.equals("IfcFillAreaStyleHatching_PatternStart")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleHatching_PatternStart());
			 //1EReference
		}
		else if (string.equals("IfcFillAreaStyleHatching_HatchLineAngle")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleHatching_HatchLineAngle());
			 //1EAttribute
		}
		else if (string.equals("IfcFillAreaStyleTileSymbolWithStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleTileSymbolWithStyle());
			 //1EClass
		}
		else if (string.equals("IfcFillAreaStyleTiles_TilingPattern")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleTiles_TilingPattern());
			 //1EReference
		}
		else if (string.equals("IfcFillAreaStyleTiles_TilingScaleAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleTiles_TilingScaleAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFlowInstrumentType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowInstrumentType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcFluidFlowProperties_PropertySource")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_PropertySource());
			 //1EAttribute
		}
		else if (string.equals("IfcFluidFlowProperties_VelocityTimeSeries")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_VelocityTimeSeries());
			 //1EReference
		}
		else if (string.equals("IfcFluidFlowProperties_FlowrateTimeSeries")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_FlowrateTimeSeries());
			 //1EReference
		}
		else if (string.equals("IfcFluidFlowProperties_PressureTimeSeries")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_PressureTimeSeries());
			 //1EReference
		}
		else if (string.equals("IfcFuelProperties_CombustionTemperature")) {
			resultList.add(((Ifc2x3Package) object).getIfcFuelProperties_CombustionTemperature());
			 //1EAttribute
		}
		else if (string.equals("IfcFuelProperties_CarbonContentAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcFuelProperties_CarbonContentAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcFuelProperties_LowerHeatingValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcFuelProperties_LowerHeatingValue());
			 //1EAttribute
		}
		else if (string.equals("IfcFuelProperties_HigherHeatingValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcFuelProperties_HigherHeatingValue());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralMaterialProperties_Porosity")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralMaterialProperties_Porosity());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralMaterialProperties_MassDensity")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralMaterialProperties_MassDensity());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralProfileProperties_Perimeter")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralProfileProperties_Perimeter());
			 //1EAttribute
		}
		else if (string.equals("IfcGeometricRepresentationSubContext")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationSubContext());
			 //1EClass
		}
		else if (string.equals("IfcGridPlacement_PlacementLocation")) {
			resultList.add(((Ifc2x3Package) object).getIfcGridPlacement_PlacementLocation());
			 //1EReference
		}
		else if (string.equals("IfcGridPlacement_PlacementRefDirection")) {
			resultList.add(((Ifc2x3Package) object).getIfcGridPlacement_PlacementRefDirection());
			 //1EReference
		}
		else if (string.equals("IfcHeatExchangerType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcHeatExchangerType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcIShapeProfileDef_OverallWidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcIShapeProfileDef_OverallWidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcIShapeProfileDef_OverallDepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcIShapeProfileDef_OverallDepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcIShapeProfileDef_WebThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcIShapeProfileDef_WebThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcIShapeProfileDef_FlangeThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcIShapeProfileDef_FlangeThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcIShapeProfileDef_FilletRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcIShapeProfileDef_FilletRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcIrregularTimeSeriesValue_TimeStamp")) {
			resultList.add(((Ifc2x3Package) object).getIfcIrregularTimeSeriesValue_TimeStamp());
			 //1EReference
		}
		else if (string.equals("IfcIrregularTimeSeriesValue_ListValues")) {
			resultList.add(((Ifc2x3Package) object).getIfcIrregularTimeSeriesValue_ListValues());
			 //1EReference
		}
		else if (string.equals("IfcLShapeProfileDef_ThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_ThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_FilletRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_FilletRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_EdgeRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_EdgeRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_LegSlopeAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_LegSlopeAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_CentreOfGravityInX")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_CentreOfGravityInX());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_CentreOfGravityInY")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_CentreOfGravityInY());
			 //1EAttribute
		}
		else if (string.equals("IfcLibraryInformation_LibraryReference")) {
			resultList.add(((Ifc2x3Package) object).getIfcLibraryInformation_LibraryReference());
			 //1EReference
		}
		else if (string.equals("IfcLibraryReference_ReferenceIntoLibrary")) {
			resultList.add(((Ifc2x3Package) object).getIfcLibraryReference_ReferenceIntoLibrary());
			 //1EReference
		}
		else if (string.equals("IfcLightDistributionData_MainPlaneAngle")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightDistributionData_MainPlaneAngle());
			 //1EAttribute
		}
		else if (string.equals("IfcLightFixtureType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightFixtureType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSource_AmbientIntensityAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSource_AmbientIntensityAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourceDirectional_Orientation")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceDirectional_Orientation());
			 //1EReference
		}
		else if (string.equals("IfcLightSourceGoniometric_Position")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceGoniometric_Position());
			 //1EReference
		}
		else if (string.equals("IfcLightSourceGoniometric_LuminousFlux")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceGoniometric_LuminousFlux());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourcePositional_RadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourcePositional_RadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourceSpot_ConcentrationExponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceSpot_ConcentrationExponent());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourceSpot_SpreadAngleAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceSpot_SpreadAngleAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourceSpot_BeamWidthAngleAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceSpot_BeamWidthAngleAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLocalPlacement_RelativePlacement")) {
			resultList.add(((Ifc2x3Package) object).getIfcLocalPlacement_RelativePlacement());
			 //1EReference
		}
		else if (string.equals("IfcLocalTime_SecondComponentAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLocalTime_SecondComponentAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMaterialClassificationRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialClassificationRelationship());
			 //1EClass
		}
		else if (string.equals("IfcMaterialDefinitionRepresentation")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialDefinitionRepresentation());
			 //1EClass
		}
		else if (string.equals("IfcMaterialLayer_LayerThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayer_LayerThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcMaterialLayer_ToMaterialLayerSet")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayer_ToMaterialLayerSet());
			 //1EReference
		}
		else if (string.equals("IfcMaterialLayerSet_MaterialLayers")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayerSet_MaterialLayers());
			 //1EReference
		}
		else if (string.equals("IfcMaterialLayerSet_TotalThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayerSet_TotalThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcMaterialLayerSetUsage_ForLayerSet")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayerSetUsage_ForLayerSet());
			 //1EReference
		}
		else if (string.equals("IfcMaterialLayerSetUsage_DirectionSense")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayerSetUsage_DirectionSense());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalConcreteMaterialProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalConcreteMaterialProperties());
			 //1EClass
		}
		else if (string.equals("IfcMechanicalFastener_NominalDiameter")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalFastener_NominalDiameter());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalFastener_NominalLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalFastener_NominalLength());
			 //1EAttribute
		}
		else if (string.equals("IfcMechanicalSteelMaterialProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalSteelMaterialProperties());
			 //1EClass
		}
		else if (string.equals("IfcMotorConnectionType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcMotorConnectionType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcObjectDefinition_HasAssignments")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjectDefinition_HasAssignments());
			 //1EReference
		}
		else if (string.equals("IfcObjectDefinition_IsDecomposedBy")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjectDefinition_IsDecomposedBy());
			 //1EReference
		}
		else if (string.equals("IfcObjectDefinition_HasAssociations")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjectDefinition_HasAssociations());
			 //1EReference
		}
		else if (string.equals("IfcObjectPlacement_ReferencedByPlacements")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjectPlacement_ReferencedByPlacements());
			 //1EReference
		}
		else if (string.equals("IfcOneDirectionRepeatFactor_RepeatFactor")) {
			resultList.add(((Ifc2x3Package) object).getIfcOneDirectionRepeatFactor_RepeatFactor());
			 //1EReference
		}
		else if (string.equals("IfcOrganizationRelationship_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganizationRelationship_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcOwnerHistory_LastModifyingApplication")) {
			resultList.add(((Ifc2x3Package) object).getIfcOwnerHistory_LastModifyingApplication());
			 //1EReference
		}
		else if (string.equals("IfcParameterizedProfileDef_Position")) {
			resultList.add(((Ifc2x3Package) object).getIfcParameterizedProfileDef_Position());
			 //1EReference
		}
		else if (string.equals("IfcPerformanceHistory_LifeCyclePhase")) {
			resultList.add(((Ifc2x3Package) object).getIfcPerformanceHistory_LifeCyclePhase());
			 //1EAttribute
		}
		else if (string.equals("IfcPermeableCoveringProperties_FrameDepth")) {
			resultList.add(((Ifc2x3Package) object).getIfcPermeableCoveringProperties_FrameDepth());
			 //1EAttribute
		}
		else if (string.equals("IfcPersonAndOrganization_ThePerson")) {
			resultList.add(((Ifc2x3Package) object).getIfcPersonAndOrganization_ThePerson());
			 //1EReference
		}
		else if (string.equals("IfcPersonAndOrganization_TheOrganization")) {
			resultList.add(((Ifc2x3Package) object).getIfcPersonAndOrganization_TheOrganization());
			 //1EReference
		}
		else if (string.equals("IfcPhysicalComplexQuantity_HasQuantities")) {
			resultList.add(((Ifc2x3Package) object).getIfcPhysicalComplexQuantity_HasQuantities());
			 //1EReference
		}
		else if (string.equals("IfcPhysicalComplexQuantity_Discrimination")) {
			resultList.add(((Ifc2x3Package) object).getIfcPhysicalComplexQuantity_Discrimination());
			 //1EAttribute
		}
		else if (string.equals("IfcPhysicalComplexQuantity_Quality")) {
			resultList.add(((Ifc2x3Package) object).getIfcPhysicalComplexQuantity_Quality());
			 //1EAttribute
		}
		else if (string.equals("IfcPointOnCurve_PointParameterAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcPointOnCurve_PointParameterAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcPointOnSurface_PointParameterUAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcPointOnSurface_PointParameterUAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcPointOnSurface_PointParameterVAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcPointOnSurface_PointParameterVAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcPolygonalBoundedHalfSpace_Position")) {
			resultList.add(((Ifc2x3Package) object).getIfcPolygonalBoundedHalfSpace_Position());
			 //1EReference
		}
		else if (string.equals("IfcPresentationLayerAssignment_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationLayerAssignment_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcPresentationLayerAssignment_Identifier")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationLayerAssignment_Identifier());
			 //1EAttribute
		}
		else if (string.equals("IfcPresentationLayerWithStyle_LayerOn")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationLayerWithStyle_LayerOn());
			 //1EAttribute
		}
		else if (string.equals("IfcPresentationLayerWithStyle_LayerFrozen")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationLayerWithStyle_LayerFrozen());
			 //1EAttribute
		}
		else if (string.equals("IfcPresentationLayerWithStyle_LayerStyles")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationLayerWithStyle_LayerStyles());
			 //1EReference
		}
		else if (string.equals("IfcPresentationStyleAssignment_Styles")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationStyleAssignment_Styles());
			 //1EReference
		}
		else if (string.equals("IfcProcedure_UserDefinedProcedureType")) {
			resultList.add(((Ifc2x3Package) object).getIfcProcedure_UserDefinedProcedureType());
			 //1EAttribute
		}
		else if (string.equals("IfcProductDefinitionShape_ShapeOfProduct")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductDefinitionShape_ShapeOfProduct());
			 //1EReference
		}
		else if (string.equals("IfcProductDefinitionShape_HasShapeAspects")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductDefinitionShape_HasShapeAspects());
			 //1EReference
		}
		else if (string.equals("IfcProductRepresentation_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductRepresentation_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcProductRepresentation_Representations")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductRepresentation_Representations());
			 //1EReference
		}
		else if (string.equals("IfcProfileProperties_ProfileDefinition")) {
			resultList.add(((Ifc2x3Package) object).getIfcProfileProperties_ProfileDefinition());
			 //1EReference
		}
		else if (string.equals("IfcProjectOrderRecord_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcProjectOrderRecord_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcPropertyBoundedValue_UpperBoundValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyBoundedValue_UpperBoundValue());
			 //1EReference
		}
		else if (string.equals("IfcPropertyBoundedValue_LowerBoundValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyBoundedValue_LowerBoundValue());
			 //1EReference
		}
		else if (string.equals("IfcPropertyConstraintRelationship_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyConstraintRelationship_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcPropertyDefinition_HasAssociations")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyDefinition_HasAssociations());
			 //1EReference
		}
		else if (string.equals("IfcPropertyDependencyRelationship_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyDependencyRelationship_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcPropertyEnumeration_EnumerationValues")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyEnumeration_EnumerationValues());
			 //1EReference
		}
		else if (string.equals("IfcPropertyReferenceValue_UsageName")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyReferenceValue_UsageName());
			 //1EAttribute
		}
		else if (string.equals("IfcPropertySetDefinition_DefinesType")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertySetDefinition_DefinesType());
			 //1EReference
		}
		else if (string.equals("IfcPropertySingleValue_NominalValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertySingleValue_NominalValue());
			 //1EReference
		}
		else if (string.equals("IfcPropertyTableValue_DefiningValues")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyTableValue_DefiningValues());
			 //1EReference
		}
		else if (string.equals("IfcPropertyTableValue_DefinedValues")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyTableValue_DefinedValues());
			 //1EReference
		}
		else if (string.equals("IfcPropertyTableValue_DefiningUnit")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyTableValue_DefiningUnit());
			 //1EReference
		}
		else if (string.equals("IfcProtectiveDeviceType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcProtectiveDeviceType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcQuantityCount_CountValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityCount_CountValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcQuantityLength_LengthValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityLength_LengthValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcQuantityVolume_VolumeValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityVolume_VolumeValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcQuantityWeight_WeightValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityWeight_WeightValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRationalBezierCurve_WeightsData")) {
			resultList.add(((Ifc2x3Package) object).getIfcRationalBezierCurve_WeightsData());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangleProfileDef_XDimAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangleProfileDef_XDimAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangleProfileDef_YDimAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangleProfileDef_YDimAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularPyramid_XLengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularPyramid_XLengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularPyramid_YLengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularPyramid_YLengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularPyramid_HeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularPyramid_HeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularTrimmedSurface_BasisSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularTrimmedSurface_BasisSurface());
			 //1EReference
		}
		else if (string.equals("IfcRectangularTrimmedSurface_U1AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularTrimmedSurface_U1AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularTrimmedSurface_V1AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularTrimmedSurface_V1AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularTrimmedSurface_U2AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularTrimmedSurface_U2AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularTrimmedSurface_V2AsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularTrimmedSurface_V2AsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularTrimmedSurface_Usense")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularTrimmedSurface_Usense());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularTrimmedSurface_Vsense")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularTrimmedSurface_Vsense());
			 //1EAttribute
		}
		else if (string.equals("IfcReferencesValueDocument_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcReferencesValueDocument_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcRegularTimeSeries_TimeStepAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRegularTimeSeries_TimeStepAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcementBarProperties_SteelGrade")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementBarProperties_SteelGrade());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcementBarProperties_BarSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementBarProperties_BarSurface());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcementBarProperties_BarCount")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementBarProperties_BarCount());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcementDefinitionProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementDefinitionProperties());
			 //1EClass
		}
		else if (string.equals("IfcReinforcingBar_NominalDiameterAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingBar_NominalDiameterAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingBar_CrossSectionArea")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingBar_CrossSectionArea());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingBar_BarLengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingBar_BarLengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_MeshLengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_MeshLengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_MeshWidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_MeshWidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_LongitudinalBarSpacing")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_LongitudinalBarSpacing());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_TransverseBarSpacing")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_TransverseBarSpacing());
			 //1EAttribute
		}
		else if (string.equals("IfcRelAssignsToActor_RelatingActor")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToActor_RelatingActor());
			 //1EReference
		}
		else if (string.equals("IfcRelAssignsToControl_RelatingControl")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToControl_RelatingControl());
			 //1EReference
		}
		else if (string.equals("IfcRelAssignsToGroup_RelatingGroup")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToGroup_RelatingGroup());
			 //1EReference
		}
		else if (string.equals("IfcRelAssignsToProcess_RelatingProcess")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToProcess_RelatingProcess());
			 //1EReference
		}
		else if (string.equals("IfcRelAssignsToProcess_QuantityInProcess")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToProcess_QuantityInProcess());
			 //1EReference
		}
		else if (string.equals("IfcRelAssignsToProduct_RelatingProduct")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToProduct_RelatingProduct());
			 //1EReference
		}
		else if (string.equals("IfcRelAssignsToResource_RelatingResource")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToResource_RelatingResource());
			 //1EReference
		}
		else if (string.equals("IfcRelAssociatesApproval_RelatingApproval")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesApproval_RelatingApproval());
			 //1EReference
		}
		else if (string.equals("IfcRelAssociatesDocument_RelatingDocument")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesDocument_RelatingDocument());
			 //1EReference
		}
		else if (string.equals("IfcRelAssociatesLibrary_RelatingLibrary")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesLibrary_RelatingLibrary());
			 //1EReference
		}
		else if (string.equals("IfcRelAssociatesMaterial_RelatingMaterial")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesMaterial_RelatingMaterial());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsElements_ConnectionGeometry")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsElements_ConnectionGeometry());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsElements_RelatingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsElements_RelatingElement());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsElements_RelatedElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsElements_RelatedElement());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsPortToElement_RelatingPort")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsPortToElement_RelatingPort());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsPorts_RealizingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsPorts_RealizingElement());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsWithRealizingElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsWithRealizingElements());
			 //1EClass
		}
		else if (string.equals("IfcRelCoversBldgElements_RelatedCoverings")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelCoversBldgElements_RelatedCoverings());
			 //1EReference
		}
		else if (string.equals("IfcRelCoversSpaces_RelatedCoverings")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelCoversSpaces_RelatedCoverings());
			 //1EReference
		}
		else if (string.equals("IfcRelFillsElement_RelatingOpeningElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelFillsElement_RelatingOpeningElement());
			 //1EReference
		}
		else if (string.equals("IfcRelFillsElement_RelatedBuildingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelFillsElement_RelatedBuildingElement());
			 //1EReference
		}
		else if (string.equals("IfcRelProjectsElement_RelatingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelProjectsElement_RelatingElement());
			 //1EReference
		}
		else if (string.equals("IfcRelReferencedInSpatialStructure")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelReferencedInSpatialStructure());
			 //1EClass
		}
		else if (string.equals("IfcRelServicesBuildings_RelatingSystem")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelServicesBuildings_RelatingSystem());
			 //1EReference
		}
		else if (string.equals("IfcRelServicesBuildings_RelatedBuildings")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelServicesBuildings_RelatedBuildings());
			 //1EReference
		}
		else if (string.equals("IfcRelSpaceBoundary_ConnectionGeometry")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelSpaceBoundary_ConnectionGeometry());
			 //1EReference
		}
		else if (string.equals("IfcRelVoidsElement_RelatedOpeningElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelVoidsElement_RelatedOpeningElement());
			 //1EReference
		}
		else if (string.equals("IfcRelaxation_RelaxationValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelaxation_RelaxationValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRelaxation_InitialStressAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelaxation_InitialStressAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRepresentation_RepresentationType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentation_RepresentationType());
			 //1EAttribute
		}
		else if (string.equals("IfcRepresentation_RepresentationMap")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentation_RepresentationMap());
			 //1EReference
		}
		else if (string.equals("IfcRepresentation_LayerAssignments")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentation_LayerAssignments());
			 //1EReference
		}
		else if (string.equals("IfcRepresentation_OfProductRepresentation")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentation_OfProductRepresentation());
			 //1EReference
		}
		else if (string.equals("IfcRepresentationContext_ContextType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentationContext_ContextType());
			 //1EAttribute
		}
		else if (string.equals("IfcRepresentationItem_LayerAssignments")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentationItem_LayerAssignments());
			 //1EReference
		}
		else if (string.equals("IfcRepresentationItem_StyledByItem")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentationItem_StyledByItem());
			 //1EReference
		}
		else if (string.equals("IfcRepresentationMap_MappingOrigin")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentationMap_MappingOrigin());
			 //1EReference
		}
		else if (string.equals("IfcRepresentationMap_MappedRepresentation")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentationMap_MappedRepresentation());
			 //1EReference
		}
		else if (string.equals("IfcRevolvedAreaSolid_AngleAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRevolvedAreaSolid_AngleAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRibPlateProfileProperties_Thickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcRibPlateProfileProperties_Thickness());
			 //1EAttribute
		}
		else if (string.equals("IfcRibPlateProfileProperties_RibHeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcRibPlateProfileProperties_RibHeight());
			 //1EAttribute
		}
		else if (string.equals("IfcRibPlateProfileProperties_RibWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcRibPlateProfileProperties_RibWidth());
			 //1EAttribute
		}
		else if (string.equals("IfcRibPlateProfileProperties_RibSpacing")) {
			resultList.add(((Ifc2x3Package) object).getIfcRibPlateProfileProperties_RibSpacing());
			 //1EAttribute
		}
		else if (string.equals("IfcRibPlateProfileProperties_Direction")) {
			resultList.add(((Ifc2x3Package) object).getIfcRibPlateProfileProperties_Direction());
			 //1EAttribute
		}
		else if (string.equals("IfcRightCircularCone_HeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRightCircularCone_HeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRightCircularCone_BottomRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRightCircularCone_BottomRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRightCircularCylinder_HeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRightCircularCylinder_HeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRightCircularCylinder_RadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRightCircularCylinder_RadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRoundedEdgeFeature_RadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoundedEdgeFeature_RadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSanitaryTerminalType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSanitaryTerminalType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_ActualStart")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_ActualStart());
			 //1EReference
		}
		else if (string.equals("IfcScheduleTimeControl_ScheduleStart")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_ScheduleStart());
			 //1EReference
		}
		else if (string.equals("IfcScheduleTimeControl_ActualFinish")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_ActualFinish());
			 //1EReference
		}
		else if (string.equals("IfcScheduleTimeControl_EarlyFinish")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_EarlyFinish());
			 //1EReference
		}
		else if (string.equals("IfcScheduleTimeControl_ScheduleFinish")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_ScheduleFinish());
			 //1EReference
		}
		else if (string.equals("IfcScheduleTimeControl_ScheduleDuration")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_ScheduleDuration());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_ActualDuration")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_ActualDuration());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_RemainingTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_RemainingTime());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_FreeFloatAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_FreeFloatAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_TotalFloatAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_TotalFloatAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_StartFloatAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_StartFloatAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_FinishFloat")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_FinishFloat());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_CompletionAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_CompletionAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionedSpine_CrossSectionPositions")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionedSpine_CrossSectionPositions());
			 //1EReference
		}
		else if (string.equals("IfcServiceLife_ServiceLifeDuration")) {
			resultList.add(((Ifc2x3Package) object).getIfcServiceLife_ServiceLifeDuration());
			 //1EAttribute
		}
		else if (string.equals("IfcServiceLifeFactor_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcServiceLifeFactor_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcServiceLifeFactor_MostUsedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcServiceLifeFactor_MostUsedValue());
			 //1EReference
		}
		else if (string.equals("IfcShapeAspect_ShapeRepresentations")) {
			resultList.add(((Ifc2x3Package) object).getIfcShapeAspect_ShapeRepresentations());
			 //1EReference
		}
		else if (string.equals("IfcShapeAspect_ProductDefinitional")) {
			resultList.add(((Ifc2x3Package) object).getIfcShapeAspect_ProductDefinitional());
			 //1EAttribute
		}
		else if (string.equals("IfcShellBasedSurfaceModel_SbsmBoundary")) {
			resultList.add(((Ifc2x3Package) object).getIfcShellBasedSurfaceModel_SbsmBoundary());
			 //1EReference
		}
		else if (string.equals("IfcSlippageConnectionCondition_SlippageX")) {
			resultList.add(((Ifc2x3Package) object).getIfcSlippageConnectionCondition_SlippageX());
			 //1EAttribute
		}
		else if (string.equals("IfcSlippageConnectionCondition_SlippageY")) {
			resultList.add(((Ifc2x3Package) object).getIfcSlippageConnectionCondition_SlippageY());
			 //1EAttribute
		}
		else if (string.equals("IfcSlippageConnectionCondition_SlippageZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcSlippageConnectionCondition_SlippageZ());
			 //1EAttribute
		}
		else if (string.equals("IfcSoundValue_SoundLevelTimeSeries")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundValue_SoundLevelTimeSeries());
			 //1EReference
		}
		else if (string.equals("IfcSoundValue_SoundLevelSingleValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundValue_SoundLevelSingleValue());
			 //1EReference
		}
		else if (string.equals("IfcSpace_ElevationWithFlooringAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpace_ElevationWithFlooringAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceProgram_SpaceProgramIdentifier")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceProgram_SpaceProgramIdentifier());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceProgram_MaxRequiredAreaAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceProgram_MaxRequiredAreaAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceProgram_MinRequiredAreaAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceProgram_MinRequiredAreaAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceProgram_StandardRequiredArea")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceProgram_StandardRequiredArea());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceProgram_HasInteractionReqsFrom")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceProgram_HasInteractionReqsFrom());
			 //1EReference
		}
		else if (string.equals("IfcSpaceProgram_HasInteractionReqsTo")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceProgram_HasInteractionReqsTo());
			 //1EReference
		}
		else if (string.equals("IfcSpatialStructureElement_LongName")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpatialStructureElement_LongName());
			 //1EAttribute
		}
		else if (string.equals("IfcStackTerminalType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcStackTerminalType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcStairFlight_RiserHeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStairFlight_RiserHeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStairFlight_TreadLengthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStairFlight_TreadLengthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralAction_DestabilizingLoad")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralAction_DestabilizingLoad());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralActivity_GlobalOrLocal")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralActivity_GlobalOrLocal());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralAnalysisModel_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralAnalysisModel_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralAnalysisModel_LoadedBy")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralAnalysisModel_LoadedBy());
			 //1EReference
		}
		else if (string.equals("IfcStructuralAnalysisModel_HasResults")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralAnalysisModel_HasResults());
			 //1EReference
		}
		else if (string.equals("IfcStructuralConnection_AppliedCondition")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralConnection_AppliedCondition());
			 //1EReference
		}
		else if (string.equals("IfcStructuralConnectionCondition_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralConnectionCondition_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralCurveMember_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralCurveMember_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLinearAction_ProjectedOrTrue")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLinearAction_ProjectedOrTrue());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadGroup_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadGroup_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadGroup_ActionSource")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadGroup_ActionSource());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadGroup_Coefficient")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadGroup_Coefficient());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadGroup_LoadGroupFor")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadGroup_LoadGroupFor());
			 //1EReference
		}
		else if (string.equals("IfcStructuralLoadLinearForce_LinearForceX")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadLinearForce_LinearForceX());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadLinearForce_LinearForceY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadLinearForce_LinearForceY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadLinearForce_LinearForceZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadLinearForce_LinearForceZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadPlanarForce_PlanarForceX")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadPlanarForce_PlanarForceX());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadPlanarForce_PlanarForceY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadPlanarForce_PlanarForceY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadPlanarForce_PlanarForceZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadPlanarForce_PlanarForceZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacement")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacement());
			 //1EClass
		}
		else if (string.equals("IfcStructuralLoadSingleForce_ForceX")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForce_ForceX());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleForce_ForceY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForce_ForceY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleForce_ForceZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForce_ForceZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleForce_MomentX")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForce_MomentX());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleForce_MomentY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForce_MomentY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleForce_MomentZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForce_MomentZ());
			 //1EAttribute
		}
		else if (string.equals("IfcFeatureElementAddition")) {
			resultList.add(((Ifc2x3Package) object).getIfcFeatureElementAddition());
			 //1EClass
		}
		else if (string.equals("IfcFillAreaStyleHatching")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleHatching());
			 //1EClass
		}
		else if (string.equals("IfcFillAreaStyleTiles")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleTiles());
			 //1EClass
		}
		else if (string.equals("IfcFlowControllerType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowControllerType());
			 //1EClass
		}
		else if (string.equals("IfcFlowFittingType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowFittingType());
			 //1EClass
		}
		else if (string.equals("IfcFlowInstrumentType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowInstrumentType());
			 //1EClass
		}
		else if (string.equals("IfcFlowMovingDevice")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowMovingDevice());
			 //1EClass
		}
		else if (string.equals("IfcFlowMovingDeviceType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowMovingDeviceType());
			 //1EClass
		}
		else if (string.equals("IfcFlowSegmentType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowSegmentType());
			 //1EClass
		}
		else if (string.equals("IfcFlowStorageDevice")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowStorageDevice());
			 //1EClass
		}
		else if (string.equals("IfcFlowStorageDeviceType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowStorageDeviceType());
			 //1EClass
		}
		else if (string.equals("IfcFlowTerminalType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowTerminalType());
			 //1EClass
		}
		else if (string.equals("IfcFlowTreatmentDevice")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowTreatmentDevice());
			 //1EClass
		}
		else if (string.equals("IfcFluidFlowProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties());
			 //1EClass
		}
		else if (string.equals("IfcFooting_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFooting_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcFurnishingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcFurnishingElement());
			 //1EClass
		}
		else if (string.equals("IfcFurnishingElementType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFurnishingElementType());
			 //1EClass
		}
		else if (string.equals("IfcFurnitureStandard")) {
			resultList.add(((Ifc2x3Package) object).getIfcFurnitureStandard());
			 //1EClass
		}
		else if (string.equals("IfcGasTerminalType")) {
			resultList.add(((Ifc2x3Package) object).getIfcGasTerminalType());
			 //1EClass
		}
		else if (string.equals("IfcGeometricCurveSet")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricCurveSet());
			 //1EClass
		}
		else if (string.equals("IfcGeometricSet_Elements")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricSet_Elements());
			 //1EReference
		}
		else if (string.equals("IfcGeometricSet_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricSet_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcGridAxis_AxisTag")) {
			resultList.add(((Ifc2x3Package) object).getIfcGridAxis_AxisTag());
			 //1EAttribute
		}
		else if (string.equals("IfcGridAxis_AxisCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcGridAxis_AxisCurve());
			 //1EReference
		}
		else if (string.equals("IfcGridAxis_SameSense")) {
			resultList.add(((Ifc2x3Package) object).getIfcGridAxis_SameSense());
			 //1EAttribute
		}
		else if (string.equals("IfcGridAxis_PartOfW")) {
			resultList.add(((Ifc2x3Package) object).getIfcGridAxis_PartOfW());
			 //1EReference
		}
		else if (string.equals("IfcGridAxis_PartOfV")) {
			resultList.add(((Ifc2x3Package) object).getIfcGridAxis_PartOfV());
			 //1EReference
		}
		else if (string.equals("IfcGridAxis_PartOfU")) {
			resultList.add(((Ifc2x3Package) object).getIfcGridAxis_PartOfU());
			 //1EReference
		}
		else if (string.equals("IfcGroup_IsGroupedBy")) {
			resultList.add(((Ifc2x3Package) object).getIfcGroup_IsGroupedBy());
			 //1EReference
		}
		else if (string.equals("IfcHalfSpaceSolid_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcHalfSpaceSolid_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcHeatExchangerType")) {
			resultList.add(((Ifc2x3Package) object).getIfcHeatExchangerType());
			 //1EClass
		}
		else if (string.equals("IfcIShapeProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcIShapeProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcInventory_Jurisdiction")) {
			resultList.add(((Ifc2x3Package) object).getIfcInventory_Jurisdiction());
			 //1EReference
		}
		else if (string.equals("IfcInventory_CurrentValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcInventory_CurrentValue());
			 //1EReference
		}
		else if (string.equals("IfcIrregularTimeSeries")) {
			resultList.add(((Ifc2x3Package) object).getIfcIrregularTimeSeries());
			 //1EClass
		}
		else if (string.equals("IfcJunctionBoxType")) {
			resultList.add(((Ifc2x3Package) object).getIfcJunctionBoxType());
			 //1EClass
		}
		else if (string.equals("IfcLShapeProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcLShapeProfileDef_Depth")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_Depth());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_Width")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_Width());
			 //1EAttribute
		}
		else if (string.equals("IfcLaborResource_SkillSet")) {
			resultList.add(((Ifc2x3Package) object).getIfcLaborResource_SkillSet());
			 //1EAttribute
		}
		else if (string.equals("IfcLibraryInformation")) {
			resultList.add(((Ifc2x3Package) object).getIfcLibraryInformation());
			 //1EClass
		}
		else if (string.equals("IfcLibraryReference")) {
			resultList.add(((Ifc2x3Package) object).getIfcLibraryReference());
			 //1EClass
		}
		else if (string.equals("IfcLightDistributionData")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightDistributionData());
			 //1EClass
		}
		else if (string.equals("IfcLightFixtureType")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightFixtureType());
			 //1EClass
		}
		else if (string.equals("IfcLightSource_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSource_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSource_Intensity")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSource_Intensity());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourceAmbient")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceAmbient());
			 //1EClass
		}
		else if (string.equals("IfcLightSourceDirectional")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceDirectional());
			 //1EClass
		}
		else if (string.equals("IfcLightSourceGoniometric")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceGoniometric());
			 //1EClass
		}
		else if (string.equals("IfcLightSourcePositional")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourcePositional());
			 //1EClass
		}
		else if (string.equals("IfcLightSourceSpot")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceSpot());
			 //1EClass
		}
		else if (string.equals("IfcLinearDimension")) {
			resultList.add(((Ifc2x3Package) object).getIfcLinearDimension());
			 //1EClass
		}
		else if (string.equals("IfcManifoldSolidBrep")) {
			resultList.add(((Ifc2x3Package) object).getIfcManifoldSolidBrep());
			 //1EClass
		}
		else if (string.equals("IfcMaterial_ClassifiedAs")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterial_ClassifiedAs());
			 //1EReference
		}
		else if (string.equals("IfcMaterialLayer_Material")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayer_Material());
			 //1EReference
		}
		else if (string.equals("IfcMaterialLayerSet")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayerSet());
			 //1EClass
		}
		else if (string.equals("IfcMaterialLayerSetUsage")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayerSetUsage());
			 //1EClass
		}
		else if (string.equals("IfcMaterialList_Materials")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialList_Materials());
			 //1EReference
		}
		else if (string.equals("IfcMaterialProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialProperties());
			 //1EClass
		}
		else if (string.equals("IfcMeasureWithUnit")) {
			resultList.add(((Ifc2x3Package) object).getIfcMeasureWithUnit());
			 //1EClass
		}
		else if (string.equals("IfcMechanicalFastener")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalFastener());
			 //1EClass
		}
		else if (string.equals("IfcMechanicalFastenerType")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalFastenerType());
			 //1EClass
		}
		else if (string.equals("IfcMetric_Benchmark")) {
			resultList.add(((Ifc2x3Package) object).getIfcMetric_Benchmark());
			 //1EAttribute
		}
		else if (string.equals("IfcMetric_ValueSource")) {
			resultList.add(((Ifc2x3Package) object).getIfcMetric_ValueSource());
			 //1EAttribute
		}
		else if (string.equals("IfcMetric_DataValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcMetric_DataValue());
			 //1EReference
		}
		else if (string.equals("IfcMonetaryUnit_Currency")) {
			resultList.add(((Ifc2x3Package) object).getIfcMonetaryUnit_Currency());
			 //1EAttribute
		}
		else if (string.equals("IfcMotorConnectionType")) {
			resultList.add(((Ifc2x3Package) object).getIfcMotorConnectionType());
			 //1EClass
		}
		else if (string.equals("IfcNamedUnit_Dimensions")) {
			resultList.add(((Ifc2x3Package) object).getIfcNamedUnit_Dimensions());
			 //1EReference
		}
		else if (string.equals("IfcNamedUnit_UnitType")) {
			resultList.add(((Ifc2x3Package) object).getIfcNamedUnit_UnitType());
			 //1EAttribute
		}
		else if (string.equals("IfcObject_ObjectType")) {
			resultList.add(((Ifc2x3Package) object).getIfcObject_ObjectType());
			 //1EAttribute
		}
		else if (string.equals("IfcObject_IsDefinedBy")) {
			resultList.add(((Ifc2x3Package) object).getIfcObject_IsDefinedBy());
			 //1EReference
		}
		else if (string.equals("IfcObjectDefinition")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjectDefinition());
			 //1EClass
		}
		else if (string.equals("IfcObjectPlacement")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjectPlacement());
			 //1EClass
		}
		else if (string.equals("IfcObjective_ResultValues")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjective_ResultValues());
			 //1EReference
		}
		else if (string.equals("IfcOffsetCurve2D_Distance")) {
			resultList.add(((Ifc2x3Package) object).getIfcOffsetCurve2D_Distance());
			 //1EAttribute
		}
		else if (string.equals("IfcOffsetCurve3D_Distance")) {
			resultList.add(((Ifc2x3Package) object).getIfcOffsetCurve3D_Distance());
			 //1EAttribute
		}
		else if (string.equals("IfcOrderAction_ActionID")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrderAction_ActionID());
			 //1EAttribute
		}
		else if (string.equals("IfcOrganization_Id")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganization_Id());
			 //1EAttribute
		}
		else if (string.equals("IfcOrganization_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganization_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcOrganization_Roles")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganization_Roles());
			 //1EReference
		}
		else if (string.equals("IfcOrganization_Addresses")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganization_Addresses());
			 //1EReference
		}
		else if (string.equals("IfcOrganization_Relates")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganization_Relates());
			 //1EReference
		}
		else if (string.equals("IfcOrganization_Engages")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganization_Engages());
			 //1EReference
		}
		else if (string.equals("IfcOwnerHistory_State")) {
			resultList.add(((Ifc2x3Package) object).getIfcOwnerHistory_State());
			 //1EAttribute
		}
		else if (string.equals("IfcPerformanceHistory")) {
			resultList.add(((Ifc2x3Package) object).getIfcPerformanceHistory());
			 //1EClass
		}
		else if (string.equals("IfcPermit_PermitID")) {
			resultList.add(((Ifc2x3Package) object).getIfcPermit_PermitID());
			 //1EAttribute
		}
		else if (string.equals("IfcPerson_FamilyName")) {
			resultList.add(((Ifc2x3Package) object).getIfcPerson_FamilyName());
			 //1EAttribute
		}
		else if (string.equals("IfcPerson_GivenName")) {
			resultList.add(((Ifc2x3Package) object).getIfcPerson_GivenName());
			 //1EAttribute
		}
		else if (string.equals("IfcPerson_MiddleNames")) {
			resultList.add(((Ifc2x3Package) object).getIfcPerson_MiddleNames());
			 //1EAttribute
		}
		else if (string.equals("IfcPerson_PrefixTitles")) {
			resultList.add(((Ifc2x3Package) object).getIfcPerson_PrefixTitles());
			 //1EAttribute
		}
		else if (string.equals("IfcPerson_SuffixTitles")) {
			resultList.add(((Ifc2x3Package) object).getIfcPerson_SuffixTitles());
			 //1EAttribute
		}
		else if (string.equals("IfcPerson_Addresses")) {
			resultList.add(((Ifc2x3Package) object).getIfcPerson_Addresses());
			 //1EReference
		}
		else if (string.equals("IfcPerson_EngagedIn")) {
			resultList.add(((Ifc2x3Package) object).getIfcPerson_EngagedIn());
			 //1EReference
		}
		else if (string.equals("IfcPersonAndOrganization")) {
			resultList.add(((Ifc2x3Package) object).getIfcPersonAndOrganization());
			 //1EClass
		}
		else if (string.equals("IfcPhysicalQuantity")) {
			resultList.add(((Ifc2x3Package) object).getIfcPhysicalQuantity());
			 //1EClass
		}
		else if (string.equals("IfcPhysicalQuantity_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcPhysicalQuantity_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcPhysicalSimpleQuantity")) {
			resultList.add(((Ifc2x3Package) object).getIfcPhysicalSimpleQuantity());
			 //1EClass
		}
		else if (string.equals("IfcPile_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcPile_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcPile_ConstructionType")) {
			resultList.add(((Ifc2x3Package) object).getIfcPile_ConstructionType());
			 //1EAttribute
		}
		else if (string.equals("IfcPipeFittingType")) {
			resultList.add(((Ifc2x3Package) object).getIfcPipeFittingType());
			 //1EClass
		}
		else if (string.equals("IfcPipeSegmentType")) {
			resultList.add(((Ifc2x3Package) object).getIfcPipeSegmentType());
			 //1EClass
		}
		else if (string.equals("IfcPixelTexture_Width")) {
			resultList.add(((Ifc2x3Package) object).getIfcPixelTexture_Width());
			 //1EAttribute
		}
		else if (string.equals("IfcPixelTexture_Height")) {
			resultList.add(((Ifc2x3Package) object).getIfcPixelTexture_Height());
			 //1EAttribute
		}
		else if (string.equals("IfcPlacement_Location")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlacement_Location());
			 //1EReference
		}
		else if (string.equals("IfcPlanarBox_Placement")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlanarBox_Placement());
			 //1EReference
		}
		else if (string.equals("IfcPlanarExtent_SizeInX")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlanarExtent_SizeInX());
			 //1EAttribute
		}
		else if (string.equals("IfcPlanarExtent_SizeInY")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlanarExtent_SizeInY());
			 //1EAttribute
		}
		else if (string.equals("IfcPointOnCurve_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcPointOnCurve_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcPointOnSurface_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcPointOnSurface_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcPolyLoop_Polygon")) {
			resultList.add(((Ifc2x3Package) object).getIfcPolyLoop_Polygon());
			 //1EReference
		}
		else if (string.equals("IfcPolyline_Points")) {
			resultList.add(((Ifc2x3Package) object).getIfcPolyline_Points());
			 //1EReference
		}
		else if (string.equals("IfcPort_ContainedIn")) {
			resultList.add(((Ifc2x3Package) object).getIfcPort_ContainedIn());
			 //1EReference
		}
		else if (string.equals("IfcPort_ConnectedFrom")) {
			resultList.add(((Ifc2x3Package) object).getIfcPort_ConnectedFrom());
			 //1EReference
		}
		else if (string.equals("IfcPort_ConnectedTo")) {
			resultList.add(((Ifc2x3Package) object).getIfcPort_ConnectedTo());
			 //1EReference
		}
		else if (string.equals("IfcPostalAddress_Town")) {
			resultList.add(((Ifc2x3Package) object).getIfcPostalAddress_Town());
			 //1EAttribute
		}
		else if (string.equals("IfcPostalAddress_Region")) {
			resultList.add(((Ifc2x3Package) object).getIfcPostalAddress_Region());
			 //1EAttribute
		}
		else if (string.equals("IfcPostalAddress_Country")) {
			resultList.add(((Ifc2x3Package) object).getIfcPostalAddress_Country());
			 //1EAttribute
		}
		else if (string.equals("IfcPreDefinedColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcPreDefinedColour());
			 //1EClass
		}
		else if (string.equals("IfcPreDefinedCurveFont")) {
			resultList.add(((Ifc2x3Package) object).getIfcPreDefinedCurveFont());
			 //1EClass
		}
		else if (string.equals("IfcPreDefinedItem_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcPreDefinedItem_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcPreDefinedSymbol")) {
			resultList.add(((Ifc2x3Package) object).getIfcPreDefinedSymbol());
			 //1EClass
		}
		else if (string.equals("IfcPreDefinedTextFont")) {
			resultList.add(((Ifc2x3Package) object).getIfcPreDefinedTextFont());
			 //1EClass
		}
		else if (string.equals("IfcPresentationStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationStyle());
			 //1EClass
		}
		else if (string.equals("IfcPresentationStyle_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationStyle_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcProcedure_ProcedureID")) {
			resultList.add(((Ifc2x3Package) object).getIfcProcedure_ProcedureID());
			 //1EAttribute
		}
		else if (string.equals("IfcProcess_OperatesOn")) {
			resultList.add(((Ifc2x3Package) object).getIfcProcess_OperatesOn());
			 //1EReference
		}
		else if (string.equals("IfcProduct_Representation")) {
			resultList.add(((Ifc2x3Package) object).getIfcProduct_Representation());
			 //1EReference
		}
		else if (string.equals("IfcProduct_ReferencedBy")) {
			resultList.add(((Ifc2x3Package) object).getIfcProduct_ReferencedBy());
			 //1EReference
		}
		else if (string.equals("IfcProductDefinitionShape")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductDefinitionShape());
			 //1EClass
		}
		else if (string.equals("IfcProductRepresentation")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductRepresentation());
			 //1EClass
		}
		else if (string.equals("IfcProfileDef_ProfileType")) {
			resultList.add(((Ifc2x3Package) object).getIfcProfileDef_ProfileType());
			 //1EAttribute
		}
		else if (string.equals("IfcProfileDef_ProfileName")) {
			resultList.add(((Ifc2x3Package) object).getIfcProfileDef_ProfileName());
			 //1EAttribute
		}
		else if (string.equals("IfcProfileProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcProfileProperties());
			 //1EClass
		}
		else if (string.equals("IfcProject_LongName")) {
			resultList.add(((Ifc2x3Package) object).getIfcProject_LongName());
			 //1EAttribute
		}
		else if (string.equals("IfcProject_UnitsInContext")) {
			resultList.add(((Ifc2x3Package) object).getIfcProject_UnitsInContext());
			 //1EReference
		}
		else if (string.equals("IfcProjectOrder_ID")) {
			resultList.add(((Ifc2x3Package) object).getIfcProjectOrder_ID());
			 //1EAttribute
		}
		else if (string.equals("IfcProjectOrder_Status")) {
			resultList.add(((Ifc2x3Package) object).getIfcProjectOrder_Status());
			 //1EAttribute
		}
		else if (string.equals("IfcProjectOrderRecord")) {
			resultList.add(((Ifc2x3Package) object).getIfcProjectOrderRecord());
			 //1EClass
		}
		else if (string.equals("IfcProjectionCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcProjectionCurve());
			 //1EClass
		}
		else if (string.equals("IfcProjectionElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcProjectionElement());
			 //1EClass
		}
		else if (string.equals("IfcProperty_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcProperty_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcProperty_PartOfComplex")) {
			resultList.add(((Ifc2x3Package) object).getIfcProperty_PartOfComplex());
			 //1EReference
		}
		else if (string.equals("IfcPropertyBoundedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyBoundedValue());
			 //1EClass
		}
		else if (string.equals("IfcPropertyDefinition")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyDefinition());
			 //1EClass
		}
		else if (string.equals("IfcPropertyEnumeration")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyEnumeration());
			 //1EClass
		}
		else if (string.equals("IfcPropertyListValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyListValue());
			 //1EClass
		}
		else if (string.equals("IfcPropertyListValue_Unit")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyListValue_Unit());
			 //1EReference
		}
		else if (string.equals("IfcPropertyReferenceValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyReferenceValue());
			 //1EClass
		}
		else if (string.equals("IfcPropertySetDefinition")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertySetDefinition());
			 //1EClass
		}
		else if (string.equals("IfcPropertySingleValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertySingleValue());
			 //1EClass
		}
		else if (string.equals("IfcPropertyTableValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyTableValue());
			 //1EClass
		}
		else if (string.equals("IfcProtectiveDeviceType")) {
			resultList.add(((Ifc2x3Package) object).getIfcProtectiveDeviceType());
			 //1EClass
		}
		else if (string.equals("IfcProxy_ProxyType")) {
			resultList.add(((Ifc2x3Package) object).getIfcProxy_ProxyType());
			 //1EAttribute
		}
		else if (string.equals("IfcQuantityArea_AreaValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityArea_AreaValue());
			 //1EAttribute
		}
		else if (string.equals("IfcQuantityTime_TimeValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityTime_TimeValue());
			 //1EAttribute
		}
		else if (string.equals("IfcRadiusDimension")) {
			resultList.add(((Ifc2x3Package) object).getIfcRadiusDimension());
			 //1EClass
		}
		else if (string.equals("IfcRailing_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRailing_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcRationalBezierCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcRationalBezierCurve());
			 //1EClass
		}
		else if (string.equals("IfcRectangleProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangleProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcRectangularPyramid")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularPyramid());
			 //1EClass
		}
		else if (string.equals("IfcRegularTimeSeries")) {
			resultList.add(((Ifc2x3Package) object).getIfcRegularTimeSeries());
			 //1EClass
		}
		else if (string.equals("IfcReinforcingBar_BarRole")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingBar_BarRole());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingElement());
			 //1EClass
		}
		else if (string.equals("IfcReinforcingMesh")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh());
			 //1EClass
		}
		else if (string.equals("IfcRelAssignsTasks")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsTasks());
			 //1EClass
		}
		else if (string.equals("IfcRelAssignsToActor")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToActor());
			 //1EClass
		}
		else if (string.equals("IfcRelAssignsToControl")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToControl());
			 //1EClass
		}
		else if (string.equals("IfcRelAssignsToGroup")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToGroup());
			 //1EClass
		}
		else if (string.equals("IfcRelAssignsToProcess")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToProcess());
			 //1EClass
		}
		else if (string.equals("IfcRelAssignsToProduct")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToProduct());
			 //1EClass
		}
		else if (string.equals("IfcRelAssignsToResource")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToResource());
			 //1EClass
		}
		else if (string.equals("IfcRelAssociatesApproval")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesApproval());
			 //1EClass
		}
		else if (string.equals("IfcRelAssociatesDocument")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesDocument());
			 //1EClass
		}
		else if (string.equals("IfcRelAssociatesLibrary")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesLibrary());
			 //1EClass
		}
		else if (string.equals("IfcRelAssociatesMaterial")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesMaterial());
			 //1EClass
		}
		else if (string.equals("IfcRelConnectsElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsElements());
			 //1EClass
		}
		else if (string.equals("IfcRelConnectsPorts")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsPorts());
			 //1EClass
		}
		else if (string.equals("IfcRelCoversBldgElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelCoversBldgElements());
			 //1EClass
		}
		else if (string.equals("IfcRelCoversSpaces")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelCoversSpaces());
			 //1EClass
		}
		else if (string.equals("IfcRelDefinesByProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelDefinesByProperties());
			 //1EClass
		}
		else if (string.equals("IfcRelDefinesByType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelDefinesByType());
			 //1EClass
		}
		else if (string.equals("IfcRelFillsElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelFillsElement());
			 //1EClass
		}
		else if (string.equals("IfcRelFlowControlElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelFlowControlElements());
			 //1EClass
		}
		else if (string.equals("IfcRelOccupiesSpaces")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelOccupiesSpaces());
			 //1EClass
		}
		else if (string.equals("IfcRelOverridesProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelOverridesProperties());
			 //1EClass
		}
		else if (string.equals("IfcRelProjectsElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelProjectsElement());
			 //1EClass
		}
		else if (string.equals("IfcRelSchedulesCostItems")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelSchedulesCostItems());
			 //1EClass
		}
		else if (string.equals("IfcRelSequence_TimeLag")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelSequence_TimeLag());
			 //1EAttribute
		}
		else if (string.equals("IfcRelServicesBuildings")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelServicesBuildings());
			 //1EClass
		}
		else if (string.equals("IfcRelSpaceBoundary")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelSpaceBoundary());
			 //1EClass
		}
		else if (string.equals("IfcRelVoidsElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelVoidsElement());
			 //1EClass
		}
		else if (string.equals("IfcRepresentation_Items")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentation_Items());
			 //1EReference
		}
		else if (string.equals("IfcRepresentationContext")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentationContext());
			 //1EClass
		}
		else if (string.equals("IfcRepresentationItem")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentationItem());
			 //1EClass
		}
		else if (string.equals("IfcRepresentationMap")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentationMap());
			 //1EClass
		}
		else if (string.equals("IfcResource_ResourceOf")) {
			resultList.add(((Ifc2x3Package) object).getIfcResource_ResourceOf());
			 //1EReference
		}
		else if (string.equals("IfcRevolvedAreaSolid")) {
			resultList.add(((Ifc2x3Package) object).getIfcRevolvedAreaSolid());
			 //1EClass
		}
		else if (string.equals("IfcRevolvedAreaSolid_Axis")) {
			resultList.add(((Ifc2x3Package) object).getIfcRevolvedAreaSolid_Axis());
			 //1EReference
		}
		else if (string.equals("IfcRightCircularCone")) {
			resultList.add(((Ifc2x3Package) object).getIfcRightCircularCone());
			 //1EClass
		}
		else if (string.equals("IfcRightCircularCylinder")) {
			resultList.add(((Ifc2x3Package) object).getIfcRightCircularCylinder());
			 //1EClass
		}
		else if (string.equals("IfcRoot_OwnerHistory")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoot_OwnerHistory());
			 //1EReference
		}
		else if (string.equals("IfcRoot_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoot_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcRoundedEdgeFeature")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoundedEdgeFeature());
			 //1EClass
		}
		else if (string.equals("IfcSanitaryTerminalType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSanitaryTerminalType());
			 //1EClass
		}
		else if (string.equals("IfcScheduleTimeControl")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl());
			 //1EClass
		}
		else if (string.equals("IfcSectionProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionProperties());
			 //1EClass
		}
		else if (string.equals("IfcSectionedSpine_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionedSpine_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcServiceLifeFactor")) {
			resultList.add(((Ifc2x3Package) object).getIfcServiceLifeFactor());
			 //1EClass
		}
		else if (string.equals("IfcShapeAspect_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcShapeAspect_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcShapeRepresentation")) {
			resultList.add(((Ifc2x3Package) object).getIfcShapeRepresentation());
			 //1EClass
		}
		else if (string.equals("IfcShellBasedSurfaceModel")) {
			resultList.add(((Ifc2x3Package) object).getIfcShellBasedSurfaceModel());
			 //1EClass
		}
		else if (string.equals("IfcSite_RefLatitude")) {
			resultList.add(((Ifc2x3Package) object).getIfcSite_RefLatitude());
			 //1EAttribute
		}
		else if (string.equals("IfcSite_RefLongitude")) {
			resultList.add(((Ifc2x3Package) object).getIfcSite_RefLongitude());
			 //1EAttribute
		}
		else if (string.equals("IfcSite_RefElevation")) {
			resultList.add(((Ifc2x3Package) object).getIfcSite_RefElevation());
			 //1EAttribute
		}
		else if (string.equals("IfcSite_LandTitleNumber")) {
			resultList.add(((Ifc2x3Package) object).getIfcSite_LandTitleNumber());
			 //1EAttribute
		}
		else if (string.equals("IfcSite_SiteAddress")) {
			resultList.add(((Ifc2x3Package) object).getIfcSite_SiteAddress());
			 //1EReference
		}
		else if (string.equals("IfcSlab_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSlab_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcSoundProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundProperties());
			 //1EClass
		}
		else if (string.equals("IfcSoundValue_Frequency")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundValue_Frequency());
			 //1EAttribute
		}
		else if (string.equals("IfcSpace_HasCoverings")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpace_HasCoverings());
			 //1EReference
		}
		else if (string.equals("IfcSpace_BoundedBy")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpace_BoundedBy());
			 //1EReference
		}
		else if (string.equals("IfcSpaceHeaterType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceHeaterType());
			 //1EClass
		}
		else if (string.equals("IfcSphere_RadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSphere_RadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStackTerminalType")) {
			resultList.add(((Ifc2x3Package) object).getIfcStackTerminalType());
			 //1EClass
		}
		else if (string.equals("IfcStair_ShapeType")) {
			resultList.add(((Ifc2x3Package) object).getIfcStair_ShapeType());
			 //1EAttribute
		}
		else if (string.equals("IfcStairFlightType")) {
			resultList.add(((Ifc2x3Package) object).getIfcStairFlightType());
			 //1EClass
		}
		else if (string.equals("IfcStructuralAction")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralAction());
			 //1EClass
		}
		else if (string.equals("IfcStructuralActivity")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralActivity());
			 //1EClass
		}
		else if (string.equals("IfcStructuralConnection")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralConnection());
			 //1EClass
		}
		else if (string.equals("IfcStructuralCurveMember")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralCurveMember());
			 //1EClass
		}
		else if (string.equals("IfcStructuralLinearAction")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLinearAction());
			 //1EClass
		}
		else if (string.equals("IfcStructuralLoad_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoad_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadGroup")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadGroup());
			 //1EClass
		}
		else if (string.equals("IfcStructuralLoadStatic")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadStatic());
			 //1EClass
		}
		else if (string.equals("IfcStructuralMember")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralMember());
			 //1EClass
		}
		else if (string.equals("IfcStructuralPlanarAction")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralPlanarAction());
			 //1EClass
		}
		else if (string.equals("IfcStructuralPointAction")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralPointAction());
			 //1EClass
		}
		else if (string.equals("IfcStructuralReaction")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralReaction());
			 //1EClass
		}
		else if (string.equals("IfcStructuralResultGroup")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralResultGroup());
			 //1EClass
		}
		else if (string.equals("IfcStyledItem_Item")) {
			resultList.add(((Ifc2x3Package) object).getIfcStyledItem_Item());
			 //1EReference
		}
		else if (string.equals("IfcStyledItem_Styles")) {
			resultList.add(((Ifc2x3Package) object).getIfcStyledItem_Styles());
			 //1EReference
		}
		else if (string.equals("IfcStyledItem_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcStyledItem_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcStyledRepresentation")) {
			resultList.add(((Ifc2x3Package) object).getIfcStyledRepresentation());
			 //1EClass
		}
		else if (string.equals("IfcSubContractResource")) {
			resultList.add(((Ifc2x3Package) object).getIfcSubContractResource());
			 //1EClass
		}
		else if (string.equals("IfcSubedge_ParentEdge")) {
			resultList.add(((Ifc2x3Package) object).getIfcSubedge_ParentEdge());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceOfRevolution")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceOfRevolution());
			 //1EClass
		}
		else if (string.equals("IfcSurfaceStyle_Side")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyle_Side());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceStyle_Styles")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyle_Styles());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceStyleLighting")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleLighting());
			 //1EClass
		}
		else if (string.equals("IfcSurfaceStyleRefraction")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRefraction());
			 //1EClass
		}
		else if (string.equals("IfcSurfaceStyleRendering")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRendering());
			 //1EClass
		}
		else if (string.equals("IfcSurfaceStyleShading")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleShading());
			 //1EClass
		}
		else if (string.equals("IfcSurfaceTexture_RepeatS")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceTexture_RepeatS());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceTexture_RepeatT")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceTexture_RepeatT());
			 //1EAttribute
		}
		else if (string.equals("IfcSweptDiskSolid_Radius")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptDiskSolid_Radius());
			 //1EAttribute
		}
		else if (string.equals("IfcSweptSurface_Position")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptSurface_Position());
			 //1EReference
		}
		else if (string.equals("IfcSweptSurface_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptSurface_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcSwitchingDeviceType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSwitchingDeviceType());
			 //1EClass
		}
		else if (string.equals("IfcTShapeProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcTShapeProfileDef_Depth")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_Depth());
			 //1EAttribute
		}
		else if (string.equals("IfcTableRow_RowCells")) {
			resultList.add(((Ifc2x3Package) object).getIfcTableRow_RowCells());
			 //1EReference
		}
		else if (string.equals("IfcTableRow_IsHeading")) {
			resultList.add(((Ifc2x3Package) object).getIfcTableRow_IsHeading());
			 //1EAttribute
		}
		else if (string.equals("IfcTableRow_OfTable")) {
			resultList.add(((Ifc2x3Package) object).getIfcTableRow_OfTable());
			 //1EReference
		}
		else if (string.equals("IfcTask_WorkMethod")) {
			resultList.add(((Ifc2x3Package) object).getIfcTask_WorkMethod());
			 //1EAttribute
		}
		else if (string.equals("IfcTask_IsMilestone")) {
			resultList.add(((Ifc2x3Package) object).getIfcTask_IsMilestone());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_NominalDiameter")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_NominalDiameter());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_TensionForce")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_TensionForce());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_PreStress")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_PreStress());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_AnchorageSlip")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_AnchorageSlip());
			 //1EAttribute
		}
		else if (string.equals("IfcTerminatorSymbol")) {
			resultList.add(((Ifc2x3Package) object).getIfcTerminatorSymbol());
			 //1EClass
		}
		else if (string.equals("IfcTextLiteral_Literal")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextLiteral_Literal());
			 //1EAttribute
		}
		else if (string.equals("IfcTextLiteral_Placement")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextLiteral_Placement());
			 //1EReference
		}
		else if (string.equals("IfcTextLiteral_Path")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextLiteral_Path());
			 //1EAttribute
		}
		else if (string.equals("IfcTextLiteralWithExtent")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextLiteralWithExtent());
			 //1EClass
		}
		else if (string.equals("IfcTextStyle_TextStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyle_TextStyle());
			 //1EReference
		}
		else if (string.equals("IfcTextStyleFontModel")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleFontModel());
			 //1EClass
		}
		else if (string.equals("IfcTextStyleTextModel")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleTextModel());
			 //1EClass
		}
		else if (string.equals("IfcTextureCoordinate")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextureCoordinate());
			 //1EClass
		}
		else if (string.equals("IfcTextureMap_TextureMaps")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextureMap_TextureMaps());
			 //1EReference
		}
		else if (string.equals("IfcTimeSeries_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeries_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcTimeSeries_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeries_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcTimeSeries_StartTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeries_StartTime());
			 //1EReference
		}
		else if (string.equals("IfcTimeSeries_EndTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeries_EndTime());
			 //1EReference
		}
		else if (string.equals("IfcTimeSeries_DataOrigin")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeries_DataOrigin());
			 //1EAttribute
		}
		else if (string.equals("IfcTimeSeries_Unit")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeries_Unit());
			 //1EReference
		}
		else if (string.equals("IfcTimeSeriesSchedule")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeriesSchedule());
			 //1EClass
		}
		else if (string.equals("IfcTimeSeriesValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeriesValue());
			 //1EClass
		}
		else if (string.equals("IfcTopologyRepresentation")) {
			resultList.add(((Ifc2x3Package) object).getIfcTopologyRepresentation());
			 //1EClass
		}
		else if (string.equals("IfcTransformerType")) {
			resultList.add(((Ifc2x3Package) object).getIfcTransformerType());
			 //1EClass
		}
		else if (string.equals("IfcTransportElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcTransportElement());
			 //1EClass
		}
		else if (string.equals("IfcTransportElementType")) {
			resultList.add(((Ifc2x3Package) object).getIfcTransportElementType());
			 //1EClass
		}
		else if (string.equals("IfcTrapeziumProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrapeziumProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcTrimmedCurve_Trim1")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrimmedCurve_Trim1());
			 //1EReference
		}
		else if (string.equals("IfcTrimmedCurve_Trim2")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrimmedCurve_Trim2());
			 //1EReference
		}
		else if (string.equals("IfcTypeProduct_Tag")) {
			resultList.add(((Ifc2x3Package) object).getIfcTypeProduct_Tag());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcUShapeProfileDef_Depth")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_Depth());
			 //1EAttribute
		}
		else if (string.equals("IfcUnitAssignment_Units")) {
			resultList.add(((Ifc2x3Package) object).getIfcUnitAssignment_Units());
			 //1EReference
		}
		else if (string.equals("IfcUnitaryEquipmentType")) {
			resultList.add(((Ifc2x3Package) object).getIfcUnitaryEquipmentType());
			 //1EClass
		}
		else if (string.equals("IfcVector_Orientation")) {
			resultList.add(((Ifc2x3Package) object).getIfcVector_Orientation());
			 //1EReference
		}
		else if (string.equals("IfcVector_Magnitude")) {
			resultList.add(((Ifc2x3Package) object).getIfcVector_Magnitude());
			 //1EAttribute
		}
		else if (string.equals("IfcVertexBasedTextureMap")) {
			resultList.add(((Ifc2x3Package) object).getIfcVertexBasedTextureMap());
			 //1EClass
		}
		else if (string.equals("IfcVertexLoop_LoopVertex")) {
			resultList.add(((Ifc2x3Package) object).getIfcVertexLoop_LoopVertex());
			 //1EReference
		}
		else if (string.equals("IfcVibrationIsolatorType")) {
			resultList.add(((Ifc2x3Package) object).getIfcVibrationIsolatorType());
			 //1EClass
		}
		else if (string.equals("IfcWallStandardCase")) {
			resultList.add(((Ifc2x3Package) object).getIfcWallStandardCase());
			 //1EClass
		}
		else if (string.equals("IfcWasteTerminalType")) {
			resultList.add(((Ifc2x3Package) object).getIfcWasteTerminalType());
			 //1EClass
		}
		else if (string.equals("IfcWaterProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties());
			 //1EClass
		}
		else if (string.equals("IfcWindow_OverallHeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindow_OverallHeight());
			 //1EAttribute
		}
		else if (string.equals("IfcWindow_OverallWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindow_OverallWidth());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties());
			 //1EClass
		}
		else if (string.equals("IfcWindowPanelProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowPanelProperties());
			 //1EClass
		}
		else if (string.equals("IfcWindowStyle_Sizeable")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowStyle_Sizeable());
			 //1EAttribute
		}
		else if (string.equals("IfcWorkControl_Identifier")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControl_Identifier());
			 //1EAttribute
		}
		else if (string.equals("IfcWorkControl_Creators")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControl_Creators());
			 //1EReference
		}
		else if (string.equals("IfcWorkControl_Purpose")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControl_Purpose());
			 //1EAttribute
		}
		else if (string.equals("IfcWorkControl_Duration")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControl_Duration());
			 //1EAttribute
		}
		else if (string.equals("IfcWorkControl_TotalFloat")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControl_TotalFloat());
			 //1EAttribute
		}
		else if (string.equals("IfcWorkControl_StartTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControl_StartTime());
			 //1EReference
		}
		else if (string.equals("IfcWorkControl_FinishTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControl_FinishTime());
			 //1EReference
		}
		else if (string.equals("IfcZShapeProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcZShapeProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcZShapeProfileDef_Depth")) {
			resultList.add(((Ifc2x3Package) object).getIfcZShapeProfileDef_Depth());
			 //1EAttribute
		}
		else if (string.equals("IfcAppliedValueSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcAppliedValueSelect());
			 //1EClass
		}
		else if (string.equals("IfcCharacterStyleSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcCharacterStyleSelect());
			 //1EClass
		}
		else if (string.equals("IfcCurveOrEdgeCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveOrEdgeCurve());
			 //1EClass
		}
		else if (string.equals("IfcCurveStyleFontSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveStyleFontSelect());
			 //1EClass
		}
		else if (string.equals("IfcDefinedSymbolSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcDefinedSymbolSelect());
			 //1EClass
		}
		else if (string.equals("IfcDerivedMeasureValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcDerivedMeasureValue());
			 //1EClass
		}
		else if (string.equals("IfcFillStyleSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillStyleSelect());
			 //1EClass
		}
		else if (string.equals("IfcGeometricSetSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricSetSelect());
			 //1EClass
		}
		else if (string.equals("IfcMetricValueSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcMetricValueSelect());
			 //1EClass
		}
		else if (string.equals("IfcObjectReferenceSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjectReferenceSelect());
			 //1EClass
		}
		else if (string.equals("IfcOrientationSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrientationSelect());
			 //1EClass
		}
		else if (string.equals("IfcPointOrVertexPoint")) {
			resultList.add(((Ifc2x3Package) object).getIfcPointOrVertexPoint());
			 //1EClass
		}
		else if (string.equals("IfcSurfaceOrFaceSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceOrFaceSurface());
			 //1EClass
		}
		else if (string.equals("IfcSymbolStyleSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcSymbolStyleSelect());
			 //1EClass
		}
		else if (string.equals("IfcTextStyleSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleSelect());
			 //1EClass
		}
		else if (string.equals("IfcVectorOrDirection")) {
			resultList.add(((Ifc2x3Package) object).getIfcVectorOrDirection());
			 //1EClass
		}
		else if (string.equals("IfcActionSourceTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcActionSourceTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcActuatorTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcActuatorTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcFilterType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFilterType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcFireSuppressionTerminalType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFireSuppressionTerminalType());
			 //1EClass
		}
		else if (string.equals("IfcFlowMeterType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowMeterType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcFlowTreatmentDeviceType")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowTreatmentDeviceType());
			 //1EClass
		}
		else if (string.equals("IfcFluidFlowProperties_Fluid")) {
			resultList.add(((Ifc2x3Package) object).getIfcFluidFlowProperties_Fluid());
			 //1EReference
		}
		else if (string.equals("IfcFuelProperties_CarbonContent")) {
			resultList.add(((Ifc2x3Package) object).getIfcFuelProperties_CarbonContent());
			 //1EAttribute
		}
		else if (string.equals("IfcFurnitureType_AssemblyPlace")) {
			resultList.add(((Ifc2x3Package) object).getIfcFurnitureType_AssemblyPlace());
			 //1EAttribute
		}
		else if (string.equals("IfcGasTerminalType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcGasTerminalType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcGeneralMaterialProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralMaterialProperties());
			 //1EClass
		}
		else if (string.equals("IfcGeneralProfileProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeneralProfileProperties());
			 //1EClass
		}
		else if (string.equals("IfcGeometricRepresentationContext")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationContext());
			 //1EClass
		}
		else if (string.equals("IfcGeometricRepresentationItem")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricRepresentationItem());
			 //1EClass
		}
		else if (string.equals("IfcGrid_ContainedInStructure")) {
			resultList.add(((Ifc2x3Package) object).getIfcGrid_ContainedInStructure());
			 //1EReference
		}
		else if (string.equals("IfcGridAxis_HasIntersections")) {
			resultList.add(((Ifc2x3Package) object).getIfcGridAxis_HasIntersections());
			 //1EReference
		}
		else if (string.equals("IfcHalfSpaceSolid_BaseSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcHalfSpaceSolid_BaseSurface());
			 //1EReference
		}
		else if (string.equals("IfcHalfSpaceSolid_AgreementFlag")) {
			resultList.add(((Ifc2x3Package) object).getIfcHalfSpaceSolid_AgreementFlag());
			 //1EAttribute
		}
		else if (string.equals("IfcHumidifierType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcHumidifierType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcHygroscopicMaterialProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcHygroscopicMaterialProperties());
			 //1EClass
		}
		else if (string.equals("IfcIShapeProfileDef_OverallWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcIShapeProfileDef_OverallWidth());
			 //1EAttribute
		}
		else if (string.equals("IfcIShapeProfileDef_OverallDepth")) {
			resultList.add(((Ifc2x3Package) object).getIfcIShapeProfileDef_OverallDepth());
			 //1EAttribute
		}
		else if (string.equals("IfcIShapeProfileDef_WebThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcIShapeProfileDef_WebThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcIShapeProfileDef_FilletRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcIShapeProfileDef_FilletRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcImageTexture_UrlReference")) {
			resultList.add(((Ifc2x3Package) object).getIfcImageTexture_UrlReference());
			 //1EAttribute
		}
		else if (string.equals("IfcInventory_InventoryType")) {
			resultList.add(((Ifc2x3Package) object).getIfcInventory_InventoryType());
			 //1EAttribute
		}
		else if (string.equals("IfcInventory_ResponsiblePersons")) {
			resultList.add(((Ifc2x3Package) object).getIfcInventory_ResponsiblePersons());
			 //1EReference
		}
		else if (string.equals("IfcInventory_LastUpdateDate")) {
			resultList.add(((Ifc2x3Package) object).getIfcInventory_LastUpdateDate());
			 //1EReference
		}
		else if (string.equals("IfcInventory_OriginalValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcInventory_OriginalValue());
			 //1EReference
		}
		else if (string.equals("IfcIrregularTimeSeries_Values")) {
			resultList.add(((Ifc2x3Package) object).getIfcIrregularTimeSeries_Values());
			 //1EReference
		}
		else if (string.equals("IfcIrregularTimeSeriesValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcIrregularTimeSeriesValue());
			 //1EClass
		}
		else if (string.equals("IfcJunctionBoxType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcJunctionBoxType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_DepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_DepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_WidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_WidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_Thickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_Thickness());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_FilletRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_FilletRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_EdgeRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_EdgeRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcLShapeProfileDef_LegSlope")) {
			resultList.add(((Ifc2x3Package) object).getIfcLShapeProfileDef_LegSlope());
			 //1EAttribute
		}
		else if (string.equals("IfcLampType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcLampType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcLibraryInformation_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcLibraryInformation_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcLibraryInformation_Version")) {
			resultList.add(((Ifc2x3Package) object).getIfcLibraryInformation_Version());
			 //1EAttribute
		}
		else if (string.equals("IfcLibraryInformation_Publisher")) {
			resultList.add(((Ifc2x3Package) object).getIfcLibraryInformation_Publisher());
			 //1EReference
		}
		else if (string.equals("IfcLibraryInformation_VersionDate")) {
			resultList.add(((Ifc2x3Package) object).getIfcLibraryInformation_VersionDate());
			 //1EReference
		}
		else if (string.equals("IfcLightIntensityDistribution")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightIntensityDistribution());
			 //1EClass
		}
		else if (string.equals("IfcLightSource_LightColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSource_LightColour());
			 //1EReference
		}
		else if (string.equals("IfcLightSource_AmbientIntensity")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSource_AmbientIntensity());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSource_IntensityAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSource_IntensityAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourcePositional_Position")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourcePositional_Position());
			 //1EReference
		}
		else if (string.equals("IfcLightSourcePositional_Radius")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourcePositional_Radius());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourceSpot_Orientation")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceSpot_Orientation());
			 //1EReference
		}
		else if (string.equals("IfcLightSourceSpot_SpreadAngle")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceSpot_SpreadAngle());
			 //1EAttribute
		}
		else if (string.equals("IfcLightSourceSpot_BeamWidthAngle")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightSourceSpot_BeamWidthAngle());
			 //1EAttribute
		}
		else if (string.equals("IfcLocalPlacement_PlacementRelTo")) {
			resultList.add(((Ifc2x3Package) object).getIfcLocalPlacement_PlacementRelTo());
			 //1EReference
		}
		else if (string.equals("IfcLocalTime_HourComponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcLocalTime_HourComponent());
			 //1EAttribute
		}
		else if (string.equals("IfcLocalTime_MinuteComponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcLocalTime_MinuteComponent());
			 //1EAttribute
		}
		else if (string.equals("IfcLocalTime_SecondComponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcLocalTime_SecondComponent());
			 //1EAttribute
		}
		else if (string.equals("IfcLocalTime_DaylightSavingOffset")) {
			resultList.add(((Ifc2x3Package) object).getIfcLocalTime_DaylightSavingOffset());
			 //1EAttribute
		}
		else if (string.equals("IfcManifoldSolidBrep_Outer")) {
			resultList.add(((Ifc2x3Package) object).getIfcManifoldSolidBrep_Outer());
			 //1EReference
		}
		else if (string.equals("IfcMappedItem_MappingSource")) {
			resultList.add(((Ifc2x3Package) object).getIfcMappedItem_MappingSource());
			 //1EReference
		}
		else if (string.equals("IfcMappedItem_MappingTarget")) {
			resultList.add(((Ifc2x3Package) object).getIfcMappedItem_MappingTarget());
			 //1EReference
		}
		else if (string.equals("IfcMaterial_HasRepresentation")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterial_HasRepresentation());
			 //1EReference
		}
		else if (string.equals("IfcMaterialLayer_LayerThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayer_LayerThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcMaterialLayer_IsVentilated")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayer_IsVentilated());
			 //1EAttribute
		}
		else if (string.equals("IfcMaterialLayerSet_LayerSetName")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialLayerSet_LayerSetName());
			 //1EAttribute
		}
		else if (string.equals("IfcMaterialProperties_Material")) {
			resultList.add(((Ifc2x3Package) object).getIfcMaterialProperties_Material());
			 //1EReference
		}
		else if (string.equals("IfcMeasureWithUnit_ValueComponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcMeasureWithUnit_ValueComponent());
			 //1EReference
		}
		else if (string.equals("IfcMeasureWithUnit_UnitComponent")) {
			resultList.add(((Ifc2x3Package) object).getIfcMeasureWithUnit_UnitComponent());
			 //1EReference
		}
		else if (string.equals("IfcMechanicalMaterialProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcMechanicalMaterialProperties());
			 //1EClass
		}
		else if (string.equals("IfcMemberType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcMemberType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcObjectDefinition_Decomposes")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjectDefinition_Decomposes());
			 //1EReference
		}
		else if (string.equals("IfcObjectPlacement_PlacesObject")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjectPlacement_PlacesObject());
			 //1EReference
		}
		else if (string.equals("IfcObjective_BenchmarkValues")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjective_BenchmarkValues());
			 //1EReference
		}
		else if (string.equals("IfcObjective_ObjectiveQualifier")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjective_ObjectiveQualifier());
			 //1EAttribute
		}
		else if (string.equals("IfcObjective_UserDefinedQualifier")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjective_UserDefinedQualifier());
			 //1EAttribute
		}
		else if (string.equals("IfcOccupant_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcOccupant_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcOffsetCurve2D_BasisCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcOffsetCurve2D_BasisCurve());
			 //1EReference
		}
		else if (string.equals("IfcOffsetCurve2D_DistanceAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcOffsetCurve2D_DistanceAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcOffsetCurve2D_SelfIntersect")) {
			resultList.add(((Ifc2x3Package) object).getIfcOffsetCurve2D_SelfIntersect());
			 //1EAttribute
		}
		else if (string.equals("IfcOffsetCurve3D_BasisCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcOffsetCurve3D_BasisCurve());
			 //1EReference
		}
		else if (string.equals("IfcOffsetCurve3D_DistanceAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcOffsetCurve3D_DistanceAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcOffsetCurve3D_SelfIntersect")) {
			resultList.add(((Ifc2x3Package) object).getIfcOffsetCurve3D_SelfIntersect());
			 //1EAttribute
		}
		else if (string.equals("IfcOffsetCurve3D_RefDirection")) {
			resultList.add(((Ifc2x3Package) object).getIfcOffsetCurve3D_RefDirection());
			 //1EReference
		}
		else if (string.equals("IfcOneDirectionRepeatFactor")) {
			resultList.add(((Ifc2x3Package) object).getIfcOneDirectionRepeatFactor());
			 //1EClass
		}
		else if (string.equals("IfcOpeningElement_HasFillings")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpeningElement_HasFillings());
			 //1EReference
		}
		else if (string.equals("IfcOpticalMaterialProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcOpticalMaterialProperties());
			 //1EClass
		}
		else if (string.equals("IfcOrganization_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganization_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcOrganization_IsRelatedBy")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganization_IsRelatedBy());
			 //1EReference
		}
		else if (string.equals("IfcOrganizationRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganizationRelationship());
			 //1EClass
		}
		else if (string.equals("IfcOrganizationRelationship_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrganizationRelationship_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcOrientedEdge_EdgeElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrientedEdge_EdgeElement());
			 //1EReference
		}
		else if (string.equals("IfcOrientedEdge_Orientation")) {
			resultList.add(((Ifc2x3Package) object).getIfcOrientedEdge_Orientation());
			 //1EAttribute
		}
		else if (string.equals("IfcOutletType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcOutletType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcOwnerHistory_OwningUser")) {
			resultList.add(((Ifc2x3Package) object).getIfcOwnerHistory_OwningUser());
			 //1EReference
		}
		else if (string.equals("IfcOwnerHistory_OwningApplication")) {
			resultList.add(((Ifc2x3Package) object).getIfcOwnerHistory_OwningApplication());
			 //1EReference
		}
		else if (string.equals("IfcOwnerHistory_ChangeAction")) {
			resultList.add(((Ifc2x3Package) object).getIfcOwnerHistory_ChangeAction());
			 //1EAttribute
		}
		else if (string.equals("IfcOwnerHistory_LastModifiedDate")) {
			resultList.add(((Ifc2x3Package) object).getIfcOwnerHistory_LastModifiedDate());
			 //1EAttribute
		}
		else if (string.equals("IfcOwnerHistory_LastModifyingUser")) {
			resultList.add(((Ifc2x3Package) object).getIfcOwnerHistory_LastModifyingUser());
			 //1EReference
		}
		else if (string.equals("IfcOwnerHistory_CreationDate")) {
			resultList.add(((Ifc2x3Package) object).getIfcOwnerHistory_CreationDate());
			 //1EAttribute
		}
		else if (string.equals("IfcParameterizedProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcParameterizedProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcPermeableCoveringProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcPermeableCoveringProperties());
			 //1EClass
		}
		else if (string.equals("IfcPersonAndOrganization_Roles")) {
			resultList.add(((Ifc2x3Package) object).getIfcPersonAndOrganization_Roles());
			 //1EReference
		}
		else if (string.equals("IfcPhysicalComplexQuantity")) {
			resultList.add(((Ifc2x3Package) object).getIfcPhysicalComplexQuantity());
			 //1EClass
		}
		else if (string.equals("IfcPhysicalComplexQuantity_Usage")) {
			resultList.add(((Ifc2x3Package) object).getIfcPhysicalComplexQuantity_Usage());
			 //1EAttribute
		}
		else if (string.equals("IfcPhysicalQuantity_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcPhysicalQuantity_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcPhysicalQuantity_PartOfComplex")) {
			resultList.add(((Ifc2x3Package) object).getIfcPhysicalQuantity_PartOfComplex());
			 //1EReference
		}
		else if (string.equals("IfcPhysicalSimpleQuantity_Unit")) {
			resultList.add(((Ifc2x3Package) object).getIfcPhysicalSimpleQuantity_Unit());
			 //1EReference
		}
		else if (string.equals("IfcPipeFittingType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcPipeFittingType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcPipeSegmentType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcPipeSegmentType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcPixelTexture_ColourComponents")) {
			resultList.add(((Ifc2x3Package) object).getIfcPixelTexture_ColourComponents());
			 //1EAttribute
		}
		else if (string.equals("IfcPlanarExtent_SizeInXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlanarExtent_SizeInXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcPlanarExtent_SizeInYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlanarExtent_SizeInYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcPlateType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlateType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcPointOnCurve_BasisCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcPointOnCurve_BasisCurve());
			 //1EReference
		}
		else if (string.equals("IfcPointOnCurve_PointParameter")) {
			resultList.add(((Ifc2x3Package) object).getIfcPointOnCurve_PointParameter());
			 //1EAttribute
		}
		else if (string.equals("IfcPointOnSurface_BasisSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcPointOnSurface_BasisSurface());
			 //1EReference
		}
		else if (string.equals("IfcPointOnSurface_PointParameterU")) {
			resultList.add(((Ifc2x3Package) object).getIfcPointOnSurface_PointParameterU());
			 //1EAttribute
		}
		else if (string.equals("IfcPointOnSurface_PointParameterV")) {
			resultList.add(((Ifc2x3Package) object).getIfcPointOnSurface_PointParameterV());
			 //1EAttribute
		}
		else if (string.equals("IfcPolygonalBoundedHalfSpace")) {
			resultList.add(((Ifc2x3Package) object).getIfcPolygonalBoundedHalfSpace());
			 //1EClass
		}
		else if (string.equals("IfcPostalAddress_InternalLocation")) {
			resultList.add(((Ifc2x3Package) object).getIfcPostalAddress_InternalLocation());
			 //1EAttribute
		}
		else if (string.equals("IfcPostalAddress_AddressLines")) {
			resultList.add(((Ifc2x3Package) object).getIfcPostalAddress_AddressLines());
			 //1EAttribute
		}
		else if (string.equals("IfcPostalAddress_PostalBox")) {
			resultList.add(((Ifc2x3Package) object).getIfcPostalAddress_PostalBox());
			 //1EAttribute
		}
		else if (string.equals("IfcPostalAddress_PostalCode")) {
			resultList.add(((Ifc2x3Package) object).getIfcPostalAddress_PostalCode());
			 //1EAttribute
		}
		else if (string.equals("IfcPreDefinedDimensionSymbol")) {
			resultList.add(((Ifc2x3Package) object).getIfcPreDefinedDimensionSymbol());
			 //1EClass
		}
		else if (string.equals("IfcPreDefinedPointMarkerSymbol")) {
			resultList.add(((Ifc2x3Package) object).getIfcPreDefinedPointMarkerSymbol());
			 //1EClass
		}
		else if (string.equals("IfcPreDefinedTerminatorSymbol")) {
			resultList.add(((Ifc2x3Package) object).getIfcPreDefinedTerminatorSymbol());
			 //1EClass
		}
		else if (string.equals("IfcPresentationLayerAssignment")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationLayerAssignment());
			 //1EClass
		}
		else if (string.equals("IfcPresentationLayerWithStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationLayerWithStyle());
			 //1EClass
		}
		else if (string.equals("IfcPresentationStyleAssignment")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationStyleAssignment());
			 //1EClass
		}
		else if (string.equals("IfcProcedure_ProcedureType")) {
			resultList.add(((Ifc2x3Package) object).getIfcProcedure_ProcedureType());
			 //1EAttribute
		}
		else if (string.equals("IfcProcess_IsSuccessorFrom")) {
			resultList.add(((Ifc2x3Package) object).getIfcProcess_IsSuccessorFrom());
			 //1EReference
		}
		else if (string.equals("IfcProcess_IsPredecessorTo")) {
			resultList.add(((Ifc2x3Package) object).getIfcProcess_IsPredecessorTo());
			 //1EReference
		}
		else if (string.equals("IfcProduct_ObjectPlacement")) {
			resultList.add(((Ifc2x3Package) object).getIfcProduct_ObjectPlacement());
			 //1EReference
		}
		else if (string.equals("IfcProductRepresentation_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductRepresentation_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcProductsOfCombustionProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcProductsOfCombustionProperties());
			 //1EClass
		}
		else if (string.equals("IfcProfileProperties_ProfileName")) {
			resultList.add(((Ifc2x3Package) object).getIfcProfileProperties_ProfileName());
			 //1EAttribute
		}
		else if (string.equals("IfcProject_RepresentationContexts")) {
			resultList.add(((Ifc2x3Package) object).getIfcProject_RepresentationContexts());
			 //1EReference
		}
		else if (string.equals("IfcProjectOrder_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcProjectOrder_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcProjectOrderRecord_Records")) {
			resultList.add(((Ifc2x3Package) object).getIfcProjectOrderRecord_Records());
			 //1EReference
		}
		else if (string.equals("IfcProperty_PropertyForDependance")) {
			resultList.add(((Ifc2x3Package) object).getIfcProperty_PropertyForDependance());
			 //1EReference
		}
		else if (string.equals("IfcProperty_PropertyDependsOn")) {
			resultList.add(((Ifc2x3Package) object).getIfcProperty_PropertyDependsOn());
			 //1EReference
		}
		else if (string.equals("IfcPropertyBoundedValue_Unit")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyBoundedValue_Unit());
			 //1EReference
		}
		else if (string.equals("IfcPropertyConstraintRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyConstraintRelationship());
			 //1EClass
		}
		else if (string.equals("IfcPropertyDependencyRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyDependencyRelationship());
			 //1EClass
		}
		else if (string.equals("IfcPropertyEnumeratedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyEnumeratedValue());
			 //1EClass
		}
		else if (string.equals("IfcPropertyEnumeration_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyEnumeration_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcPropertyEnumeration_Unit")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyEnumeration_Unit());
			 //1EReference
		}
		else if (string.equals("IfcPropertyListValue_ListValues")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyListValue_ListValues());
			 //1EReference
		}
		else if (string.equals("IfcPropertySet_HasProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertySet_HasProperties());
			 //1EReference
		}
		else if (string.equals("IfcPropertySingleValue_Unit")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertySingleValue_Unit());
			 //1EReference
		}
		else if (string.equals("IfcPropertyTableValue_Expression")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyTableValue_Expression());
			 //1EAttribute
		}
		else if (string.equals("IfcPropertyTableValue_DefinedUnit")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertyTableValue_DefinedUnit());
			 //1EReference
		}
		else if (string.equals("IfcPumpType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcPumpType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcQuantityArea_AreaValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityArea_AreaValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcQuantityCount_CountValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityCount_CountValue());
			 //1EAttribute
		}
		else if (string.equals("IfcQuantityLength_LengthValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityLength_LengthValue());
			 //1EAttribute
		}
		else if (string.equals("IfcQuantityTime_TimeValueAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityTime_TimeValueAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcQuantityVolume_VolumeValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityVolume_VolumeValue());
			 //1EAttribute
		}
		else if (string.equals("IfcQuantityWeight_WeightValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcQuantityWeight_WeightValue());
			 //1EAttribute
		}
		else if (string.equals("IfcRailingType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRailingType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcRampFlightType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRampFlightType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangleHollowProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangleHollowProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcRectangleProfileDef_XDim")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangleProfileDef_XDim());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangleProfileDef_YDim")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangleProfileDef_YDim());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularPyramid_XLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularPyramid_XLength());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularPyramid_YLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularPyramid_YLength());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularPyramid_Height")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularPyramid_Height());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularTrimmedSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularTrimmedSurface());
			 //1EClass
		}
		else if (string.equals("IfcRectangularTrimmedSurface_U1")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularTrimmedSurface_U1());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularTrimmedSurface_V1")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularTrimmedSurface_V1());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularTrimmedSurface_U2")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularTrimmedSurface_U2());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularTrimmedSurface_V2")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularTrimmedSurface_V2());
			 //1EAttribute
		}
		else if (string.equals("IfcRectangularTrimmedSurface_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcRectangularTrimmedSurface_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcReferencesValueDocument")) {
			resultList.add(((Ifc2x3Package) object).getIfcReferencesValueDocument());
			 //1EClass
		}
		else if (string.equals("IfcReferencesValueDocument_Name")) {
			resultList.add(((Ifc2x3Package) object).getIfcReferencesValueDocument_Name());
			 //1EAttribute
		}
		else if (string.equals("IfcRegularTimeSeries_TimeStep")) {
			resultList.add(((Ifc2x3Package) object).getIfcRegularTimeSeries_TimeStep());
			 //1EAttribute
		}
		else if (string.equals("IfcRegularTimeSeries_Values")) {
			resultList.add(((Ifc2x3Package) object).getIfcRegularTimeSeries_Values());
			 //1EReference
		}
		else if (string.equals("IfcReinforcementBarProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcementBarProperties());
			 //1EClass
		}
		else if (string.equals("IfcReinforcingBar_NominalDiameter")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingBar_NominalDiameter());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingBar_BarLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingBar_BarLength());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingBar_BarSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingBar_BarSurface());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingElement_SteelGrade")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingElement_SteelGrade());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_MeshLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_MeshLength());
			 //1EAttribute
		}
		else if (string.equals("IfcReinforcingMesh_MeshWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingMesh_MeshWidth());
			 //1EAttribute
		}
		else if (string.equals("IfcRelAssigns_RelatedObjects")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssigns_RelatedObjects());
			 //1EReference
		}
		else if (string.equals("IfcRelAssigns_RelatedObjectsType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssigns_RelatedObjectsType());
			 //1EAttribute
		}
		else if (string.equals("IfcRelAssignsTasks_TimeForTask")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsTasks_TimeForTask());
			 //1EReference
		}
		else if (string.equals("IfcRelAssignsToActor_ActingRole")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToActor_ActingRole());
			 //1EReference
		}
		else if (string.equals("IfcRelAssignsToProjectOrder")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssignsToProjectOrder());
			 //1EClass
		}
		else if (string.equals("IfcRelAssociates_RelatedObjects")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociates_RelatedObjects());
			 //1EReference
		}
		else if (string.equals("IfcRelAssociatesAppliedValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesAppliedValue());
			 //1EClass
		}
		else if (string.equals("IfcRelAssociatesClassification")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesClassification());
			 //1EClass
		}
		else if (string.equals("IfcRelAssociatesConstraint")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesConstraint());
			 //1EClass
		}
		else if (string.equals("IfcRelAssociatesConstraint_Intent")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesConstraint_Intent());
			 //1EAttribute
		}
		else if (string.equals("IfcRelAssociatesProfileProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelAssociatesProfileProperties());
			 //1EClass
		}
		else if (string.equals("IfcRelConnectsPathElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsPathElements());
			 //1EClass
		}
		else if (string.equals("IfcRelConnectsPortToElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsPortToElement());
			 //1EClass
		}
		else if (string.equals("IfcRelConnectsPorts_RelatingPort")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsPorts_RelatingPort());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsPorts_RelatedPort")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsPorts_RelatedPort());
			 //1EReference
		}
		else if (string.equals("IfcRelConnectsStructuralActivity")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralActivity());
			 //1EClass
		}
		else if (string.equals("IfcRelConnectsStructuralElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralElement());
			 //1EClass
		}
		else if (string.equals("IfcRelConnectsStructuralMember")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsStructuralMember());
			 //1EClass
		}
		else if (string.equals("IfcRelConnectsWithEccentricity")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelConnectsWithEccentricity());
			 //1EClass
		}
		else if (string.equals("IfcRelContainedInSpatialStructure")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelContainedInSpatialStructure());
			 //1EClass
		}
		else if (string.equals("IfcRelCoversSpaces_RelatedSpace")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelCoversSpaces_RelatedSpace());
			 //1EReference
		}
		else if (string.equals("IfcRelDecomposes_RelatingObject")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelDecomposes_RelatingObject());
			 //1EReference
		}
		else if (string.equals("IfcRelDecomposes_RelatedObjects")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelDecomposes_RelatedObjects());
			 //1EReference
		}
		else if (string.equals("IfcRelDefines_RelatedObjects")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelDefines_RelatedObjects());
			 //1EReference
		}
		else if (string.equals("IfcRelDefinesByType_RelatingType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelDefinesByType_RelatingType());
			 //1EReference
		}
		else if (string.equals("IfcRelInteractionRequirements")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelInteractionRequirements());
			 //1EClass
		}
		else if (string.equals("IfcRelSequence_RelatingProcess")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelSequence_RelatingProcess());
			 //1EReference
		}
		else if (string.equals("IfcRelSequence_RelatedProcess")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelSequence_RelatedProcess());
			 //1EReference
		}
		else if (string.equals("IfcRelSequence_TimeLagAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelSequence_TimeLagAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcRelSequence_SequenceType")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelSequence_SequenceType());
			 //1EAttribute
		}
		else if (string.equals("IfcRelSpaceBoundary_RelatingSpace")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelSpaceBoundary_RelatingSpace());
			 //1EReference
		}
		else if (string.equals("IfcRelaxation_RelaxationValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelaxation_RelaxationValue());
			 //1EAttribute
		}
		else if (string.equals("IfcRelaxation_InitialStress")) {
			resultList.add(((Ifc2x3Package) object).getIfcRelaxation_InitialStress());
			 //1EAttribute
		}
		else if (string.equals("IfcRepresentation_ContextOfItems")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentation_ContextOfItems());
			 //1EReference
		}
		else if (string.equals("IfcRepresentationMap_MapUsage")) {
			resultList.add(((Ifc2x3Package) object).getIfcRepresentationMap_MapUsage());
			 //1EReference
		}
		else if (string.equals("IfcRevolvedAreaSolid_Angle")) {
			resultList.add(((Ifc2x3Package) object).getIfcRevolvedAreaSolid_Angle());
			 //1EAttribute
		}
		else if (string.equals("IfcRibPlateProfileProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcRibPlateProfileProperties());
			 //1EClass
		}
		else if (string.equals("IfcRightCircularCone_Height")) {
			resultList.add(((Ifc2x3Package) object).getIfcRightCircularCone_Height());
			 //1EAttribute
		}
		else if (string.equals("IfcRightCircularCone_BottomRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcRightCircularCone_BottomRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcRightCircularCylinder_Height")) {
			resultList.add(((Ifc2x3Package) object).getIfcRightCircularCylinder_Height());
			 //1EAttribute
		}
		else if (string.equals("IfcRightCircularCylinder_Radius")) {
			resultList.add(((Ifc2x3Package) object).getIfcRightCircularCylinder_Radius());
			 //1EAttribute
		}
		else if (string.equals("IfcRoundedEdgeFeature_Radius")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoundedEdgeFeature_Radius());
			 //1EAttribute
		}
		else if (string.equals("IfcRoundedRectangleProfileDef")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoundedRectangleProfileDef());
			 //1EClass
		}
		else if (string.equals("IfcScheduleTimeControl_EarlyStart")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_EarlyStart());
			 //1EReference
		}
		else if (string.equals("IfcScheduleTimeControl_LateStart")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_LateStart());
			 //1EReference
		}
		else if (string.equals("IfcScheduleTimeControl_LateFinish")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_LateFinish());
			 //1EReference
		}
		else if (string.equals("IfcScheduleTimeControl_FreeFloat")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_FreeFloat());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_TotalFloat")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_TotalFloat());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_IsCritical")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_IsCritical());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_StatusTime")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_StatusTime());
			 //1EReference
		}
		else if (string.equals("IfcScheduleTimeControl_StartFloat")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_StartFloat());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_Completion")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_Completion());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionProperties_SectionType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionProperties_SectionType());
			 //1EAttribute
		}
		else if (string.equals("IfcSectionProperties_StartProfile")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionProperties_StartProfile());
			 //1EReference
		}
		else if (string.equals("IfcSectionProperties_EndProfile")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionProperties_EndProfile());
			 //1EReference
		}
		else if (string.equals("IfcSectionReinforcementProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionReinforcementProperties());
			 //1EClass
		}
		else if (string.equals("IfcSectionedSpine_SpineCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionedSpine_SpineCurve());
			 //1EReference
		}
		else if (string.equals("IfcSectionedSpine_CrossSections")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionedSpine_CrossSections());
			 //1EReference
		}
		else if (string.equals("IfcSensorType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSensorType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcServiceLife_ServiceLifeType")) {
			resultList.add(((Ifc2x3Package) object).getIfcServiceLife_ServiceLifeType());
			 //1EAttribute
		}
		else if (string.equals("IfcServiceLifeFactor_UpperValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcServiceLifeFactor_UpperValue());
			 //1EReference
		}
		else if (string.equals("IfcServiceLifeFactor_LowerValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcServiceLifeFactor_LowerValue());
			 //1EReference
		}
		else if (string.equals("IfcShapeAspect_Description")) {
			resultList.add(((Ifc2x3Package) object).getIfcShapeAspect_Description());
			 //1EAttribute
		}
		else if (string.equals("IfcShapeModel_OfShapeAspect")) {
			resultList.add(((Ifc2x3Package) object).getIfcShapeModel_OfShapeAspect());
			 //1EReference
		}
		else if (string.equals("IfcShellBasedSurfaceModel_Dim")) {
			resultList.add(((Ifc2x3Package) object).getIfcShellBasedSurfaceModel_Dim());
			 //1EAttribute
		}
		else if (string.equals("IfcSite_RefElevationAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSite_RefElevationAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSlabType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSlabType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcSlippageConnectionCondition")) {
			resultList.add(((Ifc2x3Package) object).getIfcSlippageConnectionCondition());
			 //1EClass
		}
		else if (string.equals("IfcSoundProperties_IsAttenuating")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundProperties_IsAttenuating());
			 //1EAttribute
		}
		else if (string.equals("IfcSoundProperties_SoundScale")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundProperties_SoundScale());
			 //1EAttribute
		}
		else if (string.equals("IfcSoundProperties_SoundValues")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundProperties_SoundValues());
			 //1EReference
		}
		else if (string.equals("IfcSoundValue_FrequencyAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundValue_FrequencyAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSpace_InteriorOrExteriorSpace")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpace_InteriorOrExteriorSpace());
			 //1EAttribute
		}
		else if (string.equals("IfcSpace_ElevationWithFlooring")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpace_ElevationWithFlooring());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceHeaterType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceHeaterType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceProgram_MaxRequiredArea")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceProgram_MaxRequiredArea());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceProgram_MinRequiredArea")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceProgram_MinRequiredArea());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceProgram_RequestedLocation")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceProgram_RequestedLocation());
			 //1EReference
		}
		else if (string.equals("IfcSpaceThermalLoadProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties());
			 //1EClass
		}
		else if (string.equals("IfcSpaceType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcSpatialStructureElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpatialStructureElement());
			 //1EClass
		}
		else if (string.equals("IfcSpatialStructureElementType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpatialStructureElementType());
			 //1EClass
		}
		else if (string.equals("IfcStairFlight_NumberOfRiser")) {
			resultList.add(((Ifc2x3Package) object).getIfcStairFlight_NumberOfRiser());
			 //1EAttribute
		}
		else if (string.equals("IfcStairFlight_NumberOfTreads")) {
			resultList.add(((Ifc2x3Package) object).getIfcStairFlight_NumberOfTreads());
			 //1EAttribute
		}
		else if (string.equals("IfcStairFlight_RiserHeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcStairFlight_RiserHeight());
			 //1EAttribute
		}
		else if (string.equals("IfcStairFlight_TreadLength")) {
			resultList.add(((Ifc2x3Package) object).getIfcStairFlight_TreadLength());
			 //1EAttribute
		}
		else if (string.equals("IfcStairFlightType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcStairFlightType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralAction_CausedBy")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralAction_CausedBy());
			 //1EReference
		}
		else if (string.equals("IfcStructuralActivity_AppliedLoad")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralActivity_AppliedLoad());
			 //1EReference
		}
		else if (string.equals("IfcStructuralAnalysisModel")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralAnalysisModel());
			 //1EClass
		}
		else if (string.equals("IfcStructuralConnectionCondition")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralConnectionCondition());
			 //1EClass
		}
		else if (string.equals("IfcStructuralCurveConnection")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralCurveConnection());
			 //1EClass
		}
		else if (string.equals("IfcStructuralCurveMemberVarying")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralCurveMemberVarying());
			 //1EClass
		}
		else if (string.equals("IfcStructuralLinearActionVarying")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLinearActionVarying());
			 //1EClass
		}
		else if (string.equals("IfcStructuralLoadGroup_ActionType")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadGroup_ActionType());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadGroup_Purpose")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadGroup_Purpose());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadLinearForce")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadLinearForce());
			 //1EClass
		}
		else if (string.equals("IfcStructuralLoadPlanarForce")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadPlanarForce());
			 //1EClass
		}
		else if (string.equals("IfcStructuralLoadSingleForce")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForce());
			 //1EClass
		}
		else if (string.equals("IfcStructuralLoadTemperature")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadTemperature());
			 //1EClass
		}
		else if (string.equals("IfcStructuralMember_ConnectedBy")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralMember_ConnectedBy());
			 //1EReference
		}
		else if (string.equals("IfcStructuralPlanarActionVarying")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralPlanarActionVarying());
			 //1EClass
		}
		else if (string.equals("IfcStructuralPointConnection")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralPointConnection());
			 //1EClass
		}
		else if (string.equals("IfcStructuralPointReaction")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralPointReaction());
			 //1EClass
		}
		else if (string.equals("IfcStructuralProfileProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties());
			 //1EClass
		}
		else if (string.equals("IfcStructuralReaction_Causes")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralReaction_Causes());
			 //1EReference
		}
		else if (string.equals("IfcStructuralResultGroup_IsLinear")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralResultGroup_IsLinear());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSurfaceConnection")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSurfaceConnection());
			 //1EClass
		}
		else if (string.equals("IfcStructuralSurfaceMember")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSurfaceMember());
			 //1EClass
		}
		else if (string.equals("IfcStructuralSurfaceMemberVarying")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSurfaceMemberVarying());
			 //1EClass
		}
		else if (string.equals("IfcStructuredDimensionCallout")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuredDimensionCallout());
			 //1EClass
		}
		else if (string.equals("IfcScheduleTimeControl_RemainingTimeAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_RemainingTimeAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcScheduleTimeControl_FinishFloatAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcScheduleTimeControl_FinishFloatAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcServiceLife_ServiceLifeDurationAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcServiceLife_ServiceLifeDurationAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcShapeAspect_PartOfProductDefinitionShape")) {
			resultList.add(((Ifc2x3Package) object).getIfcShapeAspect_PartOfProductDefinitionShape());
			 //1EReference
		}
		else if (string.equals("IfcSlippageConnectionCondition_SlippageXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSlippageConnectionCondition_SlippageXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSlippageConnectionCondition_SlippageYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSlippageConnectionCondition_SlippageYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSlippageConnectionCondition_SlippageZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSlippageConnectionCondition_SlippageZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceProgram_StandardRequiredAreaAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceProgram_StandardRequiredAreaAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceThermalLoadProperties_ThermalLoadSource")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties_ThermalLoadSource());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceThermalLoadProperties_PropertySource")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties_PropertySource());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceThermalLoadProperties_SourceDescription")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties_SourceDescription());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceThermalLoadProperties_MaximumValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties_MaximumValue());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceThermalLoadProperties_MinimumValue")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties_MinimumValue());
			 //1EAttribute
		}
		else if (string.equals("IfcSpaceThermalLoadProperties_ThermalLoadType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceThermalLoadProperties_ThermalLoadType());
			 //1EAttribute
		}
		else if (string.equals("IfcSpatialStructureElement_CompositionType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpatialStructureElement_CompositionType());
			 //1EAttribute
		}
		else if (string.equals("IfcSpatialStructureElement_ReferencesElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpatialStructureElement_ReferencesElements());
			 //1EReference
		}
		else if (string.equals("IfcSpatialStructureElement_ServicedBySystems")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpatialStructureElement_ServicedBySystems());
			 //1EReference
		}
		else if (string.equals("IfcSpatialStructureElement_ContainsElements")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpatialStructureElement_ContainsElements());
			 //1EReference
		}
		else if (string.equals("IfcStructuralActivity_AssignedToStructuralItem")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralActivity_AssignedToStructuralItem());
			 //1EReference
		}
		else if (string.equals("IfcStructuralAnalysisModel_OrientationOf2DPlane")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralAnalysisModel_OrientationOf2DPlane());
			 //1EReference
		}
		else if (string.equals("IfcStructuralConnection_ConnectsStructuralMembers")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralConnection_ConnectsStructuralMembers());
			 //1EReference
		}
		else if (string.equals("IfcStructuralItem_AssignedStructuralActivity")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralItem_AssignedStructuralActivity());
			 //1EReference
		}
		else if (string.equals("IfcStructuralLoadGroup_CoefficientAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadGroup_CoefficientAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadGroup_SourceOfResultGroup")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadGroup_SourceOfResultGroup());
			 //1EReference
		}
		else if (string.equals("IfcStructuralLoadLinearForce_LinearForceXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadLinearForce_LinearForceXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadLinearForce_LinearForceYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadLinearForce_LinearForceYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadLinearForce_LinearForceZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadLinearForce_LinearForceZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadLinearForce_LinearMomentX")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadLinearForce_LinearMomentX());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadLinearForce_LinearMomentY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadLinearForce_LinearMomentY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadLinearForce_LinearMomentZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadLinearForce_LinearMomentZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadPlanarForce_PlanarForceXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadPlanarForce_PlanarForceXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadPlanarForce_PlanarForceYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadPlanarForce_PlanarForceYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadPlanarForce_PlanarForceZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadPlanarForce_PlanarForceZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacement_DisplacementX")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacement_DisplacementX());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacement_DisplacementY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacement_DisplacementY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacement_DisplacementZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacement_DisplacementZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleDisplacementDistortion")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleDisplacementDistortion());
			 //1EClass
		}
		else if (string.equals("IfcStructuralLoadSingleForce_ForceXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForce_ForceXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleForce_ForceYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForce_ForceYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleForce_ForceZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForce_ForceZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleForce_MomentXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForce_MomentXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleForce_MomentYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForce_MomentYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleForce_MomentZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForce_MomentZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleForceWarping_WarpingMoment")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForceWarping_WarpingMoment());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadTemperature_DeltaT_Constant")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadTemperature_DeltaT_Constant());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadTemperature_DeltaT_YAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadTemperature_DeltaT_YAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadTemperature_DeltaT_ZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadTemperature_DeltaT_ZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_TorsionalConstantX")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_TorsionalConstantX());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MomentOfInertiaYZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MomentOfInertiaYZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MomentOfInertiaY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MomentOfInertiaY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MomentOfInertiaZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MomentOfInertiaZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_WarpingConstant")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_WarpingConstant());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_ShearCentreZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_ShearCentreZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_ShearCentreY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_ShearCentreY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_CentreOfGravityInX")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_CentreOfGravityInX());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_CentreOfGravityInY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_CentreOfGravityInY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralResultGroup_ResultForLoadGroup")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralResultGroup_ResultForLoadGroup());
			 //1EReference
		}
		else if (string.equals("IfcStructuralSteelProfileProperties_ShearAreaZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSteelProfileProperties_ShearAreaZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSteelProfileProperties_ShearAreaY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSteelProfileProperties_ShearAreaY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSurfaceMember_ThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSurfaceMember_ThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceCurveSweptAreaSolid_StartParamAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceCurveSweptAreaSolid_StartParamAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceCurveSweptAreaSolid_EndParamAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceCurveSweptAreaSolid_EndParamAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceCurveSweptAreaSolid_ReferenceSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceCurveSweptAreaSolid_ReferenceSurface());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceOfLinearExtrusion_ExtrudedDirection")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceOfLinearExtrusion_ExtrudedDirection());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceStyleLighting_DiffuseTransmissionColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleLighting_DiffuseTransmissionColour());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceStyleLighting_DiffuseReflectionColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleLighting_DiffuseReflectionColour());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceStyleLighting_TransmissionColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleLighting_TransmissionColour());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceStyleRefraction_RefractionIndexAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRefraction_RefractionIndexAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceStyleRefraction_DispersionFactor")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRefraction_DispersionFactor());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceStyleRendering_TransparencyAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRendering_TransparencyAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceStyleRendering_TransmissionColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRendering_TransmissionColour());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceStyleRendering_SpecularHighlight")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRendering_SpecularHighlight());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceStyleRendering_ReflectanceMethod")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRendering_ReflectanceMethod());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_FlangeThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_FlangeThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_FlangeEdgeRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_FlangeEdgeRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_CentreOfGravityInYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_CentreOfGravityInYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleForDefinedFont_BackgroundColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleForDefinedFont_BackgroundColour());
			 //1EReference
		}
		else if (string.equals("IfcTextStyleWithBoxCharacteristics_BoxHeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleWithBoxCharacteristics_BoxHeight());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleWithBoxCharacteristics_BoxWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleWithBoxCharacteristics_BoxWidth());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleWithBoxCharacteristics_BoxSlantAngle")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleWithBoxCharacteristics_BoxSlantAngle());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleWithBoxCharacteristics_BoxRotateAngle")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleWithBoxCharacteristics_BoxRotateAngle());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalMaterialProperties_SpecificHeatCapacity")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalMaterialProperties_SpecificHeatCapacity());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalMaterialProperties_BoilingPointAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalMaterialProperties_BoilingPointAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalMaterialProperties_FreezingPoint")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalMaterialProperties_FreezingPoint());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalMaterialProperties_ThermalConductivity")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalMaterialProperties_ThermalConductivity());
			 //1EAttribute
		}
		else if (string.equals("IfcTimeSeriesSchedule_TimeSeriesScheduleType")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeriesSchedule_TimeSeriesScheduleType());
			 //1EAttribute
		}
		else if (string.equals("IfcTransportElement_CapacityByWeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTransportElement_CapacityByWeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTransportElement_CapacityByNumberAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTransportElement_CapacityByNumberAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTwoDirectionRepeatFactor_SecondRepeatFactor")) {
			resultList.add(((Ifc2x3Package) object).getIfcTwoDirectionRepeatFactor_SecondRepeatFactor());
			 //1EReference
		}
		else if (string.equals("IfcUShapeProfileDef_FlangeThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_FlangeThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef_CentreOfGravityInXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_CentreOfGravityInXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcVirtualGridIntersection_IntersectingAxes")) {
			resultList.add(((Ifc2x3Package) object).getIfcVirtualGridIntersection_IntersectingAxes());
			 //1EReference
		}
		else if (string.equals("IfcVirtualGridIntersection_OffsetDistances")) {
			resultList.add(((Ifc2x3Package) object).getIfcVirtualGridIntersection_OffsetDistances());
			 //1EAttribute
		}
		else if (string.equals("IfcWaterProperties_AlkalinityConcentration")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties_AlkalinityConcentration());
			 //1EAttribute
		}
		else if (string.equals("IfcWaterProperties_AcidityConcentrationAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties_AcidityConcentrationAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWaterProperties_ImpuritiesContentAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties_ImpuritiesContentAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWaterProperties_DissolvedSolidsContentAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties_DissolvedSolidsContentAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_LiningDepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_LiningDepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_LiningThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_LiningThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_TransomThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_TransomThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_MullionThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_MullionThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_FirstTransomOffset")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_FirstTransomOffset());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_SecondTransomOffset")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_SecondTransomOffset());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_FirstMullionOffset")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_FirstMullionOffset());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_SecondMullionOffset")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_SecondMullionOffset());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_ShapeAspectStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_ShapeAspectStyle());
			 //1EReference
		}
		else if (string.equals("IfcWindowPanelProperties_FrameDepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowPanelProperties_FrameDepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowPanelProperties_FrameThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowPanelProperties_FrameThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcZShapeProfileDef_FlangeThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcZShapeProfileDef_FlangeThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadSingleForceWarping")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadSingleForceWarping());
			 //1EClass
		}
		else if (string.equals("IfcStructuralLoadTemperature_DeltaT_Y")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadTemperature_DeltaT_Y());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralLoadTemperature_DeltaT_Z")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralLoadTemperature_DeltaT_Z());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralMember_ReferencesElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralMember_ReferencesElement());
			 //1EReference
		}
		else if (string.equals("IfcStructuralPlanarAction_ProjectedOrTrue")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralPlanarAction_ProjectedOrTrue());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralResultGroup_TheoryType")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralResultGroup_TheoryType());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralResultGroup_ResultGroupFor")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralResultGroup_ResultGroupFor());
			 //1EReference
		}
		else if (string.equals("IfcStructuralSteelProfileProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSteelProfileProperties());
			 //1EClass
		}
		else if (string.equals("IfcStructuralSurfaceMember_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSurfaceMember_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSurfaceMember_Thickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSurfaceMember_Thickness());
			 //1EAttribute
		}
		else if (string.equals("IfcSubContractResource_SubContractor")) {
			resultList.add(((Ifc2x3Package) object).getIfcSubContractResource_SubContractor());
			 //1EReference
		}
		else if (string.equals("IfcSubContractResource_JobDescription")) {
			resultList.add(((Ifc2x3Package) object).getIfcSubContractResource_JobDescription());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceCurveSweptAreaSolid_Directrix")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceCurveSweptAreaSolid_Directrix());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceCurveSweptAreaSolid_StartParam")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceCurveSweptAreaSolid_StartParam());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceCurveSweptAreaSolid_EndParam")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceCurveSweptAreaSolid_EndParam());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceOfLinearExtrusion_DepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceOfLinearExtrusion_DepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceOfRevolution_AxisPosition")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceOfRevolution_AxisPosition());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceStyleLighting_ReflectanceColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleLighting_ReflectanceColour());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceStyleRefraction_RefractionIndex")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRefraction_RefractionIndex());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceStyleRendering_Transparency")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRendering_Transparency());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceStyleRendering_DiffuseColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRendering_DiffuseColour());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceStyleRendering_ReflectionColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRendering_ReflectionColour());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceStyleRendering_SpecularColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRendering_SpecularColour());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceStyleShading_SurfaceColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleShading_SurfaceColour());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceStyleWithTextures_Textures")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleWithTextures_Textures());
			 //1EReference
		}
		else if (string.equals("IfcSurfaceTexture_TextureTransform")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceTexture_TextureTransform());
			 //1EReference
		}
		else if (string.equals("IfcSweptDiskSolid_InnerRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptDiskSolid_InnerRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSweptDiskSolid_StartParamAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptDiskSolid_StartParamAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSweptDiskSolid_EndParamAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptDiskSolid_EndParamAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSwitchingDeviceType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSwitchingDeviceType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_FlangeWidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_FlangeWidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_WebThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_WebThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_FlangeThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_FlangeThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_FilletRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_FilletRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_FlangeEdgeRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_FlangeEdgeRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_WebEdgeRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_WebEdgeRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_WebSlopeAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_WebSlopeAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_FlangeSlopeAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_FlangeSlopeAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_CentreOfGravityInY")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_CentreOfGravityInY());
			 //1EAttribute
		}
		else if (string.equals("IfcTelecomAddress_TelephoneNumbers")) {
			resultList.add(((Ifc2x3Package) object).getIfcTelecomAddress_TelephoneNumbers());
			 //1EAttribute
		}
		else if (string.equals("IfcTelecomAddress_FacsimileNumbers")) {
			resultList.add(((Ifc2x3Package) object).getIfcTelecomAddress_FacsimileNumbers());
			 //1EAttribute
		}
		else if (string.equals("IfcTelecomAddress_ElectronicMailAddresses")) {
			resultList.add(((Ifc2x3Package) object).getIfcTelecomAddress_ElectronicMailAddresses());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_CrossSectionAreaAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_CrossSectionAreaAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_FrictionCoefficientAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_FrictionCoefficientAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_MinCurvatureRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_MinCurvatureRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTerminatorSymbol_AnnotatedCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcTerminatorSymbol_AnnotatedCurve());
			 //1EReference
		}
		else if (string.equals("IfcTextLiteralWithExtent_BoxAlignment")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextLiteralWithExtent_BoxAlignment());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyle_TextCharacterAppearance")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyle_TextCharacterAppearance());
			 //1EReference
		}
		else if (string.equals("IfcTextStyleTextModel_TextDecoration")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleTextModel_TextDecoration());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleTextModel_LetterSpacing")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleTextModel_LetterSpacing());
			 //1EReference
		}
		else if (string.equals("IfcTextStyleTextModel_TextTransform")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleTextModel_TextTransform());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleWithBoxCharacteristics")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleWithBoxCharacteristics());
			 //1EClass
		}
		else if (string.equals("IfcTextureCoordinate_AnnotatedSurface")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextureCoordinate_AnnotatedSurface());
			 //1EReference
		}
		else if (string.equals("IfcTextureCoordinateGenerator_Mode")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextureCoordinateGenerator_Mode());
			 //1EAttribute
		}
		else if (string.equals("IfcTextureCoordinateGenerator_Parameter")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextureCoordinateGenerator_Parameter());
			 //1EReference
		}
		else if (string.equals("IfcTextureVertex_CoordinatesAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextureVertex_CoordinatesAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalMaterialProperties_BoilingPoint")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalMaterialProperties_BoilingPoint());
			 //1EAttribute
		}
		else if (string.equals("IfcTimeSeries_UserDefinedDataOrigin")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeries_UserDefinedDataOrigin());
			 //1EAttribute
		}
		else if (string.equals("IfcTimeSeriesReferenceRelationship")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeriesReferenceRelationship());
			 //1EClass
		}
		else if (string.equals("IfcTimeSeriesSchedule_ApplicableDates")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeriesSchedule_ApplicableDates());
			 //1EReference
		}
		else if (string.equals("IfcTransportElement_CapacityByWeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcTransportElement_CapacityByWeight());
			 //1EAttribute
		}
		else if (string.equals("IfcTransportElement_CapacityByNumber")) {
			resultList.add(((Ifc2x3Package) object).getIfcTransportElement_CapacityByNumber());
			 //1EAttribute
		}
		else if (string.equals("IfcTransportElementType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcTransportElementType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcTrapeziumProfileDef_BottomXDimAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrapeziumProfileDef_BottomXDimAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTrapeziumProfileDef_TopXDimAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrapeziumProfileDef_TopXDimAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTrapeziumProfileDef_YDimAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrapeziumProfileDef_YDimAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTrapeziumProfileDef_TopXOffsetAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrapeziumProfileDef_TopXOffsetAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTrimmedCurve_MasterRepresentation")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrimmedCurve_MasterRepresentation());
			 //1EAttribute
		}
		else if (string.equals("IfcTypeObject_ApplicableOccurrence")) {
			resultList.add(((Ifc2x3Package) object).getIfcTypeObject_ApplicableOccurrence());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef_FlangeWidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_FlangeWidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef_WebThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_WebThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef_FlangeThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_FlangeThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef_FilletRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_FilletRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef_EdgeRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_EdgeRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef_FlangeSlopeAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_FlangeSlopeAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef_CentreOfGravityInX")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_CentreOfGravityInX());
			 //1EAttribute
		}
		else if (string.equals("IfcUnitaryEquipmentType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcUnitaryEquipmentType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcVertexBasedTextureMap_TextureVertices")) {
			resultList.add(((Ifc2x3Package) object).getIfcVertexBasedTextureMap_TextureVertices());
			 //1EReference
		}
		else if (string.equals("IfcVertexBasedTextureMap_TexturePoints")) {
			resultList.add(((Ifc2x3Package) object).getIfcVertexBasedTextureMap_TexturePoints());
			 //1EReference
		}
		else if (string.equals("IfcVibrationIsolatorType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcVibrationIsolatorType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcWasteTerminalType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcWasteTerminalType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcWaterProperties_HardnessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties_HardnessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWaterProperties_AcidityConcentration")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties_AcidityConcentration());
			 //1EAttribute
		}
		else if (string.equals("IfcWaterProperties_ImpuritiesContent")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties_ImpuritiesContent());
			 //1EAttribute
		}
		else if (string.equals("IfcWaterProperties_PHLevelAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties_PHLevelAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWaterProperties_DissolvedSolidsContent")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties_DissolvedSolidsContent());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_LiningDepth")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_LiningDepth());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_LiningThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_LiningThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowPanelProperties_OperationType")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowPanelProperties_OperationType());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowPanelProperties_PanelPosition")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowPanelProperties_PanelPosition());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowPanelProperties_FrameDepth")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowPanelProperties_FrameDepth());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowPanelProperties_FrameThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowPanelProperties_FrameThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowPanelProperties_ShapeAspectStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowPanelProperties_ShapeAspectStyle());
			 //1EReference
		}
		else if (string.equals("IfcWindowStyle_ParameterTakesPrecedence")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowStyle_ParameterTakesPrecedence());
			 //1EAttribute
		}
		else if (string.equals("IfcWorkControl_UserDefinedControlType")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControl_UserDefinedControlType());
			 //1EAttribute
		}
		else if (string.equals("IfcZShapeProfileDef_FlangeWidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcZShapeProfileDef_FlangeWidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcZShapeProfileDef_WebThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcZShapeProfileDef_WebThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcZShapeProfileDef_FlangeThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcZShapeProfileDef_FlangeThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcZShapeProfileDef_FilletRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcZShapeProfileDef_FilletRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcZShapeProfileDef_EdgeRadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcZShapeProfileDef_EdgeRadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcCurveFontOrScaledCurveFontSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurveFontOrScaledCurveFontSelect());
			 //1EClass
		}
		else if (string.equals("IfcLightDistributionDataSourceSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightDistributionDataSourceSelect());
			 //1EClass
		}
		else if (string.equals("IfcStructuralActivityAssignmentSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralActivityAssignmentSelect());
			 //1EClass
		}
		else if (string.equals("IfcDistributionChamberElementTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDistributionChamberElementTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcElectricDistributionPointFunctionEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricDistributionPointFunctionEnum());
			 //1EEnum
		}
		else if (string.equals("IfcElectricFlowStorageDeviceTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricFlowStorageDeviceTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcEnvironmentalImpactCategoryEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnvironmentalImpactCategoryEnum());
			 //1EEnum
		}
		else if (string.equals("IfcFireSuppressionTerminalTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcFireSuppressionTerminalTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcStructuralProfileProperties_TorsionalConstantXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_TorsionalConstantXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MomentOfInertiaYZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MomentOfInertiaYZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MomentOfInertiaYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MomentOfInertiaYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MomentOfInertiaZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MomentOfInertiaZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_WarpingConstantAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_WarpingConstantAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_ShearCentreZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_ShearCentreZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_ShearCentreYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_ShearCentreYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_ShearDeformationAreaZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_ShearDeformationAreaZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_ShearDeformationAreaY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_ShearDeformationAreaY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MaximumSectionModulusY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MaximumSectionModulusY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MinimumSectionModulusY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MinimumSectionModulusY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MaximumSectionModulusZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MaximumSectionModulusZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_MinimumSectionModulusZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_MinimumSectionModulusZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_TorsionalSectionModulus")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_TorsionalSectionModulus());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_CentreOfGravityInXAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_CentreOfGravityInXAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralProfileProperties_CentreOfGravityInYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralProfileProperties_CentreOfGravityInYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSteelProfileProperties_ShearAreaZAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSteelProfileProperties_ShearAreaZAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSteelProfileProperties_ShearAreaYAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSteelProfileProperties_ShearAreaYAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSteelProfileProperties_PlasticShapeFactorY")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSteelProfileProperties_PlasticShapeFactorY());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSteelProfileProperties_PlasticShapeFactorZ")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSteelProfileProperties_PlasticShapeFactorZ());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSurfaceMemberVarying_SubsequentThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSurfaceMemberVarying_SubsequentThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcStructuralSurfaceMemberVarying_VaryingThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSurfaceMemberVarying_VaryingThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceStyleRefraction_DispersionFactorAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRefraction_DispersionFactorAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceStyleRendering_DiffuseTransmissionColour")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleRendering_DiffuseTransmissionColour());
			 //1EReference
		}
		else if (string.equals("IfcTextStyleWithBoxCharacteristics_BoxHeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleWithBoxCharacteristics_BoxHeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleWithBoxCharacteristics_BoxWidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleWithBoxCharacteristics_BoxWidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleWithBoxCharacteristics_BoxSlantAngleAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleWithBoxCharacteristics_BoxSlantAngleAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleWithBoxCharacteristics_BoxRotateAngleAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleWithBoxCharacteristics_BoxRotateAngleAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleWithBoxCharacteristics_CharacterSpacing")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleWithBoxCharacteristics_CharacterSpacing());
			 //1EReference
		}
		else if (string.equals("IfcThermalMaterialProperties_SpecificHeatCapacityAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalMaterialProperties_SpecificHeatCapacityAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalMaterialProperties_FreezingPointAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalMaterialProperties_FreezingPointAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalMaterialProperties_ThermalConductivityAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalMaterialProperties_ThermalConductivityAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTimeSeriesReferenceRelationship_ReferencedTimeSeries")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeriesReferenceRelationship_ReferencedTimeSeries());
			 //1EReference
		}
		else if (string.equals("IfcTimeSeriesReferenceRelationship_TimeSeriesReferences")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeriesReferenceRelationship_TimeSeriesReferences());
			 //1EReference
		}
		else if (string.equals("IfcVirtualGridIntersection_OffsetDistancesAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcVirtualGridIntersection_OffsetDistancesAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWaterProperties_AlkalinityConcentrationAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties_AlkalinityConcentrationAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_TransomThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_TransomThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_MullionThicknessAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_MullionThicknessAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_FirstTransomOffsetAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_FirstTransomOffsetAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_SecondTransomOffsetAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_SecondTransomOffsetAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_FirstMullionOffsetAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_FirstMullionOffsetAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowLiningProperties_SecondMullionOffsetAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowLiningProperties_SecondMullionOffsetAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceCurveSweptAreaSolid")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceCurveSweptAreaSolid());
			 //1EClass
		}
		else if (string.equals("IfcSurfaceOfLinearExtrusion")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceOfLinearExtrusion());
			 //1EClass
		}
		else if (string.equals("IfcSurfaceOfLinearExtrusion_Depth")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceOfLinearExtrusion_Depth());
			 //1EAttribute
		}
		else if (string.equals("IfcSurfaceStyleWithTextures")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleWithTextures());
			 //1EClass
		}
		else if (string.equals("IfcSurfaceTexture_TextureType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceTexture_TextureType());
			 //1EAttribute
		}
		else if (string.equals("IfcSweptAreaSolid_SweptArea")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptAreaSolid_SweptArea());
			 //1EReference
		}
		else if (string.equals("IfcSweptAreaSolid_Position")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptAreaSolid_Position());
			 //1EReference
		}
		else if (string.equals("IfcSweptDiskSolid_Directrix")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptDiskSolid_Directrix());
			 //1EReference
		}
		else if (string.equals("IfcSweptDiskSolid_RadiusAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptDiskSolid_RadiusAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcSweptDiskSolid_InnerRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptDiskSolid_InnerRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcSweptDiskSolid_StartParam")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptDiskSolid_StartParam());
			 //1EAttribute
		}
		else if (string.equals("IfcSweptDiskSolid_EndParam")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptDiskSolid_EndParam());
			 //1EAttribute
		}
		else if (string.equals("IfcSweptSurface_SweptCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcSweptSurface_SweptCurve());
			 //1EReference
		}
		else if (string.equals("IfcSymbolStyle_StyleOfSymbol")) {
			resultList.add(((Ifc2x3Package) object).getIfcSymbolStyle_StyleOfSymbol());
			 //1EReference
		}
		else if (string.equals("IfcSystem_ServicesBuildings")) {
			resultList.add(((Ifc2x3Package) object).getIfcSystem_ServicesBuildings());
			 //1EReference
		}
		else if (string.equals("IfcSystemFurnitureElementType")) {
			resultList.add(((Ifc2x3Package) object).getIfcSystemFurnitureElementType());
			 //1EClass
		}
		else if (string.equals("IfcTShapeProfileDef_DepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_DepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_FlangeWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_FlangeWidth());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_WebThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_WebThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_FilletRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_FilletRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_WebEdgeRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_WebEdgeRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_WebSlope")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_WebSlope());
			 //1EAttribute
		}
		else if (string.equals("IfcTShapeProfileDef_FlangeSlope")) {
			resultList.add(((Ifc2x3Package) object).getIfcTShapeProfileDef_FlangeSlope());
			 //1EAttribute
		}
		else if (string.equals("IfcTankType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcTankType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcTelecomAddress_PagerNumber")) {
			resultList.add(((Ifc2x3Package) object).getIfcTelecomAddress_PagerNumber());
			 //1EAttribute
		}
		else if (string.equals("IfcTelecomAddress_WWWHomePageURL")) {
			resultList.add(((Ifc2x3Package) object).getIfcTelecomAddress_WWWHomePageURL());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_NominalDiameterAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_NominalDiameterAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_CrossSectionArea")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_CrossSectionArea());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_TensionForceAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_TensionForceAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_PreStressAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_PreStressAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_FrictionCoefficient")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_FrictionCoefficient());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_AnchorageSlipAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_AnchorageSlipAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcTendon_MinCurvatureRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendon_MinCurvatureRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcTextLiteralWithExtent_Extent")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextLiteralWithExtent_Extent());
			 //1EReference
		}
		else if (string.equals("IfcTextStyle_TextFontStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyle_TextFontStyle());
			 //1EReference
		}
		else if (string.equals("IfcTextStyleFontModel_FontFamily")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleFontModel_FontFamily());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleFontModel_FontStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleFontModel_FontStyle());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleFontModel_FontVariant")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleFontModel_FontVariant());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleFontModel_FontWeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleFontModel_FontWeight());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleFontModel_FontSize")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleFontModel_FontSize());
			 //1EReference
		}
		else if (string.equals("IfcTextStyleForDefinedFont")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleForDefinedFont());
			 //1EClass
		}
		else if (string.equals("IfcTextStyleForDefinedFont_Colour")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleForDefinedFont_Colour());
			 //1EReference
		}
		else if (string.equals("IfcTextStyleTextModel_TextIndent")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleTextModel_TextIndent());
			 //1EReference
		}
		else if (string.equals("IfcTextStyleTextModel_TextAlign")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleTextModel_TextAlign());
			 //1EAttribute
		}
		else if (string.equals("IfcTextStyleTextModel_WordSpacing")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleTextModel_WordSpacing());
			 //1EReference
		}
		else if (string.equals("IfcTextStyleTextModel_LineHeight")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextStyleTextModel_LineHeight());
			 //1EReference
		}
		else if (string.equals("IfcTextureCoordinateGenerator")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextureCoordinateGenerator());
			 //1EClass
		}
		else if (string.equals("IfcTextureVertex_Coordinates")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextureVertex_Coordinates());
			 //1EAttribute
		}
		else if (string.equals("IfcThermalMaterialProperties")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalMaterialProperties());
			 //1EClass
		}
		else if (string.equals("IfcTimeSeries_TimeSeriesDataType")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeries_TimeSeriesDataType());
			 //1EAttribute
		}
		else if (string.equals("IfcTimeSeries_DocumentedBy")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeries_DocumentedBy());
			 //1EReference
		}
		else if (string.equals("IfcTimeSeriesSchedule_TimeSeries")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeriesSchedule_TimeSeries());
			 //1EReference
		}
		else if (string.equals("IfcTimeSeriesValue_ListValues")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeriesValue_ListValues());
			 //1EReference
		}
		else if (string.equals("IfcTopologicalRepresentationItem")) {
			resultList.add(((Ifc2x3Package) object).getIfcTopologicalRepresentationItem());
			 //1EClass
		}
		else if (string.equals("IfcTransformerType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcTransformerType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcTransportElement_OperationType")) {
			resultList.add(((Ifc2x3Package) object).getIfcTransportElement_OperationType());
			 //1EAttribute
		}
		else if (string.equals("IfcTrapeziumProfileDef_BottomXDim")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrapeziumProfileDef_BottomXDim());
			 //1EAttribute
		}
		else if (string.equals("IfcTrapeziumProfileDef_TopXDim")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrapeziumProfileDef_TopXDim());
			 //1EAttribute
		}
		else if (string.equals("IfcTrapeziumProfileDef_YDim")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrapeziumProfileDef_YDim());
			 //1EAttribute
		}
		else if (string.equals("IfcTrapeziumProfileDef_TopXOffset")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrapeziumProfileDef_TopXOffset());
			 //1EAttribute
		}
		else if (string.equals("IfcTrimmedCurve_BasisCurve")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrimmedCurve_BasisCurve());
			 //1EReference
		}
		else if (string.equals("IfcTrimmedCurve_SenseAgreement")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrimmedCurve_SenseAgreement());
			 //1EAttribute
		}
		else if (string.equals("IfcTubeBundleType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcTubeBundleType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcTwoDirectionRepeatFactor")) {
			resultList.add(((Ifc2x3Package) object).getIfcTwoDirectionRepeatFactor());
			 //1EClass
		}
		else if (string.equals("IfcTypeObject_HasPropertySets")) {
			resultList.add(((Ifc2x3Package) object).getIfcTypeObject_HasPropertySets());
			 //1EReference
		}
		else if (string.equals("IfcTypeObject_ObjectTypeOf")) {
			resultList.add(((Ifc2x3Package) object).getIfcTypeObject_ObjectTypeOf());
			 //1EReference
		}
		else if (string.equals("IfcTypeProduct_RepresentationMaps")) {
			resultList.add(((Ifc2x3Package) object).getIfcTypeProduct_RepresentationMaps());
			 //1EReference
		}
		else if (string.equals("IfcUShapeProfileDef_DepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_DepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef_FlangeWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_FlangeWidth());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef_WebThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_WebThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef_FilletRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_FilletRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef_EdgeRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_EdgeRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcUShapeProfileDef_FlangeSlope")) {
			resultList.add(((Ifc2x3Package) object).getIfcUShapeProfileDef_FlangeSlope());
			 //1EAttribute
		}
		else if (string.equals("IfcValveType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcValveType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcVector_MagnitudeAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcVector_MagnitudeAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcVertexPoint_VertexGeometry")) {
			resultList.add(((Ifc2x3Package) object).getIfcVertexPoint_VertexGeometry());
			 //1EReference
		}
		else if (string.equals("IfcVirtualGridIntersection")) {
			resultList.add(((Ifc2x3Package) object).getIfcVirtualGridIntersection());
			 //1EClass
		}
		else if (string.equals("IfcWallType_PredefinedType")) {
			resultList.add(((Ifc2x3Package) object).getIfcWallType_PredefinedType());
			 //1EAttribute
		}
		else if (string.equals("IfcWaterProperties_IsPotable")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties_IsPotable());
			 //1EAttribute
		}
		else if (string.equals("IfcWaterProperties_Hardness")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties_Hardness());
			 //1EAttribute
		}
		else if (string.equals("IfcWaterProperties_PHLevel")) {
			resultList.add(((Ifc2x3Package) object).getIfcWaterProperties_PHLevel());
			 //1EAttribute
		}
		else if (string.equals("IfcWindow_OverallHeightAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindow_OverallHeightAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWindow_OverallWidthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindow_OverallWidthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowStyle_ConstructionType")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowStyle_ConstructionType());
			 //1EAttribute
		}
		else if (string.equals("IfcWindowStyle_OperationType")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowStyle_OperationType());
			 //1EAttribute
		}
		else if (string.equals("IfcWorkControl_CreationDate")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControl_CreationDate());
			 //1EReference
		}
		else if (string.equals("IfcWorkControl_DurationAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControl_DurationAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWorkControl_TotalFloatAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControl_TotalFloatAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcWorkControl_WorkControlType")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControl_WorkControlType());
			 //1EAttribute
		}
		else if (string.equals("IfcZShapeProfileDef_DepthAsString")) {
			resultList.add(((Ifc2x3Package) object).getIfcZShapeProfileDef_DepthAsString());
			 //1EAttribute
		}
		else if (string.equals("IfcZShapeProfileDef_FlangeWidth")) {
			resultList.add(((Ifc2x3Package) object).getIfcZShapeProfileDef_FlangeWidth());
			 //1EAttribute
		}
		else if (string.equals("IfcZShapeProfileDef_WebThickness")) {
			resultList.add(((Ifc2x3Package) object).getIfcZShapeProfileDef_WebThickness());
			 //1EAttribute
		}
		else if (string.equals("IfcZShapeProfileDef_FilletRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcZShapeProfileDef_FilletRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcZShapeProfileDef_EdgeRadius")) {
			resultList.add(((Ifc2x3Package) object).getIfcZShapeProfileDef_EdgeRadius());
			 //1EAttribute
		}
		else if (string.equals("IfcClassificationNotationSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcClassificationNotationSelect());
			 //1EClass
		}
		else if (string.equals("IfcConditionCriterionSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcConditionCriterionSelect());
			 //1EClass
		}
		else if (string.equals("IfcDraughtingCalloutElement")) {
			resultList.add(((Ifc2x3Package) object).getIfcDraughtingCalloutElement());
			 //1EClass
		}
		else if (string.equals("IfcFillAreaStyleTileShapeSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcFillAreaStyleTileShapeSelect());
			 //1EClass
		}
		else if (string.equals("IfcHatchLineDistanceSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcHatchLineDistanceSelect());
			 //1EClass
		}
		else if (string.equals("IfcPresentationStyleSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcPresentationStyleSelect());
			 //1EClass
		}
		else if (string.equals("IfcSpecularHighlightSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpecularHighlightSelect());
			 //1EClass
		}
		else if (string.equals("IfcSurfaceStyleElementSelect")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceStyleElementSelect());
			 //1EClass
		}
		else if (string.equals("IfcAirToAirHeatRecoveryTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcAirToAirHeatRecoveryTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcBuildingElementProxyTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcBuildingElementProxyTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcCableCarrierFittingTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcCableCarrierFittingTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcCableCarrierSegmentTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcCableCarrierSegmentTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcDocumentConfidentialityEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentConfidentialityEnum());
			 //1EEnum
		}
		else if (string.equals("IfcDoorStyleConstructionEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorStyleConstructionEnum());
			 //1EEnum
		}
		else if (string.equals("IfcElectricApplianceTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricApplianceTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcElectricGeneratorTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricGeneratorTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcElectricTimeControlTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricTimeControlTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcElementAssemblyTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementAssemblyTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcEvaporativeCoolerTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcEvaporativeCoolerTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcGeometricProjectionEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcGeometricProjectionEnum());
			 //1EEnum
		}
		else if (string.equals("IfcLightDistributionCurveEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightDistributionCurveEnum());
			 //1EEnum
		}
		else if (string.equals("IfcLightEmissionSourceEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightEmissionSourceEnum());
			 //1EEnum
		}
		else if (string.equals("IfcMotorConnectionTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcMotorConnectionTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcPermeableCoveringOperationEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcPermeableCoveringOperationEnum());
			 //1EEnum
		}
		else if (string.equals("IfcProjectOrderRecordTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcProjectOrderRecordTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcProjectedOrTrueLengthEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcProjectedOrTrueLengthEnum());
			 //1EEnum
		}
		else if (string.equals("IfcProtectiveDeviceTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcProtectiveDeviceTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcReinforcingBarSurfaceEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingBarSurfaceEnum());
			 //1EEnum
		}
		else if (string.equals("IfcResourceConsumptionEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcResourceConsumptionEnum());
			 //1EEnum
		}
		else if (string.equals("IfcSanitaryTerminalTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcSanitaryTerminalTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcServiceLifeFactorTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcServiceLifeFactorTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcStructuralCurveTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralCurveTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcStructuralSurfaceTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcStructuralSurfaceTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcSwitchingDeviceTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcSwitchingDeviceTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcTimeSeriesScheduleTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeriesScheduleTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcTransportElementTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcTransportElementTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcUnitaryEquipmentTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcUnitaryEquipmentTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcVibrationIsolatorTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcVibrationIsolatorTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcWindowPanelOperationEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowPanelOperationEnum());
			 //1EEnum
		}
		else if (string.equals("IfcWindowPanelPositionEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowPanelPositionEnum());
			 //1EEnum
		}
		else if (string.equals("IfcWindowStyleConstructionEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowStyleConstructionEnum());
			 //1EEnum
		}
		else if (string.equals("IfcWindowStyleOperationEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcWindowStyleOperationEnum());
			 //1EEnum
		}
		else if (string.equals("IfcAddressTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcAddressTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcAirTerminalBoxTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcAirTerminalBoxTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcAirTerminalTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcAirTerminalTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcAnalysisModelTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnalysisModelTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcAnalysisTheoryTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcAnalysisTheoryTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcArithmeticOperatorEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcArithmeticOperatorEnum());
			 //1EEnum
		}
		else if (string.equals("IfcAssemblyPlaceEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcAssemblyPlaceEnum());
			 //1EEnum
		}
		else if (string.equals("IfcBSplineCurveForm")) {
			resultList.add(((Ifc2x3Package) object).getIfcBSplineCurveForm());
			 //1EEnum
		}
		else if (string.equals("IfcBooleanOperator")) {
			resultList.add(((Ifc2x3Package) object).getIfcBooleanOperator());
			 //1EEnum
		}
		else if (string.equals("IfcCableSegmentTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcCableSegmentTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcChangeActionEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcChangeActionEnum());
			 //1EEnum
		}
		else if (string.equals("IfcChillerTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcChillerTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcCompressorTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcCompressorTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcCondenserTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcCondenserTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcConnectionTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcConnectionTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcControllerTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcControllerTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcCooledBeamTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcCooledBeamTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcCoolingTowerTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcCoolingTowerTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcCostScheduleTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcCostScheduleTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcCoveringTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcCoveringTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcCurtainWallTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurtainWallTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcDerivedUnitEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDerivedUnitEnum());
			 //1EEnum
		}
		else if (string.equals("IfcDimensionExtentUsage")) {
			resultList.add(((Ifc2x3Package) object).getIfcDimensionExtentUsage());
			 //1EEnum
		}
		else if (string.equals("IfcDirectionSenseEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDirectionSenseEnum());
			 //1EEnum
		}
		else if (string.equals("IfcDocumentStatusEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDocumentStatusEnum());
			 //1EEnum
		}
		else if (string.equals("IfcDoorPanelOperationEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorPanelOperationEnum());
			 //1EEnum
		}
		else if (string.equals("IfcDoorPanelPositionEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorPanelPositionEnum());
			 //1EEnum
		}
		else if (string.equals("IfcDoorStyleOperationEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDoorStyleOperationEnum());
			 //1EEnum
		}
		else if (string.equals("IfcDuctFittingTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDuctFittingTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcDuctSegmentTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDuctSegmentTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcDuctSilencerTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDuctSilencerTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcElectricCurrentEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricCurrentEnum());
			 //1EEnum
		}
		else if (string.equals("IfcElectricHeaterTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricHeaterTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcElectricMotorTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcElectricMotorTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcElementCompositionEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcElementCompositionEnum());
			 //1EEnum
		}
		else if (string.equals("IfcEnergySequenceEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcEnergySequenceEnum());
			 //1EEnum
		}
		else if (string.equals("IfcEvaporatorTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcEvaporatorTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcFlowDirectionEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowDirectionEnum());
			 //1EEnum
		}
		else if (string.equals("IfcFlowInstrumentTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowInstrumentTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcFlowMeterTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcFlowMeterTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcFootingTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcFootingTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcGasTerminalTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcGasTerminalTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcGlobalOrLocalEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcGlobalOrLocalEnum());
			 //1EEnum
		}
		else if (string.equals("IfcHeatExchangerTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcHeatExchangerTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcHumidifierTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcHumidifierTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcInternalOrExternalEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcInternalOrExternalEnum());
			 //1EEnum
		}
		else if (string.equals("IfcInventoryTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcInventoryTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcJunctionBoxTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcJunctionBoxTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcLayerSetDirectionEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcLayerSetDirectionEnum());
			 //1EEnum
		}
		else if (string.equals("IfcLightFixtureTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcLightFixtureTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcLoadGroupTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcLoadGroupTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcLogicalOperatorEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcLogicalOperatorEnum());
			 //1EEnum
		}
		else if (string.equals("IfcOccupantTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcOccupantTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcPhysicalOrVirtualEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcPhysicalOrVirtualEnum());
			 //1EEnum
		}
		else if (string.equals("IfcPileConstructionEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcPileConstructionEnum());
			 //1EEnum
		}
		else if (string.equals("IfcPipeFittingTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcPipeFittingTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcPipeSegmentTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcPipeSegmentTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcProcedureTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcProcedureTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcProfileTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcProfileTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcProjectOrderTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcProjectOrderTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcPropertySourceEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcPropertySourceEnum());
			 //1EEnum
		}
		else if (string.equals("IfcRailingTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcRailingTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcRampFlightTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcRampFlightTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcReflectanceMethodEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcReflectanceMethodEnum());
			 //1EEnum
		}
		else if (string.equals("IfcReinforcingBarRoleEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcReinforcingBarRoleEnum());
			 //1EEnum
		}
		else if (string.equals("IfcRibPlateDirectionEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcRibPlateDirectionEnum());
			 //1EEnum
		}
		else if (string.equals("IfcSectionTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcSectionTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcServiceLifeTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcServiceLifeTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcSpaceHeaterTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceHeaterTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcStackTerminalTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcStackTerminalTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcStairFlightTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcStairFlightTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcSurfaceTextureEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceTextureEnum());
			 //1EEnum
		}
		else if (string.equals("IfcThermalLoadSourceEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalLoadSourceEnum());
			 //1EEnum
		}
		else if (string.equals("IfcThermalLoadTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcThermalLoadTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcTimeSeriesDataTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcTimeSeriesDataTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcTransformerTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcTransformerTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcTrimmingPreference")) {
			resultList.add(((Ifc2x3Package) object).getIfcTrimmingPreference());
			 //1EEnum
		}
		else if (string.equals("IfcTubeBundleTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcTubeBundleTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcWasteTerminalTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcWasteTerminalTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcWorkControlTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcWorkControlTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcBeamTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcBeamTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcBenchmarkEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcBenchmarkEnum());
			 //1EEnum
		}
		else if (string.equals("IfcBoilerTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcBoilerTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcCoilTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcCoilTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcColumnTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcColumnTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcConstraintEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcConstraintEnum());
			 //1EEnum
		}
		else if (string.equals("IfcCurrencyEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcCurrencyEnum());
			 //1EEnum
		}
		else if (string.equals("IfcDamperTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDamperTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcDataOriginEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcDataOriginEnum());
			 //1EEnum
		}
		else if (string.equals("IfcFanTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcFanTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcFilterTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcFilterTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcLampTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcLampTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcMemberTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcMemberTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcNullStyle")) {
			resultList.add(((Ifc2x3Package) object).getIfcNullStyle());
			 //1EEnum
		}
		else if (string.equals("IfcObjectTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjectTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcObjectiveEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcObjectiveEnum());
			 //1EEnum
		}
		else if (string.equals("IfcOutletTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcOutletTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcPileTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcPileTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcPlateTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcPlateTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcPumpTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcPumpTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcRampTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcRampTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcRoleEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoleEnum());
			 //1EEnum
		}
		else if (string.equals("IfcRoofTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcRoofTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcSIPrefix")) {
			resultList.add(((Ifc2x3Package) object).getIfcSIPrefix());
			 //1EEnum
		}
		else if (string.equals("IfcSIUnitName")) {
			resultList.add(((Ifc2x3Package) object).getIfcSIUnitName());
			 //1EEnum
		}
		else if (string.equals("IfcSensorTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcSensorTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcSequenceEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcSequenceEnum());
			 //1EEnum
		}
		else if (string.equals("IfcSlabTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcSlabTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcSoundScaleEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcSoundScaleEnum());
			 //1EEnum
		}
		else if (string.equals("IfcSpaceTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcSpaceTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcStairTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcStairTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcStateEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcStateEnum());
			 //1EEnum
		}
		else if (string.equals("IfcSurfaceSide")) {
			resultList.add(((Ifc2x3Package) object).getIfcSurfaceSide());
			 //1EEnum
		}
		else if (string.equals("IfcTankTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcTankTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcTendonTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcTendonTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcTextPath")) {
			resultList.add(((Ifc2x3Package) object).getIfcTextPath());
			 //1EEnum
		}
		else if (string.equals("IfcTransitionCode")) {
			resultList.add(((Ifc2x3Package) object).getIfcTransitionCode());
			 //1EEnum
		}
		else if (string.equals("IfcUnitEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcUnitEnum());
			 //1EEnum
		}
		else if (string.equals("IfcValveTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcValveTypeEnum());
			 //1EEnum
		}
		else if (string.equals("IfcWallTypeEnum")) {
			resultList.add(((Ifc2x3Package) object).getIfcWallTypeEnum());
			 //1EEnum
		}
		else if (string.equals("Ifc2x3Factory")) {
			resultList.add(((Ifc2x3Package) object).getIfc2x3Factory());
			 //1Ifc2x3Factory
		}
		return resultList;
	}
}
