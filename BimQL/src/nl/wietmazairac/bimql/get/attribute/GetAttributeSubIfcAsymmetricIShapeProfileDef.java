package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcAsymmetricIShapeProfileDef;

public class GetAttributeSubIfcAsymmetricIShapeProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAsymmetricIShapeProfileDef(Object object, String string) {
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
		if (string.equals("TopFlangeWidthAsString")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getTopFlangeWidthAsString());
			 //1String
		}
		else if (string.equals("TopFlangeThickness")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getTopFlangeThickness());
			 //1double
		}
		else if (string.equals("TopFlangeFilletRadius")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getTopFlangeFilletRadius());
			 //1double
		}
		else if (string.equals("TopFlangeWidth")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getTopFlangeWidth());
			 //1double
		}
		else if (string.equals("TopFlangeThicknessAsString")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getTopFlangeThicknessAsString());
			 //1String
		}
		else if (string.equals("TopFlangeFilletRadiusAsString")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getTopFlangeFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInYAsString")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getCentreOfGravityInYAsString());
			 //1String
		}
		else if (string.equals("CentreOfGravityInY")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getCentreOfGravityInY());
			 //1double
		}
		else if (string.equals("OverallWidthAsString")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getOverallWidthAsString());
			 //2String
		}
		else if (string.equals("OverallDepthAsString")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getOverallDepthAsString());
			 //2String
		}
		else if (string.equals("FlangeThicknessAsString")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getFlangeThicknessAsString());
			 //2String
		}
		else if (string.equals("FilletRadiusAsString")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getFilletRadiusAsString());
			 //2String
		}
		else if (string.equals("OverallWidth")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getOverallWidth());
			 //2double
		}
		else if (string.equals("OverallDepth")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getOverallDepth());
			 //2double
		}
		else if (string.equals("FlangeThickness")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getFlangeThickness());
			 //2double
		}
		else if (string.equals("FilletRadius")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getFilletRadius());
			 //2double
		}
		else if (string.equals("WebThickness")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getWebThickness());
			 //2double
		}
		else if (string.equals("WebThicknessAsString")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getWebThicknessAsString());
			 //2String
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getPosition());
			 //3IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcAsymmetricIShapeProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
