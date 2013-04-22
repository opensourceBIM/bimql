package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPerformanceHistory;

public class GetAttributeSubIfcPerformanceHistory {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPerformanceHistory(Object object, String string) {
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
		if (string.equals("LifeCyclePhase")) {
			resultList.add(((IfcPerformanceHistory) object).getLifeCyclePhase());
			 //1String
		}
		else if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcPerformanceHistory) object).getControls().size(); i++) {
				resultList.add(((IfcPerformanceHistory) object).getControls().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcPerformanceHistory) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcPerformanceHistory) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcPerformanceHistory) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcPerformanceHistory) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcPerformanceHistory) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcPerformanceHistory) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcPerformanceHistory) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcPerformanceHistory) object).getDecomposes().size(); i++) {
				resultList.add(((IfcPerformanceHistory) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcPerformanceHistory) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcPerformanceHistory) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcPerformanceHistory) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcPerformanceHistory) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcPerformanceHistory) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPerformanceHistory) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPerformanceHistory) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
