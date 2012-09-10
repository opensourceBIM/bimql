package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcMechanicalSteelMaterialProperties;

public class GetAttributeSubIfcMechanicalSteelMaterialProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMechanicalSteelMaterialProperties(Object object, String string) {
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
		if (string.equals("YieldStressAsString")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getYieldStressAsString());
			 //1String
		}
		else if (string.equals("UltimateStressAsString")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getUltimateStressAsString());
			 //1String
		}
		else if (string.equals("UltimateStrainAsString")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getUltimateStrainAsString());
			 //1String
		}
		else if (string.equals("HardeningModuleAsString")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getHardeningModuleAsString());
			 //1String
		}
		else if (string.equals("ProportionalStress")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getProportionalStress());
			 //1double
		}
		else if (string.equals("PlasticStrainAsString")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getPlasticStrainAsString());
			 //1String
		}
		else if (string.equals("YieldStress")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getYieldStress());
			 //1double
		}
		else if (string.equals("UltimateStress")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getUltimateStress());
			 //1double
		}
		else if (string.equals("UltimateStrain")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getUltimateStrain());
			 //1double
		}
		else if (string.equals("HardeningModule")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getHardeningModule());
			 //1double
		}
		else if (string.equals("PlasticStrain")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getPlasticStrain());
			 //1double
		}
		else if (string.equals("Relaxations")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalSteelMaterialProperties) object).getRelaxations().size(); i++) {
				resultList.add(((IfcMechanicalSteelMaterialProperties) object).getRelaxations().get(i));
			}
			 //1EList
		}
		else if (string.equals("ProportionalStressAsString")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getProportionalStressAsString());
			 //1String
		}
		else if (string.equals("DynamicViscosityAsString")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getDynamicViscosityAsString());
			 //2String
		}
		else if (string.equals("YoungModulusAsString")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getYoungModulusAsString());
			 //2String
		}
		else if (string.equals("ShearModulusAsString")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getShearModulusAsString());
			 //2String
		}
		else if (string.equals("PoissonRatioAsString")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getPoissonRatioAsString());
			 //2String
		}
		else if (string.equals("DynamicViscosity")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getDynamicViscosity());
			 //2double
		}
		else if (string.equals("YoungModulus")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getYoungModulus());
			 //2double
		}
		else if (string.equals("ShearModulus")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getShearModulus());
			 //2double
		}
		else if (string.equals("PoissonRatio")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getPoissonRatio());
			 //2double
		}
		else if (string.equals("ThermalExpansionCoefficientAsString")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getThermalExpansionCoefficientAsString());
			 //2String
		}
		else if (string.equals("ThermalExpansionCoefficient")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getThermalExpansionCoefficient());
			 //2double
		}
		else if (string.equals("Material")) {
			resultList.add(((IfcMechanicalSteelMaterialProperties) object).getMaterial());
			 //3IfcMaterial
		}
		else {
		}
		return resultList;
	}
}
