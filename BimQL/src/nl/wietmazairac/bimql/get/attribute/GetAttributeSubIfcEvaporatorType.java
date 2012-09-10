package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcEvaporatorType;

public class GetAttributeSubIfcEvaporatorType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcEvaporatorType(Object object, String string) {
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
			resultList.add(((IfcEvaporatorType) object).getPredefinedType());
			 //1IfcEvaporatorTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcEvaporatorType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporatorType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcEvaporatorType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcEvaporatorType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcEvaporatorType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporatorType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcEvaporatorType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporatorType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcEvaporatorType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporatorType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcEvaporatorType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporatorType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcEvaporatorType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporatorType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcEvaporatorType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporatorType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcEvaporatorType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcEvaporatorType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcEvaporatorType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcEvaporatorType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcEvaporatorType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcEvaporatorType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
