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

import org.bimserver.models.ifc2x3tc1.IfcThermalMaterialProperties;

public class SetAttributeSubIfcThermalMaterialProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcThermalMaterialProperties() {
	}

	public SetAttributeSubIfcThermalMaterialProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("SpecificHeatCapacity")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setSpecificHeatCapacity(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SpecificHeatCapacityAsString")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setSpecificHeatCapacityAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThermalConductivityAsString")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setThermalConductivityAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BoilingPoint")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setBoilingPoint(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FreezingPoint")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setFreezingPoint(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BoilingPointAsString")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setBoilingPointAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FreezingPointAsString")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setFreezingPointAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThermalConductivity")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setThermalConductivity(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
