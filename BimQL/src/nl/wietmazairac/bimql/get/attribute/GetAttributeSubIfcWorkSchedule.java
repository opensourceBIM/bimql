package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcWorkSchedule {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcWorkSchedule(Object object, String string) {
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
		if (string.equals("CreationDate")) {
			resultList.add(((IfcWorkSchedule) object).getCreationDate());
			 //2IfcDateTimeSelect
		}
		else if (string.equals("Purpose")) {
			resultList.add(((IfcWorkSchedule) object).getPurpose());
			 //2String
		}
		else if (string.equals("TotalFloat")) {
			resultList.add(((IfcWorkSchedule) object).getTotalFloat());
			 //2double
		}
		else if (string.equals("TotalFloatAsString")) {
			resultList.add(((IfcWorkSchedule) object).getTotalFloatAsString());
			 //2String
		}
		else if (string.equals("DurationAsString")) {
			resultList.add(((IfcWorkSchedule) object).getDurationAsString());
			 //2String
		}
		else if (string.equals("FinishTime")) {
			resultList.add(((IfcWorkSchedule) object).getFinishTime());
			 //2IfcDateTimeSelect
		}
		else if (string.equals("WorkControlType")) {
			resultList.add(((IfcWorkSchedule) object).getWorkControlType());
			 //2IfcWorkControlTypeEnum
		}
		else if (string.equals("UserDefinedControlType")) {
			resultList.add(((IfcWorkSchedule) object).getUserDefinedControlType());
			 //2String
		}
		else if (string.equals("Creators")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkSchedule) object).getCreators().size(); i++) {
				resultList.add(((IfcWorkSchedule) object).getCreators().get(i));
			}
			 //2EList
		}
		else if (string.equals("Duration")) {
			resultList.add(((IfcWorkSchedule) object).getDuration());
			 //2double
		}
		else if (string.equals("StartTime")) {
			resultList.add(((IfcWorkSchedule) object).getStartTime());
			 //2IfcDateTimeSelect
		}
		else if (string.equals("Identifier")) {
			resultList.add(((IfcWorkSchedule) object).getIdentifier());
			 //2String
		}
		else if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkSchedule) object).getControls().size(); i++) {
				resultList.add(((IfcWorkSchedule) object).getControls().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcWorkSchedule) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkSchedule) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcWorkSchedule) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkSchedule) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcWorkSchedule) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkSchedule) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcWorkSchedule) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkSchedule) object).getDecomposes().size(); i++) {
				resultList.add(((IfcWorkSchedule) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkSchedule) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcWorkSchedule) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcWorkSchedule) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcWorkSchedule) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcWorkSchedule) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcWorkSchedule) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcWorkSchedule) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
