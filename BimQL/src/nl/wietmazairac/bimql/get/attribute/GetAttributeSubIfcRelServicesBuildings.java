package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRelServicesBuildings {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelServicesBuildings(Object object, String string) {
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
		if (string.equals("RelatingSystem")) {
			resultList.add(((IfcRelServicesBuildings) object).getRelatingSystem());
			 //1IfcSystem
		}
		else if (string.equals("RelatedBuildings")) {
			//3xxx
			for (int i = 0; i < ((IfcRelServicesBuildings) object).getRelatedBuildings().size(); i++) {
				resultList.add(((IfcRelServicesBuildings) object).getRelatedBuildings().get(i));
			}
			 //1EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelServicesBuildings) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelServicesBuildings) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelServicesBuildings) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelServicesBuildings) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelServicesBuildings) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
