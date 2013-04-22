package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcFlowInstrumentType;

public class GetAttributeSubIfcFlowInstrumentType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFlowInstrumentType(Object object, String string) {
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
			resultList.add(((IfcFlowInstrumentType) object).getPredefinedType());
			 //1IfcFlowInstrumentTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcFlowInstrumentType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowInstrumentType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcFlowInstrumentType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcFlowInstrumentType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcFlowInstrumentType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowInstrumentType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcFlowInstrumentType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowInstrumentType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcFlowInstrumentType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowInstrumentType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFlowInstrumentType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowInstrumentType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFlowInstrumentType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowInstrumentType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFlowInstrumentType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowInstrumentType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFlowInstrumentType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFlowInstrumentType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFlowInstrumentType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFlowInstrumentType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFlowInstrumentType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFlowInstrumentType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
