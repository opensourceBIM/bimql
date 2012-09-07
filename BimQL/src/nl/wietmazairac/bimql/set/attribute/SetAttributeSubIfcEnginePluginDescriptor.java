package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcEnginePluginDescriptor {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcEnginePluginDescriptor() {
	}

	public SetAttributeSubIfcEnginePluginDescriptor(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("PluginClassName")) {
			//1NoEList
			((IfcEnginePluginDescriptor) object).setPluginClassName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DefaultName")) {
			//1NoEList
			((IfcEnginePluginDescriptor) object).setDefaultName(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
