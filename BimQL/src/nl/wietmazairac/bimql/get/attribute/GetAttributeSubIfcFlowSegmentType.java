package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcFlowSegmentType;

public class GetAttributeSubIfcFlowSegmentType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFlowSegmentType(Object object, String string) {
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
			resultList.add(((IfcFlowSegmentType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegmentType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcFlowSegmentType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcFlowSegmentType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcFlowSegmentType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegmentType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcFlowSegmentType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegmentType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcFlowSegmentType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegmentType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFlowSegmentType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegmentType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFlowSegmentType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegmentType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFlowSegmentType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegmentType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFlowSegmentType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFlowSegmentType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFlowSegmentType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFlowSegmentType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFlowSegmentType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFlowSegmentType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
