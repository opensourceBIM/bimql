package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPipeSegmentType;

public class GetAttributeSubIfcPipeSegmentType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPipeSegmentType(Object object, String string) {
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
			resultList.add(((IfcPipeSegmentType) object).getPredefinedType());
			 //1IfcPipeSegmentTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcPipeSegmentType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeSegmentType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcPipeSegmentType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcPipeSegmentType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcPipeSegmentType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeSegmentType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcPipeSegmentType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeSegmentType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcPipeSegmentType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeSegmentType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcPipeSegmentType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeSegmentType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcPipeSegmentType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeSegmentType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcPipeSegmentType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeSegmentType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcPipeSegmentType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcPipeSegmentType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcPipeSegmentType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcPipeSegmentType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPipeSegmentType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPipeSegmentType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
