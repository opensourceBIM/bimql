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

import org.bimserver.models.ifc2x3tc1.IfcConstructionProductResource;

public class GetAttributeSubIfcConstructionProductResource {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcConstructionProductResource(Object object, String string) {
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
		if (string.equals("ResourceGroup")) {
			resultList.add(((IfcConstructionProductResource) object).getResourceGroup());
			 //2String
		}
		else if (string.equals("BaseQuantity")) {
			resultList.add(((IfcConstructionProductResource) object).getBaseQuantity());
			 //2IfcMeasureWithUnit
		}
		else if (string.equals("ResourceIdentifier")) {
			resultList.add(((IfcConstructionProductResource) object).getResourceIdentifier());
			 //2String
		}
		else if (string.equals("ResourceConsumption")) {
			resultList.add(((IfcConstructionProductResource) object).getResourceConsumption());
			 //2IfcResourceConsumptionEnum
		}
		else if (string.equals("ResourceOf")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionProductResource) object).getResourceOf().size(); i++) {
				resultList.add(((IfcConstructionProductResource) object).getResourceOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcConstructionProductResource) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionProductResource) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcConstructionProductResource) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionProductResource) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcConstructionProductResource) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionProductResource) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcConstructionProductResource) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionProductResource) object).getDecomposes().size(); i++) {
				resultList.add(((IfcConstructionProductResource) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionProductResource) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcConstructionProductResource) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcConstructionProductResource) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcConstructionProductResource) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcConstructionProductResource) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcConstructionProductResource) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcConstructionProductResource) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
