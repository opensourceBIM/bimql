package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcProcess;

public class GetAttributeSubIfcProcess {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProcess(Object object, String string) {
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
		if (string.equals("OperatesOn")) {
			//3xxx
			for (int i = 0; i < ((IfcProcess) object).getOperatesOn().size(); i++) {
				resultList.add(((IfcProcess) object).getOperatesOn().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsSuccessorFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcProcess) object).getIsSuccessorFrom().size(); i++) {
				resultList.add(((IfcProcess) object).getIsSuccessorFrom().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsPredecessorTo")) {
			//3xxx
			for (int i = 0; i < ((IfcProcess) object).getIsPredecessorTo().size(); i++) {
				resultList.add(((IfcProcess) object).getIsPredecessorTo().get(i));
			}
			 //1EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcProcess) object).getObjectType());
			 //2String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProcess) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcProcess) object).getIsDefinedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcProcess) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcProcess) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProcess) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcProcess) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcProcess) object).getDecomposes().size(); i++) {
				resultList.add(((IfcProcess) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcProcess) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcProcess) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcProcess) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcProcess) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcProcess) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcProcess) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcProcess) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
