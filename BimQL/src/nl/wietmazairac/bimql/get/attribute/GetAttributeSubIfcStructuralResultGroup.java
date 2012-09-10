package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcStructuralResultGroup;

public class GetAttributeSubIfcStructuralResultGroup {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralResultGroup(Object object, String string) {
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
		if (string.equals("TheoryType")) {
			resultList.add(((IfcStructuralResultGroup) object).getTheoryType());
			 //1IfcAnalysisTheoryTypeEnum
		}
		else if (string.equals("ResultGroupFor")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralResultGroup) object).getResultGroupFor().size(); i++) {
				resultList.add(((IfcStructuralResultGroup) object).getResultGroupFor().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsLinear")) {
			resultList.add(((IfcStructuralResultGroup) object).getIsLinear());
			 //1Tristate
		}
		else if (string.equals("ResultForLoadGroup")) {
			resultList.add(((IfcStructuralResultGroup) object).getResultForLoadGroup());
			 //1IfcStructuralLoadGroup
		}
		else if (string.equals("IsGroupedBy")) {
			resultList.add(((IfcStructuralResultGroup) object).getIsGroupedBy());
			 //2IfcRelAssignsToGroup
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralResultGroup) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralResultGroup) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralResultGroup) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralResultGroup) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralResultGroup) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralResultGroup) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralResultGroup) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralResultGroup) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralResultGroup) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralResultGroup) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralResultGroup) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralResultGroup) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralResultGroup) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralResultGroup) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralResultGroup) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralResultGroup) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
