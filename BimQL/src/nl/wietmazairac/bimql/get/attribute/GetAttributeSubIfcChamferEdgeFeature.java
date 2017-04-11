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

import org.bimserver.models.ifc2x3tc1.IfcChamferEdgeFeature;

public class GetAttributeSubIfcChamferEdgeFeature {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcChamferEdgeFeature(Object object, String string) {
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
		if (string.equals("WidthAsString")) {
			resultList.add(((IfcChamferEdgeFeature) object).getWidthAsString());
			 //1String
		}
		else if (string.equals("HeightAsString")) {
			resultList.add(((IfcChamferEdgeFeature) object).getHeightAsString());
			 //1String
		}
		else if (string.equals("Height")) {
			resultList.add(((IfcChamferEdgeFeature) object).getHeight());
			 //1double
		}
		else if (string.equals("Width")) {
			resultList.add(((IfcChamferEdgeFeature) object).getWidth());
			 //1double
		}
		else if (string.equals("FeatureLength")) {
			resultList.add(((IfcChamferEdgeFeature) object).getFeatureLength());
			 //2double
		}
		else if (string.equals("FeatureLengthAsString")) {
			resultList.add(((IfcChamferEdgeFeature) object).getFeatureLengthAsString());
			 //2String
		}
		else if (string.equals("VoidsElements")) {
			resultList.add(((IfcChamferEdgeFeature) object).getVoidsElements());
			 //3IfcRelVoidsElement
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getHasPorts().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getHasProjections().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcChamferEdgeFeature) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcChamferEdgeFeature) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcChamferEdgeFeature) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcChamferEdgeFeature) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getDecomposes().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcChamferEdgeFeature) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcChamferEdgeFeature) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcChamferEdgeFeature) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcChamferEdgeFeature) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcChamferEdgeFeature) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcChamferEdgeFeature) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcChamferEdgeFeature) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
