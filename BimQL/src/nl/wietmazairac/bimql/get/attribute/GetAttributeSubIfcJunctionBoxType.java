package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcJunctionBoxType;

public class GetAttributeSubIfcJunctionBoxType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcJunctionBoxType(Object object, String string) {
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
		if (string.equals("PredefinedType")) {
			resultList.add(((IfcJunctionBoxType) object).getPredefinedType());
			 //1IfcJunctionBoxTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcJunctionBoxType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcJunctionBoxType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcJunctionBoxType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcJunctionBoxType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcJunctionBoxType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcJunctionBoxType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcJunctionBoxType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcJunctionBoxType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcJunctionBoxType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcJunctionBoxType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcJunctionBoxType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcJunctionBoxType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcJunctionBoxType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcJunctionBoxType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcJunctionBoxType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcJunctionBoxType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcJunctionBoxType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcJunctionBoxType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcJunctionBoxType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcJunctionBoxType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcJunctionBoxType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcJunctionBoxType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
