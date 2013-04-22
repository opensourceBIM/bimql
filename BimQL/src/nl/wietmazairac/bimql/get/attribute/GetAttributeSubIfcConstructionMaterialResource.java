package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcConstructionMaterialResource;

public class GetAttributeSubIfcConstructionMaterialResource {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcConstructionMaterialResource(Object object, String string) {
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
		if (string.equals("UsageRatioAsString")) {
			resultList.add(((IfcConstructionMaterialResource) object).getUsageRatioAsString());
			 //1String
		}
		else if (string.equals("UsageRatio")) {
			resultList.add(((IfcConstructionMaterialResource) object).getUsageRatio());
			 //1double
		}
		else if (string.equals("Suppliers")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionMaterialResource) object).getSuppliers().size(); i++) {
				resultList.add(((IfcConstructionMaterialResource) object).getSuppliers().get(i));
			}
			 //1EList
		}
		else if (string.equals("ResourceGroup")) {
			resultList.add(((IfcConstructionMaterialResource) object).getResourceGroup());
			 //2String
		}
		else if (string.equals("BaseQuantity")) {
			resultList.add(((IfcConstructionMaterialResource) object).getBaseQuantity());
			 //2IfcMeasureWithUnit
		}
		else if (string.equals("ResourceIdentifier")) {
			resultList.add(((IfcConstructionMaterialResource) object).getResourceIdentifier());
			 //2String
		}
		else if (string.equals("ResourceConsumption")) {
			resultList.add(((IfcConstructionMaterialResource) object).getResourceConsumption());
			 //2IfcResourceConsumptionEnum
		}
		else if (string.equals("ResourceOf")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionMaterialResource) object).getResourceOf().size(); i++) {
				resultList.add(((IfcConstructionMaterialResource) object).getResourceOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcConstructionMaterialResource) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionMaterialResource) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcConstructionMaterialResource) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionMaterialResource) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcConstructionMaterialResource) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionMaterialResource) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcConstructionMaterialResource) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionMaterialResource) object).getDecomposes().size(); i++) {
				resultList.add(((IfcConstructionMaterialResource) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionMaterialResource) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcConstructionMaterialResource) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcConstructionMaterialResource) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcConstructionMaterialResource) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcConstructionMaterialResource) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcConstructionMaterialResource) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcConstructionMaterialResource) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
