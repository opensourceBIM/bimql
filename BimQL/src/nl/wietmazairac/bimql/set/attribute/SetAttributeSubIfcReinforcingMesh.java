package nl.wietmazairac.bimql.set.attribute;

/******************************************************************************
 * Copyright (C) 2009-2017  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.bimserver.models.ifc2x3tc1.IfcReinforcingMesh;

public class SetAttributeSubIfcReinforcingMesh {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcReinforcingMesh() {
	}

	public SetAttributeSubIfcReinforcingMesh(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("MeshLengthAsString")) {
			//1NoEList
			((IfcReinforcingMesh) object).setMeshLengthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LongitudinalBarSpacing")) {
			//1NoEList
			((IfcReinforcingMesh) object).setLongitudinalBarSpacing(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TransverseBarSpacing")) {
			//1NoEList
			((IfcReinforcingMesh) object).setTransverseBarSpacing(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MeshWidth")) {
			//1NoEList
			((IfcReinforcingMesh) object).setMeshWidth(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MeshLength")) {
			//1NoEList
			((IfcReinforcingMesh) object).setMeshLength(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("MeshWidthAsString")) {
			//1NoEList
			((IfcReinforcingMesh) object).setMeshWidthAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LongitudinalBarNominalDiameterAsString")) {
			//1NoEList
			((IfcReinforcingMesh) object).setLongitudinalBarNominalDiameterAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TransverseBarNominalDiameterAsString")) {
			//1NoEList
			((IfcReinforcingMesh) object).setTransverseBarNominalDiameterAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LongitudinalBarCrossSectionAreaAsString")) {
			//1NoEList
			((IfcReinforcingMesh) object).setLongitudinalBarCrossSectionAreaAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TransverseBarCrossSectionAreaAsString")) {
			//1NoEList
			((IfcReinforcingMesh) object).setTransverseBarCrossSectionAreaAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LongitudinalBarNominalDiameter")) {
			//1NoEList
			((IfcReinforcingMesh) object).setLongitudinalBarNominalDiameter(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TransverseBarNominalDiameter")) {
			//1NoEList
			((IfcReinforcingMesh) object).setTransverseBarNominalDiameter(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LongitudinalBarCrossSectionArea")) {
			//1NoEList
			((IfcReinforcingMesh) object).setLongitudinalBarCrossSectionArea(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("TransverseBarCrossSectionArea")) {
			//1NoEList
			((IfcReinforcingMesh) object).setTransverseBarCrossSectionArea(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("LongitudinalBarSpacingAsString")) {
			//1NoEList
			((IfcReinforcingMesh) object).setLongitudinalBarSpacingAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("TransverseBarSpacingAsString")) {
			//1NoEList
			((IfcReinforcingMesh) object).setTransverseBarSpacingAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("SteelGrade")) {
			//2NoEList
			((IfcReinforcingMesh) object).setSteelGrade(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Tag")) {
			//5NoEList
			((IfcReinforcingMesh) object).setTag(attributeNewValue);
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
			((IfcReinforcingMesh) object).setObjectType(attributeNewValue);
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
			((IfcReinforcingMesh) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcReinforcingMesh) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
