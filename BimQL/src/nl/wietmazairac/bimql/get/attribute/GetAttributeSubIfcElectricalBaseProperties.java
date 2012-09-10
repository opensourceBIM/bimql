package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcElectricalBaseProperties;

public class GetAttributeSubIfcElectricalBaseProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcElectricalBaseProperties(Object object, String string) {
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
		if (string.equals("ElectricCurrentType")) {
			resultList.add(((IfcElectricalBaseProperties) object).getElectricCurrentType());
			 //1IfcElectricCurrentEnum
		}
		else if (string.equals("InputVoltageAsString")) {
			resultList.add(((IfcElectricalBaseProperties) object).getInputVoltageAsString());
			 //1String
		}
		else if (string.equals("InputFrequencyAsString")) {
			resultList.add(((IfcElectricalBaseProperties) object).getInputFrequencyAsString());
			 //1String
		}
		else if (string.equals("FullLoadCurrentAsString")) {
			resultList.add(((IfcElectricalBaseProperties) object).getFullLoadCurrentAsString());
			 //1String
		}
		else if (string.equals("MinimumCircuitCurrent")) {
			resultList.add(((IfcElectricalBaseProperties) object).getMinimumCircuitCurrent());
			 //1double
		}
		else if (string.equals("MaximumPowerInputAsString")) {
			resultList.add(((IfcElectricalBaseProperties) object).getMaximumPowerInputAsString());
			 //1String
		}
		else if (string.equals("RatedPowerInputAsString")) {
			resultList.add(((IfcElectricalBaseProperties) object).getRatedPowerInputAsString());
			 //1String
		}
		else if (string.equals("InputVoltage")) {
			resultList.add(((IfcElectricalBaseProperties) object).getInputVoltage());
			 //1double
		}
		else if (string.equals("InputFrequency")) {
			resultList.add(((IfcElectricalBaseProperties) object).getInputFrequency());
			 //1double
		}
		else if (string.equals("FullLoadCurrent")) {
			resultList.add(((IfcElectricalBaseProperties) object).getFullLoadCurrent());
			 //1double
		}
		else if (string.equals("MaximumPowerInput")) {
			resultList.add(((IfcElectricalBaseProperties) object).getMaximumPowerInput());
			 //1double
		}
		else if (string.equals("RatedPowerInput")) {
			resultList.add(((IfcElectricalBaseProperties) object).getRatedPowerInput());
			 //1double
		}
		else if (string.equals("InputPhase")) {
			resultList.add(((IfcElectricalBaseProperties) object).getInputPhase());
			 //1int
		}
		else if (string.equals("MinimumCircuitCurrentAsString")) {
			resultList.add(((IfcElectricalBaseProperties) object).getMinimumCircuitCurrentAsString());
			 //1String
		}
		else if (string.equals("UserDefinedEnergySequence")) {
			resultList.add(((IfcElectricalBaseProperties) object).getUserDefinedEnergySequence());
			 //2String
		}
		else if (string.equals("EnergySequence")) {
			resultList.add(((IfcElectricalBaseProperties) object).getEnergySequence());
			 //2IfcEnergySequenceEnum
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricalBaseProperties) object).getDefinesType().size(); i++) {
				resultList.add(((IfcElectricalBaseProperties) object).getDefinesType().get(i));
			}
			 //3EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricalBaseProperties) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcElectricalBaseProperties) object).getPropertyDefinitionOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricalBaseProperties) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcElectricalBaseProperties) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcElectricalBaseProperties) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcElectricalBaseProperties) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcElectricalBaseProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcElectricalBaseProperties) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcElectricalBaseProperties) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
