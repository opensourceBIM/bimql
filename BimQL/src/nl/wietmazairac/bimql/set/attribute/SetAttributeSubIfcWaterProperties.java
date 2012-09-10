package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcWaterProperties;

public class SetAttributeSubIfcWaterProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcWaterProperties() {
	}

	public SetAttributeSubIfcWaterProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("IsPotable")) {
			//1NoEList
			 //1void
			 //1Tristate
		}
		else if (attributeName.equals("Hardness")) {
			//1NoEList
			((IfcWaterProperties) object).setHardness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PHLevel")) {
			//1NoEList
			((IfcWaterProperties) object).setPHLevel(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("AlkalinityConcentrationAsString")) {
			//1NoEList
			((IfcWaterProperties) object).setAlkalinityConcentrationAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("AcidityConcentrationAsString")) {
			//1NoEList
			((IfcWaterProperties) object).setAcidityConcentrationAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DissolvedSolidsContentAsString")) {
			//1NoEList
			((IfcWaterProperties) object).setDissolvedSolidsContentAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("HardnessAsString")) {
			//1NoEList
			((IfcWaterProperties) object).setHardnessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ImpuritiesContent")) {
			//1NoEList
			((IfcWaterProperties) object).setImpuritiesContent(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PHLevelAsString")) {
			//1NoEList
			((IfcWaterProperties) object).setPHLevelAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("AlkalinityConcentration")) {
			//1NoEList
			((IfcWaterProperties) object).setAlkalinityConcentration(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("AcidityConcentration")) {
			//1NoEList
			((IfcWaterProperties) object).setAcidityConcentration(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ImpuritiesContentAsString")) {
			//1NoEList
			((IfcWaterProperties) object).setImpuritiesContentAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DissolvedSolidsContent")) {
			//1NoEList
			((IfcWaterProperties) object).setDissolvedSolidsContent(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
