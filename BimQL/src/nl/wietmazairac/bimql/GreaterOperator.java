package nl.wietmazairac.bimql;

/******************************************************************************
 * Copyright (C) 2009-2017  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import java.util.ArrayList;
import java.util.List;

public class GreaterOperator {
	// fields
	private List<List<Object>> leftOperand;
	private String rightOperand;
		
	// constructors
	public GreaterOperator() {	
	}
	
	public GreaterOperator(List<List<Object>> leftOperand, String rightOperand){
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	// methods
	public List<List<Object>> getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(List<List<Object>> leftOperand) {
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
		for (List<Object> arrayList : leftOperand) {
			if (arrayList.size() > 0) {
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getClass().getSimpleName().equals("Double")) {						
						double rightOperandDouble = Double.parseDouble(rightOperand);
						int i1 = Double.compare((Double) arrayList.get(i),rightOperandDouble);
						if (i1 > 0) {
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
