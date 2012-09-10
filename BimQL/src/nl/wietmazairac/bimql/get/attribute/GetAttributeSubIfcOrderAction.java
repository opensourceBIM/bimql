package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcOrderAction;

public class GetAttributeSubIfcOrderAction {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcOrderAction(Object object, String string) {
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
		if (string.equals("ActionID")) {
			resultList.add(((IfcOrderAction) object).getActionID());
			 //1String
		}
		else if (string.equals("TaskId")) {
			resultList.add(((IfcOrderAction) object).getTaskId());
			 //2String
		}
		else if (string.equals("WorkMethod")) {
			resultList.add(((IfcOrderAction) object).getWorkMethod());
			 //2String
		}
		else if (string.equals("IsMilestone")) {
			resultList.add(((IfcOrderAction) object).getIsMilestone());
			 //2Tristate
		}
		else if (string.equals("Priority")) {
			resultList.add(((IfcOrderAction) object).getPriority());
			 //2int
		}
		else if (string.equals("Status")) {
			resultList.add(((IfcOrderAction) object).getStatus());
			 //2String
		}
		else if (string.equals("OperatesOn")) {
			//3xxx
			for (int i = 0; i < ((IfcOrderAction) object).getOperatesOn().size(); i++) {
				resultList.add(((IfcOrderAction) object).getOperatesOn().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsSuccessorFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcOrderAction) object).getIsSuccessorFrom().size(); i++) {
				resultList.add(((IfcOrderAction) object).getIsSuccessorFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsPredecessorTo")) {
			//3xxx
			for (int i = 0; i < ((IfcOrderAction) object).getIsPredecessorTo().size(); i++) {
				resultList.add(((IfcOrderAction) object).getIsPredecessorTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcOrderAction) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcOrderAction) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcOrderAction) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcOrderAction) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcOrderAction) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcOrderAction) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcOrderAction) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcOrderAction) object).getDecomposes().size(); i++) {
				resultList.add(((IfcOrderAction) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcOrderAction) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcOrderAction) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcOrderAction) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcOrderAction) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcOrderAction) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcOrderAction) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcOrderAction) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
