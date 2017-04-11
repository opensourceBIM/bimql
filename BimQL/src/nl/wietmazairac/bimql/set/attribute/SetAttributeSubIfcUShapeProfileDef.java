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

import org.bimserver.models.ifc2x3tc1.IfcUShapeProfileDef;

public class SetAttributeSubIfcUShapeProfileDef {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcUShapeProfileDef() {
	}

	public SetAttributeSubIfcUShapeProfileDef(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Depth")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setDepth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FlangeThicknessAsString")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setFlangeThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FilletRadiusAsString")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setFilletRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FlangeThickness")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setFlangeThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FilletRadius")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setFilletRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("EdgeRadiusAsString")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setEdgeRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CentreOfGravityInX")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setCentreOfGravityInX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DepthAsString")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setDepthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("EdgeRadius")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setEdgeRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CentreOfGravityInXAsString")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setCentreOfGravityInXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FlangeWidthAsString")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setFlangeWidthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FlangeSlopeAsString")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setFlangeSlopeAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FlangeWidth")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setFlangeWidth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FlangeSlope")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setFlangeSlope(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("WebThicknessAsString")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setWebThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("WebThickness")) {
			//1NoEList
			((IfcUShapeProfileDef) object).setWebThickness(Double.parseDouble(attributeNewValue));
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
			((IfcUShapeProfileDef) object).setProfileName(attributeNewValue);
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
