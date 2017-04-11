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

import org.bimserver.models.ifc2x3tc1.IfcFuelProperties;

public class SetAttributeSubIfcFuelProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcFuelProperties() {
	}

	public SetAttributeSubIfcFuelProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("CombustionTemperature")) {
			//1NoEList
			((IfcFuelProperties) object).setCombustionTemperature(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CarbonContentAsString")) {
			//1NoEList
			((IfcFuelProperties) object).setCarbonContentAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LowerHeatingValueAsString")) {
			//1NoEList
			((IfcFuelProperties) object).setLowerHeatingValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("HigherHeatingValue")) {
			//1NoEList
			((IfcFuelProperties) object).setHigherHeatingValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CarbonContent")) {
			//1NoEList
			((IfcFuelProperties) object).setCarbonContent(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LowerHeatingValue")) {
			//1NoEList
			((IfcFuelProperties) object).setLowerHeatingValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CombustionTemperatureAsString")) {
			//1NoEList
			((IfcFuelProperties) object).setCombustionTemperatureAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("HigherHeatingValueAsString")) {
			//1NoEList
			((IfcFuelProperties) object).setHigherHeatingValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
