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

import org.bimserver.models.ifc2x3tc1.IfcTrimmedCurve;

public class GetAttributeSubIfcTrimmedCurve {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTrimmedCurve(Object object, String string) {
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
			resultList.add(((IfcTrimmedCurve) object).getBasisCurve());
			 //1IfcCurve
		}
		else if (string.equals("Trim1")) {
			//3xxx
			for (int i = 0; i < ((IfcTrimmedCurve) object).getTrim1().size(); i++) {
				resultList.add(((IfcTrimmedCurve) object).getTrim1().get(i));
			}
			 //1EList
		}
		else if (string.equals("Trim2")) {
			//3xxx
			for (int i = 0; i < ((IfcTrimmedCurve) object).getTrim2().size(); i++) {
				resultList.add(((IfcTrimmedCurve) object).getTrim2().get(i));
			}
			 //1EList
		}
		else if (string.equals("SenseAgreement")) {
			resultList.add(((IfcTrimmedCurve) object).getSenseAgreement());
			 //1Tristate
		}
		else if (string.equals("MasterRepresentation")) {
			resultList.add(((IfcTrimmedCurve) object).getMasterRepresentation());
			 //1IfcTrimmingPreference
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcTrimmedCurve) object).getDim());
			 //3int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcTrimmedCurve) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcTrimmedCurve) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTrimmedCurve) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcTrimmedCurve) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
