package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRailingType;

public class GetAttributeSubIfcRailingType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRailingType(Object object, String string) {
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
			resultList.add(((IfcRailingType) object).getPredefinedType());
			 //1IfcRailingTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcRailingType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcRailingType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcRailingType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcRailingType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcRailingType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcRailingType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcRailingType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcRailingType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcRailingType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcRailingType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcRailingType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcRailingType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcRailingType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcRailingType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcRailingType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcRailingType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcRailingType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRailingType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRailingType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRailingType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRailingType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRailingType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
