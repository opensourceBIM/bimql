package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcRelSpaceBoundary {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRelSpaceBoundary() {
	}

	public SetAttributeSubIfcRelSpaceBoundary(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ConnectionGeometry")) {
			//1NoEList
			 //1void
			 //1IfcConnectionGeometry
		}
		else if (attributeName.equals("RelatingSpace")) {
			//1NoEList
			 //1void
			 //1IfcSpace
		}
		else if (attributeName.equals("InternalOrExternalBoundary")) {
			//1NoEList
			 //1void
			 //1IfcInternalOrExternalEnum
		}
		else if (attributeName.equals("RelatedBuildingElement")) {
			//1NoEList
			 //1void
			 //1IfcElement
		}
		else if (attributeName.equals("PhysicalOrVirtualBoundary")) {
			//1NoEList
			 //1void
			 //1IfcPhysicalOrVirtualEnum
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
			((IfcRelSpaceBoundary) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcRelSpaceBoundary) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
