package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTubeBundleType;

public class GetAttributeSubIfcTubeBundleType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTubeBundleType(Object object, String string) {
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
			resultList.add(((IfcTubeBundleType) object).getPredefinedType());
			 //1IfcTubeBundleTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcTubeBundleType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcTubeBundleType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcTubeBundleType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcTubeBundleType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcTubeBundleType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcTubeBundleType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcTubeBundleType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcTubeBundleType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcTubeBundleType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTubeBundleType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcTubeBundleType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTubeBundleType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcTubeBundleType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcTubeBundleType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcTubeBundleType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcTubeBundleType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcTubeBundleType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcTubeBundleType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcTubeBundleType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcTubeBundleType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcTubeBundleType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcTubeBundleType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
