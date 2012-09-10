package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDistributionChamberElementType;

public class GetAttributeSubIfcDistributionChamberElementType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDistributionChamberElementType(Object object, String string) {
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
			resultList.add(((IfcDistributionChamberElementType) object).getPredefinedType());
			 //1IfcDistributionChamberElementTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcDistributionChamberElementType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionChamberElementType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcDistributionChamberElementType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcDistributionChamberElementType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcDistributionChamberElementType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionChamberElementType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcDistributionChamberElementType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionChamberElementType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcDistributionChamberElementType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionChamberElementType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcDistributionChamberElementType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionChamberElementType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcDistributionChamberElementType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionChamberElementType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcDistributionChamberElementType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionChamberElementType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDistributionChamberElementType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDistributionChamberElementType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDistributionChamberElementType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDistributionChamberElementType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDistributionChamberElementType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDistributionChamberElementType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
