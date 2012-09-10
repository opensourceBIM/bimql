package nl.wietmazairac.bimql.get.property;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.IfcModel;
import org.bimserver.models.ifc2x3tc1.*;
import org.bimserver.models.ifc2x3tc1.impl.Ifc2x3tc1PackageImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcAbsorbedDoseMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcAccelerationMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcAmountOfSubstanceMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcAngularVelocityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcAreaMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcBooleanImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcContextDependentMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcCountMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcCurvatureMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcDescriptiveMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcDoseEquivalentMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcDynamicViscosityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcElectricCapacitanceMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcElectricChargeMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcElectricConductanceMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcElectricCurrentMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcElectricResistanceMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcElectricVoltageMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcEnergyMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcForceMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcFrequencyMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcGloballyUniqueIdImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcHeatFluxDensityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcHeatingValueMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcIdentifierImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcIlluminanceMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcInductanceMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcIntegerCountRateMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcIntegerImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcIonConcentrationMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcIsothermalMoistureCapacityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcKinematicViscosityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcLabelImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcLengthMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcLinearForceMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcLinearMomentMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcLinearStiffnessMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcLinearVelocityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcLogicalImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcLuminousFluxMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcLuminousIntensityDistributionMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcLuminousIntensityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcMagneticFluxDensityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcMagneticFluxMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcMassDensityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcMassFlowRateMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcMassMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcMassPerLengthMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcModulusOfElasticityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcModulusOfLinearSubgradeReactionMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcModulusOfRotationalSubgradeReactionMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcModulusOfSubgradeReactionMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcMoistureDiffusivityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcMolecularWeightMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcMomentOfInertiaMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcMonetaryMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcNumericMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcPHMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcParameterValueImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcPlanarForceMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcPlaneAngleMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcPowerMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcPressureMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcRadioActivityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcRatioMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcRealImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcRotationalFrequencyMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcRotationalMassMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcRotationalStiffnessMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcSectionModulusMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcSectionalAreaIntegralMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcShearModulusMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcSolidAngleMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcSoundPowerMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcSoundPressureMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcSpecificHeatCapacityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcSpecularExponentImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcSpecularRoughnessImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcTemperatureGradientMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcTextImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcThermalAdmittanceMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcThermalConductivityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcThermalExpansionCoefficientMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcThermalResistanceMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcThermalTransmittanceMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcThermodynamicTemperatureMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcTimeMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcTimeStampImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcTorqueMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcVaporPermeabilityMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcVolumeMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcVolumetricFlowRateMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcWarpingConstantMeasureImpl;
import org.bimserver.models.ifc2x3tc1.impl.IfcWarpingMomentMeasureImpl;
import org.eclipse.emf.ecore.EObject;

public class GetPropertyMain {
	// fields
	private IfcModel ifcModel;
	private List<Object> objectList;
	private List<IfcRoot> ifcRootList;
	private String string;

	// constructors
	public GetPropertyMain(IfcModel ifcModel, String string) {
		this.ifcModel = ifcModel;
		this.ifcRootList = ifcModel.getAllWithSubTypes(IfcRoot.class);
		for (IfcRoot ifcRoot : ifcRootList) {
			this.objectList.add(ifcRoot);
		}
		this.string = string;
	}

	public GetPropertyMain(List<Object> objectList, String string) {
		this.objectList = objectList;
		this.string = string;
	}

	// methods
	public IfcModel getIfcModel() {
		return ifcModel;
	}

