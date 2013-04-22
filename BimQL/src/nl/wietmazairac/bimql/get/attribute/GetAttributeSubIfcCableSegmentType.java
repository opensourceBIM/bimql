package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCableSegmentType;

public class GetAttributeSubIfcCableSegmentType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCableSegmentType(Object object, String string) {
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
			resultList.add(((IfcCableSegmentType) object).getPredefinedType());
			 //1IfcCableSegmentTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcCableSegmentType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcCableSegmentType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcCableSegmentType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcCableSegmentType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcCableSegmentType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcCableSegmentType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcCableSegmentType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcCableSegmentType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcCableSegmentType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCableSegmentType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcCableSegmentType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCableSegmentType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcCableSegmentType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcCableSegmentType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcCableSegmentType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcCableSegmentType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcCableSegmentType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcCableSegmentType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcCableSegmentType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcCableSegmentType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcCableSegmentType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcCableSegmentType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
