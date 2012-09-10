package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcZShapeProfileDef;

public class GetAttributeSubIfcZShapeProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcZShapeProfileDef(Object object, String string) {
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
			resultList.add(((IfcZShapeProfileDef) object).getFlangeThicknessAsString());
			 //1String
		}
		else if (string.equals("FilletRadiusAsString")) {
			resultList.add(((IfcZShapeProfileDef) object).getFilletRadiusAsString());
			 //1String
		}
		else if (string.equals("EdgeRadiusAsString")) {
			resultList.add(((IfcZShapeProfileDef) object).getEdgeRadiusAsString());
			 //1String
		}
		else if (string.equals("DepthAsString")) {
			resultList.add(((IfcZShapeProfileDef) object).getDepthAsString());
			 //1String
		}
		else if (string.equals("FlangeThickness")) {
			resultList.add(((IfcZShapeProfileDef) object).getFlangeThickness());
			 //1double
		}
		else if (string.equals("FilletRadius")) {
			resultList.add(((IfcZShapeProfileDef) object).getFilletRadius());
			 //1double
		}
		else if (string.equals("EdgeRadius")) {
			resultList.add(((IfcZShapeProfileDef) object).getEdgeRadius());
			 //1double
		}
		else if (string.equals("FlangeWidthAsString")) {
			resultList.add(((IfcZShapeProfileDef) object).getFlangeWidthAsString());
			 //1String
		}
		else if (string.equals("FlangeWidth")) {
			resultList.add(((IfcZShapeProfileDef) object).getFlangeWidth());
			 //1double
		}
		else if (string.equals("WebThickness")) {
			resultList.add(((IfcZShapeProfileDef) object).getWebThickness());
			 //1double
		}
		else if (string.equals("WebThicknessAsString")) {
			resultList.add(((IfcZShapeProfileDef) object).getWebThicknessAsString());
			 //1String
		}
		else if (string.equals("Depth")) {
			resultList.add(((IfcZShapeProfileDef) object).getDepth());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcZShapeProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcZShapeProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcZShapeProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
