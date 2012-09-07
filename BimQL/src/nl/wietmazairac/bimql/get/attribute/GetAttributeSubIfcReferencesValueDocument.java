package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcReferencesValueDocument {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcReferencesValueDocument(Object object, String string) {
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
		if (string.equals("ReferencedDocument")) {
			resultList.add(((IfcReferencesValueDocument) object).getReferencedDocument());
			 //1IfcDocumentSelect
		}
		else if (string.equals("ReferencingValues")) {
			//3xxx
			for (int i = 0; i < ((IfcReferencesValueDocument) object).getReferencingValues().size(); i++) {
				resultList.add(((IfcReferencesValueDocument) object).getReferencingValues().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcReferencesValueDocument) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcReferencesValueDocument) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
