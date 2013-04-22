package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTankType;

public class GetAttributeSubIfcTankType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTankType(Object object, String string) {
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
			resultList.add(((IfcTankType) object).getPredefinedType());
			 //1IfcTankTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcTankType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcTankType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcTankType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcTankType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcTankType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcTankType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcTankType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcTankType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcTankType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTankType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcTankType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTankType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcTankType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcTankType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcTankType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcTankType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcTankType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcTankType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcTankType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcTankType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcTankType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcTankType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
