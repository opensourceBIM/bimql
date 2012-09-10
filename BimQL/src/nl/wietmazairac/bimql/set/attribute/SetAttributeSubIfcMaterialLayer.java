package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcMaterialLayer;

public class SetAttributeSubIfcMaterialLayer {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcMaterialLayer() {
	}

	public SetAttributeSubIfcMaterialLayer(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Material")) {
			//1NoEList
			 //1void
			 //1IfcMaterial
		}
		else if (attributeName.equals("LayerThickness")) {
			//1NoEList
			((IfcMaterialLayer) object).setLayerThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("IsVentilated")) {
			//1NoEList
			 //1void
			 //1Tristate
		}
		else if (attributeName.equals("LayerThicknessAsString")) {
			//1NoEList
			((IfcMaterialLayer) object).setLayerThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ToMaterialLayerSet")) {
			//1NoEList
			 //1void
			 //1IfcMaterialLayerSet
		}
	}
}
