package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDoorStyle;

public class GetAttributeSubIfcDoorStyle {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDoorStyle(Object object, String string) {
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
		if (string.equals("OperationType")) {
			resultList.add(((IfcDoorStyle) object).getOperationType());
			 //1IfcDoorStyleOperationEnum
		}
		else if (string.equals("ConstructionType")) {
			resultList.add(((IfcDoorStyle) object).getConstructionType());
			 //1IfcDoorStyleConstructionEnum
		}
		else if (string.equals("ParameterTakesPrecedence")) {
			resultList.add(((IfcDoorStyle) object).getParameterTakesPrecedence());
			 //1Tristate
		}
		else if (string.equals("Sizeable")) {
			resultList.add(((IfcDoorStyle) object).getSizeable());
			 //1Tristate
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcDoorStyle) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcDoorStyle) object).getRepresentationMaps().get(i));
			}
			 //2EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcDoorStyle) object).getTag());
			 //2String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcDoorStyle) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcDoorStyle) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcDoorStyle) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcDoorStyle) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcDoorStyle) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDoorStyle) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcDoorStyle) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDoorStyle) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcDoorStyle) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcDoorStyle) object).getDecomposes().size(); i++) {
				resultList.add(((IfcDoorStyle) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDoorStyle) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDoorStyle) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDoorStyle) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDoorStyle) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDoorStyle) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDoorStyle) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDoorStyle) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
