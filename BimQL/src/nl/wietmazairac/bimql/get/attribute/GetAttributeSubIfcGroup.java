package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcGroup;

public class GetAttributeSubIfcGroup {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcGroup(Object object, String string) {
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
		if (string.equals("IsGroupedBy")) {
			resultList.add(((IfcGroup) object).getIsGroupedBy());
			 //1IfcRelAssignsToGroup
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcGroup) object).getObjectType());
			 //2String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcGroup) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcGroup) object).getIsDefinedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcGroup) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcGroup) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcGroup) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcGroup) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcGroup) object).getDecomposes().size(); i++) {
				resultList.add(((IfcGroup) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcGroup) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcGroup) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcGroup) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcGroup) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcGroup) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcGroup) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcGroup) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
