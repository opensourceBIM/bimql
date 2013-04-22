package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelConnectsStructuralElement;

public class GetAttributeSubIfcRelConnectsStructuralElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelConnectsStructuralElement(Object object, String string) {
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
			resultList.add(((IfcRelConnectsStructuralElement) object).getRelatingElement());
			 //1IfcElement
		}
		else if (string.equals("RelatedStructuralMember")) {
			resultList.add(((IfcRelConnectsStructuralElement) object).getRelatedStructuralMember());
			 //1IfcStructuralMember
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelConnectsStructuralElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelConnectsStructuralElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelConnectsStructuralElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelConnectsStructuralElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelConnectsStructuralElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
