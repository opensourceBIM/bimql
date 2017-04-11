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

import org.bimserver.models.ifc2x3tc1.IfcBoundaryNodeConditionWarping;

public class GetAttributeSubIfcBoundaryNodeConditionWarping {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBoundaryNodeConditionWarping(Object object, String string) {
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
		if (string.equals("WarpingStiffnessAsString")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getWarpingStiffnessAsString());
			 //1String
		}
		else if (string.equals("WarpingStiffness")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getWarpingStiffness());
			 //1double
		}
		else if (string.equals("LinearStiffnessXAsString")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getLinearStiffnessXAsString());
			 //2String
		}
		else if (string.equals("LinearStiffnessYAsString")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getLinearStiffnessYAsString());
			 //2String
		}
		else if (string.equals("LinearStiffnessZAsString")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getLinearStiffnessZAsString());
			 //2String
		}
		else if (string.equals("RotationalStiffnessX")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getRotationalStiffnessX());
			 //2double
		}
		else if (string.equals("RotationalStiffnessY")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getRotationalStiffnessY());
			 //2double
		}
		else if (string.equals("RotationalStiffnessZ")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getRotationalStiffnessZ());
			 //2double
		}
		else if (string.equals("LinearStiffnessX")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getLinearStiffnessX());
			 //2double
		}
		else if (string.equals("LinearStiffnessY")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getLinearStiffnessY());
			 //2double
		}
		else if (string.equals("LinearStiffnessZ")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getLinearStiffnessZ());
			 //2double
		}
		else if (string.equals("RotationalStiffnessXAsString")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getRotationalStiffnessXAsString());
			 //2String
		}
		else if (string.equals("RotationalStiffnessYAsString")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getRotationalStiffnessYAsString());
			 //2String
		}
		else if (string.equals("RotationalStiffnessZAsString")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getRotationalStiffnessZAsString());
			 //2String
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcBoundaryNodeConditionWarping) object).getName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
