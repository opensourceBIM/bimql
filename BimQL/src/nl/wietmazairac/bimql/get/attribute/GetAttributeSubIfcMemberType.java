package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcMemberType;

public class GetAttributeSubIfcMemberType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMemberType(Object object, String string) {
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
			resultList.add(((IfcMemberType) object).getPredefinedType());
			 //1IfcMemberTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcMemberType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcMemberType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcMemberType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcMemberType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcMemberType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcMemberType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcMemberType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcMemberType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcMemberType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcMemberType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcMemberType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcMemberType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcMemberType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcMemberType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcMemberType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcMemberType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcMemberType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcMemberType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcMemberType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcMemberType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcMemberType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcMemberType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
