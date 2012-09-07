package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcChamferEdgeFeature {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcChamferEdgeFeature() {
	}

	public SetAttributeSubIfcChamferEdgeFeature(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Height")) {
			//1NoEList
			((IfcChamferEdgeFeature) object).setHeight(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("HeightAsString")) {
			//1NoEList
			((IfcChamferEdgeFeature) object).setHeightAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("WidthAsString")) {
			//1NoEList
			((IfcChamferEdgeFeature) object).setWidthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Width")) {
			//1NoEList
			((IfcChamferEdgeFeature) object).setWidth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FeatureLength")) {
			//2NoEList
			((IfcChamferEdgeFeature) object).setFeatureLength(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("FeatureLengthAsString")) {
			//2NoEList
			((IfcChamferEdgeFeature) object).setFeatureLengthAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("VoidsElements")) {
			//5NoEList
			 //5void
			 //5IfcRelVoidsElement
		}
		else if (attributeName.equals("Tag")) {
			//5NoEList
			((IfcChamferEdgeFeature) object).setTag(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("ObjectPlacement")) {
			//5NoEList
			 //5void
			 //5IfcObjectPlacement
		}
		else if (attributeName.equals("Representation")) {
			//5NoEList
			 //5void
			 //5IfcProductRepresentation
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcChamferEdgeFeature) object).setObjectType(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcChamferEdgeFeature) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcChamferEdgeFeature) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
