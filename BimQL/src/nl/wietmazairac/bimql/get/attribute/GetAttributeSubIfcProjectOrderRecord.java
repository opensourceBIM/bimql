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

import org.bimserver.models.ifc2x3tc1.IfcProjectOrderRecord;

public class GetAttributeSubIfcProjectOrderRecord {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProjectOrderRecord(Object object, String string) {
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
		if (string.equals("Records")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getRecords().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getRecords().get(i));
			}
			 //1EList
		}
		else if (string.equals("PredefinedType")) {
			resultList.add(((IfcProjectOrderRecord) object).getPredefinedType());
			 //1IfcProjectOrderRecordTypeEnum
		}
		else if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getControls().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getControls().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcProjectOrderRecord) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getDecomposes().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcProjectOrderRecord) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcProjectOrderRecord) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcProjectOrderRecord) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcProjectOrderRecord) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcProjectOrderRecord) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
