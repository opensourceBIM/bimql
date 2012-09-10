package nl.wietmazairac.bimql.set.attribute;


public class SetAttributeSubIfcOwnerHistory {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcOwnerHistory() {
	}

	public SetAttributeSubIfcOwnerHistory(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("LastModifyingApplication")) {
			//1NoEList
			 //1void
			 //1IfcApplication
		}
		else if (attributeName.equals("OwningUser")) {
			//1NoEList
			 //1void
			 //1IfcPersonAndOrganization
		}
		else if (attributeName.equals("OwningApplication")) {
			//1NoEList
			 //1void
			 //1IfcApplication
		}
		else if (attributeName.equals("ChangeAction")) {
			//1NoEList
			 //1void
			 //1IfcChangeActionEnum
		}
		else if (attributeName.equals("LastModifiedDate")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("LastModifyingUser")) {
			//1NoEList
			 //1void
			 //1IfcPersonAndOrganization
		}
		else if (attributeName.equals("CreationDate")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("State")) {
			//1NoEList
			 //1void
			 //1IfcStateEnum
		}
	}
}
