package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcFillAreaStyleHatching {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcFillAreaStyleHatching() {
	}

	public SetAttributeSubIfcFillAreaStyleHatching(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("PatternStart")) {
			//1NoEList
			 //1void
			 //1IfcCartesianPoint
		}
		else if (attributeName.equals("HatchLineAngle")) {
			//1NoEList
			((IfcFillAreaStyleHatching) object).setHatchLineAngle(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("HatchLineAppearance")) {
			//1NoEList
			 //1void
			 //1IfcCurveStyle
		}
		else if (attributeName.equals("StartOfNextHatchLine")) {
			//1NoEList
			 //1void
			 //1IfcHatchLineDistanceSelect
		}
		else if (attributeName.equals("PointOfReferenceHatchLine")) {
			//1NoEList
			 //1void
			 //1IfcCartesianPoint
		}
		else if (attributeName.equals("HatchLineAngleAsString")) {
			//1NoEList
			((IfcFillAreaStyleHatching) object).setHatchLineAngleAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
