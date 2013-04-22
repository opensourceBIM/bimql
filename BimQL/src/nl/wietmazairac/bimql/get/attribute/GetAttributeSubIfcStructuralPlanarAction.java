package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcStructuralPlanarAction;

public class GetAttributeSubIfcStructuralPlanarAction {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralPlanarAction(Object object, String string) {
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
		if (string.equals("ProjectedOrTrue")) {
			resultList.add(((IfcStructuralPlanarAction) object).getProjectedOrTrue());
			 //1IfcProjectedOrTrueLengthEnum
		}
		else if (string.equals("CausedBy")) {
			resultList.add(((IfcStructuralPlanarAction) object).getCausedBy());
			 //2IfcStructuralReaction
		}
		else if (string.equals("DestabilizingLoad")) {
			resultList.add(((IfcStructuralPlanarAction) object).getDestabilizingLoad());
			 //2Tristate
		}
		else if (string.equals("AppliedLoad")) {
			resultList.add(((IfcStructuralPlanarAction) object).getAppliedLoad());
			 //3IfcStructuralLoad
		}
		else if (string.equals("GlobalOrLocal")) {
			resultList.add(((IfcStructuralPlanarAction) object).getGlobalOrLocal());
			 //3IfcGlobalOrLocalEnum
		}
		else if (string.equals("AssignedToStructuralItem")) {
			resultList.add(((IfcStructuralPlanarAction) object).getAssignedToStructuralItem());
			 //3IfcRelConnectsStructuralActivity
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralPlanarAction) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralPlanarAction) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPlanarAction) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralPlanarAction) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralPlanarAction) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPlanarAction) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralPlanarAction) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPlanarAction) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralPlanarAction) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPlanarAction) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralPlanarAction) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPlanarAction) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralPlanarAction) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPlanarAction) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralPlanarAction) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralPlanarAction) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralPlanarAction) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralPlanarAction) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralPlanarAction) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralPlanarAction) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
