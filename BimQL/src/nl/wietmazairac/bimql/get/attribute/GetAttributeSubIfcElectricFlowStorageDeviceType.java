package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcElectricFlowStorageDeviceType;

public class GetAttributeSubIfcElectricFlowStorageDeviceType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcElectricFlowStorageDeviceType(Object object, String string) {
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
			resultList.add(((IfcElectricFlowStorageDeviceType) object).getPredefinedType());
			 //1IfcElectricFlowStorageDeviceTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcElectricFlowStorageDeviceType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricFlowStorageDeviceType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcElectricFlowStorageDeviceType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcElectricFlowStorageDeviceType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcElectricFlowStorageDeviceType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricFlowStorageDeviceType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcElectricFlowStorageDeviceType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricFlowStorageDeviceType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcElectricFlowStorageDeviceType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricFlowStorageDeviceType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcElectricFlowStorageDeviceType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricFlowStorageDeviceType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcElectricFlowStorageDeviceType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricFlowStorageDeviceType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcElectricFlowStorageDeviceType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricFlowStorageDeviceType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcElectricFlowStorageDeviceType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcElectricFlowStorageDeviceType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcElectricFlowStorageDeviceType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcElectricFlowStorageDeviceType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcElectricFlowStorageDeviceType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcElectricFlowStorageDeviceType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
