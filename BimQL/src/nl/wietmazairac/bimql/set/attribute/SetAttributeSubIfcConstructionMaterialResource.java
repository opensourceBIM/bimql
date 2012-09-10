package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcConstructionMaterialResource;

public class SetAttributeSubIfcConstructionMaterialResource {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcConstructionMaterialResource() {
	}

	public SetAttributeSubIfcConstructionMaterialResource(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("UsageRatio")) {
			//1NoEList
			((IfcConstructionMaterialResource) object).setUsageRatio(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("UsageRatioAsString")) {
			//1NoEList
			((IfcConstructionMaterialResource) object).setUsageRatioAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ResourceIdentifier")) {
			//2NoEList
			((IfcConstructionMaterialResource) object).setResourceIdentifier(attributeNewValue);
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
			((IfcConstructionMaterialResource) object).setResourceGroup(attributeNewValue);
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
			((IfcConstructionMaterialResource) object).setObjectType(attributeNewValue);
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
			((IfcConstructionMaterialResource) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcConstructionMaterialResource) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
