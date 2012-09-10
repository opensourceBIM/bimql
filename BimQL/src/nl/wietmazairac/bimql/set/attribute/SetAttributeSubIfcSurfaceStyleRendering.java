package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcSurfaceStyleRendering;

public class SetAttributeSubIfcSurfaceStyleRendering {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcSurfaceStyleRendering() {
	}

	public SetAttributeSubIfcSurfaceStyleRendering(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("DiffuseColour")) {
			//1NoEList
			 //1void
			 //1IfcColourOrFactor
		}
		else if (attributeName.equals("ReflectionColour")) {
			//1NoEList
			 //1void
			 //1IfcColourOrFactor
		}
		else if (attributeName.equals("SpecularColour")) {
			//1NoEList
			 //1void
			 //1IfcColourOrFactor
		}
		else if (attributeName.equals("SpecularHighlight")) {
			//1NoEList
			 //1void
			 //1IfcSpecularHighlightSelect
		}
		else if (attributeName.equals("ReflectanceMethod")) {
			//1NoEList
			 //1void
			 //1IfcReflectanceMethodEnum
		}
		else if (attributeName.equals("DiffuseTransmissionColour")) {
			//1NoEList
			 //1void
			 //1IfcColourOrFactor
		}
		else if (attributeName.equals("TransmissionColour")) {
			//1NoEList
			 //1void
			 //1IfcColourOrFactor
		}
		else if (attributeName.equals("TransparencyAsString")) {
			//1NoEList
			((IfcSurfaceStyleRendering) object).setTransparencyAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Transparency")) {
			//1NoEList
			((IfcSurfaceStyleRendering) object).setTransparency(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
