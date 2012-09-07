package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcActor {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcActor(Object object, String string) {
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
		if (string.equals("TheActor")) {
			resultList.add(((IfcActor) object).getTheActor());
			 //1IfcActorSelect
		}
		else if (string.equals("IsActingUpon")) {
			//3xxx
			for (int i = 0; i < ((IfcActor) object).getIsActingUpon().size(); i++) {
				resultList.add(((IfcActor) object).getIsActingUpon().get(i));
			}
			 //1EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcActor) object).getObjectType());
			 //2String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcActor) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcActor) object).getIsDefinedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcActor) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcActor) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcActor) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcActor) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcActor) object).getDecomposes().size(); i++) {
				resultList.add(((IfcActor) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcActor) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcActor) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcActor) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcActor) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcActor) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcActor) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcActor) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
