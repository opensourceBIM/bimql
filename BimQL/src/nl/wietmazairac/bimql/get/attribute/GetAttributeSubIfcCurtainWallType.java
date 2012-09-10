package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCurtainWallType;

public class GetAttributeSubIfcCurtainWallType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCurtainWallType(Object object, String string) {
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
			resultList.add(((IfcCurtainWallType) object).getPredefinedType());
			 //1IfcCurtainWallTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcCurtainWallType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWallType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcCurtainWallType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcCurtainWallType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcCurtainWallType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWallType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcCurtainWallType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWallType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcCurtainWallType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWallType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcCurtainWallType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWallType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcCurtainWallType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWallType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcCurtainWallType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWallType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcCurtainWallType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcCurtainWallType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcCurtainWallType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcCurtainWallType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcCurtainWallType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcCurtainWallType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
