package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcSpaceProgram;

public class SetAttributeSubIfcSpaceProgram {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcSpaceProgram() {
	}

	public SetAttributeSubIfcSpaceProgram(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("StandardRequiredAreaAsString")) {
			//1NoEList
			((IfcSpaceProgram) object).setStandardRequiredAreaAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("SpaceProgramIdentifier")) {
			//1NoEList
			((IfcSpaceProgram) object).setSpaceProgramIdentifier(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MaxRequiredAreaAsString")) {
			//1NoEList
			((IfcSpaceProgram) object).setMaxRequiredAreaAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MinRequiredAreaAsString")) {
			//1NoEList
			((IfcSpaceProgram) object).setMinRequiredAreaAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("StandardRequiredArea")) {
			//1NoEList
			((IfcSpaceProgram) object).setStandardRequiredArea(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MaxRequiredArea")) {
			//1NoEList
			((IfcSpaceProgram) object).setMaxRequiredArea(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MinRequiredArea")) {
			//1NoEList
			((IfcSpaceProgram) object).setMinRequiredArea(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("RequestedLocation")) {
			//1NoEList
			 //1void
			 //1IfcSpatialStructureElement
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcSpaceProgram) object).setObjectType(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcSpaceProgram) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcSpaceProgram) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
