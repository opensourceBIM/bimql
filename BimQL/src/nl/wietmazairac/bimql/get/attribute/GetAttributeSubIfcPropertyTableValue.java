package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcPropertyTableValue {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPropertyTableValue(Object object, String string) {
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
		if (string.equals("Expression")) {
			resultList.add(((IfcPropertyTableValue) object).getExpression());
			 //1String
		}
		else if (string.equals("DefiningValues")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyTableValue) object).getDefiningValues().size(); i++) {
				resultList.add(((IfcPropertyTableValue) object).getDefiningValues().get(i));
			}
			 //1EList
		}
		else if (string.equals("DefinedValues")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyTableValue) object).getDefinedValues().size(); i++) {
				resultList.add(((IfcPropertyTableValue) object).getDefinedValues().get(i));
			}
			 //1EList
		}
		else if (string.equals("DefiningUnit")) {
			resultList.add(((IfcPropertyTableValue) object).getDefiningUnit());
			 //1IfcUnit
		}
		else if (string.equals("DefinedUnit")) {
			resultList.add(((IfcPropertyTableValue) object).getDefinedUnit());
			 //1IfcUnit
		}
		else if (string.equals("PropertyForDependance")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyTableValue) object).getPropertyForDependance().size(); i++) {
				resultList.add(((IfcPropertyTableValue) object).getPropertyForDependance().get(i));
			}
			 //3EList
		}
		else if (string.equals("PartOfComplex")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyTableValue) object).getPartOfComplex().size(); i++) {
				resultList.add(((IfcPropertyTableValue) object).getPartOfComplex().get(i));
			}
			 //3EList
		}
		else if (string.equals("PropertyDependsOn")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyTableValue) object).getPropertyDependsOn().size(); i++) {
				resultList.add(((IfcPropertyTableValue) object).getPropertyDependsOn().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPropertyTableValue) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPropertyTableValue) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