	public void setIfcModel(IfcModel ifcModel) {
		this.ifcModel = ifcModel;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public List<List<Object>> getResult() {
		List<List<Object>> arrayListArrayList = new ArrayList<List<Object>>();
		for (Object object : objectList) {
			ArrayList<Object> objectArrayList = new ArrayList<Object>();
			if (object instanceof IfcObject) {
				List<IfcRelDefines> ifcRelDefinesList = new ArrayList<IfcRelDefines>(((IfcObject) object).getIsDefinedBy());
				for (IfcRelDefines ifcRelDefines : ifcRelDefinesList) {
					if (ifcRelDefines.eClass().getName().equals("IfcRelDefinesByProperties")) {
						IfcPropertySetDefinition ifcPropertySetDefinition = ((IfcRelDefinesByProperties) ifcRelDefines).getRelatingPropertyDefinition();
						if (ifcPropertySetDefinition.eClass().getName().equals("IfcPropertySet")) {
							List<IfcProperty> ifcPropertyList = new ArrayList<IfcProperty>(((IfcPropertySet) ifcPropertySetDefinition).getHasProperties());
							for (IfcProperty ifcProperty : ifcPropertyList) {
								if (ifcProperty.getName().equals(string)) {
									if (ifcProperty.getClass().getSimpleName().equals("IfcPropertySingleValueImpl")) {
										if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("Ifc2x3tc1Package")) {
											objectArrayList.add(((Ifc2x3tc1Package) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcAbsorbedDoseMeasure")) {
											objectArrayList.add(((IfcAbsorbedDoseMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcAccelerationMeasure")) {
											objectArrayList.add(((IfcAccelerationMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcAmountOfSubstanceMeasure")) {
											objectArrayList.add(((IfcAmountOfSubstanceMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcAngularVelocityMeasure")) {
											objectArrayList.add(((IfcAngularVelocityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcAreaMeasure")) {
											objectArrayList.add(((IfcAreaMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcBoolean")) {
											objectArrayList.add(((IfcBoolean) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcContextDependentMeasure")) {
											objectArrayList.add(((IfcContextDependentMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcCountMeasure")) {
											objectArrayList.add(((IfcCountMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcCurvatureMeasure")) {
											objectArrayList.add(((IfcCurvatureMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcDescriptiveMeasure")) {
											objectArrayList.add(((IfcDescriptiveMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcDoseEquivalentMeasure")) {
											objectArrayList.add(((IfcDoseEquivalentMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcDynamicViscosityMeasure")) {
											objectArrayList.add(((IfcDynamicViscosityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricCapacitanceMeasure")) {
											objectArrayList.add(((IfcElectricCapacitanceMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricChargeMeasure")) {
											objectArrayList.add(((IfcElectricChargeMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricConductanceMeasure")) {
											objectArrayList.add(((IfcElectricConductanceMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricCurrentMeasure")) {
											objectArrayList.add(((IfcElectricCurrentMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricResistanceMeasure")) {
											objectArrayList.add(((IfcElectricResistanceMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricVoltageMeasure")) {
											objectArrayList.add(((IfcElectricVoltageMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcEnergyMeasure")) {
											objectArrayList.add(((IfcEnergyMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcForceMeasure")) {
											objectArrayList.add(((IfcForceMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcFrequencyMeasure")) {
											objectArrayList.add(((IfcFrequencyMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcGloballyUniqueId")) {
											objectArrayList.add(((IfcGloballyUniqueId) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcHeatFluxDensityMeasure")) {
											objectArrayList.add(((IfcHeatFluxDensityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcHeatingValueMeasure")) {
											objectArrayList.add(((IfcHeatingValueMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcIdentifier")) {
											objectArrayList.add(((IfcIdentifier) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcIlluminanceMeasure")) {
											objectArrayList.add(((IfcIlluminanceMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcInductanceMeasure")) {
											objectArrayList.add(((IfcInductanceMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcInteger")) {
											objectArrayList.add(((IfcInteger) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcIntegerCountRateMeasure")) {
											objectArrayList.add(((IfcIntegerCountRateMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcIonConcentrationMeasure")) {
											objectArrayList.add(((IfcIonConcentrationMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcIsothermalMoistureCapacityMeasure")) {
											objectArrayList.add(((IfcIsothermalMoistureCapacityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcKinematicViscosityMeasure")) {
											objectArrayList.add(((IfcKinematicViscosityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLabel")) {
											objectArrayList.add(((IfcLabel) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLengthMeasure")) {
											objectArrayList.add(((IfcLengthMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearForceMeasure")) {
											objectArrayList.add(((IfcLinearForceMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearMomentMeasure")) {
											objectArrayList.add(((IfcLinearMomentMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearStiffnessMeasure")) {
											objectArrayList.add(((IfcLinearStiffnessMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearVelocityMeasure")) {
											objectArrayList.add(((IfcLinearVelocityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLogical")) {
											objectArrayList.add(((IfcLogical) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLuminousFluxMeasure")) {
											objectArrayList.add(((IfcLuminousFluxMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLuminousIntensityDistributionMeasure")) {
											objectArrayList.add(((IfcLuminousIntensityDistributionMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLuminousIntensityMeasure")) {
											objectArrayList.add(((IfcLuminousIntensityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMagneticFluxDensityMeasure")) {
											objectArrayList.add(((IfcMagneticFluxDensityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMagneticFluxMeasure")) {
											objectArrayList.add(((IfcMagneticFluxMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassDensityMeasure")) {
											objectArrayList.add(((IfcMassDensityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassFlowRateMeasure")) {
											objectArrayList.add(((IfcMassFlowRateMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassMeasure")) {
											objectArrayList.add(((IfcMassMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassPerLengthMeasure")) {
											objectArrayList.add(((IfcMassPerLengthMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfElasticityMeasure")) {
											objectArrayList.add(((IfcModulusOfElasticityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfLinearSubgradeReactionMeasure")) {
											objectArrayList.add(((IfcModulusOfLinearSubgradeReactionMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfRotationalSubgradeReactionMeasure")) {
											objectArrayList.add(((IfcModulusOfRotationalSubgradeReactionMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfSubgradeReactionMeasure")) {
											objectArrayList.add(((IfcModulusOfSubgradeReactionMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMoistureDiffusivityMeasure")) {
											objectArrayList.add(((IfcMoistureDiffusivityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMolecularWeightMeasure")) {
											objectArrayList.add(((IfcMolecularWeightMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMomentOfInertiaMeasure")) {
											objectArrayList.add(((IfcMomentOfInertiaMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMonetaryMeasure")) {
											objectArrayList.add(((IfcMonetaryMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcNumericMeasure")) {
											objectArrayList.add(((IfcNumericMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcPHMeasure")) {
											objectArrayList.add(((IfcPHMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcParameterValue")) {
											objectArrayList.add(((IfcParameterValue) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcPlanarForceMeasure")) {
											objectArrayList.add(((IfcPlanarForceMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcPlaneAngleMeasure")) {
											objectArrayList.add(((IfcPlaneAngleMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcPowerMeasure")) {
											objectArrayList.add(((IfcPowerMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcPressureMeasure")) {
											objectArrayList.add(((IfcPressureMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcRadioActivityMeasure")) {
											objectArrayList.add(((IfcRadioActivityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcRatioMeasure")) {
											objectArrayList.add(((IfcRatioMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcReal")) {
											objectArrayList.add(((IfcReal) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcRotationalFrequencyMeasure")) {
											objectArrayList.add(((IfcRotationalFrequencyMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcRotationalMassMeasure")) {
											objectArrayList.add(((IfcRotationalMassMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcRotationalStiffnessMeasure")) {
											objectArrayList.add(((IfcRotationalStiffnessMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSectionModulusMeasure")) {
											objectArrayList.add(((IfcSectionModulusMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSectionalAreaIntegralMeasure")) {
											objectArrayList.add(((IfcSectionalAreaIntegralMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcShearModulusMeasure")) {
											objectArrayList.add(((IfcShearModulusMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSolidAngleMeasure")) {
											objectArrayList.add(((IfcSolidAngleMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSoundPowerMeasure")) {
											objectArrayList.add(((IfcSoundPowerMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSoundPressureMeasure")) {
											objectArrayList.add(((IfcSoundPressureMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSpecificHeatCapacityMeasure")) {
											objectArrayList.add(((IfcSpecificHeatCapacityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSpecularExponent")) {
											objectArrayList.add(((IfcSpecularExponent) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSpecularRoughness")) {
											objectArrayList.add(((IfcSpecularRoughness) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcTemperatureGradientMeasure")) {
											objectArrayList.add(((IfcTemperatureGradientMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcText")) {
											objectArrayList.add(((IfcText) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalAdmittanceMeasure")) {
											objectArrayList.add(((IfcThermalAdmittanceMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalConductivityMeasure")) {
											objectArrayList.add(((IfcThermalConductivityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalExpansionCoefficientMeasure")) {
											objectArrayList.add(((IfcThermalExpansionCoefficientMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalResistanceMeasure")) {
											objectArrayList.add(((IfcThermalResistanceMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalTransmittanceMeasure")) {
											objectArrayList.add(((IfcThermalTransmittanceMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermodynamicTemperatureMeasure")) {
											objectArrayList.add(((IfcThermodynamicTemperatureMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcTimeMeasure")) {
											objectArrayList.add(((IfcTimeMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcTimeStamp")) {
											objectArrayList.add(((IfcTimeStamp) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcTorqueMeasure")) {
											objectArrayList.add(((IfcTorqueMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcVaporPermeabilityMeasure")) {
											objectArrayList.add(((IfcVaporPermeabilityMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcVolumeMeasure")) {
											objectArrayList.add(((IfcVolumeMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcVolumetricFlowRateMeasure")) {
											objectArrayList.add(((IfcVolumetricFlowRateMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcWarpingConstantMeasure")) {
											objectArrayList.add(((IfcWarpingConstantMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcWarpingMomentMeasure")) {
											objectArrayList.add(((IfcWarpingMomentMeasure) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("Ifc2x3tc1PackageImpl")) {
											objectArrayList.add(((Ifc2x3tc1PackageImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcAbsorbedDoseMeasureImpl")) {
											objectArrayList.add(((IfcAbsorbedDoseMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcAccelerationMeasureImpl")) {
											objectArrayList.add(((IfcAccelerationMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcAmountOfSubstanceMeasureImpl")) {
											objectArrayList.add(((IfcAmountOfSubstanceMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcAngularVelocityMeasureImpl")) {
											objectArrayList.add(((IfcAngularVelocityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcAreaMeasureImpl")) {
											objectArrayList.add(((IfcAreaMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcBooleanImpl")) {
											objectArrayList.add(((IfcBooleanImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcContextDependentMeasureImpl")) {
											objectArrayList.add(((IfcContextDependentMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcCountMeasureImpl")) {
											objectArrayList.add(((IfcCountMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcCurvatureMeasureImpl")) {
											objectArrayList.add(((IfcCurvatureMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcDescriptiveMeasureImpl")) {
											objectArrayList.add(((IfcDescriptiveMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcDoseEquivalentMeasureImpl")) {
											objectArrayList.add(((IfcDoseEquivalentMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcDynamicViscosityMeasureImpl")) {
											objectArrayList.add(((IfcDynamicViscosityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricCapacitanceMeasureImpl")) {
											objectArrayList.add(((IfcElectricCapacitanceMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricChargeMeasureImpl")) {
											objectArrayList.add(((IfcElectricChargeMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricConductanceMeasureImpl")) {
											objectArrayList.add(((IfcElectricConductanceMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricCurrentMeasureImpl")) {
											objectArrayList.add(((IfcElectricCurrentMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricResistanceMeasureImpl")) {
											objectArrayList.add(((IfcElectricResistanceMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricVoltageMeasureImpl")) {
											objectArrayList.add(((IfcElectricVoltageMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcEnergyMeasureImpl")) {
											objectArrayList.add(((IfcEnergyMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcForceMeasureImpl")) {
											objectArrayList.add(((IfcForceMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcFrequencyMeasureImpl")) {
											objectArrayList.add(((IfcFrequencyMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcGloballyUniqueIdImpl")) {
											objectArrayList.add(((IfcGloballyUniqueIdImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcHeatFluxDensityMeasureImpl")) {
											objectArrayList.add(((IfcHeatFluxDensityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcHeatingValueMeasureImpl")) {
											objectArrayList.add(((IfcHeatingValueMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcIdentifierImpl")) {
											objectArrayList.add(((IfcIdentifierImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcIlluminanceMeasureImpl")) {
											objectArrayList.add(((IfcIlluminanceMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcInductanceMeasureImpl")) {
											objectArrayList.add(((IfcInductanceMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcIntegerCountRateMeasureImpl")) {
											objectArrayList.add(((IfcIntegerCountRateMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcIntegerImpl")) {
											objectArrayList.add(((IfcIntegerImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcIonConcentrationMeasureImpl")) {
											objectArrayList.add(((IfcIonConcentrationMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcIsothermalMoistureCapacityMeasureImpl")) {
											objectArrayList.add(((IfcIsothermalMoistureCapacityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcKinematicViscosityMeasureImpl")) {
											objectArrayList.add(((IfcKinematicViscosityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLabelImpl")) {
											objectArrayList.add(((IfcLabelImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLengthMeasureImpl")) {
											objectArrayList.add(((IfcLengthMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearForceMeasureImpl")) {
											objectArrayList.add(((IfcLinearForceMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearMomentMeasureImpl")) {
											objectArrayList.add(((IfcLinearMomentMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearStiffnessMeasureImpl")) {
											objectArrayList.add(((IfcLinearStiffnessMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearVelocityMeasureImpl")) {
											objectArrayList.add(((IfcLinearVelocityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLogicalImpl")) {
											objectArrayList.add(((IfcLogicalImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLuminousFluxMeasureImpl")) {
											objectArrayList.add(((IfcLuminousFluxMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLuminousIntensityDistributionMeasureImpl")) {
											objectArrayList.add(((IfcLuminousIntensityDistributionMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcLuminousIntensityMeasureImpl")) {
											objectArrayList.add(((IfcLuminousIntensityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMagneticFluxDensityMeasureImpl")) {
											objectArrayList.add(((IfcMagneticFluxDensityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMagneticFluxMeasureImpl")) {
											objectArrayList.add(((IfcMagneticFluxMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassDensityMeasureImpl")) {
											objectArrayList.add(((IfcMassDensityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassFlowRateMeasureImpl")) {
											objectArrayList.add(((IfcMassFlowRateMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassMeasureImpl")) {
											objectArrayList.add(((IfcMassMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassPerLengthMeasureImpl")) {
											objectArrayList.add(((IfcMassPerLengthMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfElasticityMeasureImpl")) {
											objectArrayList.add(((IfcModulusOfElasticityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfLinearSubgradeReactionMeasureImpl")) {
											objectArrayList.add(((IfcModulusOfLinearSubgradeReactionMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfRotationalSubgradeReactionMeasureImpl")) {
											objectArrayList.add(((IfcModulusOfRotationalSubgradeReactionMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfSubgradeReactionMeasureImpl")) {
											objectArrayList.add(((IfcModulusOfSubgradeReactionMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMoistureDiffusivityMeasureImpl")) {
											objectArrayList.add(((IfcMoistureDiffusivityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMolecularWeightMeasureImpl")) {
											objectArrayList.add(((IfcMolecularWeightMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMomentOfInertiaMeasureImpl")) {
											objectArrayList.add(((IfcMomentOfInertiaMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcMonetaryMeasureImpl")) {
											objectArrayList.add(((IfcMonetaryMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcNumericMeasureImpl")) {
											objectArrayList.add(((IfcNumericMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcPHMeasureImpl")) {
											objectArrayList.add(((IfcPHMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcParameterValueImpl")) {
											objectArrayList.add(((IfcParameterValueImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcPlanarForceMeasureImpl")) {
											objectArrayList.add(((IfcPlanarForceMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcPlaneAngleMeasureImpl")) {
											objectArrayList.add(((IfcPlaneAngleMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcPowerMeasureImpl")) {
											objectArrayList.add(((IfcPowerMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcPressureMeasureImpl")) {
											objectArrayList.add(((IfcPressureMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcRadioActivityMeasureImpl")) {
											objectArrayList.add(((IfcRadioActivityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcRatioMeasureImpl")) {
											objectArrayList.add(((IfcRatioMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcRealImpl")) {
											objectArrayList.add(((IfcRealImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcRotationalFrequencyMeasureImpl")) {
											objectArrayList.add(((IfcRotationalFrequencyMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcRotationalMassMeasureImpl")) {
											objectArrayList.add(((IfcRotationalMassMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcRotationalStiffnessMeasureImpl")) {
											objectArrayList.add(((IfcRotationalStiffnessMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSectionModulusMeasureImpl")) {
											objectArrayList.add(((IfcSectionModulusMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSectionalAreaIntegralMeasureImpl")) {
											objectArrayList.add(((IfcSectionalAreaIntegralMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcShearModulusMeasureImpl")) {
											objectArrayList.add(((IfcShearModulusMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSolidAngleMeasureImpl")) {
											objectArrayList.add(((IfcSolidAngleMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSoundPowerMeasureImpl")) {
											objectArrayList.add(((IfcSoundPowerMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSoundPressureMeasureImpl")) {
											objectArrayList.add(((IfcSoundPressureMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSpecificHeatCapacityMeasureImpl")) {
											objectArrayList.add(((IfcSpecificHeatCapacityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSpecularExponentImpl")) {
											objectArrayList.add(((IfcSpecularExponentImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcSpecularRoughnessImpl")) {
											objectArrayList.add(((IfcSpecularRoughnessImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcTemperatureGradientMeasureImpl")) {
											objectArrayList.add(((IfcTemperatureGradientMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcTextImpl")) {
											objectArrayList.add(((IfcTextImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalAdmittanceMeasureImpl")) {
											objectArrayList.add(((IfcThermalAdmittanceMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalConductivityMeasureImpl")) {
											objectArrayList.add(((IfcThermalConductivityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalExpansionCoefficientMeasureImpl")) {
											objectArrayList.add(((IfcThermalExpansionCoefficientMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalResistanceMeasureImpl")) {
											objectArrayList.add(((IfcThermalResistanceMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalTransmittanceMeasureImpl")) {
											objectArrayList.add(((IfcThermalTransmittanceMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermodynamicTemperatureMeasureImpl")) {
											objectArrayList.add(((IfcThermodynamicTemperatureMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcTimeMeasureImpl")) {
											objectArrayList.add(((IfcTimeMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcTimeStampImpl")) {
											objectArrayList.add(((IfcTimeStampImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcTorqueMeasureImpl")) {
											objectArrayList.add(((IfcTorqueMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcVaporPermeabilityMeasureImpl")) {
											objectArrayList.add(((IfcVaporPermeabilityMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcVolumeMeasureImpl")) {
											objectArrayList.add(((IfcVolumeMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcVolumetricFlowRateMeasureImpl")) {
											objectArrayList.add(((IfcVolumetricFlowRateMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcWarpingConstantMeasureImpl")) {
											objectArrayList.add(((IfcWarpingConstantMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else if (((IfcPropertySingleValue) ifcProperty).getNominalValue().getClass().getSimpleName().equals("IfcWarpingMomentMeasureImpl")) {
											objectArrayList.add(((IfcWarpingMomentMeasureImpl) ((IfcPropertySingleValue) ifcProperty).getNominalValue()).getWrappedValue());
										}
										else {
											System.out.println("XXXXXXXX");
										}
									}
									else if (ifcProperty.getClass().getSimpleName().equals("IfcComplexPropertyImpl")) {
										List<IfcProperty> ifcComplexPropertyList = new ArrayList<IfcProperty>(((IfcComplexProperty) ifcProperty).getHasProperties());
										for (IfcProperty ifcComplexProperty : ifcComplexPropertyList) {
											if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("Ifc2x3tc1Package")) {
												objectArrayList.add(((Ifc2x3tc1Package) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcAbsorbedDoseMeasure")) {
												objectArrayList.add(((IfcAbsorbedDoseMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcAccelerationMeasure")) {
												objectArrayList.add(((IfcAccelerationMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcAmountOfSubstanceMeasure")) {
												objectArrayList.add(((IfcAmountOfSubstanceMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcAngularVelocityMeasure")) {
												objectArrayList.add(((IfcAngularVelocityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcAreaMeasure")) {
												objectArrayList.add(((IfcAreaMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcBoolean")) {
												objectArrayList.add(((IfcBoolean) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcContextDependentMeasure")) {
												objectArrayList.add(((IfcContextDependentMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcCountMeasure")) {
												objectArrayList.add(((IfcCountMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcCurvatureMeasure")) {
												objectArrayList.add(((IfcCurvatureMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcDescriptiveMeasure")) {
												objectArrayList.add(((IfcDescriptiveMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcDoseEquivalentMeasure")) {
												objectArrayList.add(((IfcDoseEquivalentMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcDynamicViscosityMeasure")) {
												objectArrayList.add(((IfcDynamicViscosityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricCapacitanceMeasure")) {
												objectArrayList.add(((IfcElectricCapacitanceMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricChargeMeasure")) {
												objectArrayList.add(((IfcElectricChargeMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricConductanceMeasure")) {
												objectArrayList.add(((IfcElectricConductanceMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricCurrentMeasure")) {
												objectArrayList.add(((IfcElectricCurrentMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricResistanceMeasure")) {
												objectArrayList.add(((IfcElectricResistanceMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricVoltageMeasure")) {
												objectArrayList.add(((IfcElectricVoltageMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcEnergyMeasure")) {
												objectArrayList.add(((IfcEnergyMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcForceMeasure")) {
												objectArrayList.add(((IfcForceMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcFrequencyMeasure")) {
												objectArrayList.add(((IfcFrequencyMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcGloballyUniqueId")) {
												objectArrayList.add(((IfcGloballyUniqueId) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcHeatFluxDensityMeasure")) {
												objectArrayList.add(((IfcHeatFluxDensityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcHeatingValueMeasure")) {
												objectArrayList.add(((IfcHeatingValueMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcIdentifier")) {
												objectArrayList.add(((IfcIdentifier) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcIlluminanceMeasure")) {
												objectArrayList.add(((IfcIlluminanceMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcInductanceMeasure")) {
												objectArrayList.add(((IfcInductanceMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcInteger")) {
												objectArrayList.add(((IfcInteger) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcIntegerCountRateMeasure")) {
												objectArrayList.add(((IfcIntegerCountRateMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcIonConcentrationMeasure")) {
												objectArrayList.add(((IfcIonConcentrationMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcIsothermalMoistureCapacityMeasure")) {
												objectArrayList.add(((IfcIsothermalMoistureCapacityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcKinematicViscosityMeasure")) {
												objectArrayList.add(((IfcKinematicViscosityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLabel")) {
												objectArrayList.add(((IfcLabel) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLengthMeasure")) {
												objectArrayList.add(((IfcLengthMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearForceMeasure")) {
												objectArrayList.add(((IfcLinearForceMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearMomentMeasure")) {
												objectArrayList.add(((IfcLinearMomentMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearStiffnessMeasure")) {
												objectArrayList.add(((IfcLinearStiffnessMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearVelocityMeasure")) {
												objectArrayList.add(((IfcLinearVelocityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLogical")) {
												objectArrayList.add(((IfcLogical) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLuminousFluxMeasure")) {
												objectArrayList.add(((IfcLuminousFluxMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLuminousIntensityDistributionMeasure")) {
												objectArrayList.add(((IfcLuminousIntensityDistributionMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLuminousIntensityMeasure")) {
												objectArrayList.add(((IfcLuminousIntensityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMagneticFluxDensityMeasure")) {
												objectArrayList.add(((IfcMagneticFluxDensityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMagneticFluxMeasure")) {
												objectArrayList.add(((IfcMagneticFluxMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassDensityMeasure")) {
												objectArrayList.add(((IfcMassDensityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassFlowRateMeasure")) {
												objectArrayList.add(((IfcMassFlowRateMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassMeasure")) {
												objectArrayList.add(((IfcMassMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassPerLengthMeasure")) {
												objectArrayList.add(((IfcMassPerLengthMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfElasticityMeasure")) {
												objectArrayList.add(((IfcModulusOfElasticityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfLinearSubgradeReactionMeasure")) {
												objectArrayList.add(((IfcModulusOfLinearSubgradeReactionMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfRotationalSubgradeReactionMeasure")) {
												objectArrayList.add(((IfcModulusOfRotationalSubgradeReactionMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfSubgradeReactionMeasure")) {
												objectArrayList.add(((IfcModulusOfSubgradeReactionMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMoistureDiffusivityMeasure")) {
												objectArrayList.add(((IfcMoistureDiffusivityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMolecularWeightMeasure")) {
												objectArrayList.add(((IfcMolecularWeightMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMomentOfInertiaMeasure")) {
												objectArrayList.add(((IfcMomentOfInertiaMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMonetaryMeasure")) {
												objectArrayList.add(((IfcMonetaryMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcNumericMeasure")) {
												objectArrayList.add(((IfcNumericMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcPHMeasure")) {
												objectArrayList.add(((IfcPHMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcParameterValue")) {
												objectArrayList.add(((IfcParameterValue) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcPlanarForceMeasure")) {
												objectArrayList.add(((IfcPlanarForceMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcPlaneAngleMeasure")) {
												objectArrayList.add(((IfcPlaneAngleMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcPowerMeasure")) {
												objectArrayList.add(((IfcPowerMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcPressureMeasure")) {
												objectArrayList.add(((IfcPressureMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcRadioActivityMeasure")) {
												objectArrayList.add(((IfcRadioActivityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcRatioMeasure")) {
												objectArrayList.add(((IfcRatioMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcReal")) {
												objectArrayList.add(((IfcReal) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcRotationalFrequencyMeasure")) {
												objectArrayList.add(((IfcRotationalFrequencyMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcRotationalMassMeasure")) {
												objectArrayList.add(((IfcRotationalMassMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcRotationalStiffnessMeasure")) {
												objectArrayList.add(((IfcRotationalStiffnessMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSectionModulusMeasure")) {
												objectArrayList.add(((IfcSectionModulusMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSectionalAreaIntegralMeasure")) {
												objectArrayList.add(((IfcSectionalAreaIntegralMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcShearModulusMeasure")) {
												objectArrayList.add(((IfcShearModulusMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSolidAngleMeasure")) {
												objectArrayList.add(((IfcSolidAngleMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSoundPowerMeasure")) {
												objectArrayList.add(((IfcSoundPowerMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSoundPressureMeasure")) {
												objectArrayList.add(((IfcSoundPressureMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSpecificHeatCapacityMeasure")) {
												objectArrayList.add(((IfcSpecificHeatCapacityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSpecularExponent")) {
												objectArrayList.add(((IfcSpecularExponent) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSpecularRoughness")) {
												objectArrayList.add(((IfcSpecularRoughness) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcTemperatureGradientMeasure")) {
												objectArrayList.add(((IfcTemperatureGradientMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcText")) {
												objectArrayList.add(((IfcText) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalAdmittanceMeasure")) {
												objectArrayList.add(((IfcThermalAdmittanceMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalConductivityMeasure")) {
												objectArrayList.add(((IfcThermalConductivityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalExpansionCoefficientMeasure")) {
												objectArrayList.add(((IfcThermalExpansionCoefficientMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalResistanceMeasure")) {
												objectArrayList.add(((IfcThermalResistanceMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalTransmittanceMeasure")) {
												objectArrayList.add(((IfcThermalTransmittanceMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermodynamicTemperatureMeasure")) {
												objectArrayList.add(((IfcThermodynamicTemperatureMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcTimeMeasure")) {
												objectArrayList.add(((IfcTimeMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcTimeStamp")) {
												objectArrayList.add(((IfcTimeStamp) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcTorqueMeasure")) {
												objectArrayList.add(((IfcTorqueMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcVaporPermeabilityMeasure")) {
												objectArrayList.add(((IfcVaporPermeabilityMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcVolumeMeasure")) {
												objectArrayList.add(((IfcVolumeMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcVolumetricFlowRateMeasure")) {
												objectArrayList.add(((IfcVolumetricFlowRateMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcWarpingConstantMeasure")) {
												objectArrayList.add(((IfcWarpingConstantMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcWarpingMomentMeasure")) {
												objectArrayList.add(((IfcWarpingMomentMeasure) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("Ifc2x3tc1PackageImpl")) {
												objectArrayList.add(((Ifc2x3tc1PackageImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcAbsorbedDoseMeasureImpl")) {
												objectArrayList.add(((IfcAbsorbedDoseMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcAccelerationMeasureImpl")) {
												objectArrayList.add(((IfcAccelerationMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcAmountOfSubstanceMeasureImpl")) {
												objectArrayList.add(((IfcAmountOfSubstanceMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcAngularVelocityMeasureImpl")) {
												objectArrayList.add(((IfcAngularVelocityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcAreaMeasureImpl")) {
												objectArrayList.add(((IfcAreaMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcBooleanImpl")) {
												objectArrayList.add(((IfcBooleanImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcContextDependentMeasureImpl")) {
												objectArrayList.add(((IfcContextDependentMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcCountMeasureImpl")) {
												objectArrayList.add(((IfcCountMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcCurvatureMeasureImpl")) {
												objectArrayList.add(((IfcCurvatureMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcDescriptiveMeasureImpl")) {
												objectArrayList.add(((IfcDescriptiveMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcDoseEquivalentMeasureImpl")) {
												objectArrayList.add(((IfcDoseEquivalentMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcDynamicViscosityMeasureImpl")) {
												objectArrayList.add(((IfcDynamicViscosityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricCapacitanceMeasureImpl")) {
												objectArrayList.add(((IfcElectricCapacitanceMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricChargeMeasureImpl")) {
												objectArrayList.add(((IfcElectricChargeMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricConductanceMeasureImpl")) {
												objectArrayList.add(((IfcElectricConductanceMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricCurrentMeasureImpl")) {
												objectArrayList.add(((IfcElectricCurrentMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricResistanceMeasureImpl")) {
												objectArrayList.add(((IfcElectricResistanceMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcElectricVoltageMeasureImpl")) {
												objectArrayList.add(((IfcElectricVoltageMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcEnergyMeasureImpl")) {
												objectArrayList.add(((IfcEnergyMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcForceMeasureImpl")) {
												objectArrayList.add(((IfcForceMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcFrequencyMeasureImpl")) {
												objectArrayList.add(((IfcFrequencyMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcGloballyUniqueIdImpl")) {
												objectArrayList.add(((IfcGloballyUniqueIdImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcHeatFluxDensityMeasureImpl")) {
												objectArrayList.add(((IfcHeatFluxDensityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcHeatingValueMeasureImpl")) {
												objectArrayList.add(((IfcHeatingValueMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcIdentifierImpl")) {
												objectArrayList.add(((IfcIdentifierImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcIlluminanceMeasureImpl")) {
												objectArrayList.add(((IfcIlluminanceMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcInductanceMeasureImpl")) {
												objectArrayList.add(((IfcInductanceMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcIntegerCountRateMeasureImpl")) {
												objectArrayList.add(((IfcIntegerCountRateMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcIntegerImpl")) {
												objectArrayList.add(((IfcIntegerImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcIonConcentrationMeasureImpl")) {
												objectArrayList.add(((IfcIonConcentrationMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcIsothermalMoistureCapacityMeasureImpl")) {
												objectArrayList.add(((IfcIsothermalMoistureCapacityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcKinematicViscosityMeasureImpl")) {
												objectArrayList.add(((IfcKinematicViscosityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLabelImpl")) {
												objectArrayList.add(((IfcLabelImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLengthMeasureImpl")) {
												objectArrayList.add(((IfcLengthMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearForceMeasureImpl")) {
												objectArrayList.add(((IfcLinearForceMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearMomentMeasureImpl")) {
												objectArrayList.add(((IfcLinearMomentMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearStiffnessMeasureImpl")) {
												objectArrayList.add(((IfcLinearStiffnessMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLinearVelocityMeasureImpl")) {
												objectArrayList.add(((IfcLinearVelocityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLogicalImpl")) {
												objectArrayList.add(((IfcLogicalImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLuminousFluxMeasureImpl")) {
												objectArrayList.add(((IfcLuminousFluxMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLuminousIntensityDistributionMeasureImpl")) {
												objectArrayList.add(((IfcLuminousIntensityDistributionMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcLuminousIntensityMeasureImpl")) {
												objectArrayList.add(((IfcLuminousIntensityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMagneticFluxDensityMeasureImpl")) {
												objectArrayList.add(((IfcMagneticFluxDensityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMagneticFluxMeasureImpl")) {
												objectArrayList.add(((IfcMagneticFluxMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassDensityMeasureImpl")) {
												objectArrayList.add(((IfcMassDensityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassFlowRateMeasureImpl")) {
												objectArrayList.add(((IfcMassFlowRateMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassMeasureImpl")) {
												objectArrayList.add(((IfcMassMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMassPerLengthMeasureImpl")) {
												objectArrayList.add(((IfcMassPerLengthMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfElasticityMeasureImpl")) {
												objectArrayList.add(((IfcModulusOfElasticityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfLinearSubgradeReactionMeasureImpl")) {
												objectArrayList.add(((IfcModulusOfLinearSubgradeReactionMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfRotationalSubgradeReactionMeasureImpl")) {
												objectArrayList.add(((IfcModulusOfRotationalSubgradeReactionMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcModulusOfSubgradeReactionMeasureImpl")) {
												objectArrayList.add(((IfcModulusOfSubgradeReactionMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMoistureDiffusivityMeasureImpl")) {
												objectArrayList.add(((IfcMoistureDiffusivityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMolecularWeightMeasureImpl")) {
												objectArrayList.add(((IfcMolecularWeightMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMomentOfInertiaMeasureImpl")) {
												objectArrayList.add(((IfcMomentOfInertiaMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcMonetaryMeasureImpl")) {
												objectArrayList.add(((IfcMonetaryMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcNumericMeasureImpl")) {
												objectArrayList.add(((IfcNumericMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcPHMeasureImpl")) {
												objectArrayList.add(((IfcPHMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcParameterValueImpl")) {
												objectArrayList.add(((IfcParameterValueImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcPlanarForceMeasureImpl")) {
												objectArrayList.add(((IfcPlanarForceMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcPlaneAngleMeasureImpl")) {
												objectArrayList.add(((IfcPlaneAngleMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcPowerMeasureImpl")) {
												objectArrayList.add(((IfcPowerMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcPressureMeasureImpl")) {
												objectArrayList.add(((IfcPressureMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcRadioActivityMeasureImpl")) {
												objectArrayList.add(((IfcRadioActivityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcRatioMeasureImpl")) {
												objectArrayList.add(((IfcRatioMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcRealImpl")) {
												objectArrayList.add(((IfcRealImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcRotationalFrequencyMeasureImpl")) {
												objectArrayList.add(((IfcRotationalFrequencyMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcRotationalMassMeasureImpl")) {
												objectArrayList.add(((IfcRotationalMassMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcRotationalStiffnessMeasureImpl")) {
												objectArrayList.add(((IfcRotationalStiffnessMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSectionModulusMeasureImpl")) {
												objectArrayList.add(((IfcSectionModulusMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSectionalAreaIntegralMeasureImpl")) {
												objectArrayList.add(((IfcSectionalAreaIntegralMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcShearModulusMeasureImpl")) {
												objectArrayList.add(((IfcShearModulusMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSolidAngleMeasureImpl")) {
												objectArrayList.add(((IfcSolidAngleMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSoundPowerMeasureImpl")) {
												objectArrayList.add(((IfcSoundPowerMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSoundPressureMeasureImpl")) {
												objectArrayList.add(((IfcSoundPressureMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSpecificHeatCapacityMeasureImpl")) {
												objectArrayList.add(((IfcSpecificHeatCapacityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSpecularExponentImpl")) {
												objectArrayList.add(((IfcSpecularExponentImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcSpecularRoughnessImpl")) {
												objectArrayList.add(((IfcSpecularRoughnessImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcTemperatureGradientMeasureImpl")) {
												objectArrayList.add(((IfcTemperatureGradientMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcTextImpl")) {
												objectArrayList.add(((IfcTextImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalAdmittanceMeasureImpl")) {
												objectArrayList.add(((IfcThermalAdmittanceMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalConductivityMeasureImpl")) {
												objectArrayList.add(((IfcThermalConductivityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalExpansionCoefficientMeasureImpl")) {
												objectArrayList.add(((IfcThermalExpansionCoefficientMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalResistanceMeasureImpl")) {
												objectArrayList.add(((IfcThermalResistanceMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermalTransmittanceMeasureImpl")) {
												objectArrayList.add(((IfcThermalTransmittanceMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcThermodynamicTemperatureMeasureImpl")) {
												objectArrayList.add(((IfcThermodynamicTemperatureMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcTimeMeasureImpl")) {
												objectArrayList.add(((IfcTimeMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcTimeStampImpl")) {
												objectArrayList.add(((IfcTimeStampImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcTorqueMeasureImpl")) {
												objectArrayList.add(((IfcTorqueMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcVaporPermeabilityMeasureImpl")) {
												objectArrayList.add(((IfcVaporPermeabilityMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcVolumeMeasureImpl")) {
												objectArrayList.add(((IfcVolumeMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcVolumetricFlowRateMeasureImpl")) {
												objectArrayList.add(((IfcVolumetricFlowRateMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcWarpingConstantMeasureImpl")) {
												objectArrayList.add(((IfcWarpingConstantMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else if (((IfcPropertySingleValue) ifcComplexProperty).getNominalValue().getClass().getSimpleName().equals("IfcWarpingMomentMeasureImpl")) {
												objectArrayList.add(((IfcWarpingMomentMeasureImpl) ((IfcPropertySingleValue) ifcComplexProperty).getNominalValue()).getWrappedValue());
											}
											else {
												System.out.println("XXXXXXXX");
											}
										}
									}
									else {
										System.out.println("GetPropertyMain. IfcRelDefinesByProperties. IfcPropertySet. Sory. Not implemented.");
									}
								}
							}
						}
						else if (ifcPropertySetDefinition.eClass().getName().equals("IfcElementQuantity")) {
							System.out.println("GetPropertyMain. IfcPropertySetDefinition. IfcElementQuantity. Sory. Not implemented.");
						}
						else {
							System.out.println("GetPropertyMain. IfcPropertySetDefinition. Sory. Not implemented.");
						}
					}
					else if (ifcRelDefines.eClass().getName().equals("IfcRelDefinesByType")) {
						System.out.println("GetPropertyMain. IfcRelDefinesByType. Sory. Not implemented.");
					}
					else {
						System.out.println("GetPropertyMain. Sory. Not implemented.");
					}
				}
			}
			arrayListArrayList.add(objectArrayList);
		}
		return arrayListArrayList;
	}
}
