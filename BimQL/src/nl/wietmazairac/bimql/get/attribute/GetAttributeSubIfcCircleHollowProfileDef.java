package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcCircleHollowProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCircleHollowProfileDef(Object object, String string) {
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
		if (string.equals("WallThicknessAsString")) {
			resultList.add(((IfcCircleHollowProfileDef) object).getWallThicknessAsString());
			 //1String
		}
		else if (string.equals("WallThickness")) {
			resultList.add(((IfcCircleHollowProfileDef) object).getWallThickness());
			 //1double
		}
		else if (string.equals("RadiusAsString")) {
			resultList.add(((IfcCircleHollowProfileDef) object).getRadiusAsString());
			 //2String
		}
		else if (string.equals("Radius")) {
			resultList.add(((IfcCircleHollowProfileDef) object).getRadius());
			 //2double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcCircleHollowProfileDef) object).getPosition());
			 //3IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcCircleHollowProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcCircleHollowProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
