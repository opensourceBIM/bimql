package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcLShapeProfileDef {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcLShapeProfileDef() {
	}

	public SetAttributeSubIfcLShapeProfileDef(Object object, String attributeName, String attributeNewValue) {
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
			((IfcLShapeProfileDef) object).setDepth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FilletRadiusAsString")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setFilletRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FilletRadius")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setFilletRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("EdgeRadiusAsString")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setEdgeRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CentreOfGravityInX")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setCentreOfGravityInX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DepthAsString")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setDepthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("WidthAsString")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setWidthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("EdgeRadius")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setEdgeRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LegSlopeAsString")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setLegSlopeAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CentreOfGravityInXAsString")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setCentreOfGravityInXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LegSlope")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setLegSlope(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CentreOfGravityInYAsString")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setCentreOfGravityInYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Thickness")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CentreOfGravityInY")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setCentreOfGravityInY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ThicknessAsString")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Width")) {
			//1NoEList
			((IfcLShapeProfileDef) object).setWidth(Double.parseDouble(attributeNewValue));
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
			((IfcLShapeProfileDef) object).setProfileName(attributeNewValue);
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
