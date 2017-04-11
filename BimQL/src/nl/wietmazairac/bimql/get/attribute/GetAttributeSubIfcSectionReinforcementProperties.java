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

import org.bimserver.models.ifc2x3tc1.IfcSectionReinforcementProperties;

public class GetAttributeSubIfcSectionReinforcementProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSectionReinforcementProperties(Object object, String string) {
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
		if (string.equals("LongitudinalStartPosition")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getLongitudinalStartPosition());
			 //1double
		}
		else if (string.equals("LongitudinalEndPosition")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getLongitudinalEndPosition());
			 //1double
		}
		else if (string.equals("TransversePosition")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getTransversePosition());
			 //1double
		}
		else if (string.equals("ReinforcementRole")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getReinforcementRole());
			 //1IfcReinforcingBarRoleEnum
		}
		else if (string.equals("SectionDefinition")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getSectionDefinition());
			 //1IfcSectionProperties
		}
		else if (string.equals("LongitudinalStartPositionAsString")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getLongitudinalStartPositionAsString());
			 //1String
		}
		else if (string.equals("LongitudinalEndPositionAsString")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getLongitudinalEndPositionAsString());
			 //1String
		}
		else if (string.equals("TransversePositionAsString")) {
			resultList.add(((IfcSectionReinforcementProperties) object).getTransversePositionAsString());
			 //1String
		}
		else if (string.equals("CrossSectionReinforcementDefinitions")) {
			//3xxx
			for (int i = 0; i < ((IfcSectionReinforcementProperties) object).getCrossSectionReinforcementDefinitions().size(); i++) {
				resultList.add(((IfcSectionReinforcementProperties) object).getCrossSectionReinforcementDefinitions().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
