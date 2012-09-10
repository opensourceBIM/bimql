package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcBooleanResult;

public class GetAttributeSubIfcBooleanResult {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBooleanResult(Object object, String string) {
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
		if (string.equals("Dim")) {
			resultList.add(((IfcBooleanResult) object).getDim());
			 //1int
		}
		else if (string.equals("Operator")) {
			resultList.add(((IfcBooleanResult) object).getOperator());
			 //1IfcBooleanOperator
		}
		else if (string.equals("FirstOperand")) {
			resultList.add(((IfcBooleanResult) object).getFirstOperand());
			 //1IfcBooleanOperand
		}
		else if (string.equals("SecondOperand")) {
			resultList.add(((IfcBooleanResult) object).getSecondOperand());
			 //1IfcBooleanOperand
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcBooleanResult) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcBooleanResult) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBooleanResult) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcBooleanResult) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
