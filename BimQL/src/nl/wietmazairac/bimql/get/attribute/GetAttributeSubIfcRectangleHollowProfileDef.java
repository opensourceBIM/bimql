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

import org.bimserver.models.ifc2x3tc1.IfcRectangleHollowProfileDef;

public class GetAttributeSubIfcRectangleHollowProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRectangleHollowProfileDef(Object object, String string) {
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
		if (string.equals("InnerFilletRadiusAsString")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getInnerFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("OuterFilletRadiusAsString")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getOuterFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("InnerFilletRadius")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getInnerFilletRadius());
			 //1double
		}
		else if (string.equals("OuterFilletRadius")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getOuterFilletRadius());
			 //1double
		}
		else if (string.equals("WallThicknessAsString")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getWallThicknessAsString());
			 //1String
		}
		else if (string.equals("WallThickness")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getWallThickness());
			 //1double
		}
		else if (string.equals("XDimAsString")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getXDimAsString());
			 //2String
		}
		else if (string.equals("YDimAsString")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getYDimAsString());
			 //2String
		}
		else if (string.equals("XDim")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getXDim());
			 //2double
		}
		else if (string.equals("YDim")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getYDim());
			 //2double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getPosition());
			 //3IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
