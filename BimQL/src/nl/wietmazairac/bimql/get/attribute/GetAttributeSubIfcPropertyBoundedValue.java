package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcPropertyBoundedValue {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPropertyBoundedValue(Object object, String string) {
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
		if (string.equals("UpperBoundValue")) {
			resultList.add(((IfcPropertyBoundedValue) object).getUpperBoundValue());
			 //1IfcValue
		}
		else if (string.equals("LowerBoundValue")) {
			resultList.add(((IfcPropertyBoundedValue) object).getLowerBoundValue());
			 //1IfcValue
		}
		else if (string.equals("Unit")) {
			resultList.add(((IfcPropertyBoundedValue) object).getUnit());
			 //1IfcUnit
		}
		else if (string.equals("PropertyForDependance")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyBoundedValue) object).getPropertyForDependance().size(); i++) {
				resultList.add(((IfcPropertyBoundedValue) object).getPropertyForDependance().get(i));
			}
			 //3EList
		}
		else if (string.equals("PartOfComplex")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyBoundedValue) object).getPartOfComplex().size(); i++) {
				resultList.add(((IfcPropertyBoundedValue) object).getPartOfComplex().get(i));
			}
			 //3EList
		}
		else if (string.equals("PropertyDependsOn")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyBoundedValue) object).getPropertyDependsOn().size(); i++) {
				resultList.add(((IfcPropertyBoundedValue) object).getPropertyDependsOn().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPropertyBoundedValue) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPropertyBoundedValue) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
