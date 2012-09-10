package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcWorkControl;

public class GetAttributeSubIfcWorkControl {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcWorkControl(Object object, String string) {
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
			resultList.add(((IfcWorkControl) object).getCreationDate());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("Purpose")) {
			resultList.add(((IfcWorkControl) object).getPurpose());
			 //1String
		}
		else if (string.equals("TotalFloat")) {
			resultList.add(((IfcWorkControl) object).getTotalFloat());
			 //1double
		}
		else if (string.equals("TotalFloatAsString")) {
			resultList.add(((IfcWorkControl) object).getTotalFloatAsString());
			 //1String
		}
		else if (string.equals("DurationAsString")) {
			resultList.add(((IfcWorkControl) object).getDurationAsString());
			 //1String
		}
		else if (string.equals("FinishTime")) {
			resultList.add(((IfcWorkControl) object).getFinishTime());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("WorkControlType")) {
			resultList.add(((IfcWorkControl) object).getWorkControlType());
			 //1IfcWorkControlTypeEnum
		}
		else if (string.equals("UserDefinedControlType")) {
			resultList.add(((IfcWorkControl) object).getUserDefinedControlType());
			 //1String
		}
		else if (string.equals("Creators")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkControl) object).getCreators().size(); i++) {
				resultList.add(((IfcWorkControl) object).getCreators().get(i));
			}
			 //1EList
		}
		else if (string.equals("Duration")) {
			resultList.add(((IfcWorkControl) object).getDuration());
			 //1double
		}
		else if (string.equals("StartTime")) {
			resultList.add(((IfcWorkControl) object).getStartTime());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("Identifier")) {
			resultList.add(((IfcWorkControl) object).getIdentifier());
			 //1String
		}
		else if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkControl) object).getControls().size(); i++) {
				resultList.add(((IfcWorkControl) object).getControls().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcWorkControl) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkControl) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcWorkControl) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkControl) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcWorkControl) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkControl) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcWorkControl) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkControl) object).getDecomposes().size(); i++) {
				resultList.add(((IfcWorkControl) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcWorkControl) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcWorkControl) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcWorkControl) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcWorkControl) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcWorkControl) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcWorkControl) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcWorkControl) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
