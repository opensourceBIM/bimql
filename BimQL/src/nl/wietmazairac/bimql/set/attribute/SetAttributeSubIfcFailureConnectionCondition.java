package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcFailureConnectionCondition;

public class SetAttributeSubIfcFailureConnectionCondition {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcFailureConnectionCondition() {
	}

	public SetAttributeSubIfcFailureConnectionCondition(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("TensionFailureX")) {
			//1NoEList
			((IfcFailureConnectionCondition) object).setTensionFailureX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TensionFailureY")) {
			//1NoEList
			((IfcFailureConnectionCondition) object).setTensionFailureY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TensionFailureZ")) {
			//1NoEList
			((IfcFailureConnectionCondition) object).setTensionFailureZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TensionFailureXAsString")) {
			//1NoEList
			((IfcFailureConnectionCondition) object).setTensionFailureXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TensionFailureYAsString")) {
			//1NoEList
			((IfcFailureConnectionCondition) object).setTensionFailureYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TensionFailureZAsString")) {
			//1NoEList
			((IfcFailureConnectionCondition) object).setTensionFailureZAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CompressionFailureX")) {
			//1NoEList
			((IfcFailureConnectionCondition) object).setCompressionFailureX(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CompressionFailureY")) {
			//1NoEList
			((IfcFailureConnectionCondition) object).setCompressionFailureY(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CompressionFailureZ")) {
			//1NoEList
			((IfcFailureConnectionCondition) object).setCompressionFailureZ(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CompressionFailureXAsString")) {
			//1NoEList
			((IfcFailureConnectionCondition) object).setCompressionFailureXAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CompressionFailureYAsString")) {
			//1NoEList
			((IfcFailureConnectionCondition) object).setCompressionFailureYAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CompressionFailureZAsString")) {
			//1NoEList
			((IfcFailureConnectionCondition) object).setCompressionFailureZAsString(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
