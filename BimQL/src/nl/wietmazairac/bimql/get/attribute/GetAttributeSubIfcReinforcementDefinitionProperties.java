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

import org.bimserver.models.ifc2x3tc1.IfcReinforcementDefinitionProperties;

public class GetAttributeSubIfcReinforcementDefinitionProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcReinforcementDefinitionProperties(Object object, String string) {
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
		if (string.equals("DefinitionType")) {
			resultList.add(((IfcReinforcementDefinitionProperties) object).getDefinitionType());
			 //1String
		}
		else if (string.equals("ReinforcementSectionDefinitions")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcementDefinitionProperties) object).getReinforcementSectionDefinitions().size(); i++) {
				resultList.add(((IfcReinforcementDefinitionProperties) object).getReinforcementSectionDefinitions().get(i));
			}
			 //1EList
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcementDefinitionProperties) object).getDefinesType().size(); i++) {
				resultList.add(((IfcReinforcementDefinitionProperties) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcementDefinitionProperties) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcReinforcementDefinitionProperties) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcementDefinitionProperties) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcReinforcementDefinitionProperties) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcReinforcementDefinitionProperties) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcReinforcementDefinitionProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcReinforcementDefinitionProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcReinforcementDefinitionProperties) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcReinforcementDefinitionProperties) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
