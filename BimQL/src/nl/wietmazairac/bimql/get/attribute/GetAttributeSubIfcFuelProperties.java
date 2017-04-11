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

import org.bimserver.models.ifc2x3tc1.IfcFuelProperties;

public class GetAttributeSubIfcFuelProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFuelProperties(Object object, String string) {
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
		if (string.equals("CombustionTemperature")) {
			resultList.add(((IfcFuelProperties) object).getCombustionTemperature());
			 //1double
		}
		else if (string.equals("CarbonContentAsString")) {
			resultList.add(((IfcFuelProperties) object).getCarbonContentAsString());
			 //1String
		}
		else if (string.equals("LowerHeatingValueAsString")) {
			resultList.add(((IfcFuelProperties) object).getLowerHeatingValueAsString());
			 //1String
		}
		else if (string.equals("HigherHeatingValue")) {
			resultList.add(((IfcFuelProperties) object).getHigherHeatingValue());
			 //1double
		}
		else if (string.equals("CarbonContent")) {
			resultList.add(((IfcFuelProperties) object).getCarbonContent());
			 //1double
		}
		else if (string.equals("LowerHeatingValue")) {
			resultList.add(((IfcFuelProperties) object).getLowerHeatingValue());
			 //1double
		}
		else if (string.equals("CombustionTemperatureAsString")) {
			resultList.add(((IfcFuelProperties) object).getCombustionTemperatureAsString());
			 //1String
		}
		else if (string.equals("HigherHeatingValueAsString")) {
			resultList.add(((IfcFuelProperties) object).getHigherHeatingValueAsString());
			 //1String
		}
		return resultList;
	}
}
