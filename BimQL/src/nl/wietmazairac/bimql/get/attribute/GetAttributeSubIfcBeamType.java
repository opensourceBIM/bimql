package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcBeamType;

public class GetAttributeSubIfcBeamType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBeamType(Object object, String string) {
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
			resultList.add(((IfcBeamType) object).getPredefinedType());
			 //1IfcBeamTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcBeamType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcBeamType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcBeamType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcBeamType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcBeamType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcBeamType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcBeamType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcBeamType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcBeamType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBeamType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcBeamType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBeamType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcBeamType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcBeamType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcBeamType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcBeamType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcBeamType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcBeamType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcBeamType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcBeamType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcBeamType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcBeamType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
