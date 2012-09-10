package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcHygroscopicMaterialProperties;

public class SetAttributeSubIfcHygroscopicMaterialProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcHygroscopicMaterialProperties() {
	}

	public SetAttributeSubIfcHygroscopicMaterialProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("UpperVaporResistanceFactorAsString")) {
			//1NoEList
			((IfcHygroscopicMaterialProperties) object).setUpperVaporResistanceFactorAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LowerVaporResistanceFactorAsString")) {
			//1NoEList
			((IfcHygroscopicMaterialProperties) object).setLowerVaporResistanceFactorAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("IsothermalMoistureCapacityAsString")) {
			//1NoEList
			((IfcHygroscopicMaterialProperties) object).setIsothermalMoistureCapacityAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("VaporPermeability")) {
			//1NoEList
			((IfcHygroscopicMaterialProperties) object).setVaporPermeability(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("VaporPermeabilityAsString")) {
			//1NoEList
			((IfcHygroscopicMaterialProperties) object).setVaporPermeabilityAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MoistureDiffusivity")) {
			//1NoEList
			((IfcHygroscopicMaterialProperties) object).setMoistureDiffusivity(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("UpperVaporResistanceFactor")) {
			//1NoEList
			((IfcHygroscopicMaterialProperties) object).setUpperVaporResistanceFactor(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LowerVaporResistanceFactor")) {
			//1NoEList
			((IfcHygroscopicMaterialProperties) object).setLowerVaporResistanceFactor(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("IsothermalMoistureCapacity")) {
			//1NoEList
			((IfcHygroscopicMaterialProperties) object).setIsothermalMoistureCapacity(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MoistureDiffusivityAsString")) {
			//1NoEList
			((IfcHygroscopicMaterialProperties) object).setMoistureDiffusivityAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
