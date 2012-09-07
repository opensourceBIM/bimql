package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcPersonAndOrganization {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPersonAndOrganization(Object object, String string) {
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
		if (string.equals("TheOrganization")) {
			resultList.add(((IfcPersonAndOrganization) object).getTheOrganization());
			 //1IfcOrganization
		}
		else if (string.equals("ThePerson")) {
			resultList.add(((IfcPersonAndOrganization) object).getThePerson());
			 //1IfcPerson
		}
		else if (string.equals("Roles")) {
			//3xxx
			for (int i = 0; i < ((IfcPersonAndOrganization) object).getRoles().size(); i++) {
				resultList.add(((IfcPersonAndOrganization) object).getRoles().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
