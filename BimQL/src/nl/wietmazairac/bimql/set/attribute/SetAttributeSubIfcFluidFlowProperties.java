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

import org.bimserver.models.ifc2x3tc1.IfcFluidFlowProperties;

public class SetAttributeSubIfcFluidFlowProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcFluidFlowProperties() {
	}

	public SetAttributeSubIfcFluidFlowProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Fluid")) {
			//1NoEList
			 //1void
			 //1IfcMaterial
		}
		else if (attributeName.equals("TemperatureSingleValueAsString")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setTemperatureSingleValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("WetBulbTemperatureSingleValue")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setWetBulbTemperatureSingleValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("WetBulbTemperatureTimeSeries")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeries
		}
		else if (attributeName.equals("FlowConditionSingleValueAsString")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setFlowConditionSingleValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("VelocitySingleValueAsString")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setVelocitySingleValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("WetBulbTemperatureSingleValueAsString")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setWetBulbTemperatureSingleValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FlowConditionTimeSeries")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeries
		}
		else if (attributeName.equals("VelocityTimeSeries")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeries
		}
		else if (attributeName.equals("FlowrateTimeSeries")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeries
		}
		else if (attributeName.equals("PressureTimeSeries")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeries
		}
		else if (attributeName.equals("UserDefinedPropertySource")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setUserDefinedPropertySource(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TemperatureSingleValue")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setTemperatureSingleValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TemperatureTimeSeries")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeries
		}
		else if (attributeName.equals("FlowrateSingleValue")) {
			//1NoEList
			 //1void
			 //1IfcDerivedMeasureValue
		}
		else if (attributeName.equals("FlowConditionSingleValue")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setFlowConditionSingleValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("VelocitySingleValue")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setVelocitySingleValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PressureSingleValue")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setPressureSingleValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PropertySource")) {
			//1NoEList
			 //1void
			 //1IfcPropertySourceEnum
		}
		else if (attributeName.equals("PressureSingleValueAsString")) {
			//1NoEList
			((IfcFluidFlowProperties) object).setPressureSingleValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcFluidFlowProperties) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcFluidFlowProperties) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
