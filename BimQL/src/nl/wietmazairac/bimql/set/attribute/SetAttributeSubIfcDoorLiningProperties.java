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

import org.bimserver.models.ifc2x3tc1.IfcDoorLiningProperties;

public class SetAttributeSubIfcDoorLiningProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcDoorLiningProperties() {
	}

	public SetAttributeSubIfcDoorLiningProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("LiningDepth")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setLiningDepth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LiningThickness")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setLiningThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ThresholdDepth")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setThresholdDepth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TransomThickness")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setTransomThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TransomOffset")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setTransomOffset(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LiningOffset")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setLiningOffset(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ThresholdOffset")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setThresholdOffset(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CasingThickness")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setCasingThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CasingDepth")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setCasingDepth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ShapeAspectStyle")) {
			//1NoEList
			 //1void
			 //1IfcShapeAspect
		}
		else if (attributeName.equals("ThresholdThicknessAsString")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setThresholdThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LiningDepthAsString")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setLiningDepthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LiningThicknessAsString")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setLiningThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThresholdDepthAsString")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setThresholdDepthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThresholdThickness")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setThresholdThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TransomThicknessAsString")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setTransomThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TransomOffsetAsString")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setTransomOffsetAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LiningOffsetAsString")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setLiningOffsetAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThresholdOffsetAsString")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setThresholdOffsetAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CasingThicknessAsString")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setCasingThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CasingDepthAsString")) {
			//1NoEList
			((IfcDoorLiningProperties) object).setCasingDepthAsString(attributeNewValue);
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
			((IfcDoorLiningProperties) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcDoorLiningProperties) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
