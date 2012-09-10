package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcSlabType;

public class GetAttributeSubIfcSlabType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSlabType(Object object, String string) {
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
			resultList.add(((IfcSlabType) object).getPredefinedType());
			 //1IfcSlabTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcSlabType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcSlabType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcSlabType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcSlabType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcSlabType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcSlabType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcSlabType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcSlabType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcSlabType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSlabType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcSlabType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSlabType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcSlabType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcSlabType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcSlabType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSlabType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSlabType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSlabType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSlabType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSlabType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSlabType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSlabType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
