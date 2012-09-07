package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcObjectDefinition {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcObjectDefinition(Object object, String string) {
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
		if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcObjectDefinition) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcObjectDefinition) object).getHasAssignments().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcObjectDefinition) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcObjectDefinition) object).getIsDecomposedBy().get(i));
			}
			 //1EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcObjectDefinition) object).getDecomposes().size(); i++) {
				resultList.add(((IfcObjectDefinition) object).getDecomposes().get(i));
			}
			 //1EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcObjectDefinition) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcObjectDefinition) object).getHasAssociations().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
