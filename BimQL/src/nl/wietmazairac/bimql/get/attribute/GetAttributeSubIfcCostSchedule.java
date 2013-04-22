package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCostSchedule;

public class GetAttributeSubIfcCostSchedule {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCostSchedule(Object object, String string) {
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
		if (string.equals("SubmittedBy")) {
			resultList.add(((IfcCostSchedule) object).getSubmittedBy());
			 //1IfcActorSelect
		}
		else if (string.equals("PreparedBy")) {
			resultList.add(((IfcCostSchedule) object).getPreparedBy());
			 //1IfcActorSelect
		}
		else if (string.equals("SubmittedOn")) {
			resultList.add(((IfcCostSchedule) object).getSubmittedOn());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("TargetUsers")) {
			//3xxx
			for (int i = 0; i < ((IfcCostSchedule) object).getTargetUsers().size(); i++) {
				resultList.add(((IfcCostSchedule) object).getTargetUsers().get(i));
			}
			 //1EList
		}
		else if (string.equals("UpdateDate")) {
			resultList.add(((IfcCostSchedule) object).getUpdateDate());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("PredefinedType")) {
			resultList.add(((IfcCostSchedule) object).getPredefinedType());
			 //1IfcCostScheduleTypeEnum
		}
		else if (string.equals("ID")) {
			resultList.add(((IfcCostSchedule) object).getID());
			 //1String
		}
		else if (string.equals("Status")) {
			resultList.add(((IfcCostSchedule) object).getStatus());
			 //1String
		}
		else if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcCostSchedule) object).getControls().size(); i++) {
				resultList.add(((IfcCostSchedule) object).getControls().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcCostSchedule) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCostSchedule) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcCostSchedule) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCostSchedule) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcCostSchedule) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCostSchedule) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcCostSchedule) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcCostSchedule) object).getDecomposes().size(); i++) {
				resultList.add(((IfcCostSchedule) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcCostSchedule) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcCostSchedule) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcCostSchedule) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcCostSchedule) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcCostSchedule) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcCostSchedule) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcCostSchedule) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
