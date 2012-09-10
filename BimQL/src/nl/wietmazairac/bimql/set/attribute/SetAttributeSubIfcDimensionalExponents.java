package nl.wietmazairac.bimql.set.attribute;


public class SetAttributeSubIfcDimensionalExponents {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcDimensionalExponents() {
	}

	public SetAttributeSubIfcDimensionalExponents(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("LengthExponent")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("MassExponent")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("TimeExponent")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("ThermodynamicTemperatureExponent")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("ElectricCurrentExponent")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("AmountOfSubstanceExponent")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("LuminousIntensityExponent")) {
			//1NoEList
			 //1void
			 //1int
		}
	}
}
