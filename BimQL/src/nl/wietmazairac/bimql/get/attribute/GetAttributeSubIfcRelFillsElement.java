package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelFillsElement;

public class GetAttributeSubIfcRelFillsElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelFillsElement(Object object, String string) {
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
		if (string.equals("RelatingOpeningElement")) {
			resultList.add(((IfcRelFillsElement) object).getRelatingOpeningElement());
			 //1IfcOpeningElement
		}
		else if (string.equals("RelatedBuildingElement")) {
			resultList.add(((IfcRelFillsElement) object).getRelatedBuildingElement());
			 //1IfcElement
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelFillsElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelFillsElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelFillsElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelFillsElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelFillsElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
