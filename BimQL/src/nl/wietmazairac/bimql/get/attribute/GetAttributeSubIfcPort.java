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

import org.bimserver.models.ifc2x3tc1.IfcPort;

public class GetAttributeSubIfcPort {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPort(Object object, String string) {
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
		if (string.equals("ContainedIn")) {
			resultList.add(((IfcPort) object).getContainedIn());
			 //1IfcRelConnectsPortToElement
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcPort) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcPort) object).getConnectedTo().get(i));
			}
			 //1EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcPort) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcPort) object).getConnectedFrom().get(i));
			}
			 //1EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcPort) object).getObjectPlacement());
			 //2IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcPort) object).getRepresentation());
			 //2IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcPort) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcPort) object).getReferencedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcPort) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcPort) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcPort) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcPort) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcPort) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcPort) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcPort) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcPort) object).getDecomposes().size(); i++) {
				resultList.add(((IfcPort) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcPort) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcPort) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcPort) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcPort) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcPort) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPort) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPort) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
