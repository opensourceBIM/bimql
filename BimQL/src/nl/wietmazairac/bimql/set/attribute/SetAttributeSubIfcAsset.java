package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcAsset;

public class SetAttributeSubIfcAsset {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcAsset() {
	}

	public SetAttributeSubIfcAsset(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("AssetID")) {
			//1NoEList
			((IfcAsset) object).setAssetID(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Owner")) {
			//1NoEList
			 //1void
			 //1IfcActorSelect
		}
		else if (attributeName.equals("User")) {
			//1NoEList
			 //1void
			 //1IfcActorSelect
		}
		else if (attributeName.equals("OriginalValue")) {
			//1NoEList
			 //1void
			 //1IfcCostValue
		}
		else if (attributeName.equals("CurrentValue")) {
			//1NoEList
			 //1void
			 //1IfcCostValue
		}
		else if (attributeName.equals("ResponsiblePerson")) {
			//1NoEList
			 //1void
			 //1IfcPerson
		}
		else if (attributeName.equals("IncorporationDate")) {
			//1NoEList
			 //1void
			 //1IfcCalendarDate
		}
		else if (attributeName.equals("DepreciatedValue")) {
			//1NoEList
			 //1void
			 //1IfcCostValue
		}
		else if (attributeName.equals("TotalReplacementCost")) {
			//1NoEList
			 //1void
			 //1IfcCostValue
		}
		else if (attributeName.equals("IsGroupedBy")) {
			//2NoEList
			 //2void
			 //2IfcRelAssignsToGroup
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcAsset) object).setObjectType(attributeNewValue);
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
			((IfcAsset) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcAsset) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
