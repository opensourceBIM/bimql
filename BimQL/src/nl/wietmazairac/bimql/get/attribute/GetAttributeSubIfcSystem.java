package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcSystem;

public class GetAttributeSubIfcSystem {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSystem(Object object, String string) {
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
			for (int i = 0; i < ((IfcSystem) object).getServicesBuildings().size(); i++) {
				resultList.add(((IfcSystem) object).getServicesBuildings().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsGroupedBy")) {
			resultList.add(((IfcSystem) object).getIsGroupedBy());
			 //2IfcRelAssignsToGroup
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcSystem) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSystem) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcSystem) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSystem) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcSystem) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSystem) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcSystem) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcSystem) object).getDecomposes().size(); i++) {
				resultList.add(((IfcSystem) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSystem) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSystem) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSystem) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSystem) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSystem) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSystem) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSystem) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
