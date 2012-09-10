package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcServiceLife;

public class GetAttributeSubIfcServiceLife {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcServiceLife(Object object, String string) {
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
		if (string.equals("ServiceLifeDurationAsString")) {
			resultList.add(((IfcServiceLife) object).getServiceLifeDurationAsString());
			 //1String
		}
		else if (string.equals("ServiceLifeDuration")) {
			resultList.add(((IfcServiceLife) object).getServiceLifeDuration());
			 //1double
		}
		else if (string.equals("ServiceLifeType")) {
			resultList.add(((IfcServiceLife) object).getServiceLifeType());
			 //1IfcServiceLifeTypeEnum
		}
		else if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcServiceLife) object).getControls().size(); i++) {
				resultList.add(((IfcServiceLife) object).getControls().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcServiceLife) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcServiceLife) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcServiceLife) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcServiceLife) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcServiceLife) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcServiceLife) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcServiceLife) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcServiceLife) object).getDecomposes().size(); i++) {
				resultList.add(((IfcServiceLife) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcServiceLife) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcServiceLife) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcServiceLife) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcServiceLife) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcServiceLife) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcServiceLife) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcServiceLife) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
