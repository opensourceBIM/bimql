package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcAirToAirHeatRecoveryType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAirToAirHeatRecoveryType(Object object, String string) {
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
			resultList.add(((IfcAirToAirHeatRecoveryType) object).getPredefinedType());
			 //1IfcAirToAirHeatRecoveryTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcAirToAirHeatRecoveryType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcAirToAirHeatRecoveryType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcAirToAirHeatRecoveryType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcAirToAirHeatRecoveryType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcAirToAirHeatRecoveryType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcAirToAirHeatRecoveryType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcAirToAirHeatRecoveryType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcAirToAirHeatRecoveryType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcAirToAirHeatRecoveryType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcAirToAirHeatRecoveryType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcAirToAirHeatRecoveryType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcAirToAirHeatRecoveryType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcAirToAirHeatRecoveryType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcAirToAirHeatRecoveryType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcAirToAirHeatRecoveryType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcAirToAirHeatRecoveryType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcAirToAirHeatRecoveryType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcAirToAirHeatRecoveryType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcAirToAirHeatRecoveryType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcAirToAirHeatRecoveryType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcAirToAirHeatRecoveryType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcAirToAirHeatRecoveryType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
