package nl.wietmazairac.bimql;

import java.util.ArrayList;
import java.util.List;

public class FlattenList {
	
	// fields	
	private List<ArrayList> arrayListList;
	
	// constructors	
	public FlattenList() {	
	}
	
	public FlattenList(List<ArrayList> arrayListList){
		this.arrayListList = arrayListList;		
	}
	
	// methods
	public List<ArrayList> getarrayListList() {
		return arrayListList;
	}

	public void setObjectList(List<ArrayList> arrayListList) {
		this.arrayListList = arrayListList;
	}
	
	public List<Object> getResult() {
		List<Object> objectList = new ArrayList<Object>();
		for (ArrayList arrayList : arrayListList) {
			if (arrayList.size() > 0) {
				for (Object object : arrayList) {
					objectList.add(object);
				}
			}
		}
		return objectList;
	}
	

	

	

	
}
