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

import org.bimserver.models.ifc2x3tc1.IfcSpaceThermalLoadProperties;

public class SetAttributeSubIfcSpaceThermalLoadProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcSpaceThermalLoadProperties() {
	}

	public SetAttributeSubIfcSpaceThermalLoadProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("UserDefinedPropertySource")) {
			//1NoEList
			((IfcSpaceThermalLoadProperties) object).setUserDefinedPropertySource(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PropertySource")) {
			//1NoEList
			 //1void
			 //1IfcPropertySourceEnum
		}
		else if (attributeName.equals("ApplicableValueRatioAsString")) {
			//1NoEList
			((IfcSpaceThermalLoadProperties) object).setApplicableValueRatioAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThermalLoadTimeSeriesValues")) {
			//1NoEList
			 //1void
			 //1IfcTimeSeries
		}
		else if (attributeName.equals("UserDefinedThermalLoadSource")) {
			//1NoEList
			((IfcSpaceThermalLoadProperties) object).setUserDefinedThermalLoadSource(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ApplicableValueRatio")) {
			//1NoEList
			((IfcSpaceThermalLoadProperties) object).setApplicableValueRatio(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MaximumValueAsString")) {
			//1NoEList
			((IfcSpaceThermalLoadProperties) object).setMaximumValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MinimumValueAsString")) {
			//1NoEList
			((IfcSpaceThermalLoadProperties) object).setMinimumValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThermalLoadSource")) {
			//1NoEList
			 //1void
			 //1IfcThermalLoadSourceEnum
		}
		else if (attributeName.equals("SourceDescription")) {
			//1NoEList
			((IfcSpaceThermalLoadProperties) object).setSourceDescription(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MaximumValue")) {
			//1NoEList
			((IfcSpaceThermalLoadProperties) object).setMaximumValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MinimumValue")) {
			//1NoEList
			((IfcSpaceThermalLoadProperties) object).setMinimumValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ThermalLoadType")) {
			//1NoEList
			 //1void
			 //1IfcThermalLoadTypeEnum
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
			((IfcSpaceThermalLoadProperties) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcSpaceThermalLoadProperties) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
