package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcLightSource {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcLightSource() {
	}

	public SetAttributeSubIfcLightSource(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("LightColour")) {
			//1NoEList
			 //1void
			 //1IfcColourRgb
		}
		else if (attributeName.equals("AmbientIntensity")) {
			//1NoEList
			((IfcLightSource) object).setAmbientIntensity(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("IntensityAsString")) {
			//1NoEList
			((IfcLightSource) object).setIntensityAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Intensity")) {
			//1NoEList
			((IfcLightSource) object).setIntensity(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("AmbientIntensityAsString")) {
			//1NoEList
			((IfcLightSource) object).setAmbientIntensityAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Name")) {
			//1NoEList
			((IfcLightSource) object).setName(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
