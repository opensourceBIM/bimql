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

import org.bimserver.models.ifc2x3tc1.IfcMove;

public class GetAttributeSubIfcMove {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMove(Object object, String string) {
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
		if (string.equals("MoveFrom")) {
			resultList.add(((IfcMove) object).getMoveFrom());
			 //1IfcSpatialStructureElement
		}
		else if (string.equals("MoveTo")) {
			resultList.add(((IfcMove) object).getMoveTo());
			 //1IfcSpatialStructureElement
		}
		else if (string.equals("PunchList")) {
			//3xxx
			for (int i = 0; i < ((IfcMove) object).getPunchList().size(); i++) {
				resultList.add(((IfcMove) object).getPunchList().get(i));
			}
			 //1EList
		}
		else if (string.equals("TaskId")) {
			resultList.add(((IfcMove) object).getTaskId());
			 //2String
		}
		else if (string.equals("WorkMethod")) {
			resultList.add(((IfcMove) object).getWorkMethod());
			 //2String
		}
		else if (string.equals("IsMilestone")) {
			resultList.add(((IfcMove) object).getIsMilestone());
			 //2Tristate
		}
		else if (string.equals("Priority")) {
			resultList.add(((IfcMove) object).getPriority());
			 //2int
		}
		else if (string.equals("Status")) {
			resultList.add(((IfcMove) object).getStatus());
			 //2String
		}
		else if (string.equals("OperatesOn")) {
			//3xxx
			for (int i = 0; i < ((IfcMove) object).getOperatesOn().size(); i++) {
				resultList.add(((IfcMove) object).getOperatesOn().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsSuccessorFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcMove) object).getIsSuccessorFrom().size(); i++) {
				resultList.add(((IfcMove) object).getIsSuccessorFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsPredecessorTo")) {
			//3xxx
			for (int i = 0; i < ((IfcMove) object).getIsPredecessorTo().size(); i++) {
				resultList.add(((IfcMove) object).getIsPredecessorTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcMove) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcMove) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcMove) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcMove) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcMove) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcMove) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcMove) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcMove) object).getDecomposes().size(); i++) {
				resultList.add(((IfcMove) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcMove) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcMove) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcMove) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcMove) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcMove) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcMove) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcMove) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
