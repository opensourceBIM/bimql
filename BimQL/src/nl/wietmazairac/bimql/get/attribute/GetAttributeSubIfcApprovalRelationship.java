package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcApprovalRelationship;

public class GetAttributeSubIfcApprovalRelationship {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcApprovalRelationship(Object object, String string) {
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
		if (string.equals("RelatingApproval")) {
			resultList.add(((IfcApprovalRelationship) object).getRelatingApproval());
			 //1IfcApproval
		}
		else if (string.equals("RelatedApproval")) {
			resultList.add(((IfcApprovalRelationship) object).getRelatedApproval());
			 //1IfcApproval
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcApprovalRelationship) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcApprovalRelationship) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
