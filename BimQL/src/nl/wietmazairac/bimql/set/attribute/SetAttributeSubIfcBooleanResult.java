package nl.wietmazairac.bimql.set.attribute;


public class SetAttributeSubIfcBooleanResult {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcBooleanResult() {
	}

	public SetAttributeSubIfcBooleanResult(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Dim")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("Operator")) {
			//1NoEList
			 //1void
			 //1IfcBooleanOperator
		}
		else if (attributeName.equals("FirstOperand")) {
			//1NoEList
			 //1void
			 //1IfcBooleanOperand
		}
		else if (attributeName.equals("SecondOperand")) {
			//1NoEList
			 //1void
			 //1IfcBooleanOperand
		}
	}
}
