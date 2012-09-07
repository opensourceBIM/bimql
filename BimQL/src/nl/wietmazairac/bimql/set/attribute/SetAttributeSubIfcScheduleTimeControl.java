package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcScheduleTimeControl {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcScheduleTimeControl() {
	}

	public SetAttributeSubIfcScheduleTimeControl(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("LateStart")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("FreeFloat")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setFreeFloat(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ActualStart")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("EarlyStart")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("ScheduleStart")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("ActualFinish")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("ScheduleTimeControlAssigned")) {
			//1NoEList
			 //1void
			 //1IfcRelAssignsTasks
		}
		else if (attributeName.equals("ScheduleDurationAsString")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setScheduleDurationAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ActualDurationAsString")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setActualDurationAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RemainingTimeAsString")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setRemainingTimeAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TotalFloatAsString")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setTotalFloatAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("StartFloatAsString")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setStartFloatAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FinishFloatAsString")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setFinishFloatAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CompletionAsString")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setCompletionAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("EarlyFinish")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("LateFinish")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("ScheduleFinish")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("ScheduleDuration")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setScheduleDuration(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ActualDuration")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setActualDuration(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RemainingTime")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setRemainingTime(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FreeFloatAsString")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setFreeFloatAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TotalFloat")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setTotalFloat(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("IsCritical")) {
			//1NoEList
			 //1void
			 //1Tristate
		}
		else if (attributeName.equals("StatusTime")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("StartFloat")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setStartFloat(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FinishFloat")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setFinishFloat(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Completion")) {
			//1NoEList
			((IfcScheduleTimeControl) object).setCompletion(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcScheduleTimeControl) object).setObjectType(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcScheduleTimeControl) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcScheduleTimeControl) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
