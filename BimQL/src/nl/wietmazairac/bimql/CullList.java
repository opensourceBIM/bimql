package nl.wietmazairac.bimql;

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

public class CullList {
	// fields
	private List<Object> objectList;
	private List<Boolean> booleanList;


	// constructors
	public CullList() {	
	}
	
	public CullList(List<Object> objectList, List<Boolean> booleanList){
		this.objectList = objectList;
		this.booleanList = booleanList;
	}
	
	// methods
	public List<Object> getObjectList() {
		return objectList;
	}

	public void setObjectList(List<Object> objectList) {
		this.objectList = objectList;
	}

	public List<Boolean> getBool() {
		return booleanList;
	}

	public void setBooleanList(List<Boolean> booleanList) {
		this.booleanList = booleanList;
	}
	
	public List<Object> getResult() {
		List<Object> result = new ArrayList<Object>();
		for (int i = 0; i < objectList.size(); i++) {
			if (booleanList.get(i)) {
				result.add(objectList.get(i));				
			}
		}
		return result;
	}
	

	

	

	
}
