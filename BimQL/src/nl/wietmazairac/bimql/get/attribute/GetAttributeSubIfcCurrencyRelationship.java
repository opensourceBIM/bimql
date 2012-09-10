package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCurrencyRelationship;

public class GetAttributeSubIfcCurrencyRelationship {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCurrencyRelationship(Object object, String string) {
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
		if (string.equals("RelatingMonetaryUnit")) {
			resultList.add(((IfcCurrencyRelationship) object).getRelatingMonetaryUnit());
			 //1IfcMonetaryUnit
		}
		else if (string.equals("RelatedMonetaryUnit")) {
			resultList.add(((IfcCurrencyRelationship) object).getRelatedMonetaryUnit());
			 //1IfcMonetaryUnit
		}
		else if (string.equals("ExchangeRateAsString")) {
			resultList.add(((IfcCurrencyRelationship) object).getExchangeRateAsString());
			 //1String
		}
		else if (string.equals("ExchangeRate")) {
			resultList.add(((IfcCurrencyRelationship) object).getExchangeRate());
			 //1double
		}
		else if (string.equals("RateDateTime")) {
			resultList.add(((IfcCurrencyRelationship) object).getRateDateTime());
			 //1IfcDateAndTime
		}
		else if (string.equals("RateSource")) {
			resultList.add(((IfcCurrencyRelationship) object).getRateSource());
			 //1IfcLibraryInformation
		}
		return resultList;
	}
}
