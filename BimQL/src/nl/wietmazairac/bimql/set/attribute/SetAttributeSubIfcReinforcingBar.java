package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcReinforcingBar;

public class SetAttributeSubIfcReinforcingBar {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcReinforcingBar() {
	}

	public SetAttributeSubIfcReinforcingBar(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("NominalDiameterAsString")) {
			//1NoEList
			((IfcReinforcingBar) object).setNominalDiameterAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CrossSectionAreaAsString")) {
			//1NoEList
			((IfcReinforcingBar) object).setCrossSectionAreaAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BarLength")) {
			//1NoEList
			((IfcReinforcingBar) object).setBarLength(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BarRole")) {
			//1NoEList
			 //1void
			 //1IfcReinforcingBarRoleEnum
		}
		else if (attributeName.equals("NominalDiameter")) {
			//1NoEList
			((IfcReinforcingBar) object).setNominalDiameter(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CrossSectionArea")) {
			//1NoEList
			((IfcReinforcingBar) object).setCrossSectionArea(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BarLengthAsString")) {
			//1NoEList
			((IfcReinforcingBar) object).setBarLengthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BarSurface")) {
			//1NoEList
			 //1void
			 //1IfcReinforcingBarSurfaceEnum
		}
		else if (attributeName.equals("SteelGrade")) {
			//2NoEList
			((IfcReinforcingBar) object).setSteelGrade(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Tag")) {
			//5NoEList
			((IfcReinforcingBar) object).setTag(attributeNewValue);
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
			((IfcReinforcingBar) object).setObjectType(attributeNewValue);
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
			((IfcReinforcingBar) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcReinforcingBar) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
