package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcProductsOfCombustionProperties;

public class GetAttributeSubIfcProductsOfCombustionProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProductsOfCombustionProperties(Object object, String string) {
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
		if (string.equals("SpecificHeatCapacity")) {
			resultList.add(((IfcProductsOfCombustionProperties) object).getSpecificHeatCapacity());
			 //1double
		}
		else if (string.equals("N20ContentAsString")) {
			resultList.add(((IfcProductsOfCombustionProperties) object).getN20ContentAsString());
			 //1String
		}
		else if (string.equals("CO2ContentAsString")) {
			resultList.add(((IfcProductsOfCombustionProperties) object).getCO2ContentAsString());
			 //1String
		}
		else if (string.equals("COContent")) {
			resultList.add(((IfcProductsOfCombustionProperties) object).getCOContent());
			 //1double
		}
		else if (string.equals("N20Content")) {
			resultList.add(((IfcProductsOfCombustionProperties) object).getN20Content());
			 //1double
		}
		else if (string.equals("COContentAsString")) {
			resultList.add(((IfcProductsOfCombustionProperties) object).getCOContentAsString());
			 //1String
		}
		else if (string.equals("CO2Content")) {
			resultList.add(((IfcProductsOfCombustionProperties) object).getCO2Content());
			 //1double
		}
		else if (string.equals("SpecificHeatCapacityAsString")) {
			resultList.add(((IfcProductsOfCombustionProperties) object).getSpecificHeatCapacityAsString());
			 //1String
		}
		return resultList;
	}
}
