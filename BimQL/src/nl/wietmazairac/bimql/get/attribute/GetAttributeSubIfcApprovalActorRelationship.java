package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcApprovalActorRelationship {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcApprovalActorRelationship(Object object, String string) {
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
		if (string.equals("Role")) {
			resultList.add(((IfcApprovalActorRelationship) object).getRole());
			 //1IfcActorRole
		}
		else if (string.equals("Actor")) {
			resultList.add(((IfcApprovalActorRelationship) object).getActor());
			 //1IfcActorSelect
		}
		else if (string.equals("Approval")) {
			resultList.add(((IfcApprovalActorRelationship) object).getApproval());
			 //1IfcApproval
		}
		return resultList;
	}
}
