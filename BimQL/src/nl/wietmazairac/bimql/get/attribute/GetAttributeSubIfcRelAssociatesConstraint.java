package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRelAssociatesConstraint {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelAssociatesConstraint(Object object, String string) {
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
		if (string.equals("Intent")) {
			resultList.add(((IfcRelAssociatesConstraint) object).getIntent());
			 //1String
		}
		else if (string.equals("RelatingConstraint")) {
			resultList.add(((IfcRelAssociatesConstraint) object).getRelatingConstraint());
			 //1IfcConstraint
		}
		else if (string.equals("RelatedObjects")) {
			//3xxx
			for (int i = 0; i < ((IfcRelAssociatesConstraint) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelAssociatesConstraint) object).getRelatedObjects().get(i));
			}
			 //2EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelAssociatesConstraint) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelAssociatesConstraint) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelAssociatesConstraint) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelAssociatesConstraint) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelAssociatesConstraint) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
