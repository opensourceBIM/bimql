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

import org.bimserver.models.ifc2x3tc1.IfcBezierCurve;

public class GetAttributeSubIfcBezierCurve {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBezierCurve(Object object, String string) {
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
		if (string.equals("Degree")) {
			resultList.add(((IfcBezierCurve) object).getDegree());
			 //2int
		}
		else if (string.equals("CurveForm")) {
			resultList.add(((IfcBezierCurve) object).getCurveForm());
			 //2IfcBSplineCurveForm
		}
		else if (string.equals("ControlPointsList")) {
			//3xxx
			for (int i = 0; i < ((IfcBezierCurve) object).getControlPointsList().size(); i++) {
				resultList.add(((IfcBezierCurve) object).getControlPointsList().get(i));
			}
			 //2EList
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcBezierCurve) object).getDim());
			 //3int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcBezierCurve) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcBezierCurve) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBezierCurve) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcBezierCurve) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
