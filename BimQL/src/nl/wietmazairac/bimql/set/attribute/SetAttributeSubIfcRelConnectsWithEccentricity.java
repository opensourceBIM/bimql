package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcRelConnectsWithEccentricity;

public class SetAttributeSubIfcRelConnectsWithEccentricity {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRelConnectsWithEccentricity() {
	}

	public SetAttributeSubIfcRelConnectsWithEccentricity(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ConnectionConstraint")) {
			//1NoEList
			 //1void
			 //1IfcConnectionGeometry
		}
		else if (attributeName.equals("AppliedCondition")) {
			//2NoEList
			 //2void
			 //2IfcBoundaryCondition
		}
		else if (attributeName.equals("SupportedLength")) {
			//2NoEList
			((IfcRelConnectsWithEccentricity) object).setSupportedLength(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("RelatedStructuralConnection")) {
			//2NoEList
			 //2void
			 //2IfcStructuralConnection
		}
		else if (attributeName.equals("RelatingStructuralMember")) {
			//2NoEList
			 //2void
			 //2IfcStructuralMember
		}
		else if (attributeName.equals("AdditionalConditions")) {
			//2NoEList
			 //2void
			 //2IfcStructuralConnectionCondition
		}
		else if (attributeName.equals("SupportedLengthAsString")) {
			//2NoEList
			((IfcRelConnectsWithEccentricity) object).setSupportedLengthAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ConditionCoordinateSystem")) {
			//2NoEList
			 //2void
			 //2IfcAxis2Placement3D
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
			((IfcRelConnectsWithEccentricity) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcRelConnectsWithEccentricity) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
