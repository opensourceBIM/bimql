package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPropertyReferenceValue;

public class GetAttributeSubIfcPropertyReferenceValue {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPropertyReferenceValue(Object object, String string) {
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
		if (string.equals("PropertyReference")) {
			resultList.add(((IfcPropertyReferenceValue) object).getPropertyReference());
			 //1IfcObjectReferenceSelect
		}
		else if (string.equals("UsageName")) {
			resultList.add(((IfcPropertyReferenceValue) object).getUsageName());
			 //1String
		}
		else if (string.equals("PropertyForDependance")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyReferenceValue) object).getPropertyForDependance().size(); i++) {
				resultList.add(((IfcPropertyReferenceValue) object).getPropertyForDependance().get(i));
			}
			 //3EList
		}
		else if (string.equals("PartOfComplex")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyReferenceValue) object).getPartOfComplex().size(); i++) {
				resultList.add(((IfcPropertyReferenceValue) object).getPartOfComplex().get(i));
			}
			 //3EList
		}
		else if (string.equals("PropertyDependsOn")) {
			//3xxx
			for (int i = 0; i < ((IfcPropertyReferenceValue) object).getPropertyDependsOn().size(); i++) {
				resultList.add(((IfcPropertyReferenceValue) object).getPropertyDependsOn().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPropertyReferenceValue) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPropertyReferenceValue) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
