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

import org.bimserver.models.ifc2x3tc1.IfcPlanarExtent;

public class GetAttributeSubIfcPlanarExtent {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPlanarExtent(Object object, String string) {
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
		if (string.equals("SizeInXAsString")) {
			resultList.add(((IfcPlanarExtent) object).getSizeInXAsString());
			 //1String
		}
		else if (string.equals("SizeInYAsString")) {
			resultList.add(((IfcPlanarExtent) object).getSizeInYAsString());
			 //1String
		}
		else if (string.equals("SizeInX")) {
			resultList.add(((IfcPlanarExtent) object).getSizeInX());
			 //1double
		}
		else if (string.equals("SizeInY")) {
			resultList.add(((IfcPlanarExtent) object).getSizeInY());
			 //1double
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcPlanarExtent) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcPlanarExtent) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcPlanarExtent) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcPlanarExtent) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
