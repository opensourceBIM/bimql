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

import org.bimserver.models.ifc2x3tc1.IfcWorkPlan;

public class GetAttributeSubIfcWorkPlan {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcWorkPlan(Object object, String string) {
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
		if (string.equals("CreationDate")) {
			resultList.add(((IfcWorkPlan) object).getCreationDate());
			 //2IfcDateTimeSelect
		}
		else if (string.equals("Purpose")) {
			resultList.add(((IfcWorkPlan) object).getPurpose());
			 //2String
		}
		else if (string.equals("TotalFloat")) {
			resultList.add(((IfcWorkPlan) object).getTotalFloat());
			 //2double
		}
		else if (string.equals("TotalFloatAsString")) {
			resultList.add(((IfcWorkPlan) object).getTotalFloatAsString());
			 //2String
		}
		else if (string.equals("DurationAsString")) {
			resultList.add(((IfcWorkPlan) object).getDurationAsString());
			 //2String
		}
		else if (string.equals("FinishTime")) {
			resultList.add(((IfcWorkPlan) object).getFinishTime());
			 //2IfcDateTimeSelect
		}
		else if (string.equals("WorkControlType")) {
			resultList.add(((IfcWorkPlan) object).getWorkControlType());
			 //2IfcWorkControlTypeEnum
		}
		else if (string.equals("UserDefinedControlType")) {
			resultList.add(((IfcWorkPlan) object).getUserDefinedControlType());
			 //2String
		}
		else if (string.equals("Creators")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkPlan) object).getCreators().size(); i++) {
				resultList.add(((IfcWorkPlan) object).getCreators().get(i));
			}
			 //2EList
		}
		else if (string.equals("Duration")) {
			resultList.add(((IfcWorkPlan) object).getDuration());
			 //2double
		}
		else if (string.equals("StartTime")) {
			resultList.add(((IfcWorkPlan) object).getStartTime());
			 //2IfcDateTimeSelect
		}
		else if (string.equals("Identifier")) {
			resultList.add(((IfcWorkPlan) object).getIdentifier());
			 //2String
		}
		else if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkPlan) object).getControls().size(); i++) {
				resultList.add(((IfcWorkPlan) object).getControls().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcWorkPlan) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkPlan) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcWorkPlan) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkPlan) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcWorkPlan) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkPlan) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcWorkPlan) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkPlan) object).getDecomposes().size(); i++) {
				resultList.add(((IfcWorkPlan) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkPlan) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcWorkPlan) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcWorkPlan) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcWorkPlan) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcWorkPlan) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcWorkPlan) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcWorkPlan) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
