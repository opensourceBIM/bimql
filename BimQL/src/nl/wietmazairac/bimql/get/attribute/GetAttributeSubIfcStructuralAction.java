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

import org.bimserver.models.ifc2x3tc1.IfcStructuralAction;

public class GetAttributeSubIfcStructuralAction {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralAction(Object object, String string) {
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
		if (string.equals("CausedBy")) {
			resultList.add(((IfcStructuralAction) object).getCausedBy());
			 //1IfcStructuralReaction
		}
		else if (string.equals("DestabilizingLoad")) {
			resultList.add(((IfcStructuralAction) object).getDestabilizingLoad());
			 //1Tristate
		}
		else if (string.equals("AppliedLoad")) {
			resultList.add(((IfcStructuralAction) object).getAppliedLoad());
			 //2IfcStructuralLoad
		}
		else if (string.equals("GlobalOrLocal")) {
			resultList.add(((IfcStructuralAction) object).getGlobalOrLocal());
			 //2IfcGlobalOrLocalEnum
		}
		else if (string.equals("AssignedToStructuralItem")) {
			resultList.add(((IfcStructuralAction) object).getAssignedToStructuralItem());
			 //2IfcRelConnectsStructuralActivity
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralAction) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralAction) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAction) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralAction) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralAction) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAction) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralAction) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAction) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralAction) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAction) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralAction) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAction) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralAction) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAction) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralAction) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralAction) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralAction) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralAction) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralAction) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralAction) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
