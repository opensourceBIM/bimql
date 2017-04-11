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

import org.bimserver.models.ifc2x3tc1.IfcConstraint;

public class GetAttributeSubIfcConstraint {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcConstraint(Object object, String string) {
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
		if (string.equals("IsRelatedWith")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraint) object).getIsRelatedWith().size(); i++) {
				resultList.add(((IfcConstraint) object).getIsRelatedWith().get(i));
			}
			 //1EList
		}
		else if (string.equals("ConstraintGrade")) {
			resultList.add(((IfcConstraint) object).getConstraintGrade());
			 //1IfcConstraintEnum
		}
		else if (string.equals("ConstraintSource")) {
			resultList.add(((IfcConstraint) object).getConstraintSource());
			 //1String
		}
		else if (string.equals("CreatingActor")) {
			resultList.add(((IfcConstraint) object).getCreatingActor());
			 //1IfcActorSelect
		}
		else if (string.equals("CreationTime")) {
			resultList.add(((IfcConstraint) object).getCreationTime());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("UserDefinedGrade")) {
			resultList.add(((IfcConstraint) object).getUserDefinedGrade());
			 //1String
		}
		else if (string.equals("ClassifiedAs")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraint) object).getClassifiedAs().size(); i++) {
				resultList.add(((IfcConstraint) object).getClassifiedAs().get(i));
			}
			 //1EList
		}
		else if (string.equals("Aggregates")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraint) object).getAggregates().size(); i++) {
				resultList.add(((IfcConstraint) object).getAggregates().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsAggregatedIn")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraint) object).getIsAggregatedIn().size(); i++) {
				resultList.add(((IfcConstraint) object).getIsAggregatedIn().get(i));
			}
			 //1EList
		}
		else if (string.equals("RelatesConstraints")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraint) object).getRelatesConstraints().size(); i++) {
				resultList.add(((IfcConstraint) object).getRelatesConstraints().get(i));
			}
			 //1EList
		}
		else if (string.equals("PropertiesForConstraint")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraint) object).getPropertiesForConstraint().size(); i++) {
				resultList.add(((IfcConstraint) object).getPropertiesForConstraint().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcConstraint) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcConstraint) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
