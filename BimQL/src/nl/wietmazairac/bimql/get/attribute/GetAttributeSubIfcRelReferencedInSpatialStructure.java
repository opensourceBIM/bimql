package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelReferencedInSpatialStructure;

public class GetAttributeSubIfcRelReferencedInSpatialStructure {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelReferencedInSpatialStructure(Object object, String string) {
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
		if (string.equals("RelatedElements")) {
			//3xxx
			for (int i = 0; i < ((IfcRelReferencedInSpatialStructure) object).getRelatedElements().size(); i++) {
				resultList.add(((IfcRelReferencedInSpatialStructure) object).getRelatedElements().get(i));
			}
			 //1EList
		}
		else if (string.equals("RelatingStructure")) {
			resultList.add(((IfcRelReferencedInSpatialStructure) object).getRelatingStructure());
			 //1IfcSpatialStructureElement
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelReferencedInSpatialStructure) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelReferencedInSpatialStructure) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelReferencedInSpatialStructure) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelReferencedInSpatialStructure) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelReferencedInSpatialStructure) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
