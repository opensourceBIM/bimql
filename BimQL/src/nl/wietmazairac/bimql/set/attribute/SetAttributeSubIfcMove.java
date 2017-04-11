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

import org.bimserver.models.ifc2x3tc1.IfcMove;

public class SetAttributeSubIfcMove {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcMove() {
	}

	public SetAttributeSubIfcMove(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("MoveFrom")) {
			//1NoEList
			 //1void
			 //1IfcSpatialStructureElement
		}
		else if (attributeName.equals("MoveTo")) {
			//1NoEList
			 //1void
			 //1IfcSpatialStructureElement
		}
		else if (attributeName.equals("WorkMethod")) {
			//2NoEList
			((IfcMove) object).setWorkMethod(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("IsMilestone")) {
			//2NoEList
			 //2void
			 //2Tristate
		}
		else if (attributeName.equals("TaskId")) {
			//2NoEList
			((IfcMove) object).setTaskId(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Priority")) {
			//2NoEList
			 //2void
			 //2int
		}
		else if (attributeName.equals("Status")) {
			//2NoEList
			((IfcMove) object).setStatus(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcMove) object).setObjectType(attributeNewValue);
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
			((IfcMove) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcMove) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
