package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcEvaporativeCoolerType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcEvaporativeCoolerType(Object object, String string) {
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
			resultList.add(((IfcEvaporativeCoolerType) object).getPredefinedType());
			 //1IfcEvaporativeCoolerTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcEvaporativeCoolerType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporativeCoolerType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcEvaporativeCoolerType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcEvaporativeCoolerType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcEvaporativeCoolerType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporativeCoolerType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcEvaporativeCoolerType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporativeCoolerType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcEvaporativeCoolerType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporativeCoolerType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcEvaporativeCoolerType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporativeCoolerType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcEvaporativeCoolerType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporativeCoolerType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcEvaporativeCoolerType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcEvaporativeCoolerType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcEvaporativeCoolerType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcEvaporativeCoolerType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcEvaporativeCoolerType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcEvaporativeCoolerType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcEvaporativeCoolerType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcEvaporativeCoolerType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
