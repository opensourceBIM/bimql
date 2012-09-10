package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcStructuralConnection;

public class GetAttributeSubIfcStructuralConnection {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralConnection(Object object, String string) {
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
		if (string.equals("AppliedCondition")) {
			resultList.add(((IfcStructuralConnection) object).getAppliedCondition());
			 //1IfcBoundaryCondition
		}
		else if (string.equals("ConnectsStructuralMembers")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralConnection) object).getConnectsStructuralMembers().size(); i++) {
				resultList.add(((IfcStructuralConnection) object).getConnectsStructuralMembers().get(i));
			}
			 //1EList
		}
		else if (string.equals("AssignedStructuralActivity")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralConnection) object).getAssignedStructuralActivity().size(); i++) {
				resultList.add(((IfcStructuralConnection) object).getAssignedStructuralActivity().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralConnection) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralConnection) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralConnection) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralConnection) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralConnection) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralConnection) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralConnection) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralConnection) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralConnection) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralConnection) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralConnection) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralConnection) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralConnection) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralConnection) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralConnection) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralConnection) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralConnection) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralConnection) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralConnection) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralConnection) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
