package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcCurrencyRelationship {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcCurrencyRelationship() {
	}

	public SetAttributeSubIfcCurrencyRelationship(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ExchangeRate")) {
			//1NoEList
			((IfcCurrencyRelationship) object).setExchangeRate(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RateDateTime")) {
			//1NoEList
			 //1void
			 //1IfcDateAndTime
		}
		else if (attributeName.equals("RateSource")) {
			//1NoEList
			 //1void
			 //1IfcLibraryInformation
		}
		else if (attributeName.equals("RelatingMonetaryUnit")) {
			//1NoEList
			 //1void
			 //1IfcMonetaryUnit
		}
		else if (attributeName.equals("RelatedMonetaryUnit")) {
			//1NoEList
			 //1void
			 //1IfcMonetaryUnit
		}
		else if (attributeName.equals("ExchangeRateAsString")) {
			//1NoEList
			((IfcCurrencyRelationship) object).setExchangeRateAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
