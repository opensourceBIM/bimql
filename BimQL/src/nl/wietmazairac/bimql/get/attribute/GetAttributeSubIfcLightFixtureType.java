package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcLightFixtureType;

public class GetAttributeSubIfcLightFixtureType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLightFixtureType(Object object, String string) {
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
			resultList.add(((IfcLightFixtureType) object).getPredefinedType());
			 //1IfcLightFixtureTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcLightFixtureType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcLightFixtureType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcLightFixtureType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcLightFixtureType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcLightFixtureType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcLightFixtureType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcLightFixtureType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcLightFixtureType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcLightFixtureType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcLightFixtureType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcLightFixtureType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcLightFixtureType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcLightFixtureType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcLightFixtureType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcLightFixtureType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcLightFixtureType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcLightFixtureType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcLightFixtureType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcLightFixtureType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcLightFixtureType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcLightFixtureType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcLightFixtureType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
