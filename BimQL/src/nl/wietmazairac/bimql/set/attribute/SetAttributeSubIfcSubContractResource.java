package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcSubContractResource {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcSubContractResource() {
	}

	public SetAttributeSubIfcSubContractResource(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("SubContractor")) {
			//1NoEList
			 //1void
			 //1IfcActorSelect
		}
		else if (attributeName.equals("JobDescription")) {
			//1NoEList
			((IfcSubContractResource) object).setJobDescription(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ResourceIdentifier")) {
			//2NoEList
			((IfcSubContractResource) object).setResourceIdentifier(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ResourceConsumption")) {
			//2NoEList
			 //2void
			 //2IfcResourceConsumptionEnum
		}
		else if (attributeName.equals("ResourceGroup")) {
			//2NoEList
			((IfcSubContractResource) object).setResourceGroup(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("BaseQuantity")) {
			//2NoEList
			 //2void
			 //2IfcMeasureWithUnit
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcSubContractResource) object).setObjectType(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcSubContractResource) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcSubContractResource) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
