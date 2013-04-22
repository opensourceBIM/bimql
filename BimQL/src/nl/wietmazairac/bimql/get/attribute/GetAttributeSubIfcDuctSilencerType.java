package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDuctSilencerType;

public class GetAttributeSubIfcDuctSilencerType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDuctSilencerType(Object object, String string) {
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
			resultList.add(((IfcDuctSilencerType) object).getPredefinedType());
			 //1IfcDuctSilencerTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcDuctSilencerType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSilencerType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcDuctSilencerType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcDuctSilencerType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcDuctSilencerType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSilencerType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcDuctSilencerType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSilencerType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcDuctSilencerType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSilencerType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcDuctSilencerType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSilencerType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcDuctSilencerType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSilencerType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcDuctSilencerType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctSilencerType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDuctSilencerType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDuctSilencerType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDuctSilencerType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDuctSilencerType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDuctSilencerType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDuctSilencerType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
