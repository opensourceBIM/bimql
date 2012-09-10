package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcConstructionResource;

public class GetAttributeSubIfcConstructionResource {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcConstructionResource(Object object, String string) {
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
			resultList.add(((IfcConstructionResource) object).getResourceGroup());
			 //1String
		}
		else if (string.equals("BaseQuantity")) {
			resultList.add(((IfcConstructionResource) object).getBaseQuantity());
			 //1IfcMeasureWithUnit
		}
		else if (string.equals("ResourceIdentifier")) {
			resultList.add(((IfcConstructionResource) object).getResourceIdentifier());
			 //1String
		}
		else if (string.equals("ResourceConsumption")) {
			resultList.add(((IfcConstructionResource) object).getResourceConsumption());
			 //1IfcResourceConsumptionEnum
		}
		else if (string.equals("ResourceOf")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionResource) object).getResourceOf().size(); i++) {
				resultList.add(((IfcConstructionResource) object).getResourceOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcConstructionResource) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionResource) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcConstructionResource) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionResource) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcConstructionResource) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionResource) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcConstructionResource) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionResource) object).getDecomposes().size(); i++) {
				resultList.add(((IfcConstructionResource) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcConstructionResource) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcConstructionResource) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcConstructionResource) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcConstructionResource) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcConstructionResource) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcConstructionResource) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcConstructionResource) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
