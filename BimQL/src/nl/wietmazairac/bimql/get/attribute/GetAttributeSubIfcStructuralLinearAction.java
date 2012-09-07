package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcStructuralLinearAction {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralLinearAction(Object object, String string) {
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
			resultList.add(((IfcStructuralLinearAction) object).getProjectedOrTrue());
			 //1IfcProjectedOrTrueLengthEnum
		}
		else if (string.equals("CausedBy")) {
			resultList.add(((IfcStructuralLinearAction) object).getCausedBy());
			 //2IfcStructuralReaction
		}
		else if (string.equals("DestabilizingLoad")) {
			resultList.add(((IfcStructuralLinearAction) object).getDestabilizingLoad());
			 //2Tristate
		}
		else if (string.equals("AppliedLoad")) {
			resultList.add(((IfcStructuralLinearAction) object).getAppliedLoad());
			 //3IfcStructuralLoad
		}
		else if (string.equals("GlobalOrLocal")) {
			resultList.add(((IfcStructuralLinearAction) object).getGlobalOrLocal());
			 //3IfcGlobalOrLocalEnum
		}
		else if (string.equals("AssignedToStructuralItem")) {
			resultList.add(((IfcStructuralLinearAction) object).getAssignedToStructuralItem());
			 //3IfcRelConnectsStructuralActivity
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralLinearAction) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralLinearAction) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLinearAction) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralLinearAction) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralLinearAction) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLinearAction) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralLinearAction) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLinearAction) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralLinearAction) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLinearAction) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralLinearAction) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLinearAction) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralLinearAction) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralLinearAction) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralLinearAction) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralLinearAction) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralLinearAction) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralLinearAction) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralLinearAction) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralLinearAction) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
