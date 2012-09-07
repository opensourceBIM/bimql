package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcExternalReference {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcExternalReference(Object object, String string) {
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
		if (string.equals("ItemReference")) {
			resultList.add(((IfcExternalReference) object).getItemReference());
			 //1String
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcExternalReference) object).getName());
			 //1String
		}
		else if (string.equals("Location")) {
			resultList.add(((IfcExternalReference) object).getLocation());
			 //1String
		}
		return resultList;
	}
}
