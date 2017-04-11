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

import org.bimserver.models.ifc2x3tc1.IfcServiceLifeFactor;

public class GetAttributeSubIfcServiceLifeFactor {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcServiceLifeFactor(Object object, String string) {
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
		if (string.equals("UpperValue")) {
			resultList.add(((IfcServiceLifeFactor) object).getUpperValue());
			 //1IfcMeasureValue
		}
		else if (string.equals("MostUsedValue")) {
			resultList.add(((IfcServiceLifeFactor) object).getMostUsedValue());
			 //1IfcMeasureValue
		}
		else if (string.equals("LowerValue")) {
			resultList.add(((IfcServiceLifeFactor) object).getLowerValue());
			 //1IfcMeasureValue
		}
		else if (string.equals("PredefinedType")) {
			resultList.add(((IfcServiceLifeFactor) object).getPredefinedType());
			 //1IfcServiceLifeFactorTypeEnum
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcServiceLifeFactor) object).getDefinesType().size(); i++) {
				resultList.add(((IfcServiceLifeFactor) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcServiceLifeFactor) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcServiceLifeFactor) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcServiceLifeFactor) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcServiceLifeFactor) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcServiceLifeFactor) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcServiceLifeFactor) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcServiceLifeFactor) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcServiceLifeFactor) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcServiceLifeFactor) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
