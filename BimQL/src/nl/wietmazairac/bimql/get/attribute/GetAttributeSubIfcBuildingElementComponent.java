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

import org.bimserver.models.ifc2x3tc1.IfcBuildingElementComponent;

public class GetAttributeSubIfcBuildingElementComponent {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBuildingElementComponent(Object object, String string) {
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
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getHasPorts().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getHasProjections().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcBuildingElementComponent) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcBuildingElementComponent) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcBuildingElementComponent) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcBuildingElementComponent) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getDecomposes().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementComponent) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcBuildingElementComponent) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcBuildingElementComponent) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcBuildingElementComponent) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcBuildingElementComponent) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcBuildingElementComponent) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcBuildingElementComponent) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
