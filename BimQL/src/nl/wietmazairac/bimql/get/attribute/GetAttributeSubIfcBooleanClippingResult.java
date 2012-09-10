package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcBooleanClippingResult;

public class GetAttributeSubIfcBooleanClippingResult {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBooleanClippingResult(Object object, String string) {
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
			resultList.add(((IfcBooleanClippingResult) object).getDim());
			 //2int
		}
		else if (string.equals("Operator")) {
			resultList.add(((IfcBooleanClippingResult) object).getOperator());
			 //2IfcBooleanOperator
		}
		else if (string.equals("FirstOperand")) {
			resultList.add(((IfcBooleanClippingResult) object).getFirstOperand());
			 //2IfcBooleanOperand
		}
		else if (string.equals("SecondOperand")) {
			resultList.add(((IfcBooleanClippingResult) object).getSecondOperand());
			 //2IfcBooleanOperand
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcBooleanClippingResult) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcBooleanClippingResult) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBooleanClippingResult) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcBooleanClippingResult) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
