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

import org.bimserver.models.ifc2x3tc1.IfcOffsetCurve2D;

public class GetAttributeSubIfcOffsetCurve2D {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcOffsetCurve2D(Object object, String string) {
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
		if (string.equals("BasisCurve")) {
			resultList.add(((IfcOffsetCurve2D) object).getBasisCurve());
			 //1IfcCurve
		}
		else if (string.equals("DistanceAsString")) {
			resultList.add(((IfcOffsetCurve2D) object).getDistanceAsString());
			 //1String
		}
		else if (string.equals("Distance")) {
			resultList.add(((IfcOffsetCurve2D) object).getDistance());
			 //1double
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcOffsetCurve2D) object).getDim());
			 //2int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcOffsetCurve2D) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcOffsetCurve2D) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcOffsetCurve2D) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcOffsetCurve2D) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
