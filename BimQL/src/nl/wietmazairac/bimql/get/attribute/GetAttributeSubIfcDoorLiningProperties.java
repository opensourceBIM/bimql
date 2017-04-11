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

import org.bimserver.models.ifc2x3tc1.IfcDoorLiningProperties;

public class GetAttributeSubIfcDoorLiningProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDoorLiningProperties(Object object, String string) {
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
		if (string.equals("LiningDepthAsString")) {
			resultList.add(((IfcDoorLiningProperties) object).getLiningDepthAsString());
			 //1String
		}
		else if (string.equals("LiningDepth")) {
			resultList.add(((IfcDoorLiningProperties) object).getLiningDepth());
			 //1double
		}
		else if (string.equals("LiningThickness")) {
			resultList.add(((IfcDoorLiningProperties) object).getLiningThickness());
			 //1double
		}
		else if (string.equals("ThresholdThicknessAsString")) {
			resultList.add(((IfcDoorLiningProperties) object).getThresholdThicknessAsString());
			 //1String
		}
		else if (string.equals("LiningThicknessAsString")) {
			resultList.add(((IfcDoorLiningProperties) object).getLiningThicknessAsString());
			 //1String
		}
		else if (string.equals("ThresholdDepthAsString")) {
			resultList.add(((IfcDoorLiningProperties) object).getThresholdDepthAsString());
			 //1String
		}
		else if (string.equals("ThresholdThickness")) {
			resultList.add(((IfcDoorLiningProperties) object).getThresholdThickness());
			 //1double
		}
		else if (string.equals("TransomThicknessAsString")) {
			resultList.add(((IfcDoorLiningProperties) object).getTransomThicknessAsString());
			 //1String
		}
		else if (string.equals("TransomOffsetAsString")) {
			resultList.add(((IfcDoorLiningProperties) object).getTransomOffsetAsString());
			 //1String
		}
		else if (string.equals("LiningOffsetAsString")) {
			resultList.add(((IfcDoorLiningProperties) object).getLiningOffsetAsString());
			 //1String
		}
		else if (string.equals("ThresholdOffsetAsString")) {
			resultList.add(((IfcDoorLiningProperties) object).getThresholdOffsetAsString());
			 //1String
		}
		else if (string.equals("CasingThicknessAsString")) {
			resultList.add(((IfcDoorLiningProperties) object).getCasingThicknessAsString());
			 //1String
		}
		else if (string.equals("CasingDepthAsString")) {
			resultList.add(((IfcDoorLiningProperties) object).getCasingDepthAsString());
			 //1String
		}
		else if (string.equals("ThresholdDepth")) {
			resultList.add(((IfcDoorLiningProperties) object).getThresholdDepth());
			 //1double
		}
		else if (string.equals("TransomThickness")) {
			resultList.add(((IfcDoorLiningProperties) object).getTransomThickness());
			 //1double
		}
		else if (string.equals("TransomOffset")) {
			resultList.add(((IfcDoorLiningProperties) object).getTransomOffset());
			 //1double
		}
		else if (string.equals("LiningOffset")) {
			resultList.add(((IfcDoorLiningProperties) object).getLiningOffset());
			 //1double
		}
		else if (string.equals("ThresholdOffset")) {
			resultList.add(((IfcDoorLiningProperties) object).getThresholdOffset());
			 //1double
		}
		else if (string.equals("CasingThickness")) {
			resultList.add(((IfcDoorLiningProperties) object).getCasingThickness());
			 //1double
		}
		else if (string.equals("CasingDepth")) {
			resultList.add(((IfcDoorLiningProperties) object).getCasingDepth());
			 //1double
		}
		else if (string.equals("ShapeAspectStyle")) {
			resultList.add(((IfcDoorLiningProperties) object).getShapeAspectStyle());
			 //1IfcShapeAspect
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcDoorLiningProperties) object).getDefinesType().size(); i++) {
				resultList.add(((IfcDoorLiningProperties) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcDoorLiningProperties) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcDoorLiningProperties) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDoorLiningProperties) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDoorLiningProperties) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDoorLiningProperties) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDoorLiningProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDoorLiningProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDoorLiningProperties) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDoorLiningProperties) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
