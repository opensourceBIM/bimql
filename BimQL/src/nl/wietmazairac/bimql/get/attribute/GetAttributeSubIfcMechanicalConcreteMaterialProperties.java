package nl.wietmazairac.bimql.get.attribute;

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

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcMechanicalConcreteMaterialProperties;

public class GetAttributeSubIfcMechanicalConcreteMaterialProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMechanicalConcreteMaterialProperties(Object object, String string) {
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
		if (string.equals("CompressiveStrength")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getCompressiveStrength());
			 //1double
		}
		else if (string.equals("MaxAggregateSizeAsString")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getMaxAggregateSizeAsString());
			 //1String
		}
		else if (string.equals("AdmixturesDescription")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getAdmixturesDescription());
			 //1String
		}
		else if (string.equals("ProtectivePoreRatio")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getProtectivePoreRatio());
			 //1double
		}
		else if (string.equals("WaterImpermeability")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getWaterImpermeability());
			 //1String
		}
		else if (string.equals("MaxAggregateSize")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getMaxAggregateSize());
			 //1double
		}
		else if (string.equals("Workability")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getWorkability());
			 //1String
		}
		else if (string.equals("CompressiveStrengthAsString")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getCompressiveStrengthAsString());
			 //1String
		}
		else if (string.equals("ProtectivePoreRatioAsString")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getProtectivePoreRatioAsString());
			 //1String
		}
		else if (string.equals("DynamicViscosityAsString")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getDynamicViscosityAsString());
			 //2String
		}
		else if (string.equals("YoungModulusAsString")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getYoungModulusAsString());
			 //2String
		}
		else if (string.equals("ShearModulusAsString")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getShearModulusAsString());
			 //2String
		}
		else if (string.equals("PoissonRatioAsString")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getPoissonRatioAsString());
			 //2String
		}
		else if (string.equals("DynamicViscosity")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getDynamicViscosity());
			 //2double
		}
		else if (string.equals("YoungModulus")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getYoungModulus());
			 //2double
		}
		else if (string.equals("ShearModulus")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getShearModulus());
			 //2double
		}
		else if (string.equals("PoissonRatio")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getPoissonRatio());
			 //2double
		}
		else if (string.equals("ThermalExpansionCoefficientAsString")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getThermalExpansionCoefficientAsString());
			 //2String
		}
		else if (string.equals("ThermalExpansionCoefficient")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getThermalExpansionCoefficient());
			 //2double
		}
		else if (string.equals("Material")) {
			resultList.add(((IfcMechanicalConcreteMaterialProperties) object).getMaterial());
			 //3IfcMaterial
		}
		else {
		}
		return resultList;
	}
}
