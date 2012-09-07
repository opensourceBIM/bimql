package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRelVoidsElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelVoidsElement(Object object, String string) {
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
		if (string.equals("RelatingBuildingElement")) {
			resultList.add(((IfcRelVoidsElement) object).getRelatingBuildingElement());
			 //1IfcElement
		}
		else if (string.equals("RelatedOpeningElement")) {
			resultList.add(((IfcRelVoidsElement) object).getRelatedOpeningElement());
			 //1IfcFeatureElementSubtraction
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelVoidsElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelVoidsElement) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelVoidsElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelVoidsElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelVoidsElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
