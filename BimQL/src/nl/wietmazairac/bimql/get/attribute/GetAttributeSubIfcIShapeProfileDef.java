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

import org.bimserver.models.ifc2x3tc1.IfcIShapeProfileDef;

public class GetAttributeSubIfcIShapeProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcIShapeProfileDef(Object object, String string) {
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
		if (string.equals("OverallWidthAsString")) {
			resultList.add(((IfcIShapeProfileDef) object).getOverallWidthAsString());
			 //1String
		}
		else if (string.equals("OverallDepthAsString")) {
			resultList.add(((IfcIShapeProfileDef) object).getOverallDepthAsString());
			 //1String
		}
		else if (string.equals("FlangeThicknessAsString")) {
			resultList.add(((IfcIShapeProfileDef) object).getFlangeThicknessAsString());
			 //1String
		}
		else if (string.equals("FilletRadiusAsString")) {
			resultList.add(((IfcIShapeProfileDef) object).getFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("OverallWidth")) {
			resultList.add(((IfcIShapeProfileDef) object).getOverallWidth());
			 //1double
		}
		else if (string.equals("OverallDepth")) {
			resultList.add(((IfcIShapeProfileDef) object).getOverallDepth());
			 //1double
		}
		else if (string.equals("FlangeThickness")) {
			resultList.add(((IfcIShapeProfileDef) object).getFlangeThickness());
			 //1double
		}
		else if (string.equals("FilletRadius")) {
			resultList.add(((IfcIShapeProfileDef) object).getFilletRadius());
			 //1double
		}
		else if (string.equals("WebThickness")) {
			resultList.add(((IfcIShapeProfileDef) object).getWebThickness());
			 //1double
		}
		else if (string.equals("WebThicknessAsString")) {
			resultList.add(((IfcIShapeProfileDef) object).getWebThicknessAsString());
			 //1String
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcIShapeProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcIShapeProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcIShapeProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
