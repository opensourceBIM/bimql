package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcBoilerType;

public class GetAttributeSubIfcBoilerType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBoilerType(Object object, String string) {
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
			resultList.add(((IfcBoilerType) object).getPredefinedType());
			 //1IfcBoilerTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcBoilerType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcBoilerType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcBoilerType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcBoilerType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcBoilerType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcBoilerType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcBoilerType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcBoilerType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcBoilerType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBoilerType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcBoilerType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBoilerType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcBoilerType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcBoilerType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcBoilerType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcBoilerType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcBoilerType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcBoilerType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcBoilerType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcBoilerType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcBoilerType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcBoilerType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
