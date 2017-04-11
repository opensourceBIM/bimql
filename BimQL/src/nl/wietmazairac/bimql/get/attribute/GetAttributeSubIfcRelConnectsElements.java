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

import org.bimserver.models.ifc2x3tc1.IfcRelConnectsElements;

public class GetAttributeSubIfcRelConnectsElements {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelConnectsElements(Object object, String string) {
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
		if (string.equals("RelatingElement")) {
			resultList.add(((IfcRelConnectsElements) object).getRelatingElement());
			 //1IfcElement
		}
		else if (string.equals("ConnectionGeometry")) {
			resultList.add(((IfcRelConnectsElements) object).getConnectionGeometry());
			 //1IfcConnectionGeometry
		}
		else if (string.equals("RelatedElement")) {
			resultList.add(((IfcRelConnectsElements) object).getRelatedElement());
			 //1IfcElement
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelConnectsElements) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelConnectsElements) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelConnectsElements) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelConnectsElements) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelConnectsElements) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
