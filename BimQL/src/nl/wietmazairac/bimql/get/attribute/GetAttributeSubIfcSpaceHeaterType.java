package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcSpaceHeaterType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSpaceHeaterType(Object object, String string) {
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
			resultList.add(((IfcSpaceHeaterType) object).getPredefinedType());
			 //1IfcSpaceHeaterTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcSpaceHeaterType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceHeaterType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcSpaceHeaterType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcSpaceHeaterType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcSpaceHeaterType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceHeaterType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcSpaceHeaterType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceHeaterType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcSpaceHeaterType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceHeaterType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcSpaceHeaterType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceHeaterType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcSpaceHeaterType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceHeaterType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcSpaceHeaterType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceHeaterType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSpaceHeaterType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSpaceHeaterType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSpaceHeaterType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSpaceHeaterType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSpaceHeaterType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSpaceHeaterType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
