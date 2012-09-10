package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcFurnitureType;

public class GetAttributeSubIfcFurnitureType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFurnitureType(Object object, String string) {
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
		if (string.equals("AssemblyPlace")) {
			resultList.add(((IfcFurnitureType) object).getAssemblyPlace());
			 //1IfcAssemblyPlaceEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcFurnitureType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnitureType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcFurnitureType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcFurnitureType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcFurnitureType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnitureType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcFurnitureType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnitureType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcFurnitureType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnitureType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFurnitureType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnitureType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFurnitureType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnitureType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFurnitureType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnitureType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFurnitureType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFurnitureType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFurnitureType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFurnitureType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFurnitureType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFurnitureType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
