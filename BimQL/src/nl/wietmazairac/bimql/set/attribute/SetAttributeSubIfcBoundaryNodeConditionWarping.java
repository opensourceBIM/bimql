package nl.wietmazairac.bimql.set.attribute;

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

import org.bimserver.models.ifc2x3tc1.IfcBoundaryNodeConditionWarping;

public class SetAttributeSubIfcBoundaryNodeConditionWarping {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcBoundaryNodeConditionWarping() {
	}

	public SetAttributeSubIfcBoundaryNodeConditionWarping(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("WarpingStiffness")) {
			//1NoEList
			((IfcBoundaryNodeConditionWarping) object).setWarpingStiffness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("WarpingStiffnessAsString")) {
			//1NoEList
			((IfcBoundaryNodeConditionWarping) object).setWarpingStiffnessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearStiffnessXAsString")) {
			//2NoEList
			((IfcBoundaryNodeConditionWarping) object).setLinearStiffnessXAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("LinearStiffnessYAsString")) {
			//2NoEList
			((IfcBoundaryNodeConditionWarping) object).setLinearStiffnessYAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("LinearStiffnessX")) {
			//2NoEList
			((IfcBoundaryNodeConditionWarping) object).setLinearStiffnessX(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("LinearStiffnessY")) {
			//2NoEList
			((IfcBoundaryNodeConditionWarping) object).setLinearStiffnessY(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("LinearStiffnessZ")) {
			//2NoEList
			((IfcBoundaryNodeConditionWarping) object).setLinearStiffnessZ(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("RotationalStiffnessXAsString")) {
			//2NoEList
			((IfcBoundaryNodeConditionWarping) object).setRotationalStiffnessXAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("RotationalStiffnessYAsString")) {
			//2NoEList
			((IfcBoundaryNodeConditionWarping) object).setRotationalStiffnessYAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("RotationalStiffnessZAsString")) {
			//2NoEList
			((IfcBoundaryNodeConditionWarping) object).setRotationalStiffnessZAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("LinearStiffnessZAsString")) {
			//2NoEList
			((IfcBoundaryNodeConditionWarping) object).setLinearStiffnessZAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("RotationalStiffnessX")) {
			//2NoEList
			((IfcBoundaryNodeConditionWarping) object).setRotationalStiffnessX(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("RotationalStiffnessY")) {
			//2NoEList
			((IfcBoundaryNodeConditionWarping) object).setRotationalStiffnessY(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("RotationalStiffnessZ")) {
			//2NoEList
			((IfcBoundaryNodeConditionWarping) object).setRotationalStiffnessZ(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcBoundaryNodeConditionWarping) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
