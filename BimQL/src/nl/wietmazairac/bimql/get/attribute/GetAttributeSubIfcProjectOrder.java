package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcProjectOrder;

public class GetAttributeSubIfcProjectOrder {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProjectOrder(Object object, String string) {
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
			resultList.add(((IfcProjectOrder) object).getPredefinedType());
			 //1IfcProjectOrderTypeEnum
		}
		else if (string.equals("ID")) {
			resultList.add(((IfcProjectOrder) object).getID());
			 //1String
		}
		else if (string.equals("Status")) {
			resultList.add(((IfcProjectOrder) object).getStatus());
			 //1String
		}
		else if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrder) object).getControls().size(); i++) {
				resultList.add(((IfcProjectOrder) object).getControls().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcProjectOrder) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrder) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcProjectOrder) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrder) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcProjectOrder) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrder) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcProjectOrder) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrder) object).getDecomposes().size(); i++) {
				resultList.add(((IfcProjectOrder) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrder) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcProjectOrder) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcProjectOrder) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcProjectOrder) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcProjectOrder) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcProjectOrder) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcProjectOrder) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
