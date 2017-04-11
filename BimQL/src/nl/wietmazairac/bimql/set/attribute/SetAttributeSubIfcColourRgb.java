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

import org.bimserver.models.ifc2x3tc1.IfcColourRgb;

public class SetAttributeSubIfcColourRgb {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcColourRgb() {
	}

	public SetAttributeSubIfcColourRgb(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("RedAsString")) {
			//1NoEList
			((IfcColourRgb) object).setRedAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("GreenAsString")) {
			//1NoEList
			((IfcColourRgb) object).setGreenAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BlueAsString")) {
			//1NoEList
			((IfcColourRgb) object).setBlueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Red")) {
			//1NoEList
			((IfcColourRgb) object).setRed(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Green")) {
			//1NoEList
			((IfcColourRgb) object).setGreen(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Blue")) {
			//1NoEList
			((IfcColourRgb) object).setBlue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
