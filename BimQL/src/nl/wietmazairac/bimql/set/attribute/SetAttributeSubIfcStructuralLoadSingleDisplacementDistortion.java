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

import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadSingleDisplacementDistortion;

public class SetAttributeSubIfcStructuralLoadSingleDisplacementDistortion {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralLoadSingleDisplacementDistortion() {
	}

	public SetAttributeSubIfcStructuralLoadSingleDisplacementDistortion(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Distortion")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setDistortion(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DistortionAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setDistortionAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DisplacementX")) {
			//2NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setDisplacementX(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("DisplacementY")) {
			//2NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setDisplacementY(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("DisplacementZ")) {
			//2NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setDisplacementZ(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("DisplacementXAsString")) {
			//2NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setDisplacementXAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("DisplacementYAsString")) {
			//2NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setDisplacementYAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("DisplacementZAsString")) {
			//2NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setDisplacementZAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("RotationalDisplacementRX")) {
			//2NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setRotationalDisplacementRX(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("RotationalDisplacementRY")) {
			//2NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setRotationalDisplacementRY(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("RotationalDisplacementRZ")) {
			//2NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setRotationalDisplacementRZ(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("RotationalDisplacementRXAsString")) {
			//2NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setRotationalDisplacementRXAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("RotationalDisplacementRYAsString")) {
			//2NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setRotationalDisplacementRYAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("RotationalDisplacementRZAsString")) {
			//2NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setRotationalDisplacementRZAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcStructuralLoadSingleDisplacementDistortion) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
