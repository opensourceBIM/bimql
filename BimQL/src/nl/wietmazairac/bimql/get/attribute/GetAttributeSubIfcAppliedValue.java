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

import org.bimserver.models.ifc2x3tc1.IfcAppliedValue;

public class GetAttributeSubIfcAppliedValue {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAppliedValue(Object object, String string) {
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
		if (string.equals("UnitBasis")) {
			resultList.add(((IfcAppliedValue) object).getUnitBasis());
			 //1IfcMeasureWithUnit
		}
		else if (string.equals("AppliedValue")) {
			resultList.add(((IfcAppliedValue) object).getAppliedValue());
			 //1IfcAppliedValueSelect
		}
		else if (string.equals("ApplicableDate")) {
			resultList.add(((IfcAppliedValue) object).getApplicableDate());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("FixedUntilDate")) {
			resultList.add(((IfcAppliedValue) object).getFixedUntilDate());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("ValuesReferenced")) {
			//3xxx
			for (int i = 0; i < ((IfcAppliedValue) object).getValuesReferenced().size(); i++) {
				resultList.add(((IfcAppliedValue) object).getValuesReferenced().get(i));
			}
			 //1EList
		}
		else if (string.equals("ValueOfComponents")) {
			//3xxx
			for (int i = 0; i < ((IfcAppliedValue) object).getValueOfComponents().size(); i++) {
				resultList.add(((IfcAppliedValue) object).getValueOfComponents().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsComponentIn")) {
			//3xxx
			for (int i = 0; i < ((IfcAppliedValue) object).getIsComponentIn().size(); i++) {
				resultList.add(((IfcAppliedValue) object).getIsComponentIn().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcAppliedValue) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcAppliedValue) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
