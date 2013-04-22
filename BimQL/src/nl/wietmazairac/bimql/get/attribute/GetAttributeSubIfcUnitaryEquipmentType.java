package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcUnitaryEquipmentType;

public class GetAttributeSubIfcUnitaryEquipmentType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcUnitaryEquipmentType(Object object, String string) {
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
			resultList.add(((IfcUnitaryEquipmentType) object).getPredefinedType());
			 //1IfcUnitaryEquipmentTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcUnitaryEquipmentType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcUnitaryEquipmentType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcUnitaryEquipmentType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcUnitaryEquipmentType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcUnitaryEquipmentType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcUnitaryEquipmentType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcUnitaryEquipmentType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcUnitaryEquipmentType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcUnitaryEquipmentType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcUnitaryEquipmentType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcUnitaryEquipmentType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcUnitaryEquipmentType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcUnitaryEquipmentType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcUnitaryEquipmentType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcUnitaryEquipmentType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcUnitaryEquipmentType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcUnitaryEquipmentType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcUnitaryEquipmentType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcUnitaryEquipmentType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcUnitaryEquipmentType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcUnitaryEquipmentType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcUnitaryEquipmentType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
