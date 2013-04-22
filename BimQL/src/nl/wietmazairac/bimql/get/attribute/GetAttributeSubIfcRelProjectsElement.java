package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelProjectsElement;

public class GetAttributeSubIfcRelProjectsElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelProjectsElement(Object object, String string) {
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
		if (string.equals("RelatingElement")) {
			resultList.add(((IfcRelProjectsElement) object).getRelatingElement());
			 //1IfcElement
		}
		else if (string.equals("RelatedFeatureElement")) {
			resultList.add(((IfcRelProjectsElement) object).getRelatedFeatureElement());
			 //1IfcFeatureElementAddition
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelProjectsElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelProjectsElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelProjectsElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelProjectsElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelProjectsElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
