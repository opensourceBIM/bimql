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

public class AndOperator {
	// fields
	private List<Boolean> leftOperand;
	private List<Boolean> rightOperand;
		
	// constructors
	public AndOperator() {	
	}
	
	public AndOperator(List<Boolean> leftOperand, List<Boolean> rightOperand){
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
			if (leftOperand.get(i) && rightOperand.get(i)){
				result.add(true);
			}
			else {
				result.add(false);
			}
		}
		return result;		
	}
}
