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

import org.bimserver.models.ifc2x3tc1.IfcAsymmetricIShapeProfileDef;

public class SetAttributeSubIfcAsymmetricIShapeProfileDef {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcAsymmetricIShapeProfileDef() {
	}

	public SetAttributeSubIfcAsymmetricIShapeProfileDef(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("TopFlangeThicknessAsString")) {
			//1NoEList
			((IfcAsymmetricIShapeProfileDef) object).setTopFlangeThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TopFlangeFilletRadiusAsString")) {
			//1NoEList
			((IfcAsymmetricIShapeProfileDef) object).setTopFlangeFilletRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TopFlangeWidthAsString")) {
			//1NoEList
			((IfcAsymmetricIShapeProfileDef) object).setTopFlangeWidthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TopFlangeThickness")) {
			//1NoEList
			((IfcAsymmetricIShapeProfileDef) object).setTopFlangeThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TopFlangeFilletRadius")) {
			//1NoEList
			((IfcAsymmetricIShapeProfileDef) object).setTopFlangeFilletRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TopFlangeWidth")) {
			//1NoEList
			((IfcAsymmetricIShapeProfileDef) object).setTopFlangeWidth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CentreOfGravityInYAsString")) {
			//1NoEList
			((IfcAsymmetricIShapeProfileDef) object).setCentreOfGravityInYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CentreOfGravityInY")) {
			//1NoEList
			((IfcAsymmetricIShapeProfileDef) object).setCentreOfGravityInY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("OverallWidthAsString")) {
			//2NoEList
			((IfcAsymmetricIShapeProfileDef) object).setOverallWidthAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("OverallDepthAsString")) {
			//2NoEList
			((IfcAsymmetricIShapeProfileDef) object).setOverallDepthAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("FlangeThicknessAsString")) {
			//2NoEList
			((IfcAsymmetricIShapeProfileDef) object).setFlangeThicknessAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("FilletRadiusAsString")) {
			//2NoEList
			((IfcAsymmetricIShapeProfileDef) object).setFilletRadiusAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("OverallWidth")) {
			//2NoEList
			((IfcAsymmetricIShapeProfileDef) object).setOverallWidth(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("OverallDepth")) {
			//2NoEList
			((IfcAsymmetricIShapeProfileDef) object).setOverallDepth(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("FlangeThickness")) {
			//2NoEList
			((IfcAsymmetricIShapeProfileDef) object).setFlangeThickness(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("FilletRadius")) {
			//2NoEList
			((IfcAsymmetricIShapeProfileDef) object).setFilletRadius(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("WebThicknessAsString")) {
			//2NoEList
			((IfcAsymmetricIShapeProfileDef) object).setWebThicknessAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("WebThickness")) {
			//2NoEList
			((IfcAsymmetricIShapeProfileDef) object).setWebThickness(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("Position")) {
			//5NoEList
			 //5void
			 //5IfcAxis2Placement2D
		}
		else if (attributeName.equals("ProfileName")) {
			//5NoEList
			((IfcAsymmetricIShapeProfileDef) object).setProfileName(attributeNewValue);
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
