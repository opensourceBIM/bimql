package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPropertyConstraintRelationship;

public class GetAttributeSubIfcPropertyConstraintRelationship {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPropertyConstraintRelationship(Object object, String string) {
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
		if (string.equals("RelatedProperties")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyConstraintRelationship) object).getRelatedProperties().size(); i++) {
				resultList.add(((IfcPropertyConstraintRelationship) object).getRelatedProperties().get(i));
			}
			 //1EList
		}
		else if (string.equals("RelatingConstraint")) {
			resultList.add(((IfcPropertyConstraintRelationship) object).getRelatingConstraint());
			 //1IfcConstraint
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPropertyConstraintRelationship) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPropertyConstraintRelationship) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
