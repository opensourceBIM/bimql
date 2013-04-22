package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcVibrationIsolatorType;

public class GetAttributeSubIfcVibrationIsolatorType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcVibrationIsolatorType(Object object, String string) {
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
			resultList.add(((IfcVibrationIsolatorType) object).getPredefinedType());
			 //1IfcVibrationIsolatorTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcVibrationIsolatorType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcVibrationIsolatorType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcVibrationIsolatorType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcVibrationIsolatorType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcVibrationIsolatorType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcVibrationIsolatorType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcVibrationIsolatorType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcVibrationIsolatorType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcVibrationIsolatorType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcVibrationIsolatorType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcVibrationIsolatorType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcVibrationIsolatorType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcVibrationIsolatorType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcVibrationIsolatorType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcVibrationIsolatorType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcVibrationIsolatorType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcVibrationIsolatorType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcVibrationIsolatorType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcVibrationIsolatorType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcVibrationIsolatorType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcVibrationIsolatorType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcVibrationIsolatorType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
