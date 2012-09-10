package nl.wietmazairac.bimql;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

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
