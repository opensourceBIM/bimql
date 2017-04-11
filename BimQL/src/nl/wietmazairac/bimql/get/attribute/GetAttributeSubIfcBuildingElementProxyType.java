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

import org.bimserver.models.ifc2x3tc1.IfcBuildingElementProxyType;

public class GetAttributeSubIfcBuildingElementProxyType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBuildingElementProxyType(Object object, String string) {
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
		if (string.equals("PredefinedType")) {
			resultList.add(((IfcBuildingElementProxyType) object).getPredefinedType());
			 //1IfcBuildingElementProxyTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcBuildingElementProxyType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxyType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcBuildingElementProxyType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcBuildingElementProxyType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcBuildingElementProxyType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxyType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcBuildingElementProxyType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxyType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcBuildingElementProxyType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxyType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcBuildingElementProxyType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxyType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcBuildingElementProxyType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxyType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcBuildingElementProxyType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxyType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcBuildingElementProxyType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcBuildingElementProxyType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcBuildingElementProxyType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcBuildingElementProxyType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcBuildingElementProxyType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcBuildingElementProxyType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
