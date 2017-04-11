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

import org.bimserver.models.ifc2x3tc1.IfcRepresentation;

public class GetAttributeSubIfcRepresentation {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRepresentation(Object object, String string) {
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
		if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcRepresentation) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcRepresentation) object).getLayerAssignments().get(i));
			}
			 //1EList
		}
		else if (string.equals("RepresentationIdentifier")) {
			resultList.add(((IfcRepresentation) object).getRepresentationIdentifier());
			 //1String
		}
		else if (string.equals("RepresentationType")) {
			resultList.add(((IfcRepresentation) object).getRepresentationType());
			 //1String
		}
		else if (string.equals("OfProductRepresentation")) {
			//3xxx
			for (int i = 0; i < ((IfcRepresentation) object).getOfProductRepresentation().size(); i++) {
				resultList.add(((IfcRepresentation) object).getOfProductRepresentation().get(i));
			}
			 //1EList
		}
		else if (string.equals("Items")) {
			//3xxx
			for (int i = 0; i < ((IfcRepresentation) object).getItems().size(); i++) {
				resultList.add(((IfcRepresentation) object).getItems().get(i));
			}
			 //1EList
		}
		else if (string.equals("ContextOfItems")) {
			resultList.add(((IfcRepresentation) object).getContextOfItems());
			 //1IfcRepresentationContext
		}
		else if (string.equals("RepresentationMap")) {
			//3xxx
			for (int i = 0; i < ((IfcRepresentation) object).getRepresentationMap().size(); i++) {
				resultList.add(((IfcRepresentation) object).getRepresentationMap().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
