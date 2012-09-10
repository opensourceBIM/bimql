package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcConstructionResource;

public class SetAttributeSubIfcConstructionResource {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcConstructionResource() {
	}

	public SetAttributeSubIfcConstructionResource(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ResourceIdentifier")) {
			//1NoEList
			((IfcConstructionResource) object).setResourceIdentifier(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ResourceConsumption")) {
			//1NoEList
			 //1void
			 //1IfcResourceConsumptionEnum
		}
		else if (attributeName.equals("ResourceGroup")) {
			//1NoEList
			((IfcConstructionResource) object).setResourceGroup(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BaseQuantity")) {
			//1NoEList
			 //1void
			 //1IfcMeasureWithUnit
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcConstructionResource) object).setObjectType(attributeNewValue);
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
			((IfcConstructionResource) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcConstructionResource) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
