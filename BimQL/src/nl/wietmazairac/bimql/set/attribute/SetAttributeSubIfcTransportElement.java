package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcTransportElement {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcTransportElement() {
	}

	public SetAttributeSubIfcTransportElement(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("OperationType")) {
			//1NoEList
			 //1void
			 //1IfcTransportElementTypeEnum
		}
		else if (attributeName.equals("CapacityByWeight")) {
			//1NoEList
			((IfcTransportElement) object).setCapacityByWeight(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CapacityByNumber")) {
			//1NoEList
			((IfcTransportElement) object).setCapacityByNumber(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CapacityByWeightAsString")) {
			//1NoEList
			((IfcTransportElement) object).setCapacityByWeightAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CapacityByNumberAsString")) {
			//1NoEList
			((IfcTransportElement) object).setCapacityByNumberAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Tag")) {
			//2NoEList
			((IfcTransportElement) object).setTag(attributeNewValue);
			 //2void
			 //2String
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
			((IfcTransportElement) object).setObjectType(attributeNewValue);
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
			((IfcTransportElement) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcTransportElement) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
