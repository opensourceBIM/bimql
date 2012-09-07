package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcSubContractResource {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSubContractResource(Object object, String string) {
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
		if (string.equals("SubContractor")) {
			resultList.add(((IfcSubContractResource) object).getSubContractor());
			 //1IfcActorSelect
		}
		else if (string.equals("JobDescription")) {
			resultList.add(((IfcSubContractResource) object).getJobDescription());
			 //1String
		}
		else if (string.equals("ResourceGroup")) {
			resultList.add(((IfcSubContractResource) object).getResourceGroup());
			 //2String
		}
		else if (string.equals("BaseQuantity")) {
			resultList.add(((IfcSubContractResource) object).getBaseQuantity());
			 //2IfcMeasureWithUnit
		}
		else if (string.equals("ResourceIdentifier")) {
			resultList.add(((IfcSubContractResource) object).getResourceIdentifier());
			 //2String
		}
		else if (string.equals("ResourceConsumption")) {
			resultList.add(((IfcSubContractResource) object).getResourceConsumption());
			 //2IfcResourceConsumptionEnum
		}
		else if (string.equals("ResourceOf")) {
			//3xxx
			for (int i = 0; i < ((IfcSubContractResource) object).getResourceOf().size(); i++) {
				resultList.add(((IfcSubContractResource) object).getResourceOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcSubContractResource) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSubContractResource) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcSubContractResource) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSubContractResource) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcSubContractResource) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSubContractResource) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcSubContractResource) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcSubContractResource) object).getDecomposes().size(); i++) {
				resultList.add(((IfcSubContractResource) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSubContractResource) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSubContractResource) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSubContractResource) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSubContractResource) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSubContractResource) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSubContractResource) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSubContractResource) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
