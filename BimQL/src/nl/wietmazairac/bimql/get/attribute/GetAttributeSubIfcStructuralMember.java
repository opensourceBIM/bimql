package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcStructuralMember;

public class GetAttributeSubIfcStructuralMember {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralMember(Object object, String string) {
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
		if (string.equals("ReferencesElement")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralMember) object).getReferencesElement().size(); i++) {
				resultList.add(((IfcStructuralMember) object).getReferencesElement().get(i));
			}
			 //1EList
		}
		else if (string.equals("ConnectedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralMember) object).getConnectedBy().size(); i++) {
				resultList.add(((IfcStructuralMember) object).getConnectedBy().get(i));
			}
			 //1EList
		}
		else if (string.equals("AssignedStructuralActivity")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralMember) object).getAssignedStructuralActivity().size(); i++) {
				resultList.add(((IfcStructuralMember) object).getAssignedStructuralActivity().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralMember) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralMember) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralMember) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralMember) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralMember) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralMember) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralMember) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralMember) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralMember) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralMember) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralMember) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralMember) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralMember) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralMember) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralMember) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralMember) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralMember) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralMember) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralMember) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralMember) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
