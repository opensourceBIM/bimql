package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcFurnitureStandard {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFurnitureStandard(Object object, String string) {
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
		if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnitureStandard) object).getControls().size(); i++) {
				resultList.add(((IfcFurnitureStandard) object).getControls().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcFurnitureStandard) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnitureStandard) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcFurnitureStandard) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnitureStandard) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFurnitureStandard) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnitureStandard) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFurnitureStandard) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnitureStandard) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFurnitureStandard) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnitureStandard) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFurnitureStandard) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFurnitureStandard) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFurnitureStandard) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFurnitureStandard) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFurnitureStandard) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFurnitureStandard) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
