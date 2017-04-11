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

import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadLinearForce;

public class SetAttributeSubIfcStructuralLoadLinearForce {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralLoadLinearForce() {
	}

	public SetAttributeSubIfcStructuralLoadLinearForce(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("LinearForceXAsString")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearForceXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearForceYAsString")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearForceYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearForceZAsString")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearForceZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearMomentXAsString")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearMomentXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearMomentYAsString")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearMomentYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearMomentZAsString")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearMomentZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LinearForceX")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearForceX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearForceY")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearForceY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearForceZ")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearForceZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearMomentX")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearMomentX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearMomentY")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearMomentY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LinearMomentZ")) {
			//1NoEList
			((IfcStructuralLoadLinearForce) object).setLinearMomentZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcStructuralLoadLinearForce) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
