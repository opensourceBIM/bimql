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

import org.bimserver.models.ifc2x3tc1.IfcMechanicalMaterialProperties;

public class SetAttributeSubIfcMechanicalMaterialProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcMechanicalMaterialProperties() {
	}

	public SetAttributeSubIfcMechanicalMaterialProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ThermalExpansionCoefficientAsString")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setThermalExpansionCoefficientAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DynamicViscosity")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setDynamicViscosity(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("YoungModulus")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setYoungModulus(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ShearModulus")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setShearModulus(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PoissonRatio")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setPoissonRatio(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ThermalExpansionCoefficient")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setThermalExpansionCoefficient(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DynamicViscosityAsString")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setDynamicViscosityAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("YoungModulusAsString")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setYoungModulusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ShearModulusAsString")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setShearModulusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PoissonRatioAsString")) {
			//1NoEList
			((IfcMechanicalMaterialProperties) object).setPoissonRatioAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
