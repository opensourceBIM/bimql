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

import org.bimserver.models.ifc2x3tc1.IfcSite;

public class GetAttributeSubIfcSite {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSite(Object object, String string) {
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
		if (string.equals("RefLatitude")) {
			//3xxx
			for (int i = 0; i < ((IfcSite) object).getRefLatitude().size(); i++) {
				resultList.add(((IfcSite) object).getRefLatitude().get(i));
			}
			 //1EList
		}
		else if (string.equals("RefLongitude")) {
			//3xxx
			for (int i = 0; i < ((IfcSite) object).getRefLongitude().size(); i++) {
				resultList.add(((IfcSite) object).getRefLongitude().get(i));
			}
			 //1EList
		}
		else if (string.equals("RefElevation")) {
			resultList.add(((IfcSite) object).getRefElevation());
			 //1double
		}
		else if (string.equals("LandTitleNumber")) {
			resultList.add(((IfcSite) object).getLandTitleNumber());
			 //1String
		}
		else if (string.equals("SiteAddress")) {
			resultList.add(((IfcSite) object).getSiteAddress());
			 //1IfcPostalAddress
		}
		else if (string.equals("RefElevationAsString")) {
			resultList.add(((IfcSite) object).getRefElevationAsString());
			 //1String
		}
		else if (string.equals("LongName")) {
			resultList.add(((IfcSite) object).getLongName());
			 //2String
		}
		else if (string.equals("ReferencesElements")) {
			//3xxx
			for (int i = 0; i < ((IfcSite) object).getReferencesElements().size(); i++) {
				resultList.add(((IfcSite) object).getReferencesElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("CompositionType")) {
			resultList.add(((IfcSite) object).getCompositionType());
			 //2IfcElementCompositionEnum
		}
		else if (string.equals("ServicedBySystems")) {
			//3xxx
			for (int i = 0; i < ((IfcSite) object).getServicedBySystems().size(); i++) {
				resultList.add(((IfcSite) object).getServicedBySystems().get(i));
			}
			 //2EList
		}
		else if (string.equals("ContainsElements")) {
			//3xxx
			for (int i = 0; i < ((IfcSite) object).getContainsElements().size(); i++) {
				resultList.add(((IfcSite) object).getContainsElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcSite) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcSite) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSite) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcSite) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcSite) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSite) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcSite) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSite) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcSite) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSite) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcSite) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcSite) object).getDecomposes().size(); i++) {
				resultList.add(((IfcSite) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSite) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSite) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSite) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSite) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSite) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSite) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSite) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
