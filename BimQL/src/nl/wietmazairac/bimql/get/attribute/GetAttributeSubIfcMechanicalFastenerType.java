package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcMechanicalFastenerType;

public class GetAttributeSubIfcMechanicalFastenerType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMechanicalFastenerType(Object object, String string) {
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
		if (string.equals("ElementType")) {
			resultList.add(((IfcMechanicalFastenerType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastenerType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcMechanicalFastenerType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcMechanicalFastenerType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcMechanicalFastenerType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastenerType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcMechanicalFastenerType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastenerType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcMechanicalFastenerType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastenerType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcMechanicalFastenerType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastenerType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcMechanicalFastenerType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastenerType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcMechanicalFastenerType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcMechanicalFastenerType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcMechanicalFastenerType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcMechanicalFastenerType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcMechanicalFastenerType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcMechanicalFastenerType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcMechanicalFastenerType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcMechanicalFastenerType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
