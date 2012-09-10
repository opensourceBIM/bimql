package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcOwnerHistory;

public class GetAttributeSubIfcOwnerHistory {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcOwnerHistory(Object object, String string) {
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
		if (string.equals("LastModifyingApplication")) {
			resultList.add(((IfcOwnerHistory) object).getLastModifyingApplication());
			 //1IfcApplication
		}
		else if (string.equals("OwningUser")) {
			resultList.add(((IfcOwnerHistory) object).getOwningUser());
			 //1IfcPersonAndOrganization
		}
		else if (string.equals("OwningApplication")) {
			resultList.add(((IfcOwnerHistory) object).getOwningApplication());
			 //1IfcApplication
		}
		else if (string.equals("ChangeAction")) {
			resultList.add(((IfcOwnerHistory) object).getChangeAction());
			 //1IfcChangeActionEnum
		}
		else if (string.equals("LastModifiedDate")) {
			resultList.add(((IfcOwnerHistory) object).getLastModifiedDate());
			 //1int
		}
		else if (string.equals("LastModifyingUser")) {
			resultList.add(((IfcOwnerHistory) object).getLastModifyingUser());
			 //1IfcPersonAndOrganization
		}
		else if (string.equals("CreationDate")) {
			resultList.add(((IfcOwnerHistory) object).getCreationDate());
			 //1int
		}
		else if (string.equals("State")) {
			resultList.add(((IfcOwnerHistory) object).getState());
			 //1IfcStateEnum
		}
		return resultList;
	}
}
