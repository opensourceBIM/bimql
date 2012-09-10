package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPlateType;

public class GetAttributeSubIfcPlateType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPlateType(Object object, String string) {
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
			resultList.add(((IfcPlateType) object).getPredefinedType());
			 //1IfcPlateTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcPlateType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcPlateType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcPlateType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcPlateType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcPlateType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcPlateType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcPlateType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcPlateType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcPlateType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcPlateType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcPlateType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcPlateType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcPlateType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcPlateType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcPlateType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcPlateType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcPlateType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcPlateType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcPlateType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcPlateType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPlateType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPlateType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
