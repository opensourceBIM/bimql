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

import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadGroup;

public class GetAttributeSubIfcStructuralLoadGroup {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralLoadGroup(Object object, String string) {
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
		if (string.equals("Purpose")) {
			resultList.add(((IfcStructuralLoadGroup) object).getPurpose());
			 //1String
		}
		else if (string.equals("CoefficientAsString")) {
			resultList.add(((IfcStructuralLoadGroup) object).getCoefficientAsString());
			 //1String
		}
		else if (string.equals("SourceOfResultGroup")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLoadGroup) object).getSourceOfResultGroup().size(); i++) {
				resultList.add(((IfcStructuralLoadGroup) object).getSourceOfResultGroup().get(i));
			}
			 //1EList
		}
		else if (string.equals("ActionType")) {
			resultList.add(((IfcStructuralLoadGroup) object).getActionType());
			 //1IfcActionTypeEnum
		}
		else if (string.equals("ActionSource")) {
			resultList.add(((IfcStructuralLoadGroup) object).getActionSource());
			 //1IfcActionSourceTypeEnum
		}
		else if (string.equals("Coefficient")) {
			resultList.add(((IfcStructuralLoadGroup) object).getCoefficient());
			 //1double
		}
		else if (string.equals("LoadGroupFor")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLoadGroup) object).getLoadGroupFor().size(); i++) {
				resultList.add(((IfcStructuralLoadGroup) object).getLoadGroupFor().get(i));
			}
			 //1EList
		}
		else if (string.equals("PredefinedType")) {
			resultList.add(((IfcStructuralLoadGroup) object).getPredefinedType());
			 //1IfcLoadGroupTypeEnum
		}
		else if (string.equals("IsGroupedBy")) {
			resultList.add(((IfcStructuralLoadGroup) object).getIsGroupedBy());
			 //2IfcRelAssignsToGroup
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralLoadGroup) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLoadGroup) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralLoadGroup) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLoadGroup) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralLoadGroup) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLoadGroup) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralLoadGroup) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLoadGroup) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralLoadGroup) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLoadGroup) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralLoadGroup) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralLoadGroup) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralLoadGroup) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralLoadGroup) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralLoadGroup) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralLoadGroup) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
