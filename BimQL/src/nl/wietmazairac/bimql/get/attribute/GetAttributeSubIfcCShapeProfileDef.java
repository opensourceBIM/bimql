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

import org.bimserver.models.ifc2x3tc1.IfcCShapeProfileDef;

public class GetAttributeSubIfcCShapeProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCShapeProfileDef(Object object, String string) {
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
		if (string.equals("CentreOfGravityInX")) {
			resultList.add(((IfcCShapeProfileDef) object).getCentreOfGravityInX());
			 //1double
		}
		else if (string.equals("DepthAsString")) {
			resultList.add(((IfcCShapeProfileDef) object).getDepthAsString());
			 //1String
		}
		else if (string.equals("WidthAsString")) {
			resultList.add(((IfcCShapeProfileDef) object).getWidthAsString());
			 //1String
		}
		else if (string.equals("Girth")) {
			resultList.add(((IfcCShapeProfileDef) object).getGirth());
			 //1double
		}
		else if (string.equals("GirthAsString")) {
			resultList.add(((IfcCShapeProfileDef) object).getGirthAsString());
			 //1String
		}
		else if (string.equals("InternalFilletRadius")) {
			resultList.add(((IfcCShapeProfileDef) object).getInternalFilletRadius());
			 //1double
		}
		else if (string.equals("InternalFilletRadiusAsString")) {
			resultList.add(((IfcCShapeProfileDef) object).getInternalFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("WallThicknessAsString")) {
			resultList.add(((IfcCShapeProfileDef) object).getWallThicknessAsString());
			 //1String
		}
		else if (string.equals("WallThickness")) {
			resultList.add(((IfcCShapeProfileDef) object).getWallThickness());
			 //1double
		}
		else if (string.equals("CentreOfGravityInXAsString")) {
			resultList.add(((IfcCShapeProfileDef) object).getCentreOfGravityInXAsString());
			 //1String
		}
		else if (string.equals("Width")) {
			resultList.add(((IfcCShapeProfileDef) object).getWidth());
			 //1double
		}
		else if (string.equals("Depth")) {
			resultList.add(((IfcCShapeProfileDef) object).getDepth());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcCShapeProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcCShapeProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcCShapeProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
