package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelAssociates;

public class GetAttributeSubIfcRelAssociates {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelAssociates(Object object, String string) {
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
			for (int i = 0; i < ((IfcRelAssociates) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelAssociates) object).getRelatedObjects().get(i));
			}
			 //1EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelAssociates) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelAssociates) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelAssociates) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelAssociates) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelAssociates) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
