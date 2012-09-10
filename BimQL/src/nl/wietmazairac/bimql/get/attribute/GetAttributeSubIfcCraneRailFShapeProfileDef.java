package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCraneRailFShapeProfileDef;

public class GetAttributeSubIfcCraneRailFShapeProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCraneRailFShapeProfileDef(Object object, String string) {
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
		if (string.equals("RadiusAsString")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getRadiusAsString());
			 //1String
		}
		else if (string.equals("Radius")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getRadius());
			 //1double
		}
		else if (string.equals("HeadWidth")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getHeadWidth());
			 //1double
		}
		else if (string.equals("OverallHeight")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getOverallHeight());
			 //1double
		}
		else if (string.equals("HeadWidthAsString")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getHeadWidthAsString());
			 //1String
		}
		else if (string.equals("HeadDepth2")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getHeadDepth2());
			 //1double
		}
		else if (string.equals("HeadDepth3")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getHeadDepth3());
			 //1double
		}
		else if (string.equals("WebThickness")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getWebThickness());
			 //1double
		}
		else if (string.equals("BaseDepth1")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getBaseDepth1());
			 //1double
		}
		else if (string.equals("BaseDepth2")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getBaseDepth2());
			 //1double
		}
		else if (string.equals("CentreOfGravityInYAsString")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getCentreOfGravityInYAsString());
			 //1String
		}
		else if (string.equals("OverallHeightAsString")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getOverallHeightAsString());
			 //1String
		}
		else if (string.equals("HeadDepth2AsString")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getHeadDepth2AsString());
			 //1String
		}
		else if (string.equals("HeadDepth3AsString")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getHeadDepth3AsString());
			 //1String
		}
		else if (string.equals("WebThicknessAsString")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getWebThicknessAsString());
			 //1String
		}
		else if (string.equals("BaseDepth1AsString")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getBaseDepth1AsString());
			 //1String
		}
		else if (string.equals("BaseDepth2AsString")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getBaseDepth2AsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInY")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getCentreOfGravityInY());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcCraneRailFShapeProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
