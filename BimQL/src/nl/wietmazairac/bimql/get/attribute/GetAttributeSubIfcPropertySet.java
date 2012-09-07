package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcPropertySet {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPropertySet(Object object, String string) {
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
		if (string.equals("HasProperties")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertySet) object).getHasProperties().size(); i++) {
				resultList.add(((IfcPropertySet) object).getHasProperties().get(i));
			}
			 //1EList
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertySet) object).getDefinesType().size(); i++) {
				resultList.add(((IfcPropertySet) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertySet) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcPropertySet) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertySet) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcPropertySet) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcPropertySet) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcPropertySet) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcPropertySet) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPropertySet) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPropertySet) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
