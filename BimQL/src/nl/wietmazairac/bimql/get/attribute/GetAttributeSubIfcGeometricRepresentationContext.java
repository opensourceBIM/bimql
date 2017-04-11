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

import org.bimserver.models.ifc2x3tc1.IfcGeometricRepresentationContext;

public class GetAttributeSubIfcGeometricRepresentationContext {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcGeometricRepresentationContext(Object object, String string) {
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
		if (string.equals("PrecisionAsString")) {
			resultList.add(((IfcGeometricRepresentationContext) object).getPrecisionAsString());
			 //1String
		}
		else if (string.equals("HasSubContexts")) {
			//3xxx
			for (int i = 0; i < ((IfcGeometricRepresentationContext) object).getHasSubContexts().size(); i++) {
				resultList.add(((IfcGeometricRepresentationContext) object).getHasSubContexts().get(i));
			}
			 //1EList
		}
		else if (string.equals("Precision")) {
			resultList.add(((IfcGeometricRepresentationContext) object).getPrecision());
			 //1double
		}
		else if (string.equals("TrueNorth")) {
			resultList.add(((IfcGeometricRepresentationContext) object).getTrueNorth());
			 //1IfcDirection
		}
		else if (string.equals("CoordinateSpaceDimension")) {
			resultList.add(((IfcGeometricRepresentationContext) object).getCoordinateSpaceDimension());
			 //1int
		}
		else if (string.equals("WorldCoordinateSystem")) {
			resultList.add(((IfcGeometricRepresentationContext) object).getWorldCoordinateSystem());
			 //1IfcAxis2Placement
		}
		return resultList;
	}
}
