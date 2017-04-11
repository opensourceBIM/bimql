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

import org.bimserver.models.ifc2x3tc1.IfcMechanicalConcreteMaterialProperties;

public class SetAttributeSubIfcMechanicalConcreteMaterialProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcMechanicalConcreteMaterialProperties() {
	}

	public SetAttributeSubIfcMechanicalConcreteMaterialProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("CompressiveStrength")) {
			//1NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setCompressiveStrength(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MaxAggregateSizeAsString")) {
			//1NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setMaxAggregateSizeAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("AdmixturesDescription")) {
			//1NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setAdmixturesDescription(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ProtectivePoreRatio")) {
			//1NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setProtectivePoreRatio(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("WaterImpermeability")) {
			//1NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setWaterImpermeability(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CompressiveStrengthAsString")) {
			//1NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setCompressiveStrengthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ProtectivePoreRatioAsString")) {
			//1NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setProtectivePoreRatioAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MaxAggregateSize")) {
			//1NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setMaxAggregateSize(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Workability")) {
			//1NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setWorkability(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThermalExpansionCoefficientAsString")) {
			//2NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setThermalExpansionCoefficientAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("DynamicViscosity")) {
			//2NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setDynamicViscosity(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("YoungModulus")) {
			//2NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setYoungModulus(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("ShearModulus")) {
			//2NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setShearModulus(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("PoissonRatio")) {
			//2NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setPoissonRatio(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("ThermalExpansionCoefficient")) {
			//2NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setThermalExpansionCoefficient(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("DynamicViscosityAsString")) {
			//2NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setDynamicViscosityAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("YoungModulusAsString")) {
			//2NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setYoungModulusAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ShearModulusAsString")) {
			//2NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setShearModulusAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("PoissonRatioAsString")) {
			//2NoEList
			((IfcMechanicalConcreteMaterialProperties) object).setPoissonRatioAsString(attributeNewValue);
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
