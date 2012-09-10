package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcTendon;

public class SetAttributeSubIfcTendon {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcTendon() {
	}

	public SetAttributeSubIfcTendon(Object object, String attributeName, String attributeNewValue) {
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
			((IfcTendon) object).setNominalDiameterAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CrossSectionAreaAsString")) {
			//1NoEList
			((IfcTendon) object).setCrossSectionAreaAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("NominalDiameter")) {
			//1NoEList
			((IfcTendon) object).setNominalDiameter(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("CrossSectionArea")) {
			//1NoEList
			((IfcTendon) object).setCrossSectionArea(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("FrictionCoefficientAsString")) {
			//1NoEList
			((IfcTendon) object).setFrictionCoefficientAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PreStress")) {
			//1NoEList
			((IfcTendon) object).setPreStress(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TensionForceAsString")) {
			//1NoEList
			((IfcTendon) object).setTensionForceAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("FrictionCoefficient")) {
			//1NoEList
			((IfcTendon) object).setFrictionCoefficient(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("AnchorageSlipAsString")) {
			//1NoEList
			((IfcTendon) object).setAnchorageSlipAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("MinCurvatureRadius")) {
			//1NoEList
			((IfcTendon) object).setMinCurvatureRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TensionForce")) {
			//1NoEList
			((IfcTendon) object).setTensionForce(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("PreStressAsString")) {
			//1NoEList
			((IfcTendon) object).setPreStressAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("AnchorageSlip")) {
			//1NoEList
			((IfcTendon) object).setAnchorageSlip(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MinCurvatureRadiusAsString")) {
			//1NoEList
			((IfcTendon) object).setMinCurvatureRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("PredefinedType")) {
			//1NoEList
			 //1void
			 //1IfcTendonTypeEnum
		}
		else if (attributeName.equals("SteelGrade")) {
			//2NoEList
			((IfcTendon) object).setSteelGrade(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Tag")) {
			//5NoEList
			((IfcTendon) object).setTag(attributeNewValue);
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
			((IfcTendon) object).setObjectType(attributeNewValue);
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
			((IfcTendon) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcTendon) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
