package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelConnectsPortToElement;

public class GetAttributeSubIfcRelConnectsPortToElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelConnectsPortToElement(Object object, String string) {
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
		if (string.equals("RelatedElement")) {
			resultList.add(((IfcRelConnectsPortToElement) object).getRelatedElement());
			 //1IfcElement
		}
		else if (string.equals("RelatingPort")) {
			resultList.add(((IfcRelConnectsPortToElement) object).getRelatingPort());
			 //1IfcPort
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelConnectsPortToElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelConnectsPortToElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelConnectsPortToElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelConnectsPortToElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelConnectsPortToElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
