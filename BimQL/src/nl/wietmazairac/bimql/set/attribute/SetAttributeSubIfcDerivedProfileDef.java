package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcDerivedProfileDef {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcDerivedProfileDef() {
	}

	public SetAttributeSubIfcDerivedProfileDef(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Operator")) {
			//1NoEList
			 //1void
			 //1IfcCartesianTransformationOperator2D
		}
		else if (attributeName.equals("ParentProfile")) {
			//1NoEList
			 //1void
			 //1IfcProfileDef
		}
		else if (attributeName.equals("Label")) {
			//1NoEList
			((IfcDerivedProfileDef) object).setLabel(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
