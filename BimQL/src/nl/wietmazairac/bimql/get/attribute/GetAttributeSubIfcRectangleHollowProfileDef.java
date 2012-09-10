package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRectangleHollowProfileDef;

public class GetAttributeSubIfcRectangleHollowProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRectangleHollowProfileDef(Object object, String string) {
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
		if (string.equals("InnerFilletRadiusAsString")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getInnerFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("OuterFilletRadiusAsString")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getOuterFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("InnerFilletRadius")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getInnerFilletRadius());
			 //1double
		}
		else if (string.equals("OuterFilletRadius")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getOuterFilletRadius());
			 //1double
		}
		else if (string.equals("WallThicknessAsString")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getWallThicknessAsString());
			 //1String
		}
		else if (string.equals("WallThickness")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getWallThickness());
			 //1double
		}
		else if (string.equals("XDimAsString")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getXDimAsString());
			 //2String
		}
		else if (string.equals("YDimAsString")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getYDimAsString());
			 //2String
		}
		else if (string.equals("XDim")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getXDim());
			 //2double
		}
		else if (string.equals("YDim")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getYDim());
			 //2double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getPosition());
			 //3IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcRectangleHollowProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
