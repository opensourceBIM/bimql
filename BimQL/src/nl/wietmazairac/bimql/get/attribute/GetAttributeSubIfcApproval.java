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

import org.bimserver.models.ifc2x3tc1.IfcApproval;

public class GetAttributeSubIfcApproval {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcApproval(Object object, String string) {
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
		if (string.equals("Actors")) {
			//3xxx
			for (int i = 0; i < ((IfcApproval) object).getActors().size(); i++) {
				resultList.add(((IfcApproval) object).getActors().get(i));
			}
			 //1EList
		}
		else if (string.equals("ApprovalDateTime")) {
			resultList.add(((IfcApproval) object).getApprovalDateTime());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("ApprovalStatus")) {
			resultList.add(((IfcApproval) object).getApprovalStatus());
			 //1String
		}
		else if (string.equals("ApprovalLevel")) {
			resultList.add(((IfcApproval) object).getApprovalLevel());
			 //1String
		}
		else if (string.equals("ApprovalQualifier")) {
			resultList.add(((IfcApproval) object).getApprovalQualifier());
			 //1String
		}
		else if (string.equals("IsRelatedWith")) {
			//3xxx
			for (int i = 0; i < ((IfcApproval) object).getIsRelatedWith().size(); i++) {
				resultList.add(((IfcApproval) object).getIsRelatedWith().get(i));
			}
			 //1EList
		}
		else if (string.equals("Relates")) {
			//3xxx
			for (int i = 0; i < ((IfcApproval) object).getRelates().size(); i++) {
				resultList.add(((IfcApproval) object).getRelates().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcApproval) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcApproval) object).getDescription());
			 //1String
		}
		else if (string.equals("Identifier")) {
			resultList.add(((IfcApproval) object).getIdentifier());
			 //1String
		}
		return resultList;
	}
}
