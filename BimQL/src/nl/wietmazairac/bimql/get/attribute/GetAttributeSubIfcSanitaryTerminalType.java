package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcSanitaryTerminalType;

public class GetAttributeSubIfcSanitaryTerminalType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSanitaryTerminalType(Object object, String string) {
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
			resultList.add(((IfcSanitaryTerminalType) object).getPredefinedType());
			 //1IfcSanitaryTerminalTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcSanitaryTerminalType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcSanitaryTerminalType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcSanitaryTerminalType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcSanitaryTerminalType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcSanitaryTerminalType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcSanitaryTerminalType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcSanitaryTerminalType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcSanitaryTerminalType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcSanitaryTerminalType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSanitaryTerminalType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcSanitaryTerminalType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSanitaryTerminalType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcSanitaryTerminalType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcSanitaryTerminalType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcSanitaryTerminalType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSanitaryTerminalType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSanitaryTerminalType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSanitaryTerminalType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSanitaryTerminalType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSanitaryTerminalType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSanitaryTerminalType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSanitaryTerminalType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
