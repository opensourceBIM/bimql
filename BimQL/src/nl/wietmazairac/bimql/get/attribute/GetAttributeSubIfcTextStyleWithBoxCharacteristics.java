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

import org.bimserver.models.ifc2x3tc1.IfcTextStyleWithBoxCharacteristics;

public class GetAttributeSubIfcTextStyleWithBoxCharacteristics {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTextStyleWithBoxCharacteristics(Object object, String string) {
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
		if (string.equals("BoxSlantAngleAsString")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxSlantAngleAsString());
			 //1String
		}
		else if (string.equals("BoxRotateAngleAsString")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxRotateAngleAsString());
			 //1String
		}
		else if (string.equals("BoxHeight")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxHeight());
			 //1double
		}
		else if (string.equals("BoxWidth")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxWidth());
			 //1double
		}
		else if (string.equals("BoxHeightAsString")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxHeightAsString());
			 //1String
		}
		else if (string.equals("BoxWidthAsString")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxWidthAsString());
			 //1String
		}
		else if (string.equals("BoxSlantAngle")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxSlantAngle());
			 //1double
		}
		else if (string.equals("BoxRotateAngle")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxRotateAngle());
			 //1double
		}
		else if (string.equals("CharacterSpacing")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getCharacterSpacing());
			 //1IfcSizeSelect
		}
		return resultList;
	}
}
