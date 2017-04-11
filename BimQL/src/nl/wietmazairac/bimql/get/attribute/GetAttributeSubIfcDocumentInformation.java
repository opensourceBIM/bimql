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

import org.bimserver.models.ifc2x3tc1.IfcDocumentInformation;

public class GetAttributeSubIfcDocumentInformation {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDocumentInformation(Object object, String string) {
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
		if (string.equals("Purpose")) {
			resultList.add(((IfcDocumentInformation) object).getPurpose());
			 //1String
		}
		else if (string.equals("CreationTime")) {
			resultList.add(((IfcDocumentInformation) object).getCreationTime());
			 //1IfcDateAndTime
		}
		else if (string.equals("Scope")) {
			resultList.add(((IfcDocumentInformation) object).getScope());
			 //1String
		}
		else if (string.equals("Revision")) {
			resultList.add(((IfcDocumentInformation) object).getRevision());
			 //1String
		}
		else if (string.equals("Editors")) {
			//3xxx
			for (int i = 0; i < ((IfcDocumentInformation) object).getEditors().size(); i++) {
				resultList.add(((IfcDocumentInformation) object).getEditors().get(i));
			}
			 //1EList
		}
		else if (string.equals("ValidFrom")) {
			resultList.add(((IfcDocumentInformation) object).getValidFrom());
			 //1IfcCalendarDate
		}
		else if (string.equals("IsPointer")) {
			//3xxx
			for (int i = 0; i < ((IfcDocumentInformation) object).getIsPointer().size(); i++) {
				resultList.add(((IfcDocumentInformation) object).getIsPointer().get(i));
			}
			 //1EList
		}
		else if (string.equals("DocumentId")) {
			resultList.add(((IfcDocumentInformation) object).getDocumentId());
			 //1String
		}
		else if (string.equals("IntendedUse")) {
			resultList.add(((IfcDocumentInformation) object).getIntendedUse());
			 //1String
		}
		else if (string.equals("DocumentOwner")) {
			resultList.add(((IfcDocumentInformation) object).getDocumentOwner());
			 //1IfcActorSelect
		}
		else if (string.equals("LastRevisionTime")) {
			resultList.add(((IfcDocumentInformation) object).getLastRevisionTime());
			 //1IfcDateAndTime
		}
		else if (string.equals("ElectronicFormat")) {
			resultList.add(((IfcDocumentInformation) object).getElectronicFormat());
			 //1IfcDocumentElectronicFormat
		}
		else if (string.equals("ValidUntil")) {
			resultList.add(((IfcDocumentInformation) object).getValidUntil());
			 //1IfcCalendarDate
		}
		else if (string.equals("Confidentiality")) {
			resultList.add(((IfcDocumentInformation) object).getConfidentiality());
			 //1IfcDocumentConfidentialityEnum
		}
		else if (string.equals("IsPointedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcDocumentInformation) object).getIsPointedTo().size(); i++) {
				resultList.add(((IfcDocumentInformation) object).getIsPointedTo().get(i));
			}
			 //1EList
		}
		else if (string.equals("DocumentReferences")) {
			//3xxx
			for (int i = 0; i < ((IfcDocumentInformation) object).getDocumentReferences().size(); i++) {
				resultList.add(((IfcDocumentInformation) object).getDocumentReferences().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDocumentInformation) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDocumentInformation) object).getDescription());
			 //1String
		}
		else if (string.equals("Status")) {
			resultList.add(((IfcDocumentInformation) object).getStatus());
			 //1IfcDocumentStatusEnum
		}
		return resultList;
	}
}
