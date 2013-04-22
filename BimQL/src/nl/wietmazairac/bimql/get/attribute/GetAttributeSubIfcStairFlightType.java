package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcStairFlightType;

public class GetAttributeSubIfcStairFlightType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStairFlightType(Object object, String string) {
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
			resultList.add(((IfcStairFlightType) object).getPredefinedType());
			 //1IfcStairFlightTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcStairFlightType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlightType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcStairFlightType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcStairFlightType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcStairFlightType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlightType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcStairFlightType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlightType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcStairFlightType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlightType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStairFlightType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlightType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStairFlightType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlightType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStairFlightType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlightType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStairFlightType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStairFlightType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStairFlightType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStairFlightType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStairFlightType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStairFlightType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
