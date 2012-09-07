package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcStyledRepresentation {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStyledRepresentation() {
	}

	public SetAttributeSubIfcStyledRepresentation(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ContextOfItems")) {
			//5NoEList
			 //5void
			 //5IfcRepresentationContext
		}
		else if (attributeName.equals("RepresentationIdentifier")) {
			//5NoEList
			((IfcStyledRepresentation) object).setRepresentationIdentifier(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("RepresentationType")) {
			//5NoEList
			((IfcStyledRepresentation) object).setRepresentationType(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
