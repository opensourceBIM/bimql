package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcElectricalBaseProperties;

public class SetAttributeSubIfcElectricalBaseProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcElectricalBaseProperties() {
	}

	public SetAttributeSubIfcElectricalBaseProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("InputVoltage")) {
			//1NoEList
			((IfcElectricalBaseProperties) object).setInputVoltage(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("InputFrequency")) {
			//1NoEList
			((IfcElectricalBaseProperties) object).setInputFrequency(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FullLoadCurrent")) {
			//1NoEList
			((IfcElectricalBaseProperties) object).setFullLoadCurrent(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MaximumPowerInput")) {
			//1NoEList
			((IfcElectricalBaseProperties) object).setMaximumPowerInput(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RatedPowerInput")) {
			//1NoEList
			((IfcElectricalBaseProperties) object).setRatedPowerInput(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("InputPhase")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("ElectricCurrentType")) {
			//1NoEList
			 //1void
			 //1IfcElectricCurrentEnum
		}
		else if (attributeName.equals("InputVoltageAsString")) {
			//1NoEList
			((IfcElectricalBaseProperties) object).setInputVoltageAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("InputFrequencyAsString")) {
			//1NoEList
			((IfcElectricalBaseProperties) object).setInputFrequencyAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FullLoadCurrentAsString")) {
			//1NoEList
			((IfcElectricalBaseProperties) object).setFullLoadCurrentAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MinimumCircuitCurrent")) {
			//1NoEList
			((IfcElectricalBaseProperties) object).setMinimumCircuitCurrent(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MaximumPowerInputAsString")) {
			//1NoEList
			((IfcElectricalBaseProperties) object).setMaximumPowerInputAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RatedPowerInputAsString")) {
			//1NoEList
			((IfcElectricalBaseProperties) object).setRatedPowerInputAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MinimumCircuitCurrentAsString")) {
			//1NoEList
			((IfcElectricalBaseProperties) object).setMinimumCircuitCurrentAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("UserDefinedEnergySequence")) {
			//2NoEList
			((IfcElectricalBaseProperties) object).setUserDefinedEnergySequence(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("EnergySequence")) {
			//2NoEList
			 //2void
			 //2IfcEnergySequenceEnum
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcElectricalBaseProperties) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcElectricalBaseProperties) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
