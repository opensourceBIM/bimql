package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcServiceLifeFactor;

public class SetAttributeSubIfcServiceLifeFactor {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcServiceLifeFactor() {
	}

	public SetAttributeSubIfcServiceLifeFactor(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("UpperValue")) {
			//1NoEList
			 //1void
			 //1IfcMeasureValue
		}
		else if (attributeName.equals("MostUsedValue")) {
			//1NoEList
			 //1void
			 //1IfcMeasureValue
		}
		else if (attributeName.equals("LowerValue")) {
			//1NoEList
			 //1void
			 //1IfcMeasureValue
		}
		else if (attributeName.equals("PredefinedType")) {
			//1NoEList
			 //1void
			 //1IfcServiceLifeFactorTypeEnum
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
			((IfcServiceLifeFactor) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcServiceLifeFactor) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
