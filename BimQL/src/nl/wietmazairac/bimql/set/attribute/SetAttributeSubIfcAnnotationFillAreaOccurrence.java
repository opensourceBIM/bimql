package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcAnnotationFillAreaOccurrence;

public class SetAttributeSubIfcAnnotationFillAreaOccurrence {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcAnnotationFillAreaOccurrence() {
	}

	public SetAttributeSubIfcAnnotationFillAreaOccurrence(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("GlobalOrLocal")) {
			//1NoEList
			 //1void
			 //1IfcGlobalOrLocalEnum
		}
		else if (attributeName.equals("FillStyleTarget")) {
			//1NoEList
			 //1void
			 //1IfcPoint
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcAnnotationFillAreaOccurrence) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Item")) {
			//5NoEList
			 //5void
			 //5IfcRepresentationItem
		}
		else {
		}
	}
}
