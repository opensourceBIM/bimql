package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcConstructionEquipmentResource {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcConstructionEquipmentResource(Object object, String string) {
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
		if (string.equals("ResourceGroup")) {
			resultList.add(((IfcConstructionEquipmentResource) object).getResourceGroup());
			 //2String
		}
		else if (string.equals("BaseQuantity")) {
			resultList.add(((IfcConstructionEquipmentResource) object).getBaseQuantity());
			 //2IfcMeasureWithUnit
		}
		else if (string.equals("ResourceIdentifier")) {
			resultList.add(((IfcConstructionEquipmentResource) object).getResourceIdentifier());
			 //2String
		}
		else if (string.equals("ResourceConsumption")) {
			resultList.add(((IfcConstructionEquipmentResource) object).getResourceConsumption());
			 //2IfcResourceConsumptionEnum
		}
		else if (string.equals("ResourceOf")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionEquipmentResource) object).getResourceOf().size(); i++) {
				resultList.add(((IfcConstructionEquipmentResource) object).getResourceOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcConstructionEquipmentResource) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionEquipmentResource) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcConstructionEquipmentResource) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionEquipmentResource) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcConstructionEquipmentResource) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionEquipmentResource) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcConstructionEquipmentResource) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionEquipmentResource) object).getDecomposes().size(); i++) {
				resultList.add(((IfcConstructionEquipmentResource) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionEquipmentResource) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcConstructionEquipmentResource) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcConstructionEquipmentResource) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcConstructionEquipmentResource) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcConstructionEquipmentResource) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcConstructionEquipmentResource) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcConstructionEquipmentResource) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
