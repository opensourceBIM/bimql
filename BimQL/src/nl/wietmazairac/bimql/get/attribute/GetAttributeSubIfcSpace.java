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

import org.bimserver.models.ifc2x3tc1.IfcSpace;

public class GetAttributeSubIfcSpace {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSpace(Object object, String string) {
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
		if (string.equals("BoundedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSpace) object).getBoundedBy().size(); i++) {
				resultList.add(((IfcSpace) object).getBoundedBy().get(i));
			}
			 //1EList
		}
		else if (string.equals("ElevationWithFlooringAsString")) {
			resultList.add(((IfcSpace) object).getElevationWithFlooringAsString());
			 //1String
		}
		else if (string.equals("InteriorOrExteriorSpace")) {
			resultList.add(((IfcSpace) object).getInteriorOrExteriorSpace());
			 //1IfcInternalOrExternalEnum
		}
		else if (string.equals("ElevationWithFlooring")) {
			resultList.add(((IfcSpace) object).getElevationWithFlooring());
			 //1double
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcSpace) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcSpace) object).getHasCoverings().get(i));
			}
			 //1EList
		}
		else if (string.equals("LongName")) {
			resultList.add(((IfcSpace) object).getLongName());
			 //2String
		}
		else if (string.equals("ReferencesElements")) {
			//3xxx
			for (int i = 0; i < ((IfcSpace) object).getReferencesElements().size(); i++) {
				resultList.add(((IfcSpace) object).getReferencesElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("CompositionType")) {
			resultList.add(((IfcSpace) object).getCompositionType());
			 //2IfcElementCompositionEnum
		}
		else if (string.equals("ServicedBySystems")) {
			//3xxx
			for (int i = 0; i < ((IfcSpace) object).getServicedBySystems().size(); i++) {
				resultList.add(((IfcSpace) object).getServicedBySystems().get(i));
			}
			 //2EList
		}
		else if (string.equals("ContainsElements")) {
			//3xxx
			for (int i = 0; i < ((IfcSpace) object).getContainsElements().size(); i++) {
				resultList.add(((IfcSpace) object).getContainsElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcSpace) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcSpace) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSpace) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcSpace) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcSpace) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSpace) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcSpace) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSpace) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcSpace) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSpace) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcSpace) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcSpace) object).getDecomposes().size(); i++) {
				resultList.add(((IfcSpace) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSpace) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSpace) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSpace) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSpace) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSpace) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSpace) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSpace) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
