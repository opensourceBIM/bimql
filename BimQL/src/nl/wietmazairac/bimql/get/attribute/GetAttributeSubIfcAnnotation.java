package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcAnnotation;

public class GetAttributeSubIfcAnnotation {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAnnotation(Object object, String string) {
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
		if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotation) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcAnnotation) object).getContainedInStructure().get(i));
			}
			 //1EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcAnnotation) object).getObjectPlacement());
			 //2IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcAnnotation) object).getRepresentation());
			 //2IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotation) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcAnnotation) object).getReferencedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcAnnotation) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotation) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcAnnotation) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotation) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcAnnotation) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotation) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcAnnotation) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotation) object).getDecomposes().size(); i++) {
				resultList.add(((IfcAnnotation) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotation) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcAnnotation) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcAnnotation) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcAnnotation) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcAnnotation) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcAnnotation) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcAnnotation) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
