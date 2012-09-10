package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcStructuralPlanarActionVarying;

public class GetAttributeSubIfcStructuralPlanarActionVarying {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralPlanarActionVarying(Object object, String string) {
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
		if (string.equals("VaryingAppliedLoadLocation")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getVaryingAppliedLoadLocation());
			 //1IfcShapeAspect
		}
		else if (string.equals("SubsequentAppliedLoads")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPlanarActionVarying) object).getSubsequentAppliedLoads().size(); i++) {
				resultList.add(((IfcStructuralPlanarActionVarying) object).getSubsequentAppliedLoads().get(i));
			}
			 //1EList
		}
		else if (string.equals("ProjectedOrTrue")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getProjectedOrTrue());
			 //2IfcProjectedOrTrueLengthEnum
		}
		else if (string.equals("CausedBy")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getCausedBy());
			 //3IfcStructuralReaction
		}
		else if (string.equals("DestabilizingLoad")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getDestabilizingLoad());
			 //3Tristate
		}
		else if (string.equals("AppliedLoad")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getAppliedLoad());
			 //3IfcStructuralLoad
		}
		else if (string.equals("GlobalOrLocal")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getGlobalOrLocal());
			 //3IfcGlobalOrLocalEnum
		}
		else if (string.equals("AssignedToStructuralItem")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getAssignedToStructuralItem());
			 //3IfcRelConnectsStructuralActivity
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPlanarActionVarying) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralPlanarActionVarying) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPlanarActionVarying) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralPlanarActionVarying) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPlanarActionVarying) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralPlanarActionVarying) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPlanarActionVarying) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralPlanarActionVarying) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPlanarActionVarying) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralPlanarActionVarying) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralPlanarActionVarying) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralPlanarActionVarying) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralPlanarActionVarying) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
