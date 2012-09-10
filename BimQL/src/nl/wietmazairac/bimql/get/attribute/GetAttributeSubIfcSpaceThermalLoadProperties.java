package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcSpaceThermalLoadProperties;

public class GetAttributeSubIfcSpaceThermalLoadProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSpaceThermalLoadProperties(Object object, String string) {
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
		if (string.equals("UserDefinedPropertySource")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getUserDefinedPropertySource());
			 //1String
		}
		else if (string.equals("PropertySource")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getPropertySource());
			 //1IfcPropertySourceEnum
		}
		else if (string.equals("ApplicableValueRatio")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getApplicableValueRatio());
			 //1double
		}
		else if (string.equals("MaximumValueAsString")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getMaximumValueAsString());
			 //1String
		}
		else if (string.equals("MinimumValueAsString")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getMinimumValueAsString());
			 //1String
		}
		else if (string.equals("ApplicableValueRatioAsString")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getApplicableValueRatioAsString());
			 //1String
		}
		else if (string.equals("ThermalLoadSource")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getThermalLoadSource());
			 //1IfcThermalLoadSourceEnum
		}
		else if (string.equals("SourceDescription")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getSourceDescription());
			 //1String
		}
		else if (string.equals("MaximumValue")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getMaximumValue());
			 //1double
		}
		else if (string.equals("MinimumValue")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getMinimumValue());
			 //1double
		}
		else if (string.equals("ThermalLoadType")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getThermalLoadType());
			 //1IfcThermalLoadTypeEnum
		}
		else if (string.equals("ThermalLoadTimeSeriesValues")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getThermalLoadTimeSeriesValues());
			 //1IfcTimeSeries
		}
		else if (string.equals("UserDefinedThermalLoadSource")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getUserDefinedThermalLoadSource());
			 //1String
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceThermalLoadProperties) object).getDefinesType().size(); i++) {
				resultList.add(((IfcSpaceThermalLoadProperties) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceThermalLoadProperties) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcSpaceThermalLoadProperties) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceThermalLoadProperties) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSpaceThermalLoadProperties) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSpaceThermalLoadProperties) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
