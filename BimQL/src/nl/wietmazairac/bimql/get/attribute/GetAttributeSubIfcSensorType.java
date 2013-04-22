package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcSensorType;

public class GetAttributeSubIfcSensorType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSensorType(Object object, String string) {
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
			resultList.add(((IfcSensorType) object).getPredefinedType());
			 //1IfcSensorTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcSensorType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcSensorType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcSensorType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcSensorType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcSensorType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcSensorType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcSensorType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcSensorType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcSensorType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSensorType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcSensorType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSensorType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcSensorType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcSensorType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcSensorType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSensorType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSensorType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSensorType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSensorType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSensorType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSensorType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSensorType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
