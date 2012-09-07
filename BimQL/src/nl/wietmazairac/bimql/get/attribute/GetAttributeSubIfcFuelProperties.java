package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcFuelProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFuelProperties(Object object, String string) {
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
		if (string.equals("CombustionTemperature")) {
			resultList.add(((IfcFuelProperties) object).getCombustionTemperature());
			 //1double
		}
		else if (string.equals("CarbonContentAsString")) {
			resultList.add(((IfcFuelProperties) object).getCarbonContentAsString());
			 //1String
		}
		else if (string.equals("LowerHeatingValueAsString")) {
			resultList.add(((IfcFuelProperties) object).getLowerHeatingValueAsString());
			 //1String
		}
		else if (string.equals("HigherHeatingValue")) {
			resultList.add(((IfcFuelProperties) object).getHigherHeatingValue());
			 //1double
		}
		else if (string.equals("CarbonContent")) {
			resultList.add(((IfcFuelProperties) object).getCarbonContent());
			 //1double
		}
		else if (string.equals("LowerHeatingValue")) {
			resultList.add(((IfcFuelProperties) object).getLowerHeatingValue());
			 //1double
		}
		else if (string.equals("CombustionTemperatureAsString")) {
			resultList.add(((IfcFuelProperties) object).getCombustionTemperatureAsString());
			 //1String
		}
		else if (string.equals("HigherHeatingValueAsString")) {
			resultList.add(((IfcFuelProperties) object).getHigherHeatingValueAsString());
			 //1String
		}
		return resultList;
	}
}
