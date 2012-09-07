package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRelDefines {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelDefines(Object object, String string) {
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
		if (string.equals("RelatedObjects")) {
			//3xxx
			for (int i = 0; i < ((IfcRelDefines) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelDefines) object).getRelatedObjects().get(i));
			}
			 //1EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelDefines) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelDefines) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelDefines) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelDefines) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelDefines) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
