package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcDoorPanelProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcDoorPanelProperties() {
	}

	public SetAttributeSubIfcDoorPanelProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ShapeAspectStyle")) {
			//1NoEList
			 //1void
			 //1IfcShapeAspect
		}
		else if (attributeName.equals("PanelDepth")) {
			//1NoEList
			((IfcDoorPanelProperties) object).setPanelDepth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PanelOperation")) {
			//1NoEList
			 //1void
			 //1IfcDoorPanelOperationEnum
		}
		else if (attributeName.equals("PanelWidth")) {
			//1NoEList
			((IfcDoorPanelProperties) object).setPanelWidth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PanelPosition")) {
			//1NoEList
			 //1void
			 //1IfcDoorPanelPositionEnum
		}
		else if (attributeName.equals("PanelDepthAsString")) {
			//1NoEList
			((IfcDoorPanelProperties) object).setPanelDepthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PanelWidthAsString")) {
			//1NoEList
			((IfcDoorPanelProperties) object).setPanelWidthAsString(attributeNewValue);
			 //1void
			 //1String
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
			((IfcDoorPanelProperties) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcDoorPanelProperties) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
