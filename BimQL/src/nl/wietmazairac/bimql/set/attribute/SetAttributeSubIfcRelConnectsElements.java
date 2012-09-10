package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcRelConnectsElements;

public class SetAttributeSubIfcRelConnectsElements {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRelConnectsElements() {
	}

	public SetAttributeSubIfcRelConnectsElements(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("RelatingElement")) {
			//1NoEList
			 //1void
			 //1IfcElement
		}
		else if (attributeName.equals("RelatedElement")) {
			//1NoEList
			 //1void
			 //1IfcElement
		}
		else if (attributeName.equals("ConnectionGeometry")) {
			//1NoEList
			 //1void
			 //1IfcConnectionGeometry
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
			((IfcRelConnectsElements) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcRelConnectsElements) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
