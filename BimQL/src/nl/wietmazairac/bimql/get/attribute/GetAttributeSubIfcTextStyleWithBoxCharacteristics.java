package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTextStyleWithBoxCharacteristics;

public class GetAttributeSubIfcTextStyleWithBoxCharacteristics {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTextStyleWithBoxCharacteristics(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("BoxSlantAngleAsString")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxSlantAngleAsString());
			 //1String
		}
		else if (string.equals("BoxRotateAngleAsString")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxRotateAngleAsString());
			 //1String
		}
		else if (string.equals("BoxHeight")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxHeight());
			 //1double
		}
		else if (string.equals("BoxWidth")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxWidth());
			 //1double
		}
		else if (string.equals("BoxHeightAsString")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxHeightAsString());
			 //1String
		}
		else if (string.equals("BoxWidthAsString")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxWidthAsString());
			 //1String
		}
		else if (string.equals("BoxSlantAngle")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxSlantAngle());
			 //1double
		}
		else if (string.equals("BoxRotateAngle")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getBoxRotateAngle());
			 //1double
		}
		else if (string.equals("CharacterSpacing")) {
			resultList.add(((IfcTextStyleWithBoxCharacteristics) object).getCharacterSpacing());
			 //1IfcSizeSelect
		}
		return resultList;
	}
}
