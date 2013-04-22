package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcSpatialStructureElement;

public class GetAttributeSubIfcSpatialStructureElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSpatialStructureElement(Object object, String string) {
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
		if (string.equals("LongName")) {
			resultList.add(((IfcSpatialStructureElement) object).getLongName());
			 //1String
		}
		else if (string.equals("ReferencesElements")) {
			//3xxx
			for (int i = 0; i < ((IfcSpatialStructureElement) object).getReferencesElements().size(); i++) {
				resultList.add(((IfcSpatialStructureElement) object).getReferencesElements().get(i));
			}
			 //1EList
		}
		else if (string.equals("CompositionType")) {
			resultList.add(((IfcSpatialStructureElement) object).getCompositionType());
			 //1IfcElementCompositionEnum
		}
		else if (string.equals("ServicedBySystems")) {
			//3xxx
			for (int i = 0; i < ((IfcSpatialStructureElement) object).getServicedBySystems().size(); i++) {
				resultList.add(((IfcSpatialStructureElement) object).getServicedBySystems().get(i));
			}
			 //1EList
		}
		else if (string.equals("ContainsElements")) {
			//3xxx
			for (int i = 0; i < ((IfcSpatialStructureElement) object).getContainsElements().size(); i++) {
				resultList.add(((IfcSpatialStructureElement) object).getContainsElements().get(i));
			}
			 //1EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcSpatialStructureElement) object).getObjectPlacement());
			 //2IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcSpatialStructureElement) object).getRepresentation());
			 //2IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSpatialStructureElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcSpatialStructureElement) object).getReferencedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcSpatialStructureElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSpatialStructureElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcSpatialStructureElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSpatialStructureElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcSpatialStructureElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSpatialStructureElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcSpatialStructureElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcSpatialStructureElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcSpatialStructureElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSpatialStructureElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSpatialStructureElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSpatialStructureElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSpatialStructureElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSpatialStructureElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSpatialStructureElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSpatialStructureElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
