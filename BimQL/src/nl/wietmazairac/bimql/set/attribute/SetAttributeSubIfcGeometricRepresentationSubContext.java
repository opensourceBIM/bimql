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

import org.bimserver.models.ifc2x3tc1.IfcGeometricRepresentationSubContext;

public class SetAttributeSubIfcGeometricRepresentationSubContext {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcGeometricRepresentationSubContext() {
	}

	public SetAttributeSubIfcGeometricRepresentationSubContext(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ParentContext")) {
			//1NoEList
			 //1void
			 //1IfcGeometricRepresentationContext
		}
		else if (attributeName.equals("TargetScale")) {
			//1NoEList
			((IfcGeometricRepresentationSubContext) object).setTargetScale(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TargetView")) {
			//1NoEList
			 //1void
			 //1IfcGeometricProjectionEnum
		}
		else if (attributeName.equals("TargetScaleAsString")) {
			//1NoEList
			((IfcGeometricRepresentationSubContext) object).setTargetScaleAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("UserDefinedTargetView")) {
			//1NoEList
			((IfcGeometricRepresentationSubContext) object).setUserDefinedTargetView(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PrecisionAsString")) {
			//2NoEList
			((IfcGeometricRepresentationSubContext) object).setPrecisionAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("CoordinateSpaceDimension")) {
			//2NoEList
			 //2void
			 //2int
		}
		else if (attributeName.equals("WorldCoordinateSystem")) {
			//2NoEList
			 //2void
			 //2IfcAxis2Placement
		}
		else if (attributeName.equals("Precision")) {
			//2NoEList
			((IfcGeometricRepresentationSubContext) object).setPrecision(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("TrueNorth")) {
			//2NoEList
			 //2void
			 //2IfcDirection
		}
		else if (attributeName.equals("ContextIdentifier")) {
			//5NoEList
			((IfcGeometricRepresentationSubContext) object).setContextIdentifier(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("ContextType")) {
			//5NoEList
			((IfcGeometricRepresentationSubContext) object).setContextType(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
