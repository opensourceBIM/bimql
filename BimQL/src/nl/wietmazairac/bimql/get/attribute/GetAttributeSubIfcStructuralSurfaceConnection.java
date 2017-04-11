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

import org.bimserver.models.ifc2x3tc1.IfcStructuralSurfaceConnection;

public class GetAttributeSubIfcStructuralSurfaceConnection {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralSurfaceConnection(Object object, String string) {
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
		if (string.equals("AppliedCondition")) {
			resultList.add(((IfcStructuralSurfaceConnection) object).getAppliedCondition());
			 //2IfcBoundaryCondition
		}
		else if (string.equals("ConnectsStructuralMembers")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceConnection) object).getConnectsStructuralMembers().size(); i++) {
				resultList.add(((IfcStructuralSurfaceConnection) object).getConnectsStructuralMembers().get(i));
			}
			 //2EList
		}
		else if (string.equals("AssignedStructuralActivity")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceConnection) object).getAssignedStructuralActivity().size(); i++) {
				resultList.add(((IfcStructuralSurfaceConnection) object).getAssignedStructuralActivity().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralSurfaceConnection) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralSurfaceConnection) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceConnection) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralSurfaceConnection) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralSurfaceConnection) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceConnection) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralSurfaceConnection) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceConnection) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralSurfaceConnection) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceConnection) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralSurfaceConnection) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceConnection) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralSurfaceConnection) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceConnection) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralSurfaceConnection) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralSurfaceConnection) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralSurfaceConnection) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralSurfaceConnection) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralSurfaceConnection) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralSurfaceConnection) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
