package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcProductsOfCombustionProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcProductsOfCombustionProperties() {
	}

	public SetAttributeSubIfcProductsOfCombustionProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("N20Content")) {
			//1NoEList
			((IfcProductsOfCombustionProperties) object).setN20Content(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("COContentAsString")) {
			//1NoEList
			((IfcProductsOfCombustionProperties) object).setCOContentAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CO2Content")) {
			//1NoEList
			((IfcProductsOfCombustionProperties) object).setCO2Content(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SpecificHeatCapacity")) {
			//1NoEList
			((IfcProductsOfCombustionProperties) object).setSpecificHeatCapacity(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("N20ContentAsString")) {
			//1NoEList
			((IfcProductsOfCombustionProperties) object).setN20ContentAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CO2ContentAsString")) {
			//1NoEList
			((IfcProductsOfCombustionProperties) object).setCO2ContentAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("SpecificHeatCapacityAsString")) {
			//1NoEList
			((IfcProductsOfCombustionProperties) object).setSpecificHeatCapacityAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("COContent")) {
			//1NoEList
			((IfcProductsOfCombustionProperties) object).setCOContent(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
