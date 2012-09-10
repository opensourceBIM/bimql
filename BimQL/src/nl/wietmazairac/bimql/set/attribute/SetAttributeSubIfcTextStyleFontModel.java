package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcTextStyleFontModel;

public class SetAttributeSubIfcTextStyleFontModel {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcTextStyleFontModel() {
	}

	public SetAttributeSubIfcTextStyleFontModel(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("FontStyle")) {
			//1NoEList
			((IfcTextStyleFontModel) object).setFontStyle(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FontVariant")) {
			//1NoEList
			((IfcTextStyleFontModel) object).setFontVariant(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FontWeight")) {
			//1NoEList
			((IfcTextStyleFontModel) object).setFontWeight(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FontSize")) {
			//1NoEList
			 //1void
			 //1IfcSizeSelect
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcTextStyleFontModel) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
