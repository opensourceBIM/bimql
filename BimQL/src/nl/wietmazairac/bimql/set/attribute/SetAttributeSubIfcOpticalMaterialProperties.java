package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcOpticalMaterialProperties;

public class SetAttributeSubIfcOpticalMaterialProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcOpticalMaterialProperties() {
	}

	public SetAttributeSubIfcOpticalMaterialProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("VisibleTransmittance")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setVisibleTransmittance(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SolarTransmittance")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setSolarTransmittance(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ThermalIrTransmittance")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setThermalIrTransmittance(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ThermalIrEmissivityBack")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setThermalIrEmissivityBack(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ThermalIrEmissivityFront")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setThermalIrEmissivityFront(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("VisibleReflectanceBack")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setVisibleReflectanceBack(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("VisibleReflectanceFront")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setVisibleReflectanceFront(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SolarReflectanceFront")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setSolarReflectanceFront(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SolarReflectanceBack")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setSolarReflectanceBack(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("VisibleTransmittanceAsString")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setVisibleTransmittanceAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("SolarTransmittanceAsString")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setSolarTransmittanceAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThermalIrTransmittanceAsString")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setThermalIrTransmittanceAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThermalIrEmissivityBackAsString")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setThermalIrEmissivityBackAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ThermalIrEmissivityFrontAsString")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setThermalIrEmissivityFrontAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("VisibleReflectanceBackAsString")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setVisibleReflectanceBackAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("VisibleReflectanceFrontAsString")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setVisibleReflectanceFrontAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("SolarReflectanceFrontAsString")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setSolarReflectanceFrontAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("SolarReflectanceBackAsString")) {
			//1NoEList
			((IfcOpticalMaterialProperties) object).setSolarReflectanceBackAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
