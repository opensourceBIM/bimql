package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRelFlowControlElements {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelFlowControlElements(Object object, String string) {
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
		if (string.equals("RelatedControlElements")) {
			//3xxx
			for (int i = 0; i < ((IfcRelFlowControlElements) object).getRelatedControlElements().size(); i++) {
				resultList.add(((IfcRelFlowControlElements) object).getRelatedControlElements().get(i));
			}
			 //1EList
		}
		else if (string.equals("RelatingFlowElement")) {
			resultList.add(((IfcRelFlowControlElements) object).getRelatingFlowElement());
			 //1IfcDistributionFlowElement
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelFlowControlElements) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelFlowControlElements) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelFlowControlElements) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelFlowControlElements) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelFlowControlElements) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
