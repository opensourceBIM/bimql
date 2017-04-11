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

import org.bimserver.models.ifc2x3tc1.IfcAsset;

public class GetAttributeSubIfcAsset {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAsset(Object object, String string) {
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
		if (string.equals("AssetID")) {
			resultList.add(((IfcAsset) object).getAssetID());
			 //1String
		}
		else if (string.equals("User")) {
			resultList.add(((IfcAsset) object).getUser());
			 //1IfcActorSelect
		}
		else if (string.equals("TotalReplacementCost")) {
			resultList.add(((IfcAsset) object).getTotalReplacementCost());
			 //1IfcCostValue
		}
		else if (string.equals("OriginalValue")) {
			resultList.add(((IfcAsset) object).getOriginalValue());
			 //1IfcCostValue
		}
		else if (string.equals("CurrentValue")) {
			resultList.add(((IfcAsset) object).getCurrentValue());
			 //1IfcCostValue
		}
		else if (string.equals("ResponsiblePerson")) {
			resultList.add(((IfcAsset) object).getResponsiblePerson());
			 //1IfcPerson
		}
		else if (string.equals("IncorporationDate")) {
			resultList.add(((IfcAsset) object).getIncorporationDate());
			 //1IfcCalendarDate
		}
		else if (string.equals("DepreciatedValue")) {
			resultList.add(((IfcAsset) object).getDepreciatedValue());
			 //1IfcCostValue
		}
		else if (string.equals("Owner")) {
			resultList.add(((IfcAsset) object).getOwner());
			 //1IfcActorSelect
		}
		else if (string.equals("IsGroupedBy")) {
			resultList.add(((IfcAsset) object).getIsGroupedBy());
			 //2IfcRelAssignsToGroup
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcAsset) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcAsset) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcAsset) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcAsset) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcAsset) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcAsset) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcAsset) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcAsset) object).getDecomposes().size(); i++) {
				resultList.add(((IfcAsset) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcAsset) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcAsset) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcAsset) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcAsset) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcAsset) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcAsset) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcAsset) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
