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

import org.bimserver.models.ifc2x3tc1.IfcStructuralSurfaceMemberVarying;

public class GetAttributeSubIfcStructuralSurfaceMemberVarying {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralSurfaceMemberVarying(Object object, String string) {
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
		if (string.equals("SubsequentThicknessAsString")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMemberVarying) object).getSubsequentThicknessAsString().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMemberVarying) object).getSubsequentThicknessAsString().get(i));
			}
			 //1EList
		}
		else if (string.equals("SubsequentThickness")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMemberVarying) object).getSubsequentThickness().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMemberVarying) object).getSubsequentThickness().get(i));
			}
			 //1EList
		}
		else if (string.equals("VaryingThicknessLocation")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getVaryingThicknessLocation());
			 //1IfcShapeAspect
		}
		else if (string.equals("VaryingThicknessAsString")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getVaryingThicknessAsString());
			 //1String
		}
		else if (string.equals("VaryingThickness")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getVaryingThickness());
			 //1double
		}
		else if (string.equals("PredefinedType")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getPredefinedType());
			 //2IfcStructuralSurfaceTypeEnum
		}
		else if (string.equals("ThicknessAsString")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getThicknessAsString());
			 //2String
		}
		else if (string.equals("Thickness")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getThickness());
			 //2double
		}
		else if (string.equals("ReferencesElement")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMemberVarying) object).getReferencesElement().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMemberVarying) object).getReferencesElement().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMemberVarying) object).getConnectedBy().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMemberVarying) object).getConnectedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("AssignedStructuralActivity")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMemberVarying) object).getAssignedStructuralActivity().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMemberVarying) object).getAssignedStructuralActivity().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMemberVarying) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMemberVarying) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMemberVarying) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMemberVarying) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMemberVarying) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMemberVarying) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMemberVarying) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMemberVarying) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMemberVarying) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMemberVarying) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralSurfaceMemberVarying) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralSurfaceMemberVarying) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralSurfaceMemberVarying) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
