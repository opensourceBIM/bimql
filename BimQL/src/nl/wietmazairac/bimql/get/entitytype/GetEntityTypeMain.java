package nl.wietmazairac.bimql.get.entitytype;

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