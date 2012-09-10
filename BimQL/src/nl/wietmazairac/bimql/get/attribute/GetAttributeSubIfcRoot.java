package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRoot;

public class GetAttributeSubIfcRoot {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRoot(Object object, String string) {
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
		if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRoot) object).getOwnerHistory());
			 //1IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRoot) object).getGlobalId());
			 //1IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRoot) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRoot) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
