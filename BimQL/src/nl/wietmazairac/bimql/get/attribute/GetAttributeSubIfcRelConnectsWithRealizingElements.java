package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRelConnectsWithRealizingElements {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelConnectsWithRealizingElements(Object object, String string) {
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
		if (string.equals("RealizingElements")) {
			//3xxx
			for (int i = 0; i < ((IfcRelConnectsWithRealizingElements) object).getRealizingElements().size(); i++) {
				resultList.add(((IfcRelConnectsWithRealizingElements) object).getRealizingElements().get(i));
			}
			 //1EList
		}
		else if (string.equals("ConnectionType")) {
			resultList.add(((IfcRelConnectsWithRealizingElements) object).getConnectionType());
			 //1String
		}
		else if (string.equals("RelatingElement")) {
			resultList.add(((IfcRelConnectsWithRealizingElements) object).getRelatingElement());
			 //2IfcElement
		}
		else if (string.equals("ConnectionGeometry")) {
			resultList.add(((IfcRelConnectsWithRealizingElements) object).getConnectionGeometry());
			 //2IfcConnectionGeometry
		}
		else if (string.equals("RelatedElement")) {
			resultList.add(((IfcRelConnectsWithRealizingElements) object).getRelatedElement());
			 //2IfcElement
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelConnectsWithRealizingElements) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelConnectsWithRealizingElements) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelConnectsWithRealizingElements) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelConnectsWithRealizingElements) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelConnectsWithRealizingElements) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
