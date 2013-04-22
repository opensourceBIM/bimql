package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcElectricMotorType;

public class GetAttributeSubIfcElectricMotorType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcElectricMotorType(Object object, String string) {
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
			resultList.add(((IfcElectricMotorType) object).getPredefinedType());
			 //1IfcElectricMotorTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcElectricMotorType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricMotorType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcElectricMotorType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcElectricMotorType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcElectricMotorType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricMotorType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcElectricMotorType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricMotorType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcElectricMotorType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricMotorType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcElectricMotorType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricMotorType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcElectricMotorType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricMotorType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcElectricMotorType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricMotorType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcElectricMotorType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcElectricMotorType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcElectricMotorType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcElectricMotorType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcElectricMotorType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcElectricMotorType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
