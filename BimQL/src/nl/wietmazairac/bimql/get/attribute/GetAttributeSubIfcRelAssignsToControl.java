package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelAssignsToControl;

public class GetAttributeSubIfcRelAssignsToControl {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelAssignsToControl(Object object, String string) {
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
		if (string.equals("RelatingControl")) {
			resultList.add(((IfcRelAssignsToControl) object).getRelatingControl());
			 //1IfcControl
		}
		else if (string.equals("RelatedObjects")) {
			//3xxx
			for (int i = 0; i < ((IfcRelAssignsToControl) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelAssignsToControl) object).getRelatedObjects().get(i));
			}
			 //2EList
		}
		else if (string.equals("RelatedObjectsType")) {
			resultList.add(((IfcRelAssignsToControl) object).getRelatedObjectsType());
			 //2IfcObjectTypeEnum
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelAssignsToControl) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelAssignsToControl) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelAssignsToControl) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelAssignsToControl) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelAssignsToControl) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
