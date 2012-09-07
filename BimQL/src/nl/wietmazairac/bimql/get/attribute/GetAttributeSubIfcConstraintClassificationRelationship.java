package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcConstraintClassificationRelationship {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcConstraintClassificationRelationship(Object object, String string) {
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
		if (string.equals("ClassifiedConstraint")) {
			resultList.add(((IfcConstraintClassificationRelationship) object).getClassifiedConstraint());
			 //1IfcConstraint
		}
		else if (string.equals("RelatedClassifications")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraintClassificationRelationship) object).getRelatedClassifications().size(); i++) {
				resultList.add(((IfcConstraintClassificationRelationship) object).getRelatedClassifications().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
