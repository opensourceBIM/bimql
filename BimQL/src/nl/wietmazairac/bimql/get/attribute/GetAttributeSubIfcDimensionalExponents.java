package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcDimensionalExponents {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDimensionalExponents(Object object, String string) {
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
		if (string.equals("ElectricCurrentExponent")) {
			resultList.add(((IfcDimensionalExponents) object).getElectricCurrentExponent());
			 //1int
		}
		else if (string.equals("AmountOfSubstanceExponent")) {
			resultList.add(((IfcDimensionalExponents) object).getAmountOfSubstanceExponent());
			 //1int
		}
		else if (string.equals("LuminousIntensityExponent")) {
			resultList.add(((IfcDimensionalExponents) object).getLuminousIntensityExponent());
			 //1int
		}
		else if (string.equals("LengthExponent")) {
			resultList.add(((IfcDimensionalExponents) object).getLengthExponent());
			 //1int
		}
		else if (string.equals("MassExponent")) {
			resultList.add(((IfcDimensionalExponents) object).getMassExponent());
			 //1int
		}
		else if (string.equals("TimeExponent")) {
			resultList.add(((IfcDimensionalExponents) object).getTimeExponent());
			 //1int
		}
		else if (string.equals("ThermodynamicTemperatureExponent")) {
			resultList.add(((IfcDimensionalExponents) object).getThermodynamicTemperatureExponent());
			 //1int
		}
		return resultList;
	}
}
