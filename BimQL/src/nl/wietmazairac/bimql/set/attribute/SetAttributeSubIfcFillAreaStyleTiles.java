package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcFillAreaStyleTiles;

public class SetAttributeSubIfcFillAreaStyleTiles {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcFillAreaStyleTiles() {
	}

	public SetAttributeSubIfcFillAreaStyleTiles(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("TilingScaleAsString")) {
			//1NoEList
			((IfcFillAreaStyleTiles) object).setTilingScaleAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TilingPattern")) {
			//1NoEList
			 //1void
			 //1IfcOneDirectionRepeatFactor
		}
		else if (attributeName.equals("TilingScale")) {
			//1NoEList
			((IfcFillAreaStyleTiles) object).setTilingScale(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
