package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcStructuralCurveMember;

public class GetAttributeSubIfcStructuralCurveMember {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralCurveMember(Object object, String string) {
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
		if (string.equals("PredefinedType")) {
			resultList.add(((IfcStructuralCurveMember) object).getPredefinedType());
			 //1IfcStructuralCurveTypeEnum
		}
		else if (string.equals("ReferencesElement")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveMember) object).getReferencesElement().size(); i++) {
				resultList.add(((IfcStructuralCurveMember) object).getReferencesElement().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveMember) object).getConnectedBy().size(); i++) {
				resultList.add(((IfcStructuralCurveMember) object).getConnectedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("AssignedStructuralActivity")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveMember) object).getAssignedStructuralActivity().size(); i++) {
				resultList.add(((IfcStructuralCurveMember) object).getAssignedStructuralActivity().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralCurveMember) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralCurveMember) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveMember) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralCurveMember) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralCurveMember) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveMember) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralCurveMember) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveMember) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralCurveMember) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveMember) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralCurveMember) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveMember) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralCurveMember) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralCurveMember) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralCurveMember) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralCurveMember) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralCurveMember) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralCurveMember) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralCurveMember) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralCurveMember) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
