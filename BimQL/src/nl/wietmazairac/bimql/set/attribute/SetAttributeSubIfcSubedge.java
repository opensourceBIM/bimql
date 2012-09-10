package nl.wietmazairac.bimql.set.attribute;


public class SetAttributeSubIfcSubedge {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcSubedge() {
	}

	public SetAttributeSubIfcSubedge(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ParentEdge")) {
			//1NoEList
			 //1void
			 //1IfcEdge
		}
		else if (attributeName.equals("EdgeStart")) {
			//2NoEList
			 //2void
			 //2IfcVertex
		}
		else if (attributeName.equals("EdgeEnd")) {
			//2NoEList
			 //2void
			 //2IfcVertex
		}
		else {
		}
	}
}
