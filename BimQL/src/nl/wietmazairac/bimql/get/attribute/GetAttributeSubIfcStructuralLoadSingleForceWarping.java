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

import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadSingleForceWarping;

public class GetAttributeSubIfcStructuralLoadSingleForceWarping {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralLoadSingleForceWarping(Object object, String string) {
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
		if (string.equals("WarpingMoment")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getWarpingMoment());
			 //1double
		}
		else if (string.equals("WarpingMomentAsString")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getWarpingMomentAsString());
			 //1String
		}
		else if (string.equals("ForceXAsString")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getForceXAsString());
			 //2String
		}
		else if (string.equals("ForceYAsString")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getForceYAsString());
			 //2String
		}
		else if (string.equals("ForceZAsString")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getForceZAsString());
			 //2String
		}
		else if (string.equals("MomentXAsString")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getMomentXAsString());
			 //2String
		}
		else if (string.equals("MomentYAsString")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getMomentYAsString());
			 //2String
		}
		else if (string.equals("MomentZAsString")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getMomentZAsString());
			 //2String
		}
		else if (string.equals("ForceX")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getForceX());
			 //2double
		}
		else if (string.equals("ForceY")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getForceY());
			 //2double
		}
		else if (string.equals("ForceZ")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getForceZ());
			 //2double
		}
		else if (string.equals("MomentX")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getMomentX());
			 //2double
		}
		else if (string.equals("MomentY")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getMomentY());
			 //2double
		}
		else if (string.equals("MomentZ")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getMomentZ());
			 //2double
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralLoadSingleForceWarping) object).getName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
