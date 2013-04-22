package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelAssignsToProcess;

public class GetAttributeSubIfcRelAssignsToProcess {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelAssignsToProcess(Object object, String string) {
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
		if (string.equals("RelatingProcess")) {
			resultList.add(((IfcRelAssignsToProcess) object).getRelatingProcess());
			 //1IfcProcess
		}
		else if (string.equals("QuantityInProcess")) {
			resultList.add(((IfcRelAssignsToProcess) object).getQuantityInProcess());
			 //1IfcMeasureWithUnit
		}
		else if (string.equals("RelatedObjects")) {
			//3xxx
			for (int i = 0; i < ((IfcRelAssignsToProcess) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelAssignsToProcess) object).getRelatedObjects().get(i));
			}
			 //2EList
		}
		else if (string.equals("RelatedObjectsType")) {
			resultList.add(((IfcRelAssignsToProcess) object).getRelatedObjectsType());
			 //2IfcObjectTypeEnum
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelAssignsToProcess) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelAssignsToProcess) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelAssignsToProcess) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelAssignsToProcess) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelAssignsToProcess) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
