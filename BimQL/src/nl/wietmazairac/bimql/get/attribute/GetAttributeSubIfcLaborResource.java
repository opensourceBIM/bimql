package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcLaborResource;

public class GetAttributeSubIfcLaborResource {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLaborResource(Object object, String string) {
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
		if (string.equals("SkillSet")) {
			resultList.add(((IfcLaborResource) object).getSkillSet());
			 //1String
		}
		else if (string.equals("ResourceGroup")) {
			resultList.add(((IfcLaborResource) object).getResourceGroup());
			 //2String
		}
		else if (string.equals("BaseQuantity")) {
			resultList.add(((IfcLaborResource) object).getBaseQuantity());
			 //2IfcMeasureWithUnit
		}
		else if (string.equals("ResourceIdentifier")) {
			resultList.add(((IfcLaborResource) object).getResourceIdentifier());
			 //2String
		}
		else if (string.equals("ResourceConsumption")) {
			resultList.add(((IfcLaborResource) object).getResourceConsumption());
			 //2IfcResourceConsumptionEnum
		}
		else if (string.equals("ResourceOf")) {
			//3xxx
			for (int i = 0; i < ((IfcLaborResource) object).getResourceOf().size(); i++) {
				resultList.add(((IfcLaborResource) object).getResourceOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcLaborResource) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcLaborResource) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcLaborResource) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcLaborResource) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcLaborResource) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcLaborResource) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcLaborResource) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcLaborResource) object).getDecomposes().size(); i++) {
				resultList.add(((IfcLaborResource) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcLaborResource) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcLaborResource) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcLaborResource) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcLaborResource) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcLaborResource) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcLaborResource) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcLaborResource) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
