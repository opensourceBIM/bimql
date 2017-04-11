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

import org.bimserver.models.ifc2x3tc1.IfcCraneRailAShapeProfileDef;

public class SetAttributeSubIfcCraneRailAShapeProfileDef {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcCraneRailAShapeProfileDef() {
	}

	public SetAttributeSubIfcCraneRailAShapeProfileDef(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("CentreOfGravityInYAsString")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setCentreOfGravityInYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Radius")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("HeadWidth")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setHeadWidth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("OverallHeightAsString")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setOverallHeightAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BaseWidth2AsString")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setBaseWidth2AsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("HeadDepth2AsString")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setHeadDepth2AsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("HeadDepth3AsString")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setHeadDepth3AsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("WebThicknessAsString")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setWebThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BaseWidth4AsString")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setBaseWidth4AsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BaseDepth1AsString")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setBaseDepth1AsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BaseDepth2AsString")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setBaseDepth2AsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BaseDepth3AsString")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setBaseDepth3AsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CentreOfGravityInY")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setCentreOfGravityInY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RadiusAsString")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("OverallHeight")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setOverallHeight(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BaseWidth2")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setBaseWidth2(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("HeadWidthAsString")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setHeadWidthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("HeadDepth2")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setHeadDepth2(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("HeadDepth3")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setHeadDepth3(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("WebThickness")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setWebThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BaseWidth4")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setBaseWidth4(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BaseDepth1")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setBaseDepth1(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BaseDepth2")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setBaseDepth2(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BaseDepth3")) {
			//1NoEList
			((IfcCraneRailAShapeProfileDef) object).setBaseDepth3(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Position")) {
			//2NoEList
			 //2void
			 //2IfcAxis2Placement2D
		}
		else if (attributeName.equals("ProfileName")) {
			//5NoEList
			((IfcCraneRailAShapeProfileDef) object).setProfileName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("ProfileType")) {
			//5NoEList
			 //5void
			 //5IfcProfileTypeEnum
		}
		else {
		}
	}
}
