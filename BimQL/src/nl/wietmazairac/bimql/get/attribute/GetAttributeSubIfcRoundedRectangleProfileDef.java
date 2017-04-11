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

import org.bimserver.models.ifc2x3tc1.IfcRoundedRectangleProfileDef;

public class GetAttributeSubIfcRoundedRectangleProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRoundedRectangleProfileDef(Object object, String string) {
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
		if (string.equals("RoundingRadiusAsString")) {
			resultList.add(((IfcRoundedRectangleProfileDef) object).getRoundingRadiusAsString());
			 //1String
		}
		else if (string.equals("RoundingRadius")) {
			resultList.add(((IfcRoundedRectangleProfileDef) object).getRoundingRadius());
			 //1double
		}
		else if (string.equals("XDimAsString")) {
			resultList.add(((IfcRoundedRectangleProfileDef) object).getXDimAsString());
			 //2String
		}
		else if (string.equals("YDimAsString")) {
			resultList.add(((IfcRoundedRectangleProfileDef) object).getYDimAsString());
			 //2String
		}
		else if (string.equals("XDim")) {
			resultList.add(((IfcRoundedRectangleProfileDef) object).getXDim());
			 //2double
		}
		else if (string.equals("YDim")) {
			resultList.add(((IfcRoundedRectangleProfileDef) object).getYDim());
			 //2double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcRoundedRectangleProfileDef) object).getPosition());
			 //3IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcRoundedRectangleProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcRoundedRectangleProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
