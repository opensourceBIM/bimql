package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRelConnectsStructuralActivity {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelConnectsStructuralActivity(Object object, String string) {
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
		if (string.equals("RelatingElement")) {
			resultList.add(((IfcRelConnectsStructuralActivity) object).getRelatingElement());
			 //1IfcStructuralActivityAssignmentSelect
		}
		else if (string.equals("RelatedStructuralActivity")) {
			resultList.add(((IfcRelConnectsStructuralActivity) object).getRelatedStructuralActivity());
			 //1IfcStructuralActivity
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelConnectsStructuralActivity) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelConnectsStructuralActivity) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelConnectsStructuralActivity) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelConnectsStructuralActivity) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelConnectsStructuralActivity) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
