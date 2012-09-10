package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcStructuralPointConnection;

public class GetAttributeSubIfcStructuralPointConnection {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralPointConnection(Object object, String string) {
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
			resultList.add(((IfcStructuralPointConnection) object).getAppliedCondition());
			 //2IfcBoundaryCondition
		}
		else if (string.equals("ConnectsStructuralMembers")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPointConnection) object).getConnectsStructuralMembers().size(); i++) {
				resultList.add(((IfcStructuralPointConnection) object).getConnectsStructuralMembers().get(i));
			}
			 //2EList
		}
		else if (string.equals("AssignedStructuralActivity")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPointConnection) object).getAssignedStructuralActivity().size(); i++) {
				resultList.add(((IfcStructuralPointConnection) object).getAssignedStructuralActivity().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralPointConnection) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralPointConnection) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPointConnection) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralPointConnection) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralPointConnection) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPointConnection) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralPointConnection) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPointConnection) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralPointConnection) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPointConnection) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralPointConnection) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPointConnection) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralPointConnection) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPointConnection) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralPointConnection) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralPointConnection) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralPointConnection) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralPointConnection) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralPointConnection) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralPointConnection) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
