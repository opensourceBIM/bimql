package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcChillerType;

public class GetAttributeSubIfcChillerType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcChillerType(Object object, String string) {
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
			resultList.add(((IfcChillerType) object).getPredefinedType());
			 //1IfcChillerTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcChillerType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcChillerType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcChillerType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcChillerType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcChillerType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcChillerType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcChillerType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcChillerType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcChillerType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcChillerType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcChillerType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcChillerType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcChillerType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcChillerType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcChillerType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcChillerType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcChillerType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcChillerType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcChillerType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcChillerType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcChillerType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcChillerType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
