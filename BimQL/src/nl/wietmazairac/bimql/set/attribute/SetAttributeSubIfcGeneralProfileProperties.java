package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcGeneralProfileProperties;

public class SetAttributeSubIfcGeneralProfileProperties {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcGeneralProfileProperties() {
	}

	public SetAttributeSubIfcGeneralProfileProperties(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("CrossSectionAreaAsString")) {
			//1NoEList
			((IfcGeneralProfileProperties) object).setCrossSectionAreaAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CrossSectionArea")) {
			//1NoEList
			((IfcGeneralProfileProperties) object).setCrossSectionArea(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MinimumPlateThicknessAsString")) {
			//1NoEList
			((IfcGeneralProfileProperties) object).setMinimumPlateThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MaximumPlateThicknessAsString")) {
			//1NoEList
			((IfcGeneralProfileProperties) object).setMaximumPlateThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Perimeter")) {
			//1NoEList
			((IfcGeneralProfileProperties) object).setPerimeter(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PhysicalWeight")) {
			//1NoEList
			((IfcGeneralProfileProperties) object).setPhysicalWeight(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PerimeterAsString")) {
			//1NoEList
			((IfcGeneralProfileProperties) object).setPerimeterAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PhysicalWeightAsString")) {
			//1NoEList
			((IfcGeneralProfileProperties) object).setPhysicalWeightAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MinimumPlateThickness")) {
			//1NoEList
			((IfcGeneralProfileProperties) object).setMinimumPlateThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MaximumPlateThickness")) {
			//1NoEList
			((IfcGeneralProfileProperties) object).setMaximumPlateThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
