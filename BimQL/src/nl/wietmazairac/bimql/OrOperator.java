package nl.wietmazairac.bimql;

import java.util.ArrayList;
import java.util.List;

public class OrOperator {
	// fields
	private List<Boolean> leftOperand;
	private List<Boolean> rightOperand;
		
	// constructors
	public OrOperator(){
	}
	
	public OrOperator(List<Boolean> leftOperand, List<Boolean> rightOperand){
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	// methods
	public List<Boolean> getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(List<Boolean> leftOperand) {
		this.leftOperand = leftOperand;
	}

	public List<Boolean> getRightOperand() {
		return rightOperand;
	}

	public void setRightOperand(List<Boolean> rightOperand) {
		this.rightOperand = rightOperand;
	}
	
	public List<Boolean> getResult() {		
		List<Boolean> result = new ArrayList<Boolean>();		
		for (int i = 0; i < leftOperand.size(); i++) {
			if (leftOperand.get(i) || rightOperand.get(i)){
				result.add(true);
			}
			else {
				result.add(false);
			}
		}
		return result;		
	}
}
