package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPipeFittingType;

public class GetAttributeSubIfcPipeFittingType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPipeFittingType(Object object, String string) {
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
			resultList.add(((IfcPipeFittingType) object).getPredefinedType());
			 //1IfcPipeFittingTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcPipeFittingType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeFittingType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcPipeFittingType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcPipeFittingType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcPipeFittingType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeFittingType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcPipeFittingType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeFittingType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcPipeFittingType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeFittingType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcPipeFittingType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeFittingType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcPipeFittingType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeFittingType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcPipeFittingType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcPipeFittingType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcPipeFittingType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcPipeFittingType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcPipeFittingType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcPipeFittingType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPipeFittingType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPipeFittingType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
