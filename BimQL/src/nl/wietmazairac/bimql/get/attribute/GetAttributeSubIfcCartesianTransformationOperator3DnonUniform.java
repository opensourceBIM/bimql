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

import org.bimserver.models.ifc2x3tc1.IfcCartesianTransformationOperator3DnonUniform;

public class GetAttributeSubIfcCartesianTransformationOperator3DnonUniform {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCartesianTransformationOperator3DnonUniform(Object object, String string) {
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
		if (string.equals("Scale2AsString")) {
			resultList.add(((IfcCartesianTransformationOperator3DnonUniform) object).getScale2AsString());
			 //1String
		}
		else if (string.equals("Scale3AsString")) {
			resultList.add(((IfcCartesianTransformationOperator3DnonUniform) object).getScale3AsString());
			 //1String
		}
		else if (string.equals("Scale2")) {
			resultList.add(((IfcCartesianTransformationOperator3DnonUniform) object).getScale2());
			 //1double
		}
		else if (string.equals("Scale3")) {
			resultList.add(((IfcCartesianTransformationOperator3DnonUniform) object).getScale3());
			 //1double
		}
		else if (string.equals("Axis3")) {
			resultList.add(((IfcCartesianTransformationOperator3DnonUniform) object).getAxis3());
			 //2IfcDirection
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcCartesianTransformationOperator3DnonUniform) object).getDim());
			 //3int
		}
		else if (string.equals("Axis1")) {
			resultList.add(((IfcCartesianTransformationOperator3DnonUniform) object).getAxis1());
			 //3IfcDirection
		}
		else if (string.equals("Axis2")) {
			resultList.add(((IfcCartesianTransformationOperator3DnonUniform) object).getAxis2());
			 //3IfcDirection
		}
		else if (string.equals("Scale")) {
			resultList.add(((IfcCartesianTransformationOperator3DnonUniform) object).getScale());
			 //3double
		}
		else if (string.equals("LocalOrigin")) {
			resultList.add(((IfcCartesianTransformationOperator3DnonUniform) object).getLocalOrigin());
			 //3IfcCartesianPoint
		}
		else if (string.equals("ScaleAsString")) {
			resultList.add(((IfcCartesianTransformationOperator3DnonUniform) object).getScaleAsString());
			 //3String
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcCartesianTransformationOperator3DnonUniform) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcCartesianTransformationOperator3DnonUniform) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCartesianTransformationOperator3DnonUniform) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcCartesianTransformationOperator3DnonUniform) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
