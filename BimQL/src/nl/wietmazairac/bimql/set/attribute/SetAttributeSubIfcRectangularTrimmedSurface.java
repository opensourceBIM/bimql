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

import org.bimserver.models.ifc2x3tc1.IfcRectangularTrimmedSurface;

public class SetAttributeSubIfcRectangularTrimmedSurface {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRectangularTrimmedSurface() {
	}

	public SetAttributeSubIfcRectangularTrimmedSurface(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Dim")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("BasisSurface")) {
			//1NoEList
			 //1void
			 //1IfcSurface
		}
		else if (attributeName.equals("U1")) {
			//1NoEList
			((IfcRectangularTrimmedSurface) object).setU1(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("V1")) {
			//1NoEList
			((IfcRectangularTrimmedSurface) object).setV1(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("U2")) {
			//1NoEList
			((IfcRectangularTrimmedSurface) object).setU2(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("V2")) {
			//1NoEList
			((IfcRectangularTrimmedSurface) object).setV2(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Usense")) {
			//1NoEList
			 //1void
			 //1Tristate
		}
		else if (attributeName.equals("Vsense")) {
			//1NoEList
			 //1void
			 //1Tristate
		}
		else if (attributeName.equals("U1AsString")) {
			//1NoEList
			((IfcRectangularTrimmedSurface) object).setU1AsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("V1AsString")) {
			//1NoEList
			((IfcRectangularTrimmedSurface) object).setV1AsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("U2AsString")) {
			//1NoEList
			((IfcRectangularTrimmedSurface) object).setU2AsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("V2AsString")) {
			//1NoEList
			((IfcRectangularTrimmedSurface) object).setV2AsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
