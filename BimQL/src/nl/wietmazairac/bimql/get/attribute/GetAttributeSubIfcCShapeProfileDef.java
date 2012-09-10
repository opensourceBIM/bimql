package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCShapeProfileDef;

public class GetAttributeSubIfcCShapeProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCShapeProfileDef(Object object, String string) {
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
		if (string.equals("CentreOfGravityInX")) {
			resultList.add(((IfcCShapeProfileDef) object).getCentreOfGravityInX());
			 //1double
		}
		else if (string.equals("DepthAsString")) {
			resultList.add(((IfcCShapeProfileDef) object).getDepthAsString());
			 //1String
		}
		else if (string.equals("WidthAsString")) {
			resultList.add(((IfcCShapeProfileDef) object).getWidthAsString());
			 //1String
		}
		else if (string.equals("Girth")) {
			resultList.add(((IfcCShapeProfileDef) object).getGirth());
			 //1double
		}
		else if (string.equals("GirthAsString")) {
			resultList.add(((IfcCShapeProfileDef) object).getGirthAsString());
			 //1String
		}
		else if (string.equals("InternalFilletRadius")) {
			resultList.add(((IfcCShapeProfileDef) object).getInternalFilletRadius());
			 //1double
		}
		else if (string.equals("InternalFilletRadiusAsString")) {
			resultList.add(((IfcCShapeProfileDef) object).getInternalFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("WallThicknessAsString")) {
			resultList.add(((IfcCShapeProfileDef) object).getWallThicknessAsString());
			 //1String
		}
		else if (string.equals("WallThickness")) {
			resultList.add(((IfcCShapeProfileDef) object).getWallThickness());
			 //1double
		}
		else if (string.equals("CentreOfGravityInXAsString")) {
			resultList.add(((IfcCShapeProfileDef) object).getCentreOfGravityInXAsString());
			 //1String
		}
		else if (string.equals("Width")) {
			resultList.add(((IfcCShapeProfileDef) object).getWidth());
			 //1double
		}
		else if (string.equals("Depth")) {
			resultList.add(((IfcCShapeProfileDef) object).getDepth());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcCShapeProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcCShapeProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcCShapeProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
