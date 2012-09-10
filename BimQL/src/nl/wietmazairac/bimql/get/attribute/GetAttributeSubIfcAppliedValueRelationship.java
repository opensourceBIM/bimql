package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcAppliedValueRelationship;

public class GetAttributeSubIfcAppliedValueRelationship {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAppliedValueRelationship(Object object, String string) {
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
		if (string.equals("ArithmeticOperator")) {
			resultList.add(((IfcAppliedValueRelationship) object).getArithmeticOperator());
			 //1IfcArithmeticOperatorEnum
		}
		else if (string.equals("ComponentOfTotal")) {
			resultList.add(((IfcAppliedValueRelationship) object).getComponentOfTotal());
			 //1IfcAppliedValue
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcAppliedValueRelationship) object).getName());
			 //1String
		}
		else if (string.equals("Components")) {
			//3xxx
			for (int i = 0; i < ((IfcAppliedValueRelationship) object).getComponents().size(); i++) {
				resultList.add(((IfcAppliedValueRelationship) object).getComponents().get(i));
			}
			 //1EList
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcAppliedValueRelationship) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
