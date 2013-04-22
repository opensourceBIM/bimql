package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcProcedure;

public class GetAttributeSubIfcProcedure {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProcedure(Object object, String string) {
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
		if (string.equals("UserDefinedProcedureType")) {
			resultList.add(((IfcProcedure) object).getUserDefinedProcedureType());
			 //1String
		}
		else if (string.equals("ProcedureID")) {
			resultList.add(((IfcProcedure) object).getProcedureID());
			 //1String
		}
		else if (string.equals("ProcedureType")) {
			resultList.add(((IfcProcedure) object).getProcedureType());
			 //1IfcProcedureTypeEnum
		}
		else if (string.equals("OperatesOn")) {
			//3xxx
			for (int i = 0; i < ((IfcProcedure) object).getOperatesOn().size(); i++) {
				resultList.add(((IfcProcedure) object).getOperatesOn().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsSuccessorFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcProcedure) object).getIsSuccessorFrom().size(); i++) {
				resultList.add(((IfcProcedure) object).getIsSuccessorFrom().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsPredecessorTo")) {
			//3xxx
			for (int i = 0; i < ((IfcProcedure) object).getIsPredecessorTo().size(); i++) {
				resultList.add(((IfcProcedure) object).getIsPredecessorTo().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcProcedure) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProcedure) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcProcedure) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcProcedure) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcProcedure) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProcedure) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcProcedure) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcProcedure) object).getDecomposes().size(); i++) {
				resultList.add(((IfcProcedure) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcProcedure) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcProcedure) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcProcedure) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcProcedure) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcProcedure) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcProcedure) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcProcedure) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
