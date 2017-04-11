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

import org.bimserver.models.ifc2x3tc1.IfcLShapeProfileDef;

public class GetAttributeSubIfcLShapeProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLShapeProfileDef(Object object, String string) {
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
		if (string.equals("FilletRadiusAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("EdgeRadiusAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getEdgeRadiusAsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInX")) {
			resultList.add(((IfcLShapeProfileDef) object).getCentreOfGravityInX());
			 //1double
		}
		else if (string.equals("DepthAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getDepthAsString());
			 //1String
		}
		else if (string.equals("FilletRadius")) {
			resultList.add(((IfcLShapeProfileDef) object).getFilletRadius());
			 //1double
		}
		else if (string.equals("WidthAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getWidthAsString());
			 //1String
		}
		else if (string.equals("EdgeRadius")) {
			resultList.add(((IfcLShapeProfileDef) object).getEdgeRadius());
			 //1double
		}
		else if (string.equals("LegSlopeAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getLegSlopeAsString());
			 //1String
		}
		else if (string.equals("ThicknessAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getThicknessAsString());
			 //1String
		}
		else if (string.equals("LegSlope")) {
			resultList.add(((IfcLShapeProfileDef) object).getLegSlope());
			 //1double
		}
		else if (string.equals("CentreOfGravityInYAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getCentreOfGravityInYAsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInXAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getCentreOfGravityInXAsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInY")) {
			resultList.add(((IfcLShapeProfileDef) object).getCentreOfGravityInY());
			 //1double
		}
		else if (string.equals("Width")) {
			resultList.add(((IfcLShapeProfileDef) object).getWidth());
			 //1double
		}
		else if (string.equals("Thickness")) {
			resultList.add(((IfcLShapeProfileDef) object).getThickness());
			 //1double
		}
		else if (string.equals("Depth")) {
			resultList.add(((IfcLShapeProfileDef) object).getDepth());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcLShapeProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcLShapeProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcLShapeProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
