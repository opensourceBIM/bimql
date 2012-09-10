package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcRelConnectsPathElements;

public class SetAttributeSubIfcRelConnectsPathElements {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRelConnectsPathElements() {
	}

	public SetAttributeSubIfcRelConnectsPathElements(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("RelatedConnectionType")) {
			//1NoEList
			 //1void
			 //1IfcConnectionTypeEnum
		}
		else if (attributeName.equals("RelatingConnectionType")) {
			//1NoEList
			 //1void
			 //1IfcConnectionTypeEnum
		}
		else if (attributeName.equals("RelatingElement")) {
			//2NoEList
			 //2void
			 //2IfcElement
		}
		else if (attributeName.equals("RelatedElement")) {
			//2NoEList
			 //2void
			 //2IfcElement
		}
		else if (attributeName.equals("ConnectionGeometry")) {
			//2NoEList
			 //2void
			 //2IfcConnectionGeometry
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
			((IfcRelConnectsPathElements) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcRelConnectsPathElements) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
