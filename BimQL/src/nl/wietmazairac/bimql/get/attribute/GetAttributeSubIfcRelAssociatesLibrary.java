package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelAssociatesLibrary;

public class GetAttributeSubIfcRelAssociatesLibrary {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelAssociatesLibrary(Object object, String string) {
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
		if (string.equals("RelatingLibrary")) {
			resultList.add(((IfcRelAssociatesLibrary) object).getRelatingLibrary());
			 //1IfcLibrarySelect
		}
		else if (string.equals("RelatedObjects")) {
			//3xxx
			for (int i = 0; i < ((IfcRelAssociatesLibrary) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelAssociatesLibrary) object).getRelatedObjects().get(i));
			}
			 //2EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelAssociatesLibrary) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelAssociatesLibrary) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelAssociatesLibrary) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelAssociatesLibrary) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelAssociatesLibrary) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
