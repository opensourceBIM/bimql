package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcTrapeziumProfileDef {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcTrapeziumProfileDef() {
	}

	public SetAttributeSubIfcTrapeziumProfileDef(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("YDimAsString")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setYDimAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TopXDim")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setTopXDim(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BottomXDim")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setBottomXDim(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TopXDimAsString")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setTopXDimAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TopXOffset")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setTopXOffset(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BottomXDimAsString")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setBottomXDimAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TopXOffsetAsString")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setTopXOffsetAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("YDim")) {
			//1NoEList
			((IfcTrapeziumProfileDef) object).setYDim(Double.parseDouble(attributeNewValue));
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
			((IfcTrapeziumProfileDef) object).setProfileName(attributeNewValue);
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
