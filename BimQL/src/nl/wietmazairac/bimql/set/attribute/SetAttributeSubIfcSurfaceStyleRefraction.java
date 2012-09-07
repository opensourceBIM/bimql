package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcSurfaceStyleRefraction {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcSurfaceStyleRefraction() {
	}

	public SetAttributeSubIfcSurfaceStyleRefraction(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("RefractionIndex")) {
			//1NoEList
			((IfcSurfaceStyleRefraction) object).setRefractionIndex(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DispersionFactor")) {
			//1NoEList
			((IfcSurfaceStyleRefraction) object).setDispersionFactor(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RefractionIndexAsString")) {
			//1NoEList
			((IfcSurfaceStyleRefraction) object).setRefractionIndexAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DispersionFactorAsString")) {
			//1NoEList
			((IfcSurfaceStyleRefraction) object).setDispersionFactorAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
