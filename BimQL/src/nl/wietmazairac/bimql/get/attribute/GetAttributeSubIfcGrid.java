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

import org.bimserver.models.ifc2x3tc1.IfcGrid;

public class GetAttributeSubIfcGrid {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcGrid(Object object, String string) {
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
		if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcGrid) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcGrid) object).getContainedInStructure().get(i));
			}
			 //1EList
		}
		else if (string.equals("UAxes")) {
			//3xxx
			for (int i = 0; i < ((IfcGrid) object).getUAxes().size(); i++) {
				resultList.add(((IfcGrid) object).getUAxes().get(i));
			}
			 //1EList
		}
		else if (string.equals("VAxes")) {
			//3xxx
			for (int i = 0; i < ((IfcGrid) object).getVAxes().size(); i++) {
				resultList.add(((IfcGrid) object).getVAxes().get(i));
			}
			 //1EList
		}
		else if (string.equals("WAxes")) {
			//3xxx
			for (int i = 0; i < ((IfcGrid) object).getWAxes().size(); i++) {
				resultList.add(((IfcGrid) object).getWAxes().get(i));
			}
			 //1EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcGrid) object).getObjectPlacement());
			 //2IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcGrid) object).getRepresentation());
			 //2IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcGrid) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcGrid) object).getReferencedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcGrid) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcGrid) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcGrid) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcGrid) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcGrid) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcGrid) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcGrid) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcGrid) object).getDecomposes().size(); i++) {
				resultList.add(((IfcGrid) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcGrid) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcGrid) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcGrid) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcGrid) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcGrid) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcGrid) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcGrid) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
