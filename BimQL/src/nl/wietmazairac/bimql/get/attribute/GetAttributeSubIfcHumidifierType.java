package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcHumidifierType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcHumidifierType(Object object, String string) {
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
			resultList.add(((IfcHumidifierType) object).getPredefinedType());
			 //1IfcHumidifierTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcHumidifierType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcHumidifierType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcHumidifierType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcHumidifierType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcHumidifierType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcHumidifierType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcHumidifierType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcHumidifierType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcHumidifierType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcHumidifierType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcHumidifierType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcHumidifierType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcHumidifierType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcHumidifierType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcHumidifierType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcHumidifierType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcHumidifierType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcHumidifierType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcHumidifierType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcHumidifierType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcHumidifierType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcHumidifierType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
