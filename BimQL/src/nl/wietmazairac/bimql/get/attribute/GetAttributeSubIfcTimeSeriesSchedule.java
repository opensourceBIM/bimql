package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcTimeSeriesSchedule {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTimeSeriesSchedule(Object object, String string) {
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
		if (string.equals("ApplicableDates")) {
			//3xxx
			for (int i = 0; i < ((IfcTimeSeriesSchedule) object).getApplicableDates().size(); i++) {
				resultList.add(((IfcTimeSeriesSchedule) object).getApplicableDates().get(i));
			}
			 //1EList
		}
		else if (string.equals("TimeSeries")) {
			resultList.add(((IfcTimeSeriesSchedule) object).getTimeSeries());
			 //1IfcTimeSeries
		}
		else if (string.equals("TimeSeriesScheduleType")) {
			resultList.add(((IfcTimeSeriesSchedule) object).getTimeSeriesScheduleType());
			 //1IfcTimeSeriesScheduleTypeEnum
		}
		else if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcTimeSeriesSchedule) object).getControls().size(); i++) {
				resultList.add(((IfcTimeSeriesSchedule) object).getControls().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcTimeSeriesSchedule) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTimeSeriesSchedule) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcTimeSeriesSchedule) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTimeSeriesSchedule) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcTimeSeriesSchedule) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTimeSeriesSchedule) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcTimeSeriesSchedule) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcTimeSeriesSchedule) object).getDecomposes().size(); i++) {
				resultList.add(((IfcTimeSeriesSchedule) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcTimeSeriesSchedule) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcTimeSeriesSchedule) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcTimeSeriesSchedule) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcTimeSeriesSchedule) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcTimeSeriesSchedule) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcTimeSeriesSchedule) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcTimeSeriesSchedule) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
