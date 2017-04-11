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

import org.bimserver.models.ifc2x3tc1.IfcBuildingElement;

public class GetAttributeSubIfcBuildingElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBuildingElement(Object object, String string) {
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
		if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getHasStructuralMember().get(i));
			}
			 //2EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getReferencedInStructures().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getIsConnectionRealization().get(i));
			}
			 //2EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getProvidesBoundaries().get(i));
			}
			 //2EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getContainedInStructure().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getHasPorts().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getHasPorts().get(i));
			}
			 //2EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getFillsVoids().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getConnectedTo().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getHasCoverings().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getHasProjections().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getHasProjections().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getHasOpenings().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getConnectedFrom().get(i));
			}
			 //2EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcBuildingElement) object).getTag());
			 //2String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcBuildingElement) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcBuildingElement) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcBuildingElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcBuildingElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcBuildingElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcBuildingElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcBuildingElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcBuildingElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcBuildingElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
