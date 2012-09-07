package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcDocumentInformationRelationship {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDocumentInformationRelationship(Object object, String string) {
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
		if (string.equals("RelatingDocument")) {
			resultList.add(((IfcDocumentInformationRelationship) object).getRelatingDocument());
			 //1IfcDocumentInformation
		}
		else if (string.equals("RelatedDocuments")) {
			//3xxx
			for (int i = 0; i < ((IfcDocumentInformationRelationship) object).getRelatedDocuments().size(); i++) {
				resultList.add(((IfcDocumentInformationRelationship) object).getRelatedDocuments().get(i));
			}
			 //1EList
		}
		else if (string.equals("RelationshipType")) {
			resultList.add(((IfcDocumentInformationRelationship) object).getRelationshipType());
			 //1String
		}
		return resultList;
	}
}
