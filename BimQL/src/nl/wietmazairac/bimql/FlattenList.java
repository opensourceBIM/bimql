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

public class FlattenList {
	
	// fields	
	private List<List<Object>> arrayListList;
	
	// constructors	
	public FlattenList() {	
	}
	
	public FlattenList(List<List<Object>> arrayListList){
		this.arrayListList = arrayListList;		
	}
	
	// methods
	public List<List<Object>> getarrayListList() {
		return arrayListList;
	}

	public void setObjectList(List<List<Object>> arrayListList) {
		this.arrayListList = arrayListList;
	}
	
	public List<Object> getResult() {
		List<Object> objectList = new ArrayList<Object>();
		for (List<Object> arrayList : arrayListList) {
			if (arrayList.size() > 0) {
				for (Object object : arrayList) {
					objectList.add(object);
				}
			}
		}
		return objectList;
	}
	

	

	

	
}
