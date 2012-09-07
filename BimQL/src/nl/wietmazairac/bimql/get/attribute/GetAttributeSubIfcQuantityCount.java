package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcQuantityCount {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcQuantityCount(Object object, String string) {
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
		if (string.equals("CountValue")) {
			resultList.add(((IfcQuantityCount) object).getCountValue());
			 //1double
		}
		else if (string.equals("CountValueAsString")) {
			resultList.add(((IfcQuantityCount) object).getCountValueAsString());
			 //1String
		}
		else if (string.equals("Unit")) {
			resultList.add(((IfcQuantityCount) object).getUnit());
			 //2IfcNamedUnit
		}
		else if (string.equals("PartOfComplex")) {
			//3xxx
			for (int i = 0; i < ((IfcQuantityCount) object).getPartOfComplex().size(); i++) {
				resultList.add(((IfcQuantityCount) object).getPartOfComplex().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcQuantityCount) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcQuantityCount) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
