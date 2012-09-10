package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcThermalMaterialProperties;

public class GetAttributeSubIfcThermalMaterialProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcThermalMaterialProperties(Object object, String string) {
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
			resultList.add(((IfcThermalMaterialProperties) object).getSpecificHeatCapacity());
			 //1double
		}
		else if (string.equals("SpecificHeatCapacityAsString")) {
			resultList.add(((IfcThermalMaterialProperties) object).getSpecificHeatCapacityAsString());
			 //1String
		}
		else if (string.equals("ThermalConductivityAsString")) {
			resultList.add(((IfcThermalMaterialProperties) object).getThermalConductivityAsString());
			 //1String
		}
		else if (string.equals("BoilingPoint")) {
			resultList.add(((IfcThermalMaterialProperties) object).getBoilingPoint());
			 //1double
		}
		else if (string.equals("FreezingPoint")) {
			resultList.add(((IfcThermalMaterialProperties) object).getFreezingPoint());
			 //1double
		}
		else if (string.equals("BoilingPointAsString")) {
			resultList.add(((IfcThermalMaterialProperties) object).getBoilingPointAsString());
			 //1String
		}
		else if (string.equals("FreezingPointAsString")) {
			resultList.add(((IfcThermalMaterialProperties) object).getFreezingPointAsString());
			 //1String
		}
		else if (string.equals("ThermalConductivity")) {
			resultList.add(((IfcThermalMaterialProperties) object).getThermalConductivity());
			 //1double
		}
		return resultList;
	}
}
