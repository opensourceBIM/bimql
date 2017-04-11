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

import org.bimserver.models.ifc2x3tc1.IfcFillAreaStyleHatching;

public class SetAttributeSubIfcFillAreaStyleHatching {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcFillAreaStyleHatching() {
	}

	public SetAttributeSubIfcFillAreaStyleHatching(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("PatternStart")) {
			//1NoEList
			 //1void
			 //1IfcCartesianPoint
		}
		else if (attributeName.equals("HatchLineAngle")) {
			//1NoEList
			((IfcFillAreaStyleHatching) object).setHatchLineAngle(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("HatchLineAppearance")) {
			//1NoEList
			 //1void
			 //1IfcCurveStyle
		}
		else if (attributeName.equals("StartOfNextHatchLine")) {
			//1NoEList
			 //1void
			 //1IfcHatchLineDistanceSelect
		}
		else if (attributeName.equals("PointOfReferenceHatchLine")) {
			//1NoEList
			 //1void
			 //1IfcCartesianPoint
		}
		else if (attributeName.equals("HatchLineAngleAsString")) {
			//1NoEList
			((IfcFillAreaStyleHatching) object).setHatchLineAngleAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
