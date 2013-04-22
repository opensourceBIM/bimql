package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCoilType;

public class GetAttributeSubIfcCoilType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCoilType(Object object, String string) {
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
			resultList.add(((IfcCoilType) object).getPredefinedType());
			 //1IfcCoilTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcCoilType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcCoilType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcCoilType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcCoilType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcCoilType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcCoilType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcCoilType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcCoilType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcCoilType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCoilType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcCoilType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCoilType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcCoilType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcCoilType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcCoilType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcCoilType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcCoilType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcCoilType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcCoilType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcCoilType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcCoilType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcCoilType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
