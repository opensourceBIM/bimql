package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcEnergyConversionDeviceType;

public class GetAttributeSubIfcEnergyConversionDeviceType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcEnergyConversionDeviceType(Object object, String string) {
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
		if (string.equals("ElementType")) {
			resultList.add(((IfcEnergyConversionDeviceType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcEnergyConversionDeviceType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcEnergyConversionDeviceType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcEnergyConversionDeviceType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcEnergyConversionDeviceType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcEnergyConversionDeviceType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcEnergyConversionDeviceType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcEnergyConversionDeviceType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcEnergyConversionDeviceType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcEnergyConversionDeviceType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcEnergyConversionDeviceType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcEnergyConversionDeviceType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcEnergyConversionDeviceType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcEnergyConversionDeviceType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcEnergyConversionDeviceType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcEnergyConversionDeviceType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcEnergyConversionDeviceType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcEnergyConversionDeviceType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcEnergyConversionDeviceType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcEnergyConversionDeviceType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcEnergyConversionDeviceType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcEnergyConversionDeviceType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
