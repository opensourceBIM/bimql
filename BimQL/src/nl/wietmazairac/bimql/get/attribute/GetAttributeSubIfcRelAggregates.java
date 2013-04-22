package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelAggregates;

public class GetAttributeSubIfcRelAggregates {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelAggregates(Object object, String string) {
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
			for (int i = 0; i < ((IfcRelAggregates) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelAggregates) object).getRelatedObjects().get(i));
			}
			 //2EList
		}
		else if (string.equals("RelatingObject")) {
			resultList.add(((IfcRelAggregates) object).getRelatingObject());
			 //2IfcObjectDefinition
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelAggregates) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelAggregates) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelAggregates) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelAggregates) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelAggregates) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
