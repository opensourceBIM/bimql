package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcElectricalCircuit;

public class GetAttributeSubIfcElectricalCircuit {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcElectricalCircuit(Object object, String string) {
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
		if (string.equals("ServicesBuildings")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricalCircuit) object).getServicesBuildings().size(); i++) {
				resultList.add(((IfcElectricalCircuit) object).getServicesBuildings().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsGroupedBy")) {
			resultList.add(((IfcElectricalCircuit) object).getIsGroupedBy());
			 //3IfcRelAssignsToGroup
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcElectricalCircuit) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricalCircuit) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcElectricalCircuit) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricalCircuit) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcElectricalCircuit) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricalCircuit) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcElectricalCircuit) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricalCircuit) object).getDecomposes().size(); i++) {
				resultList.add(((IfcElectricalCircuit) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricalCircuit) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcElectricalCircuit) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcElectricalCircuit) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcElectricalCircuit) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcElectricalCircuit) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcElectricalCircuit) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcElectricalCircuit) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
