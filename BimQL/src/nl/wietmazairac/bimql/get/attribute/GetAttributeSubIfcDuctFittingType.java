package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcDuctFittingType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDuctFittingType(Object object, String string) {
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
			resultList.add(((IfcDuctFittingType) object).getPredefinedType());
			 //1IfcDuctFittingTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcDuctFittingType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctFittingType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcDuctFittingType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcDuctFittingType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcDuctFittingType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctFittingType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcDuctFittingType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctFittingType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcDuctFittingType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctFittingType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcDuctFittingType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctFittingType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcDuctFittingType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctFittingType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcDuctFittingType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDuctFittingType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDuctFittingType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDuctFittingType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDuctFittingType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDuctFittingType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDuctFittingType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDuctFittingType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
