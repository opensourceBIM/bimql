package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcShapeAspect;

public class SetAttributeSubIfcShapeAspect {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcShapeAspect() {
	}

	public SetAttributeSubIfcShapeAspect(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("PartOfProductDefinitionShape")) {
			//1NoEList
			 //1void
			 //1IfcProductDefinitionShape
		}
		else if (attributeName.equals("ProductDefinitional")) {
			//1NoEList
			((IfcShapeAspect) object).setProductDefinitional(Boolean.parseBoolean(attributeNewValue));
			 //1void
			 //1boolean
		}
		else if (attributeName.equals("Name")) {
			//1NoEList
			((IfcShapeAspect) object).setName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Description")) {
			//1NoEList
			((IfcShapeAspect) object).setDescription(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
