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

import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadTemperature;

public class SetAttributeSubIfcStructuralLoadTemperature {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralLoadTemperature() {
	}

	public SetAttributeSubIfcStructuralLoadTemperature(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("DeltaT_Y")) {
			//1NoEList
			((IfcStructuralLoadTemperature) object).setDeltaT_Y(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DeltaT_Z")) {
			//1NoEList
			((IfcStructuralLoadTemperature) object).setDeltaT_Z(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DeltaT_Constant")) {
			//1NoEList
			((IfcStructuralLoadTemperature) object).setDeltaT_Constant(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DeltaT_YAsString")) {
			//1NoEList
			((IfcStructuralLoadTemperature) object).setDeltaT_YAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DeltaT_ZAsString")) {
			//1NoEList
			((IfcStructuralLoadTemperature) object).setDeltaT_ZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DeltaT_ConstantAsString")) {
			//1NoEList
			((IfcStructuralLoadTemperature) object).setDeltaT_ConstantAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcStructuralLoadTemperature) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
