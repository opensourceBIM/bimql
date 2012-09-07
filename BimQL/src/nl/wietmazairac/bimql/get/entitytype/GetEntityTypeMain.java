package nl.wietmazairac.bimql.get.entitytype;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.IfcModel;
import org.bimserver.models.ifc2x3.IfcComplexProperty;
import org.bimserver.models.ifc2x3.IfcObject;
import org.bimserver.models.ifc2x3.IfcProperty;
import org.bimserver.models.ifc2x3.IfcPropertySet;
import org.bimserver.models.ifc2x3.IfcPropertySetDefinition;
import org.bimserver.models.ifc2x3.IfcPropertySingleValue;
import org.bimserver.models.ifc2x3.IfcRelDefines;
import org.bimserver.models.ifc2x3.IfcRelDefinesByProperties;
import org.bimserver.models.ifc2x3.IfcRoot;
import org.bimserver.models.ifc2x3.IfcSlab;

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
	
	public ArrayList<ArrayList> getResult() {
		
		ArrayList<ArrayList> arrayListArrayList = new ArrayList<ArrayList>();
		for (int i = 0; i < objectList.size(); i++) {			
			ArrayList<String> stringArrayList = new ArrayList<String>();			
			stringArrayList.add(((IfcRoot) objectList.get(i)).eClass().getName());
			arrayListArrayList.add(stringArrayList);
		}
		return arrayListArrayList;
	}
}