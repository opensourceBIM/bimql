package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcUShapeProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcUShapeProfileDef(Object object, String string) {
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
		if (string.equals("FlangeThicknessAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getFlangeThicknessAsString());
			 //1String
		}
		else if (string.equals("FilletRadiusAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("EdgeRadiusAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getEdgeRadiusAsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInX")) {
			resultList.add(((IfcUShapeProfileDef) object).getCentreOfGravityInX());
			 //1double
		}
		else if (string.equals("DepthAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getDepthAsString());
			 //1String
		}
		else if (string.equals("FlangeThickness")) {
			resultList.add(((IfcUShapeProfileDef) object).getFlangeThickness());
			 //1double
		}
		else if (string.equals("FilletRadius")) {
			resultList.add(((IfcUShapeProfileDef) object).getFilletRadius());
			 //1double
		}
		else if (string.equals("EdgeRadius")) {
			resultList.add(((IfcUShapeProfileDef) object).getEdgeRadius());
			 //1double
		}
		else if (string.equals("FlangeWidthAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getFlangeWidthAsString());
			 //1String
		}
		else if (string.equals("FlangeWidth")) {
			resultList.add(((IfcUShapeProfileDef) object).getFlangeWidth());
			 //1double
		}
		else if (string.equals("FlangeSlope")) {
			resultList.add(((IfcUShapeProfileDef) object).getFlangeSlope());
			 //1double
		}
		else if (string.equals("FlangeSlopeAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getFlangeSlopeAsString());
			 //1String
		}
		else if (string.equals("WebThickness")) {
			resultList.add(((IfcUShapeProfileDef) object).getWebThickness());
			 //1double
		}
		else if (string.equals("CentreOfGravityInXAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getCentreOfGravityInXAsString());
			 //1String
		}
		else if (string.equals("WebThicknessAsString")) {
			resultList.add(((IfcUShapeProfileDef) object).getWebThicknessAsString());
			 //1String
		}
		else if (string.equals("Depth")) {
			resultList.add(((IfcUShapeProfileDef) object).getDepth());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcUShapeProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcUShapeProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcUShapeProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
