package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRelSequence {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelSequence(Object object, String string) {
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
		if (string.equals("TimeLag")) {
			resultList.add(((IfcRelSequence) object).getTimeLag());
			 //1double
		}
		else if (string.equals("RelatingProcess")) {
			resultList.add(((IfcRelSequence) object).getRelatingProcess());
			 //1IfcProcess
		}
		else if (string.equals("RelatedProcess")) {
			resultList.add(((IfcRelSequence) object).getRelatedProcess());
			 //1IfcProcess
		}
		else if (string.equals("TimeLagAsString")) {
			resultList.add(((IfcRelSequence) object).getTimeLagAsString());
			 //1String
		}
		else if (string.equals("SequenceType")) {
			resultList.add(((IfcRelSequence) object).getSequenceType());
			 //1IfcSequenceEnum
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelSequence) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelSequence) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelSequence) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelSequence) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelSequence) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
