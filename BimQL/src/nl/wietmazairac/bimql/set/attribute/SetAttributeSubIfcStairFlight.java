package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcStairFlight;

public class SetAttributeSubIfcStairFlight {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStairFlight() {
	}

	public SetAttributeSubIfcStairFlight(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("RiserHeightAsString")) {
			//1NoEList
			((IfcStairFlight) object).setRiserHeightAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TreadLengthAsString")) {
			//1NoEList
			((IfcStairFlight) object).setTreadLengthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("NumberOfRiser")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("NumberOfTreads")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("RiserHeight")) {
			//1NoEList
			((IfcStairFlight) object).setRiserHeight(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TreadLength")) {
			//1NoEList
			((IfcStairFlight) object).setTreadLength(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Tag")) {
			//5NoEList
			((IfcStairFlight) object).setTag(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("ObjectPlacement")) {
			//5NoEList
			 //5void
			 //5IfcObjectPlacement
		}
		else if (attributeName.equals("Representation")) {
			//5NoEList
			 //5void
			 //5IfcProductRepresentation
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcStairFlight) object).setObjectType(attributeNewValue);
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
			((IfcStairFlight) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcStairFlight) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
