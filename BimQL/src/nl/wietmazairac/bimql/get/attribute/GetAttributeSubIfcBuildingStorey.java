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

import org.bimserver.models.ifc2x3tc1.IfcBuildingStorey;

public class GetAttributeSubIfcBuildingStorey {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBuildingStorey(Object object, String string) {
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
		if (string.equals("Elevation")) {
			resultList.add(((IfcBuildingStorey) object).getElevation());
			 //1double
		}
		else if (string.equals("ElevationAsString")) {
			resultList.add(((IfcBuildingStorey) object).getElevationAsString());
			 //1String
		}
		else if (string.equals("LongName")) {
			resultList.add(((IfcBuildingStorey) object).getLongName());
			 //2String
		}
		else if (string.equals("ReferencesElements")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingStorey) object).getReferencesElements().size(); i++) {
				resultList.add(((IfcBuildingStorey) object).getReferencesElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("CompositionType")) {
			resultList.add(((IfcBuildingStorey) object).getCompositionType());
			 //2IfcElementCompositionEnum
		}
		else if (string.equals("ServicedBySystems")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingStorey) object).getServicedBySystems().size(); i++) {
				resultList.add(((IfcBuildingStorey) object).getServicedBySystems().get(i));
			}
			 //2EList
		}
		else if (string.equals("ContainsElements")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingStorey) object).getContainsElements().size(); i++) {
				resultList.add(((IfcBuildingStorey) object).getContainsElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcBuildingStorey) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcBuildingStorey) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingStorey) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcBuildingStorey) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcBuildingStorey) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingStorey) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcBuildingStorey) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingStorey) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcBuildingStorey) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingStorey) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcBuildingStorey) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingStorey) object).getDecomposes().size(); i++) {
				resultList.add(((IfcBuildingStorey) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingStorey) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcBuildingStorey) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcBuildingStorey) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcBuildingStorey) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcBuildingStorey) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcBuildingStorey) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcBuildingStorey) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
