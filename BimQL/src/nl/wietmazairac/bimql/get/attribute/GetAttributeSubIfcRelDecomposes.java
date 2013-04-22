package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelDecomposes;

public class GetAttributeSubIfcRelDecomposes {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelDecomposes(Object object, String string) {
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
			for (int i = 0; i < ((IfcRelDecomposes) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelDecomposes) object).getRelatedObjects().get(i));
			}
			 //1EList
		}
		else if (string.equals("RelatingObject")) {
			resultList.add(((IfcRelDecomposes) object).getRelatingObject());
			 //1IfcObjectDefinition
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelDecomposes) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelDecomposes) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelDecomposes) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelDecomposes) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelDecomposes) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
