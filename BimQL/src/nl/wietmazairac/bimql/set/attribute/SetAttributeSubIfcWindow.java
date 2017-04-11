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

import org.bimserver.models.ifc2x3tc1.IfcWindow;

public class SetAttributeSubIfcWindow {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcWindow() {
	}

	public SetAttributeSubIfcWindow(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("OverallWidthAsString")) {
			//1NoEList
			((IfcWindow) object).setOverallWidthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("OverallWidth")) {
			//1NoEList
			((IfcWindow) object).setOverallWidth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("OverallHeightAsString")) {
			//1NoEList
			((IfcWindow) object).setOverallHeightAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("OverallHeight")) {
			//1NoEList
			((IfcWindow) object).setOverallHeight(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Tag")) {
			//5NoEList
			((IfcWindow) object).setTag(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("ObjectPlacement")) {
			//5NoEList
			 //5void
			 //5IfcObjectPlacement
		}
		else if (attributeName.equals("Representation")) {
			//5NoEList
			 //5void
			 //5IfcProductRepresentation
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcWindow) object).setObjectType(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcWindow) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcWindow) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
