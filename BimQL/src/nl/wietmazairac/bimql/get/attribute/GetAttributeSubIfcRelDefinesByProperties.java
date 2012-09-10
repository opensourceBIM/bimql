package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelDefinesByProperties;

public class GetAttributeSubIfcRelDefinesByProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelDefinesByProperties(Object object, String string) {
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
		if (string.equals("RelatingPropertyDefinition")) {
			resultList.add(((IfcRelDefinesByProperties) object).getRelatingPropertyDefinition());
			 //1IfcPropertySetDefinition
		}
		else if (string.equals("RelatedObjects")) {
			//3xxx
			for (int i = 0; i < ((IfcRelDefinesByProperties) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelDefinesByProperties) object).getRelatedObjects().get(i));
			}
			 //2EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelDefinesByProperties) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelDefinesByProperties) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelDefinesByProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelDefinesByProperties) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelDefinesByProperties) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
