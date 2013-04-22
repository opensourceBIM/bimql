package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcActuatorType;

public class GetAttributeSubIfcActuatorType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcActuatorType(Object object, String string) {
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
			resultList.add(((IfcActuatorType) object).getPredefinedType());
			 //1IfcActuatorTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcActuatorType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcActuatorType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcActuatorType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcActuatorType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcActuatorType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcActuatorType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcActuatorType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcActuatorType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcActuatorType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcActuatorType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcActuatorType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcActuatorType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcActuatorType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcActuatorType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcActuatorType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcActuatorType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcActuatorType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcActuatorType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcActuatorType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcActuatorType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcActuatorType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcActuatorType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
