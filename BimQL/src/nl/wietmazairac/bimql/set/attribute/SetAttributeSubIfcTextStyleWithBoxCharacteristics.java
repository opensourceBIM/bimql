package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcTextStyleWithBoxCharacteristics {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcTextStyleWithBoxCharacteristics() {
	}

	public SetAttributeSubIfcTextStyleWithBoxCharacteristics(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("BoxHeight")) {
			//1NoEList
			((IfcTextStyleWithBoxCharacteristics) object).setBoxHeight(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BoxWidth")) {
			//1NoEList
			((IfcTextStyleWithBoxCharacteristics) object).setBoxWidth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BoxHeightAsString")) {
			//1NoEList
			((IfcTextStyleWithBoxCharacteristics) object).setBoxHeightAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BoxWidthAsString")) {
			//1NoEList
			((IfcTextStyleWithBoxCharacteristics) object).setBoxWidthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BoxSlantAngle")) {
			//1NoEList
			((IfcTextStyleWithBoxCharacteristics) object).setBoxSlantAngle(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BoxRotateAngle")) {
			//1NoEList
			((IfcTextStyleWithBoxCharacteristics) object).setBoxRotateAngle(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CharacterSpacing")) {
			//1NoEList
			 //1void
			 //1IfcSizeSelect
		}
		else if (attributeName.equals("BoxSlantAngleAsString")) {
			//1NoEList
			((IfcTextStyleWithBoxCharacteristics) object).setBoxSlantAngleAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BoxRotateAngleAsString")) {
			//1NoEList
			((IfcTextStyleWithBoxCharacteristics) object).setBoxRotateAngleAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
