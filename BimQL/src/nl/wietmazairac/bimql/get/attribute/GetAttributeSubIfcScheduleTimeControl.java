package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcScheduleTimeControl;

public class GetAttributeSubIfcScheduleTimeControl {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcScheduleTimeControl(Object object, String string) {
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
		if (string.equals("LateStart")) {
			resultList.add(((IfcScheduleTimeControl) object).getLateStart());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("FreeFloat")) {
			resultList.add(((IfcScheduleTimeControl) object).getFreeFloat());
			 //1double
		}
		else if (string.equals("ScheduleTimeControlAssigned")) {
			resultList.add(((IfcScheduleTimeControl) object).getScheduleTimeControlAssigned());
			 //1IfcRelAssignsTasks
		}
		else if (string.equals("ActualStart")) {
			resultList.add(((IfcScheduleTimeControl) object).getActualStart());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("EarlyStart")) {
			resultList.add(((IfcScheduleTimeControl) object).getEarlyStart());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("ScheduleStart")) {
			resultList.add(((IfcScheduleTimeControl) object).getScheduleStart());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("ActualFinish")) {
			resultList.add(((IfcScheduleTimeControl) object).getActualFinish());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("EarlyFinish")) {
			resultList.add(((IfcScheduleTimeControl) object).getEarlyFinish());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("LateFinish")) {
			resultList.add(((IfcScheduleTimeControl) object).getLateFinish());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("ScheduleFinish")) {
			resultList.add(((IfcScheduleTimeControl) object).getScheduleFinish());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("ScheduleDuration")) {
			resultList.add(((IfcScheduleTimeControl) object).getScheduleDuration());
			 //1double
		}
		else if (string.equals("ActualDuration")) {
			resultList.add(((IfcScheduleTimeControl) object).getActualDuration());
			 //1double
		}
		else if (string.equals("RemainingTime")) {
			resultList.add(((IfcScheduleTimeControl) object).getRemainingTime());
			 //1double
		}
		else if (string.equals("FreeFloatAsString")) {
			resultList.add(((IfcScheduleTimeControl) object).getFreeFloatAsString());
			 //1String
		}
		else if (string.equals("TotalFloat")) {
			resultList.add(((IfcScheduleTimeControl) object).getTotalFloat());
			 //1double
		}
		else if (string.equals("IsCritical")) {
			resultList.add(((IfcScheduleTimeControl) object).getIsCritical());
			 //1Tristate
		}
		else if (string.equals("StatusTime")) {
			resultList.add(((IfcScheduleTimeControl) object).getStatusTime());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("StartFloat")) {
			resultList.add(((IfcScheduleTimeControl) object).getStartFloat());
			 //1double
		}
		else if (string.equals("FinishFloat")) {
			resultList.add(((IfcScheduleTimeControl) object).getFinishFloat());
			 //1double
		}
		else if (string.equals("Completion")) {
			resultList.add(((IfcScheduleTimeControl) object).getCompletion());
			 //1double
		}
		else if (string.equals("ScheduleDurationAsString")) {
			resultList.add(((IfcScheduleTimeControl) object).getScheduleDurationAsString());
			 //1String
		}
		else if (string.equals("ActualDurationAsString")) {
			resultList.add(((IfcScheduleTimeControl) object).getActualDurationAsString());
			 //1String
		}
		else if (string.equals("RemainingTimeAsString")) {
			resultList.add(((IfcScheduleTimeControl) object).getRemainingTimeAsString());
			 //1String
		}
		else if (string.equals("TotalFloatAsString")) {
			resultList.add(((IfcScheduleTimeControl) object).getTotalFloatAsString());
			 //1String
		}
		else if (string.equals("StartFloatAsString")) {
			resultList.add(((IfcScheduleTimeControl) object).getStartFloatAsString());
			 //1String
		}
		else if (string.equals("FinishFloatAsString")) {
			resultList.add(((IfcScheduleTimeControl) object).getFinishFloatAsString());
			 //1String
		}
		else if (string.equals("CompletionAsString")) {
			resultList.add(((IfcScheduleTimeControl) object).getCompletionAsString());
			 //1String
		}
		else if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcScheduleTimeControl) object).getControls().size(); i++) {
				resultList.add(((IfcScheduleTimeControl) object).getControls().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcScheduleTimeControl) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcScheduleTimeControl) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcScheduleTimeControl) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcScheduleTimeControl) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcScheduleTimeControl) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcScheduleTimeControl) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcScheduleTimeControl) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcScheduleTimeControl) object).getDecomposes().size(); i++) {
				resultList.add(((IfcScheduleTimeControl) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcScheduleTimeControl) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcScheduleTimeControl) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcScheduleTimeControl) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcScheduleTimeControl) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcScheduleTimeControl) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcScheduleTimeControl) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcScheduleTimeControl) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
