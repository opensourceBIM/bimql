package nl.wietmazairac.bimql.set.attribute;

/******************************************************************************
 * Copyright (C) 2009-2017  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.bimserver.models.ifc2x3tc1.IfcMechanicalSteelMaterialProperties;

public class SetAttributeSubIfcMechanicalSteelMaterialProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcMechanicalSteelMaterialProperties() {
	}

	public SetAttributeSubIfcMechanicalSteelMaterialProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("YieldStress")) {
			//1NoEList
			((IfcMechanicalSteelMaterialProperties) object).setYieldStress(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("UltimateStress")) {
			//1NoEList
			((IfcMechanicalSteelMaterialProperties) object).setUltimateStress(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("UltimateStrain")) {
			//1NoEList
			((IfcMechanicalSteelMaterialProperties) object).setUltimateStrain(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("HardeningModule")) {
			//1NoEList
			((IfcMechanicalSteelMaterialProperties) object).setHardeningModule(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PlasticStrain")) {
			//1NoEList
			((IfcMechanicalSteelMaterialProperties) object).setPlasticStrain(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ProportionalStressAsString")) {
			//1NoEList
			((IfcMechanicalSteelMaterialProperties) object).setProportionalStressAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("YieldStressAsString")) {
			//1NoEList
			((IfcMechanicalSteelMaterialProperties) object).setYieldStressAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("UltimateStressAsString")) {
			//1NoEList
			((IfcMechanicalSteelMaterialProperties) object).setUltimateStressAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("UltimateStrainAsString")) {
			//1NoEList
			((IfcMechanicalSteelMaterialProperties) object).setUltimateStrainAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("HardeningModuleAsString")) {
			//1NoEList
			((IfcMechanicalSteelMaterialProperties) object).setHardeningModuleAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ProportionalStress")) {
			//1NoEList
			((IfcMechanicalSteelMaterialProperties) object).setProportionalStress(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PlasticStrainAsString")) {
			//1NoEList
			((IfcMechanicalSteelMaterialProperties) object).setPlasticStrainAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThermalExpansionCoefficientAsString")) {
			//2NoEList
			((IfcMechanicalSteelMaterialProperties) object).setThermalExpansionCoefficientAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("DynamicViscosity")) {
			//2NoEList
			((IfcMechanicalSteelMaterialProperties) object).setDynamicViscosity(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("YoungModulus")) {
			//2NoEList
			((IfcMechanicalSteelMaterialProperties) object).setYoungModulus(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("ShearModulus")) {
			//2NoEList
			((IfcMechanicalSteelMaterialProperties) object).setShearModulus(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("PoissonRatio")) {
			//2NoEList
			((IfcMechanicalSteelMaterialProperties) object).setPoissonRatio(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("ThermalExpansionCoefficient")) {
			//2NoEList
			((IfcMechanicalSteelMaterialProperties) object).setThermalExpansionCoefficient(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("DynamicViscosityAsString")) {
			//2NoEList
			((IfcMechanicalSteelMaterialProperties) object).setDynamicViscosityAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("YoungModulusAsString")) {
			//2NoEList
			((IfcMechanicalSteelMaterialProperties) object).setYoungModulusAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ShearModulusAsString")) {
			//2NoEList
			((IfcMechanicalSteelMaterialProperties) object).setShearModulusAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("PoissonRatioAsString")) {
			//2NoEList
			((IfcMechanicalSteelMaterialProperties) object).setPoissonRatioAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Material")) {
			//5NoEList
			 //5void
			 //5IfcMaterial
		}
		else {
		}
	}
}
