package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcProtectiveDeviceType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProtectiveDeviceType(Object object, String string) {
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
			resultList.add(((IfcProtectiveDeviceType) object).getPredefinedType());
			 //1IfcProtectiveDeviceTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcProtectiveDeviceType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcProtectiveDeviceType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcProtectiveDeviceType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcProtectiveDeviceType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcProtectiveDeviceType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcProtectiveDeviceType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcProtectiveDeviceType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcProtectiveDeviceType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcProtectiveDeviceType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcProtectiveDeviceType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcProtectiveDeviceType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProtectiveDeviceType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcProtectiveDeviceType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcProtectiveDeviceType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcProtectiveDeviceType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcProtectiveDeviceType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcProtectiveDeviceType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcProtectiveDeviceType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcProtectiveDeviceType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcProtectiveDeviceType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcProtectiveDeviceType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcProtectiveDeviceType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
