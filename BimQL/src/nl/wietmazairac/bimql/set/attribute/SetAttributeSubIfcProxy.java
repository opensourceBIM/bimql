package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcProxy;

public class SetAttributeSubIfcProxy {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcProxy() {
	}

	public SetAttributeSubIfcProxy(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ProxyType")) {
			//1NoEList
			 //1void
			 //1IfcObjectTypeEnum
		}
		else if (attributeName.equals("Tag")) {
			//1NoEList
			((IfcProxy) object).setTag(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ObjectPlacement")) {
			//2NoEList
			 //2void
			 //2IfcObjectPlacement
		}
		else if (attributeName.equals("Representation")) {
			//2NoEList
			 //2void
			 //2IfcProductRepresentation
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcProxy) object).setObjectType(attributeNewValue);
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
			((IfcProxy) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcProxy) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
