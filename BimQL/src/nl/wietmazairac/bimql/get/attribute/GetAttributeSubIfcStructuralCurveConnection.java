package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcStructuralCurveConnection;

public class GetAttributeSubIfcStructuralCurveConnection {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralCurveConnection(Object object, String string) {
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
			resultList.add(((IfcStructuralCurveConnection) object).getAppliedCondition());
			 //2IfcBoundaryCondition
		}
		else if (string.equals("ConnectsStructuralMembers")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveConnection) object).getConnectsStructuralMembers().size(); i++) {
				resultList.add(((IfcStructuralCurveConnection) object).getConnectsStructuralMembers().get(i));
			}
			 //2EList
		}
		else if (string.equals("AssignedStructuralActivity")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveConnection) object).getAssignedStructuralActivity().size(); i++) {
				resultList.add(((IfcStructuralCurveConnection) object).getAssignedStructuralActivity().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralCurveConnection) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralCurveConnection) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveConnection) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralCurveConnection) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralCurveConnection) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveConnection) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralCurveConnection) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveConnection) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralCurveConnection) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveConnection) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralCurveConnection) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveConnection) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralCurveConnection) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveConnection) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralCurveConnection) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralCurveConnection) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralCurveConnection) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralCurveConnection) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralCurveConnection) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralCurveConnection) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
