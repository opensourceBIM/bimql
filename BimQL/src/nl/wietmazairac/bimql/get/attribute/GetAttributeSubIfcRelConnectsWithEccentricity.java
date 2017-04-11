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

import org.bimserver.models.ifc2x3tc1.IfcRelConnectsWithEccentricity;

public class GetAttributeSubIfcRelConnectsWithEccentricity {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelConnectsWithEccentricity(Object object, String string) {
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
		if (string.equals("ConnectionConstraint")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getConnectionConstraint());
			 //1IfcConnectionGeometry
		}
		else if (string.equals("RelatingStructuralMember")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getRelatingStructuralMember());
			 //2IfcStructuralMember
		}
		else if (string.equals("AdditionalConditions")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getAdditionalConditions());
			 //2IfcStructuralConnectionCondition
		}
		else if (string.equals("SupportedLengthAsString")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getSupportedLengthAsString());
			 //2String
		}
		else if (string.equals("ConditionCoordinateSystem")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getConditionCoordinateSystem());
			 //2IfcAxis2Placement3D
		}
		else if (string.equals("RelatedStructuralConnection")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getRelatedStructuralConnection());
			 //2IfcStructuralConnection
		}
		else if (string.equals("AppliedCondition")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getAppliedCondition());
			 //2IfcBoundaryCondition
		}
		else if (string.equals("SupportedLength")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getSupportedLength());
			 //2double
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
