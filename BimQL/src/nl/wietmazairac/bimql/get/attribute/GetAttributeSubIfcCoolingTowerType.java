package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcCoolingTowerType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCoolingTowerType(Object object, String string) {
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
			resultList.add(((IfcCoolingTowerType) object).getPredefinedType());
			 //1IfcCoolingTowerTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcCoolingTowerType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcCoolingTowerType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcCoolingTowerType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcCoolingTowerType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcCoolingTowerType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcCoolingTowerType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcCoolingTowerType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcCoolingTowerType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcCoolingTowerType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCoolingTowerType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcCoolingTowerType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCoolingTowerType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcCoolingTowerType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcCoolingTowerType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcCoolingTowerType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcCoolingTowerType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcCoolingTowerType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcCoolingTowerType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcCoolingTowerType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcCoolingTowerType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcCoolingTowerType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcCoolingTowerType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
