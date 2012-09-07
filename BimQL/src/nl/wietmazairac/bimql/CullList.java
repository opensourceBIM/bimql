package nl.wietmazairac.bimql;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.models.ifc2x3.IfcRoot;

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
