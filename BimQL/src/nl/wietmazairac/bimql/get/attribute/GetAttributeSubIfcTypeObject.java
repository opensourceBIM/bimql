package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcTypeObject {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTypeObject(Object object, String string) {
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
		if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcTypeObject) object).getApplicableOccurrence());
			 //1String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcTypeObject) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcTypeObject) object).getObjectTypeOf().get(i));
			}
			 //1EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcTypeObject) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcTypeObject) object).getHasPropertySets().get(i));
			}
			 //1EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTypeObject) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcTypeObject) object).getHasAssignments().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTypeObject) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcTypeObject) object).getIsDecomposedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcTypeObject) object).getDecomposes().size(); i++) {
				resultList.add(((IfcTypeObject) object).getDecomposes().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcTypeObject) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcTypeObject) object).getHasAssociations().get(i));
			}
			 //2EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcTypeObject) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcTypeObject) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcTypeObject) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcTypeObject) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcTypeObject) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
