package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRampFlightType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRampFlightType(Object object, String string) {
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
			resultList.add(((IfcRampFlightType) object).getPredefinedType());
			 //1IfcRampFlightTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcRampFlightType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlightType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcRampFlightType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcRampFlightType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcRampFlightType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlightType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcRampFlightType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlightType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcRampFlightType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlightType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcRampFlightType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlightType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcRampFlightType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlightType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcRampFlightType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlightType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcRampFlightType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRampFlightType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRampFlightType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRampFlightType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRampFlightType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRampFlightType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
