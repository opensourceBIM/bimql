package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcStructuralSurfaceMemberVarying;

public class SetAttributeSubIfcStructuralSurfaceMemberVarying {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralSurfaceMemberVarying() {
	}

	public SetAttributeSubIfcStructuralSurfaceMemberVarying(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("VaryingThickness")) {
			//1NoEList
			((IfcStructuralSurfaceMemberVarying) object).setVaryingThickness(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("VaryingThicknessLocation")) {
			//1NoEList
			 //1void
			 //1IfcShapeAspect
		}
		else if (attributeName.equals("VaryingThicknessAsString")) {
			//1NoEList
			((IfcStructuralSurfaceMemberVarying) object).setVaryingThicknessAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Thickness")) {
			//2NoEList
			((IfcStructuralSurfaceMemberVarying) object).setThickness(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("ThicknessAsString")) {
			//2NoEList
			((IfcStructuralSurfaceMemberVarying) object).setThicknessAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("PredefinedType")) {
			//2NoEList
			 //2void
			 //2IfcStructuralSurfaceTypeEnum
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
			((IfcStructuralSurfaceMemberVarying) object).setObjectType(attributeNewValue);
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
			((IfcStructuralSurfaceMemberVarying) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcStructuralSurfaceMemberVarying) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
