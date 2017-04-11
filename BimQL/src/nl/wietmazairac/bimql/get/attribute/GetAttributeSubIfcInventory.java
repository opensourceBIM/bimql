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

import org.bimserver.models.ifc2x3tc1.IfcInventory;

public class GetAttributeSubIfcInventory {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcInventory(Object object, String string) {
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
		if (string.equals("OriginalValue")) {
			resultList.add(((IfcInventory) object).getOriginalValue());
			 //1IfcCostValue
		}
		else if (string.equals("CurrentValue")) {
			resultList.add(((IfcInventory) object).getCurrentValue());
			 //1IfcCostValue
		}
		else if (string.equals("InventoryType")) {
			resultList.add(((IfcInventory) object).getInventoryType());
			 //1IfcInventoryTypeEnum
		}
		else if (string.equals("Jurisdiction")) {
			resultList.add(((IfcInventory) object).getJurisdiction());
			 //1IfcActorSelect
		}
		else if (string.equals("LastUpdateDate")) {
			resultList.add(((IfcInventory) object).getLastUpdateDate());
			 //1IfcCalendarDate
		}
		else if (string.equals("ResponsiblePersons")) {
			//3xxx
			for (int i = 0; i < ((IfcInventory) object).getResponsiblePersons().size(); i++) {
				resultList.add(((IfcInventory) object).getResponsiblePersons().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsGroupedBy")) {
			resultList.add(((IfcInventory) object).getIsGroupedBy());
			 //2IfcRelAssignsToGroup
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcInventory) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcInventory) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcInventory) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcInventory) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcInventory) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcInventory) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcInventory) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcInventory) object).getDecomposes().size(); i++) {
				resultList.add(((IfcInventory) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcInventory) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcInventory) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcInventory) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcInventory) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcInventory) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcInventory) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcInventory) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
