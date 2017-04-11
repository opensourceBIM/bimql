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

import org.bimserver.models.ifc2x3tc1.IfcCraneRailAShapeProfileDef;

public class GetAttributeSubIfcCraneRailAShapeProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCraneRailAShapeProfileDef(Object object, String string) {
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
		if (string.equals("RadiusAsString")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getRadiusAsString());
			 //1String
		}
		else if (string.equals("Radius")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getRadius());
			 //1double
		}
		else if (string.equals("HeadWidth")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getHeadWidth());
			 //1double
		}
		else if (string.equals("OverallHeight")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getOverallHeight());
			 //1double
		}
		else if (string.equals("BaseWidth2")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getBaseWidth2());
			 //1double
		}
		else if (string.equals("HeadWidthAsString")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getHeadWidthAsString());
			 //1String
		}
		else if (string.equals("HeadDepth2")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getHeadDepth2());
			 //1double
		}
		else if (string.equals("HeadDepth3")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getHeadDepth3());
			 //1double
		}
		else if (string.equals("WebThickness")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getWebThickness());
			 //1double
		}
		else if (string.equals("BaseWidth4")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getBaseWidth4());
			 //1double
		}
		else if (string.equals("BaseDepth1")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getBaseDepth1());
			 //1double
		}
		else if (string.equals("BaseDepth2")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getBaseDepth2());
			 //1double
		}
		else if (string.equals("BaseDepth3")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getBaseDepth3());
			 //1double
		}
		else if (string.equals("CentreOfGravityInYAsString")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getCentreOfGravityInYAsString());
			 //1String
		}
		else if (string.equals("OverallHeightAsString")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getOverallHeightAsString());
			 //1String
		}
		else if (string.equals("BaseWidth2AsString")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getBaseWidth2AsString());
			 //1String
		}
		else if (string.equals("HeadDepth2AsString")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getHeadDepth2AsString());
			 //1String
		}
		else if (string.equals("HeadDepth3AsString")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getHeadDepth3AsString());
			 //1String
		}
		else if (string.equals("WebThicknessAsString")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getWebThicknessAsString());
			 //1String
		}
		else if (string.equals("BaseWidth4AsString")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getBaseWidth4AsString());
			 //1String
		}
		else if (string.equals("BaseDepth1AsString")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getBaseDepth1AsString());
			 //1String
		}
		else if (string.equals("BaseDepth2AsString")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getBaseDepth2AsString());
			 //1String
		}
		else if (string.equals("BaseDepth3AsString")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getBaseDepth3AsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInY")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getCentreOfGravityInY());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcCraneRailAShapeProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
