package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcConstructionProductResource;

public class SetAttributeSubIfcConstructionProductResource {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcConstructionProductResource() {
	}

	public SetAttributeSubIfcConstructionProductResource(Object object, String attributeName, String attributeNewValue) {
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
			//2NoEList
			((IfcConstructionProductResource) object).setResourceIdentifier(attributeNewValue);
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
			((IfcConstructionProductResource) object).setResourceGroup(attributeNewValue);
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
			((IfcConstructionProductResource) object).setObjectType(attributeNewValue);
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
			((IfcConstructionProductResource) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcConstructionProductResource) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
