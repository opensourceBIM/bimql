package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcObjective;

public class SetAttributeSubIfcObjective {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcObjective() {
	}

	public SetAttributeSubIfcObjective(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("BenchmarkValues")) {
			//1NoEList
			 //1void
			 //1IfcMetric
		}
		else if (attributeName.equals("ResultValues")) {
			//1NoEList
			 //1void
			 //1IfcMetric
		}
		else if (attributeName.equals("ObjectiveQualifier")) {
			//1NoEList
			 //1void
			 //1IfcObjectiveEnum
		}
		else if (attributeName.equals("UserDefinedQualifier")) {
			//1NoEList
			((IfcObjective) object).setUserDefinedQualifier(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
