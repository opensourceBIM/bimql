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

import org.bimserver.models.ifc2x3tc1.IfcRectangularTrimmedSurface;

public class GetAttributeSubIfcRectangularTrimmedSurface {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRectangularTrimmedSurface(Object object, String string) {
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
		if (string.equals("Dim")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getDim());
			 //1int
		}
		else if (string.equals("BasisSurface")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getBasisSurface());
			 //1IfcSurface
		}
		else if (string.equals("U1AsString")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getU1AsString());
			 //1String
		}
		else if (string.equals("V1AsString")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getV1AsString());
			 //1String
		}
		else if (string.equals("U2AsString")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getU2AsString());
			 //1String
		}
		else if (string.equals("V2AsString")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getV2AsString());
			 //1String
		}
		else if (string.equals("U1")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getU1());
			 //1double
		}
		else if (string.equals("V1")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getV1());
			 //1double
		}
		else if (string.equals("U2")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getU2());
			 //1double
		}
		else if (string.equals("V2")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getV2());
			 //1double
		}
		else if (string.equals("Usense")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getUsense());
			 //1Tristate
		}
		else if (string.equals("Vsense")) {
			resultList.add(((IfcRectangularTrimmedSurface) object).getVsense());
			 //1Tristate
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcRectangularTrimmedSurface) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcRectangularTrimmedSurface) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcRectangularTrimmedSurface) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcRectangularTrimmedSurface) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
