package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcProductDefinitionShape;

public class GetAttributeSubIfcProductDefinitionShape {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProductDefinitionShape(Object object, String string) {
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
		if (string.equals("ShapeOfProduct")) {
			//3xxx
			for (int i = 0; i < ((IfcProductDefinitionShape) object).getShapeOfProduct().size(); i++) {
				resultList.add(((IfcProductDefinitionShape) object).getShapeOfProduct().get(i));
			}
			 //1EList
		}
		else if (string.equals("HasShapeAspects")) {
			//3xxx
			for (int i = 0; i < ((IfcProductDefinitionShape) object).getHasShapeAspects().size(); i++) {
				resultList.add(((IfcProductDefinitionShape) object).getHasShapeAspects().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
