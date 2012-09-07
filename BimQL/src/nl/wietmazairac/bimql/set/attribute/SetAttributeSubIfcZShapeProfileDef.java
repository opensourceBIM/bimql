package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcZShapeProfileDef {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcZShapeProfileDef() {
	}

	public SetAttributeSubIfcZShapeProfileDef(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("Depth")) {
			//1NoEList
			((IfcZShapeProfileDef) object).setDepth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FlangeThicknessAsString")) {
			//1NoEList
			((IfcZShapeProfileDef) object).setFlangeThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FilletRadiusAsString")) {
			//1NoEList
			((IfcZShapeProfileDef) object).setFilletRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FlangeThickness")) {
			//1NoEList
			((IfcZShapeProfileDef) object).setFlangeThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FilletRadius")) {
			//1NoEList
			((IfcZShapeProfileDef) object).setFilletRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("EdgeRadiusAsString")) {
			//1NoEList
			((IfcZShapeProfileDef) object).setEdgeRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DepthAsString")) {
			//1NoEList
			((IfcZShapeProfileDef) object).setDepthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("EdgeRadius")) {
			//1NoEList
			((IfcZShapeProfileDef) object).setEdgeRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FlangeWidthAsString")) {
			//1NoEList
			((IfcZShapeProfileDef) object).setFlangeWidthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FlangeWidth")) {
			//1NoEList
			((IfcZShapeProfileDef) object).setFlangeWidth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("WebThicknessAsString")) {
			//1NoEList
			((IfcZShapeProfileDef) object).setWebThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("WebThickness")) {
			//1NoEList
			((IfcZShapeProfileDef) object).setWebThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Position")) {
			//2NoEList
			 //2void
			 //2IfcAxis2Placement2D
		}
		else if (attributeName.equals("ProfileName")) {
			//5NoEList
			((IfcZShapeProfileDef) object).setProfileName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("ProfileType")) {
			//5NoEList
			 //5void
			 //5IfcProfileTypeEnum
		}
		else {
		}
	}
}
