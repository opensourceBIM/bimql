package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcBuilding;

public class GetAttributeSubIfcBuilding {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBuilding(Object object, String string) {
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
		if (string.equals("ElevationOfRefHeight")) {
			resultList.add(((IfcBuilding) object).getElevationOfRefHeight());
			 //1double
		}
		else if (string.equals("ElevationOfTerrain")) {
			resultList.add(((IfcBuilding) object).getElevationOfTerrain());
			 //1double
		}
		else if (string.equals("BuildingAddress")) {
			resultList.add(((IfcBuilding) object).getBuildingAddress());
			 //1IfcPostalAddress
		}
		else if (string.equals("ElevationOfRefHeightAsString")) {
			resultList.add(((IfcBuilding) object).getElevationOfRefHeightAsString());
			 //1String
		}
		else if (string.equals("ElevationOfTerrainAsString")) {
			resultList.add(((IfcBuilding) object).getElevationOfTerrainAsString());
			 //1String
		}
		else if (string.equals("LongName")) {
			resultList.add(((IfcBuilding) object).getLongName());
			 //2String
		}
		else if (string.equals("ReferencesElements")) {
			//3xxx
			for (int i = 0; i < ((IfcBuilding) object).getReferencesElements().size(); i++) {
				resultList.add(((IfcBuilding) object).getReferencesElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("CompositionType")) {
			resultList.add(((IfcBuilding) object).getCompositionType());
			 //2IfcElementCompositionEnum
		}
		else if (string.equals("ServicedBySystems")) {
			//3xxx
			for (int i = 0; i < ((IfcBuilding) object).getServicedBySystems().size(); i++) {
				resultList.add(((IfcBuilding) object).getServicedBySystems().get(i));
			}
			 //2EList
		}
		else if (string.equals("ContainsElements")) {
			//3xxx
			for (int i = 0; i < ((IfcBuilding) object).getContainsElements().size(); i++) {
				resultList.add(((IfcBuilding) object).getContainsElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcBuilding) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcBuilding) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuilding) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcBuilding) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcBuilding) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuilding) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcBuilding) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBuilding) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcBuilding) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuilding) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcBuilding) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcBuilding) object).getDecomposes().size(); i++) {
				resultList.add(((IfcBuilding) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcBuilding) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcBuilding) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcBuilding) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcBuilding) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcBuilding) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcBuilding) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcBuilding) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
