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

import org.bimserver.models.ifc2x3tc1.IfcRelNests;

public class GetAttributeSubIfcRelNests {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelNests(Object object, String string) {
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
		if (string.equals("RelatedObjects")) {
			//3xxx
			for (int i = 0; i < ((IfcRelNests) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelNests) object).getRelatedObjects().get(i));
			}
			 //2EList
		}
		else if (string.equals("RelatingObject")) {
			resultList.add(((IfcRelNests) object).getRelatingObject());
			 //2IfcObjectDefinition
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelNests) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelNests) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelNests) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelNests) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelNests) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
