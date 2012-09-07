package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcIShapeProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcIShapeProfileDef(Object object, String string) {
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
		if (string.equals("OverallWidthAsString")) {
			resultList.add(((IfcIShapeProfileDef) object).getOverallWidthAsString());
			 //1String
		}
		else if (string.equals("OverallDepthAsString")) {
			resultList.add(((IfcIShapeProfileDef) object).getOverallDepthAsString());
			 //1String
		}
		else if (string.equals("FlangeThicknessAsString")) {
			resultList.add(((IfcIShapeProfileDef) object).getFlangeThicknessAsString());
			 //1String
		}
		else if (string.equals("FilletRadiusAsString")) {
			resultList.add(((IfcIShapeProfileDef) object).getFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("OverallWidth")) {
			resultList.add(((IfcIShapeProfileDef) object).getOverallWidth());
			 //1double
		}
		else if (string.equals("OverallDepth")) {
			resultList.add(((IfcIShapeProfileDef) object).getOverallDepth());
			 //1double
		}
		else if (string.equals("FlangeThickness")) {
			resultList.add(((IfcIShapeProfileDef) object).getFlangeThickness());
			 //1double
		}
		else if (string.equals("FilletRadius")) {
			resultList.add(((IfcIShapeProfileDef) object).getFilletRadius());
			 //1double
		}
		else if (string.equals("WebThickness")) {
			resultList.add(((IfcIShapeProfileDef) object).getWebThickness());
			 //1double
		}
		else if (string.equals("WebThicknessAsString")) {
			resultList.add(((IfcIShapeProfileDef) object).getWebThicknessAsString());
			 //1String
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcIShapeProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcIShapeProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcIShapeProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
