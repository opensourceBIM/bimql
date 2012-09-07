package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcFuelProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcFuelProperties() {
	}

	public SetAttributeSubIfcFuelProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("CombustionTemperature")) {
			//1NoEList
			((IfcFuelProperties) object).setCombustionTemperature(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CarbonContentAsString")) {
			//1NoEList
			((IfcFuelProperties) object).setCarbonContentAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LowerHeatingValueAsString")) {
			//1NoEList
			((IfcFuelProperties) object).setLowerHeatingValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("HigherHeatingValue")) {
			//1NoEList
			((IfcFuelProperties) object).setHigherHeatingValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CarbonContent")) {
			//1NoEList
			((IfcFuelProperties) object).setCarbonContent(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LowerHeatingValue")) {
			//1NoEList
			((IfcFuelProperties) object).setLowerHeatingValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CombustionTemperatureAsString")) {
			//1NoEList
			((IfcFuelProperties) object).setCombustionTemperatureAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("HigherHeatingValueAsString")) {
			//1NoEList
			((IfcFuelProperties) object).setHigherHeatingValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
