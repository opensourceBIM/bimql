package nl.wietmazairac.bimql;

import java.util.ArrayList;
import java.util.List;

public class EqualOperator {
	// fields
	private List<ArrayList> leftOperand;
	private String rightOperand;

	// constructors
	public EqualOperator() {
	}

	public EqualOperator(List<ArrayList> leftOperand, String rightOperand) {
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
					if (arrayList.get(i) != null) {
						if (arrayList.get(i).getClass().getSimpleName().equals("Double")) {
							if (rightOperand.indexOf("*") < 0) {
								double rightOperandDouble = Double.parseDouble(rightOperand);
								if (arrayList.get(i).equals(rightOperandDouble)) {
									result.add(true);
									break;
								} else {
									if (i == arrayList.size() - 1) {
										result.add(false);
									}
								}
							} else if (rightOperand.equals("*")) {
								result.add(true);
								break;
							}
						} else if (arrayList.get(i).getClass().getSimpleName().equals("String")) {
							String regex = rightOperand;
							regex = regex.replace(".", "\\.");
							regex = regex.replace("*", ".*");
							regex = regex.replace("?", ".?");
							if (((String) arrayList.get(i)).matches(regex)) {
								result.add(true);
								break;
							} else {
								if (i == arrayList.size() - 1) {
									result.add(false);
								}
							}

						}

						else {
							System.out.println("Sorry. Not implemented. EqualOperator. 001 ." + arrayList.get(i).getClass().getSimpleName());
						}
					} else {
						if (i == arrayList.size() - 1) {
							result.add(false);
						}
					}
				}
			} else {
				result.add(false);
			}
		}
		return result;
	}
}
