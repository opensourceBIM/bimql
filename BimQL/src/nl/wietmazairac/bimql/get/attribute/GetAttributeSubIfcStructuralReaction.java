package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcStructuralReaction;

public class GetAttributeSubIfcStructuralReaction {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralReaction(Object object, String string) {
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
		if (string.equals("Causes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralReaction) object).getCauses().size(); i++) {
				resultList.add(((IfcStructuralReaction) object).getCauses().get(i));
			}
			 //1EList
		}
		else if (string.equals("AppliedLoad")) {
			resultList.add(((IfcStructuralReaction) object).getAppliedLoad());
			 //2IfcStructuralLoad
		}
		else if (string.equals("GlobalOrLocal")) {
			resultList.add(((IfcStructuralReaction) object).getGlobalOrLocal());
			 //2IfcGlobalOrLocalEnum
		}
		else if (string.equals("AssignedToStructuralItem")) {
			resultList.add(((IfcStructuralReaction) object).getAssignedToStructuralItem());
			 //2IfcRelConnectsStructuralActivity
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralReaction) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralReaction) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralReaction) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralReaction) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralReaction) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralReaction) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralReaction) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralReaction) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralReaction) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralReaction) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralReaction) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralReaction) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralReaction) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralReaction) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralReaction) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralReaction) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralReaction) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralReaction) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralReaction) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralReaction) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
