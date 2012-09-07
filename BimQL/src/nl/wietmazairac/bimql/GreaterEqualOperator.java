package nl.wietmazairac.bimql;

import java.util.ArrayList;
import java.util.List;

public class GreaterEqualOperator {
	// fields
	private List<ArrayList> leftOperand;
	private String rightOperand;
		
	// constructors
	public GreaterEqualOperator() {	
	}
	
	public GreaterEqualOperator(List<ArrayList> leftOperand, String rightOperand){
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	// methods
	public List<ArrayList> getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(List<ArrayList> leftOperand) {
		this.leftOperand = leftOperand;
	}

	public String getRightOperand() {
		return rightOperand;
	}

	public void setRightOperand(String rightOperand) {
		this.rightOperand = rightOperand;
	}
	
	public List<Boolean> getResult() {
		List<Boolean> result = new ArrayList<Boolean>();
		for (ArrayList arrayList : leftOperand) {
			if (arrayList.size() > 0) {
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getClass().getSimpleName().equals("Double")) {						
						double rightOperandDouble = Double.parseDouble(rightOperand);
						int i1 = Double.compare((Double) arrayList.get(i),rightOperandDouble);
						if (i1 > 0 || i1 == 0) {
							result.add(true);
							break;
						}
						else {
							if (i == arrayList.size() - 1) {
								result.add(false);
							}
						}						
					}					
					else {
						System.out.println("Sorry. Not implemented." + arrayList.get(i).getClass().getSimpleName());
					}
				}
			}
			else {
				result.add(false);
			}
		}
		return result;
	}
}
