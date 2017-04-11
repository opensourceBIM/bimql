package nl.wietmazairac.bimql.get.attribute;

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

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcReinforcingMesh;

public class GetAttributeSubIfcReinforcingMesh {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcReinforcingMesh(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("MeshWidth")) {
			resultList.add(((IfcReinforcingMesh) object).getMeshWidth());
			 //1double
		}
		else if (string.equals("LongitudinalBarNominalDiameter")) {
			resultList.add(((IfcReinforcingMesh) object).getLongitudinalBarNominalDiameter());
			 //1double
		}
		else if (string.equals("TransverseBarNominalDiameter")) {
			resultList.add(((IfcReinforcingMesh) object).getTransverseBarNominalDiameter());
			 //1double
		}
		else if (string.equals("LongitudinalBarCrossSectionArea")) {
			resultList.add(((IfcReinforcingMesh) object).getLongitudinalBarCrossSectionArea());
			 //1double
		}
		else if (string.equals("TransverseBarCrossSectionArea")) {
			resultList.add(((IfcReinforcingMesh) object).getTransverseBarCrossSectionArea());
			 //1double
		}
		else if (string.equals("LongitudinalBarSpacingAsString")) {
			resultList.add(((IfcReinforcingMesh) object).getLongitudinalBarSpacingAsString());
			 //1String
		}
		else if (string.equals("TransverseBarSpacingAsString")) {
			resultList.add(((IfcReinforcingMesh) object).getTransverseBarSpacingAsString());
			 //1String
		}
		else if (string.equals("LongitudinalBarNominalDiameterAsString")) {
			resultList.add(((IfcReinforcingMesh) object).getLongitudinalBarNominalDiameterAsString());
			 //1String
		}
		else if (string.equals("TransverseBarNominalDiameterAsString")) {
			resultList.add(((IfcReinforcingMesh) object).getTransverseBarNominalDiameterAsString());
			 //1String
		}
		else if (string.equals("LongitudinalBarCrossSectionAreaAsString")) {
			resultList.add(((IfcReinforcingMesh) object).getLongitudinalBarCrossSectionAreaAsString());
			 //1String
		}
		else if (string.equals("TransverseBarCrossSectionAreaAsString")) {
			resultList.add(((IfcReinforcingMesh) object).getTransverseBarCrossSectionAreaAsString());
			 //1String
		}
		else if (string.equals("MeshLength")) {
			resultList.add(((IfcReinforcingMesh) object).getMeshLength());
			 //1double
		}
		else if (string.equals("MeshWidthAsString")) {
			resultList.add(((IfcReinforcingMesh) object).getMeshWidthAsString());
			 //1String
		}
		else if (string.equals("MeshLengthAsString")) {
			resultList.add(((IfcReinforcingMesh) object).getMeshLengthAsString());
			 //1String
		}
		else if (string.equals("LongitudinalBarSpacing")) {
			resultList.add(((IfcReinforcingMesh) object).getLongitudinalBarSpacing());
			 //1double
		}
		else if (string.equals("TransverseBarSpacing")) {
			resultList.add(((IfcReinforcingMesh) object).getTransverseBarSpacing());
			 //1double
		}
		else if (string.equals("SteelGrade")) {
			resultList.add(((IfcReinforcingMesh) object).getSteelGrade());
			 //2String
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getHasPorts().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getHasProjections().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcReinforcingMesh) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcReinforcingMesh) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcReinforcingMesh) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcReinforcingMesh) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getDecomposes().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingMesh) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcReinforcingMesh) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcReinforcingMesh) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcReinforcingMesh) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcReinforcingMesh) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcReinforcingMesh) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcReinforcingMesh) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
