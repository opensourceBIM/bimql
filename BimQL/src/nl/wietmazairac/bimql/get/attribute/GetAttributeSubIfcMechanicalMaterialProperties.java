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

import org.bimserver.models.ifc2x3tc1.IfcMechanicalMaterialProperties;

public class GetAttributeSubIfcMechanicalMaterialProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMechanicalMaterialProperties(Object object, String string) {
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
		if (string.equals("DynamicViscosityAsString")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getDynamicViscosityAsString());
			 //1String
		}
		else if (string.equals("YoungModulusAsString")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getYoungModulusAsString());
			 //1String
		}
		else if (string.equals("ShearModulusAsString")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getShearModulusAsString());
			 //1String
		}
		else if (string.equals("PoissonRatioAsString")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getPoissonRatioAsString());
			 //1String
		}
		else if (string.equals("DynamicViscosity")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getDynamicViscosity());
			 //1double
		}
		else if (string.equals("YoungModulus")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getYoungModulus());
			 //1double
		}
		else if (string.equals("ShearModulus")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getShearModulus());
			 //1double
		}
		else if (string.equals("PoissonRatio")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getPoissonRatio());
			 //1double
		}
		else if (string.equals("ThermalExpansionCoefficientAsString")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getThermalExpansionCoefficientAsString());
			 //1String
		}
		else if (string.equals("ThermalExpansionCoefficient")) {
			resultList.add(((IfcMechanicalMaterialProperties) object).getThermalExpansionCoefficient());
			 //1double
		}
		return resultList;
	}
}
