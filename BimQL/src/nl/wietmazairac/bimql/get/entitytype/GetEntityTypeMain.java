package nl.wietmazairac.bimql.get.entitytype;

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
import java.util.List;

import org.bimserver.models.ifc2x3tc1.IfcRoot;

public class GetEntityTypeMain {
	// fields
	private List<Object> objectList;

	// constructors
	public GetEntityTypeMain(List<Object> objectList) {
		this.objectList = objectList;
	}

	// methods
	public List<Object> getObjectList() {
		return objectList;
	}

	public void setObjectList(List<Object> objectList) {
		this.objectList = objectList;
	}
	
	public List<List<Object>> getResult() {
		
		List<List<Object>> arrayListArrayList = new ArrayList<List<Object>>();
		for (int i = 0; i < objectList.size(); i++) {			
			List<Object> stringArrayList = new ArrayList<Object>();			
			stringArrayList.add(((IfcRoot) objectList.get(i)).eClass().getName());
			arrayListArrayList.add(stringArrayList);
		}
		return arrayListArrayList;
	}
}