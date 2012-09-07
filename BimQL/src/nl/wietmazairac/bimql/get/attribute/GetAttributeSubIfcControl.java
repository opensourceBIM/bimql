package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcControl {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcControl(Object object, String string) {
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
			for (int i = 0; i < ((IfcControl) object).getControls().size(); i++) {
				resultList.add(((IfcControl) object).getControls().get(i));
			}
			 //1EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcControl) object).getObjectType());
			 //2String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcControl) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcControl) object).getIsDefinedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcControl) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcControl) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcControl) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcControl) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcControl) object).getDecomposes().size(); i++) {
				resultList.add(((IfcControl) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcControl) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcControl) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcControl) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcControl) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcControl) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcControl) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcControl) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
