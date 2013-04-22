package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDuctSegmentType;

public class GetAttributeSubIfcDuctSegmentType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDuctSegmentType(Object object, String string) {
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
			resultList.add(((IfcDuctSegmentType) object).getPredefinedType());
			 //1IfcDuctSegmentTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcDuctSegmentType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSegmentType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcDuctSegmentType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcDuctSegmentType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcDuctSegmentType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSegmentType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcDuctSegmentType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSegmentType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcDuctSegmentType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSegmentType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcDuctSegmentType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSegmentType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcDuctSegmentType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSegmentType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcDuctSegmentType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSegmentType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDuctSegmentType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDuctSegmentType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDuctSegmentType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDuctSegmentType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDuctSegmentType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDuctSegmentType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
