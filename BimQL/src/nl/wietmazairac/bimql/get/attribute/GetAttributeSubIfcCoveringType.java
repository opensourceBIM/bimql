package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCoveringType;

public class GetAttributeSubIfcCoveringType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCoveringType(Object object, String string) {
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
			resultList.add(((IfcCoveringType) object).getPredefinedType());
			 //1IfcCoveringTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcCoveringType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcCoveringType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcCoveringType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcCoveringType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcCoveringType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcCoveringType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcCoveringType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcCoveringType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcCoveringType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCoveringType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcCoveringType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCoveringType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcCoveringType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcCoveringType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcCoveringType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcCoveringType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcCoveringType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcCoveringType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcCoveringType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcCoveringType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcCoveringType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcCoveringType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
