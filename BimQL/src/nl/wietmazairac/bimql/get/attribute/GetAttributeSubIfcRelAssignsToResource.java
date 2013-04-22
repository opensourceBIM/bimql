package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelAssignsToResource;

public class GetAttributeSubIfcRelAssignsToResource {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelAssignsToResource(Object object, String string) {
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
		if (string.equals("RelatingResource")) {
			resultList.add(((IfcRelAssignsToResource) object).getRelatingResource());
			 //1IfcResource
		}
		else if (string.equals("RelatedObjects")) {
			//3xxx
			for (int i = 0; i < ((IfcRelAssignsToResource) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelAssignsToResource) object).getRelatedObjects().get(i));
			}
			 //2EList
		}
		else if (string.equals("RelatedObjectsType")) {
			resultList.add(((IfcRelAssignsToResource) object).getRelatedObjectsType());
			 //2IfcObjectTypeEnum
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelAssignsToResource) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelAssignsToResource) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelAssignsToResource) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelAssignsToResource) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelAssignsToResource) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
