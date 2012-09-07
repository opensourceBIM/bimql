package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRelAssociatesAppliedValue {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelAssociatesAppliedValue(Object object, String string) {
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
		if (string.equals("RelatingAppliedValue")) {
			resultList.add(((IfcRelAssociatesAppliedValue) object).getRelatingAppliedValue());
			 //1IfcAppliedValue
		}
		else if (string.equals("RelatedObjects")) {
			//3xxx
			for (int i = 0; i < ((IfcRelAssociatesAppliedValue) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelAssociatesAppliedValue) object).getRelatedObjects().get(i));
			}
			 //2EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelAssociatesAppliedValue) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelAssociatesAppliedValue) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelAssociatesAppliedValue) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelAssociatesAppliedValue) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelAssociatesAppliedValue) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
