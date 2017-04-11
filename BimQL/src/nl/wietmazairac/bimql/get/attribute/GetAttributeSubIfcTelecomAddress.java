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

import org.bimserver.models.ifc2x3tc1.IfcTelecomAddress;

public class GetAttributeSubIfcTelecomAddress {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTelecomAddress(Object object, String string) {
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
		if (string.equals("TelephoneNumbers")) {
			//3xxx
			for (int i = 0; i < ((IfcTelecomAddress) object).getTelephoneNumbers().size(); i++) {
				resultList.add(((IfcTelecomAddress) object).getTelephoneNumbers().get(i));
			}
			 //1EList
		}
		else if (string.equals("FacsimileNumbers")) {
			//3xxx
			for (int i = 0; i < ((IfcTelecomAddress) object).getFacsimileNumbers().size(); i++) {
				resultList.add(((IfcTelecomAddress) object).getFacsimileNumbers().get(i));
			}
			 //1EList
		}
		else if (string.equals("PagerNumber")) {
			resultList.add(((IfcTelecomAddress) object).getPagerNumber());
			 //1String
		}
		else if (string.equals("WWWHomePageURL")) {
			resultList.add(((IfcTelecomAddress) object).getWWWHomePageURL());
			 //1String
		}
		else if (string.equals("ElectronicMailAddresses")) {
			//3xxx
			for (int i = 0; i < ((IfcTelecomAddress) object).getElectronicMailAddresses().size(); i++) {
				resultList.add(((IfcTelecomAddress) object).getElectronicMailAddresses().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
