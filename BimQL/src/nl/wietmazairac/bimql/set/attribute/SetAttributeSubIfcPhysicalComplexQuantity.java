package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcPhysicalComplexQuantity {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcPhysicalComplexQuantity() {
	}

	public SetAttributeSubIfcPhysicalComplexQuantity(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Quality")) {
			//1NoEList
			((IfcPhysicalComplexQuantity) object).setQuality(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Usage")) {
			//1NoEList
			((IfcPhysicalComplexQuantity) object).setUsage(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Discrimination")) {
			//1NoEList
			((IfcPhysicalComplexQuantity) object).setDiscrimination(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
