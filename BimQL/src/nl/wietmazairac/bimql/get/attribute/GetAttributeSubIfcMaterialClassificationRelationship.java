package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcMaterialClassificationRelationship;

public class GetAttributeSubIfcMaterialClassificationRelationship {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMaterialClassificationRelationship(Object object, String string) {
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
		if (string.equals("MaterialClassifications")) {
			//3xxx
			for (int i = 0; i < ((IfcMaterialClassificationRelationship) object).getMaterialClassifications().size(); i++) {
				resultList.add(((IfcMaterialClassificationRelationship) object).getMaterialClassifications().get(i));
			}
			 //1EList
		}
		else if (string.equals("ClassifiedMaterial")) {
			resultList.add(((IfcMaterialClassificationRelationship) object).getClassifiedMaterial());
			 //1IfcMaterial
		}
		return resultList;
	}
}
