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

import org.bimserver.models.ifc2x3tc1.IfcSlippageConnectionCondition;

public class GetAttributeSubIfcSlippageConnectionCondition {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSlippageConnectionCondition(Object object, String string) {
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
		if (string.equals("SlippageX")) {
			resultList.add(((IfcSlippageConnectionCondition) object).getSlippageX());
			 //1double
		}
		else if (string.equals("SlippageY")) {
			resultList.add(((IfcSlippageConnectionCondition) object).getSlippageY());
			 //1double
		}
		else if (string.equals("SlippageZ")) {
			resultList.add(((IfcSlippageConnectionCondition) object).getSlippageZ());
			 //1double
		}
		else if (string.equals("SlippageXAsString")) {
			resultList.add(((IfcSlippageConnectionCondition) object).getSlippageXAsString());
			 //1String
		}
		else if (string.equals("SlippageYAsString")) {
			resultList.add(((IfcSlippageConnectionCondition) object).getSlippageYAsString());
			 //1String
		}
		else if (string.equals("SlippageZAsString")) {
			resultList.add(((IfcSlippageConnectionCondition) object).getSlippageZAsString());
			 //1String
		}
		return resultList;
	}
}
