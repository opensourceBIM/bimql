package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcPerson {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcPerson() {
	}

	public SetAttributeSubIfcPerson(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Id")) {
			//1NoEList
			((IfcPerson) object).setId(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FamilyName")) {
			//1NoEList
			((IfcPerson) object).setFamilyName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("GivenName")) {
			//1NoEList
			((IfcPerson) object).setGivenName(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
