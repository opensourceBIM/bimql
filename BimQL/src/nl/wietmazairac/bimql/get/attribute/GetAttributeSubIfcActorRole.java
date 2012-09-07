package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcActorRole {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcActorRole(Object object, String string) {
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
			resultList.add(((IfcActorRole) object).getRole());
			 //1IfcRoleEnum
		}
		else if (string.equals("UserDefinedRole")) {
			resultList.add(((IfcActorRole) object).getUserDefinedRole());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcActorRole) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
