package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcTextStyleTextModel;

public class SetAttributeSubIfcTextStyleTextModel {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcTextStyleTextModel() {
	}

	public SetAttributeSubIfcTextStyleTextModel(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("TextAlign")) {
			//1NoEList
			((IfcTextStyleTextModel) object).setTextAlign(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TextIndent")) {
			//1NoEList
			 //1void
			 //1IfcSizeSelect
		}
		else if (attributeName.equals("TextDecoration")) {
			//1NoEList
			((IfcTextStyleTextModel) object).setTextDecoration(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LetterSpacing")) {
			//1NoEList
			 //1void
			 //1IfcSizeSelect
		}
		else if (attributeName.equals("WordSpacing")) {
			//1NoEList
			 //1void
			 //1IfcSizeSelect
		}
		else if (attributeName.equals("TextTransform")) {
			//1NoEList
			((IfcTextStyleTextModel) object).setTextTransform(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LineHeight")) {
			//1NoEList
			 //1void
			 //1IfcSizeSelect
		}
	}
}
