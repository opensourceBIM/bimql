package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcDraughtingCalloutRelationship {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDraughtingCalloutRelationship(Object object, String string) {
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
		if (string.equals("RelatingDraughtingCallout")) {
			resultList.add(((IfcDraughtingCalloutRelationship) object).getRelatingDraughtingCallout());
			 //1IfcDraughtingCallout
		}
		else if (string.equals("RelatedDraughtingCallout")) {
			resultList.add(((IfcDraughtingCalloutRelationship) object).getRelatedDraughtingCallout());
			 //1IfcDraughtingCallout
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDraughtingCalloutRelationship) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDraughtingCalloutRelationship) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
