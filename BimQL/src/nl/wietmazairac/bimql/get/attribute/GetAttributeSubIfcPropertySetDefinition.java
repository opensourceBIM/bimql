package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPropertySetDefinition;

public class GetAttributeSubIfcPropertySetDefinition {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPropertySetDefinition(Object object, String string) {
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
		if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertySetDefinition) object).getDefinesType().size(); i++) {
				resultList.add(((IfcPropertySetDefinition) object).getDefinesType().get(i));
			}
			 //1EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertySetDefinition) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcPropertySetDefinition) object).getPropertyDefinitionOf().get(i));
			}
			 //1EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertySetDefinition) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcPropertySetDefinition) object).getHasAssociations().get(i));
			}
			 //2EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcPropertySetDefinition) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcPropertySetDefinition) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcPropertySetDefinition) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPropertySetDefinition) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPropertySetDefinition) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
