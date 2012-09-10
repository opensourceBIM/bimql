package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelOccupiesSpaces;

public class GetAttributeSubIfcRelOccupiesSpaces {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelOccupiesSpaces(Object object, String string) {
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
		if (string.equals("RelatingActor")) {
			resultList.add(((IfcRelOccupiesSpaces) object).getRelatingActor());
			 //2IfcActor
		}
		else if (string.equals("ActingRole")) {
			resultList.add(((IfcRelOccupiesSpaces) object).getActingRole());
			 //2IfcActorRole
		}
		else if (string.equals("RelatedObjects")) {
			//3xxx
			for (int i = 0; i < ((IfcRelOccupiesSpaces) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelOccupiesSpaces) object).getRelatedObjects().get(i));
			}
			 //3EList
		}
		else if (string.equals("RelatedObjectsType")) {
			resultList.add(((IfcRelOccupiesSpaces) object).getRelatedObjectsType());
			 //3IfcObjectTypeEnum
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelOccupiesSpaces) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelOccupiesSpaces) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelOccupiesSpaces) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelOccupiesSpaces) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelOccupiesSpaces) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
