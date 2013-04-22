package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCooledBeamType;

public class GetAttributeSubIfcCooledBeamType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCooledBeamType(Object object, String string) {
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
			resultList.add(((IfcCooledBeamType) object).getPredefinedType());
			 //1IfcCooledBeamTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcCooledBeamType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcCooledBeamType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcCooledBeamType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcCooledBeamType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcCooledBeamType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcCooledBeamType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcCooledBeamType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcCooledBeamType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcCooledBeamType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCooledBeamType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcCooledBeamType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCooledBeamType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcCooledBeamType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcCooledBeamType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcCooledBeamType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcCooledBeamType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcCooledBeamType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcCooledBeamType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcCooledBeamType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcCooledBeamType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcCooledBeamType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcCooledBeamType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
