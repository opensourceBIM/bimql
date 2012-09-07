package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcThermalMaterialProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcThermalMaterialProperties() {
	}

	public SetAttributeSubIfcThermalMaterialProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("SpecificHeatCapacity")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setSpecificHeatCapacity(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SpecificHeatCapacityAsString")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setSpecificHeatCapacityAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThermalConductivityAsString")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setThermalConductivityAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BoilingPoint")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setBoilingPoint(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FreezingPoint")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setFreezingPoint(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BoilingPointAsString")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setBoilingPointAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FreezingPointAsString")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setFreezingPointAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThermalConductivity")) {
			//1NoEList
			((IfcThermalMaterialProperties) object).setThermalConductivity(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
