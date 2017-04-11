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

import org.bimserver.models.ifc2x3tc1.IfcUShapeProfileDef;

public class GetAttributeSubIfcUShapeProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcUShapeProfileDef(Object object, String string) {
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
		if (string.equals("FlangeThicknessAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getFlangeThicknessAsString());
			 //1String
		}
		else if (string.equals("FilletRadiusAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("EdgeRadiusAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getEdgeRadiusAsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInX")) {
			resultList.add(((IfcUShapeProfileDef) object).getCentreOfGravityInX());
			 //1double
		}
		else if (string.equals("DepthAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getDepthAsString());
			 //1String
		}
		else if (string.equals("FlangeThickness")) {
			resultList.add(((IfcUShapeProfileDef) object).getFlangeThickness());
			 //1double
		}
		else if (string.equals("FilletRadius")) {
			resultList.add(((IfcUShapeProfileDef) object).getFilletRadius());
			 //1double
		}
		else if (string.equals("EdgeRadius")) {
			resultList.add(((IfcUShapeProfileDef) object).getEdgeRadius());
			 //1double
		}
		else if (string.equals("FlangeWidthAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getFlangeWidthAsString());
			 //1String
		}
		else if (string.equals("FlangeWidth")) {
			resultList.add(((IfcUShapeProfileDef) object).getFlangeWidth());
			 //1double
		}
		else if (string.equals("FlangeSlope")) {
			resultList.add(((IfcUShapeProfileDef) object).getFlangeSlope());
			 //1double
		}
		else if (string.equals("FlangeSlopeAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getFlangeSlopeAsString());
			 //1String
		}
		else if (string.equals("WebThickness")) {
			resultList.add(((IfcUShapeProfileDef) object).getWebThickness());
			 //1double
		}
		else if (string.equals("CentreOfGravityInXAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getCentreOfGravityInXAsString());
			 //1String
		}
		else if (string.equals("WebThicknessAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getWebThicknessAsString());
			 //1String
		}
		else if (string.equals("Depth")) {
			resultList.add(((IfcUShapeProfileDef) object).getDepth());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcUShapeProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcUShapeProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcUShapeProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
