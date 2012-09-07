package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcLShapeProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLShapeProfileDef(Object object, String string) {
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
		if (string.equals("FilletRadiusAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("EdgeRadiusAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getEdgeRadiusAsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInX")) {
			resultList.add(((IfcLShapeProfileDef) object).getCentreOfGravityInX());
			 //1double
		}
		else if (string.equals("DepthAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getDepthAsString());
			 //1String
		}
		else if (string.equals("FilletRadius")) {
			resultList.add(((IfcLShapeProfileDef) object).getFilletRadius());
			 //1double
		}
		else if (string.equals("WidthAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getWidthAsString());
			 //1String
		}
		else if (string.equals("EdgeRadius")) {
			resultList.add(((IfcLShapeProfileDef) object).getEdgeRadius());
			 //1double
		}
		else if (string.equals("LegSlopeAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getLegSlopeAsString());
			 //1String
		}
		else if (string.equals("ThicknessAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getThicknessAsString());
			 //1String
		}
		else if (string.equals("LegSlope")) {
			resultList.add(((IfcLShapeProfileDef) object).getLegSlope());
			 //1double
		}
		else if (string.equals("CentreOfGravityInYAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getCentreOfGravityInYAsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInXAsString")) {
			resultList.add(((IfcLShapeProfileDef) object).getCentreOfGravityInXAsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInY")) {
			resultList.add(((IfcLShapeProfileDef) object).getCentreOfGravityInY());
			 //1double
		}
		else if (string.equals("Width")) {
			resultList.add(((IfcLShapeProfileDef) object).getWidth());
			 //1double
		}
		else if (string.equals("Thickness")) {
			resultList.add(((IfcLShapeProfileDef) object).getThickness());
			 //1double
		}
		else if (string.equals("Depth")) {
			resultList.add(((IfcLShapeProfileDef) object).getDepth());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcLShapeProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcLShapeProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcLShapeProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
