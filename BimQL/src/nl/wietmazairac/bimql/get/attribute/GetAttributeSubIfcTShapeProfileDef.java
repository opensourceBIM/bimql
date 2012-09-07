package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcTShapeProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTShapeProfileDef(Object object, String string) {
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
			resultList.add(((IfcTShapeProfileDef) object).getFlangeThicknessAsString());
			 //1String
		}
		else if (string.equals("FilletRadiusAsString")) {
			resultList.add(((IfcTShapeProfileDef) object).getFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("DepthAsString")) {
			resultList.add(((IfcTShapeProfileDef) object).getDepthAsString());
			 //1String
		}
		else if (string.equals("FlangeThickness")) {
			resultList.add(((IfcTShapeProfileDef) object).getFlangeThickness());
			 //1double
		}
		else if (string.equals("FilletRadius")) {
			resultList.add(((IfcTShapeProfileDef) object).getFilletRadius());
			 //1double
		}
		else if (string.equals("FlangeWidthAsString")) {
			resultList.add(((IfcTShapeProfileDef) object).getFlangeWidthAsString());
			 //1String
		}
		else if (string.equals("WebSlope")) {
			resultList.add(((IfcTShapeProfileDef) object).getWebSlope());
			 //1double
		}
		else if (string.equals("FlangeWidth")) {
			resultList.add(((IfcTShapeProfileDef) object).getFlangeWidth());
			 //1double
		}
		else if (string.equals("FlangeEdgeRadius")) {
			resultList.add(((IfcTShapeProfileDef) object).getFlangeEdgeRadius());
			 //1double
		}
		else if (string.equals("WebEdgeRadius")) {
			resultList.add(((IfcTShapeProfileDef) object).getWebEdgeRadius());
			 //1double
		}
		else if (string.equals("WebSlopeAsString")) {
			resultList.add(((IfcTShapeProfileDef) object).getWebSlopeAsString());
			 //1String
		}
		else if (string.equals("FlangeSlope")) {
			resultList.add(((IfcTShapeProfileDef) object).getFlangeSlope());
			 //1double
		}
		else if (string.equals("FlangeEdgeRadiusAsString")) {
			resultList.add(((IfcTShapeProfileDef) object).getFlangeEdgeRadiusAsString());
			 //1String
		}
		else if (string.equals("WebEdgeRadiusAsString")) {
			resultList.add(((IfcTShapeProfileDef) object).getWebEdgeRadiusAsString());
			 //1String
		}
		else if (string.equals("FlangeSlopeAsString")) {
			resultList.add(((IfcTShapeProfileDef) object).getFlangeSlopeAsString());
			 //1String
		}
		else if (string.equals("WebThickness")) {
			resultList.add(((IfcTShapeProfileDef) object).getWebThickness());
			 //1double
		}
		else if (string.equals("CentreOfGravityInYAsString")) {
			resultList.add(((IfcTShapeProfileDef) object).getCentreOfGravityInYAsString());
			 //1String
		}
		else if (string.equals("WebThicknessAsString")) {
			resultList.add(((IfcTShapeProfileDef) object).getWebThicknessAsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInY")) {
			resultList.add(((IfcTShapeProfileDef) object).getCentreOfGravityInY());
			 //1double
		}
		else if (string.equals("Depth")) {
			resultList.add(((IfcTShapeProfileDef) object).getDepth());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcTShapeProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcTShapeProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcTShapeProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
