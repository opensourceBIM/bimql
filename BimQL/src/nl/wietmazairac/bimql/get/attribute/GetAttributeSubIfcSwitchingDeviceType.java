package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcSwitchingDeviceType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSwitchingDeviceType(Object object, String string) {
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
			resultList.add(((IfcSwitchingDeviceType) object).getPredefinedType());
			 //1IfcSwitchingDeviceTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcSwitchingDeviceType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcSwitchingDeviceType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcSwitchingDeviceType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcSwitchingDeviceType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcSwitchingDeviceType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcSwitchingDeviceType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcSwitchingDeviceType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcSwitchingDeviceType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcSwitchingDeviceType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSwitchingDeviceType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcSwitchingDeviceType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSwitchingDeviceType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcSwitchingDeviceType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcSwitchingDeviceType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcSwitchingDeviceType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSwitchingDeviceType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSwitchingDeviceType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSwitchingDeviceType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSwitchingDeviceType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSwitchingDeviceType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSwitchingDeviceType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSwitchingDeviceType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
