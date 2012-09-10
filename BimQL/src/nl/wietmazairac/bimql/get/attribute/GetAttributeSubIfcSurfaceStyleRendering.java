package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcSurfaceStyleRendering;

public class GetAttributeSubIfcSurfaceStyleRendering {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSurfaceStyleRendering(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("DiffuseColour")) {
			resultList.add(((IfcSurfaceStyleRendering) object).getDiffuseColour());
			 //1IfcColourOrFactor
		}
		else if (string.equals("ReflectionColour")) {
			resultList.add(((IfcSurfaceStyleRendering) object).getReflectionColour());
			 //1IfcColourOrFactor
		}
		else if (string.equals("SpecularColour")) {
			resultList.add(((IfcSurfaceStyleRendering) object).getSpecularColour());
			 //1IfcColourOrFactor
		}
		else if (string.equals("SpecularHighlight")) {
			resultList.add(((IfcSurfaceStyleRendering) object).getSpecularHighlight());
			 //1IfcSpecularHighlightSelect
		}
		else if (string.equals("ReflectanceMethod")) {
			resultList.add(((IfcSurfaceStyleRendering) object).getReflectanceMethod());
			 //1IfcReflectanceMethodEnum
		}
		else if (string.equals("DiffuseTransmissionColour")) {
			resultList.add(((IfcSurfaceStyleRendering) object).getDiffuseTransmissionColour());
			 //1IfcColourOrFactor
		}
		else if (string.equals("TransmissionColour")) {
			resultList.add(((IfcSurfaceStyleRendering) object).getTransmissionColour());
			 //1IfcColourOrFactor
		}
		else if (string.equals("TransparencyAsString")) {
			resultList.add(((IfcSurfaceStyleRendering) object).getTransparencyAsString());
			 //1String
		}
		else if (string.equals("Transparency")) {
			resultList.add(((IfcSurfaceStyleRendering) object).getTransparency());
			 //1double
		}
		return resultList;
	}
}
