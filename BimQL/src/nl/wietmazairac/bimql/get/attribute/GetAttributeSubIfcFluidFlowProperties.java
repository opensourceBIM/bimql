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

import org.bimserver.models.ifc2x3tc1.IfcFluidFlowProperties;

public class GetAttributeSubIfcFluidFlowProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFluidFlowProperties(Object object, String string) {
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
		if (string.equals("FlowConditionTimeSeries")) {
			resultList.add(((IfcFluidFlowProperties) object).getFlowConditionTimeSeries());
			 //1IfcTimeSeries
		}
		else if (string.equals("VelocityTimeSeries")) {
			resultList.add(((IfcFluidFlowProperties) object).getVelocityTimeSeries());
			 //1IfcTimeSeries
		}
		else if (string.equals("FlowrateTimeSeries")) {
			resultList.add(((IfcFluidFlowProperties) object).getFlowrateTimeSeries());
			 //1IfcTimeSeries
		}
		else if (string.equals("PressureTimeSeries")) {
			resultList.add(((IfcFluidFlowProperties) object).getPressureTimeSeries());
			 //1IfcTimeSeries
		}
		else if (string.equals("UserDefinedPropertySource")) {
			resultList.add(((IfcFluidFlowProperties) object).getUserDefinedPropertySource());
			 //1String
		}
		else if (string.equals("TemperatureSingleValue")) {
			resultList.add(((IfcFluidFlowProperties) object).getTemperatureSingleValue());
			 //1double
		}
		else if (string.equals("TemperatureTimeSeries")) {
			resultList.add(((IfcFluidFlowProperties) object).getTemperatureTimeSeries());
			 //1IfcTimeSeries
		}
		else if (string.equals("FlowrateSingleValue")) {
			resultList.add(((IfcFluidFlowProperties) object).getFlowrateSingleValue());
			 //1IfcDerivedMeasureValue
		}
		else if (string.equals("FlowConditionSingleValue")) {
			resultList.add(((IfcFluidFlowProperties) object).getFlowConditionSingleValue());
			 //1double
		}
		else if (string.equals("VelocitySingleValue")) {
			resultList.add(((IfcFluidFlowProperties) object).getVelocitySingleValue());
			 //1double
		}
		else if (string.equals("PressureSingleValue")) {
			resultList.add(((IfcFluidFlowProperties) object).getPressureSingleValue());
			 //1double
		}
		else if (string.equals("PropertySource")) {
			resultList.add(((IfcFluidFlowProperties) object).getPropertySource());
			 //1IfcPropertySourceEnum
		}
		else if (string.equals("Fluid")) {
			resultList.add(((IfcFluidFlowProperties) object).getFluid());
			 //1IfcMaterial
		}
		else if (string.equals("WetBulbTemperatureSingleValueAsString")) {
			resultList.add(((IfcFluidFlowProperties) object).getWetBulbTemperatureSingleValueAsString());
			 //1String
		}
		else if (string.equals("TemperatureSingleValueAsString")) {
			resultList.add(((IfcFluidFlowProperties) object).getTemperatureSingleValueAsString());
			 //1String
		}
		else if (string.equals("WetBulbTemperatureSingleValue")) {
			resultList.add(((IfcFluidFlowProperties) object).getWetBulbTemperatureSingleValue());
			 //1double
		}
		else if (string.equals("WetBulbTemperatureTimeSeries")) {
			resultList.add(((IfcFluidFlowProperties) object).getWetBulbTemperatureTimeSeries());
			 //1IfcTimeSeries
		}
		else if (string.equals("FlowConditionSingleValueAsString")) {
			resultList.add(((IfcFluidFlowProperties) object).getFlowConditionSingleValueAsString());
			 //1String
		}
		else if (string.equals("VelocitySingleValueAsString")) {
			resultList.add(((IfcFluidFlowProperties) object).getVelocitySingleValueAsString());
			 //1String
		}
		else if (string.equals("PressureSingleValueAsString")) {
			resultList.add(((IfcFluidFlowProperties) object).getPressureSingleValueAsString());
			 //1String
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcFluidFlowProperties) object).getDefinesType().size(); i++) {
				resultList.add(((IfcFluidFlowProperties) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcFluidFlowProperties) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcFluidFlowProperties) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFluidFlowProperties) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFluidFlowProperties) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFluidFlowProperties) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFluidFlowProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFluidFlowProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFluidFlowProperties) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFluidFlowProperties) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
