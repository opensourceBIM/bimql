package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcPropertyDependencyRelationship;

public class SetAttributeSubIfcPropertyDependencyRelationship {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcPropertyDependencyRelationship() {
	}

	public SetAttributeSubIfcPropertyDependencyRelationship(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("DependingProperty")) {
			//1NoEList
			 //1void
			 //1IfcProperty
		}
		else if (attributeName.equals("DependantProperty")) {
			//1NoEList
			 //1void
			 //1IfcProperty
		}
		else if (attributeName.equals("Expression")) {
			//1NoEList
			((IfcPropertyDependencyRelationship) object).setExpression(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Name")) {
			//1NoEList
			((IfcPropertyDependencyRelationship) object).setName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Description")) {
			//1NoEList
			((IfcPropertyDependencyRelationship) object).setDescription(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
