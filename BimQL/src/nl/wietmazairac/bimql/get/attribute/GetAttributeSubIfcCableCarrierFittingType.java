package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCableCarrierFittingType;

public class GetAttributeSubIfcCableCarrierFittingType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCableCarrierFittingType(Object object, String string) {
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
			resultList.add(((IfcCableCarrierFittingType) object).getPredefinedType());
			 //1IfcCableCarrierFittingTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcCableCarrierFittingType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierFittingType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcCableCarrierFittingType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcCableCarrierFittingType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcCableCarrierFittingType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierFittingType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcCableCarrierFittingType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierFittingType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcCableCarrierFittingType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierFittingType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcCableCarrierFittingType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierFittingType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcCableCarrierFittingType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierFittingType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcCableCarrierFittingType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierFittingType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcCableCarrierFittingType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcCableCarrierFittingType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcCableCarrierFittingType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcCableCarrierFittingType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcCableCarrierFittingType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcCableCarrierFittingType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
