package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcElementQuantity;

public class GetAttributeSubIfcElementQuantity {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcElementQuantity(Object object, String string) {
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
		if (string.equals("MethodOfMeasurement")) {
			resultList.add(((IfcElementQuantity) object).getMethodOfMeasurement());
			 //1String
		}
		else if (string.equals("Quantities")) {
			//3xxx
			for (int i = 0; i < ((IfcElementQuantity) object).getQuantities().size(); i++) {
				resultList.add(((IfcElementQuantity) object).getQuantities().get(i));
			}
			 //1EList
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcElementQuantity) object).getDefinesType().size(); i++) {
				resultList.add(((IfcElementQuantity) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcElementQuantity) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcElementQuantity) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcElementQuantity) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcElementQuantity) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcElementQuantity) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcElementQuantity) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcElementQuantity) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcElementQuantity) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcElementQuantity) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
