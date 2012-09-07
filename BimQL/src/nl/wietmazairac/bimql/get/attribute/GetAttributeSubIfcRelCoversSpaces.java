package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRelCoversSpaces {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelCoversSpaces(Object object, String string) {
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
		if (string.equals("RelatedCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcRelCoversSpaces) object).getRelatedCoverings().size(); i++) {
				resultList.add(((IfcRelCoversSpaces) object).getRelatedCoverings().get(i));
			}
			 //1EList
		}
		else if (string.equals("RelatedSpace")) {
			resultList.add(((IfcRelCoversSpaces) object).getRelatedSpace());
			 //1IfcSpace
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelCoversSpaces) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelCoversSpaces) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelCoversSpaces) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelCoversSpaces) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelCoversSpaces) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
