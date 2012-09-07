package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcProperty {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProperty(Object object, String string) {
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
		if (string.equals("PropertyForDependance")) {
			//3xxx
			for (int i = 0; i < ((IfcProperty) object).getPropertyForDependance().size(); i++) {
				resultList.add(((IfcProperty) object).getPropertyForDependance().get(i));
			}
			 //1EList
		}
		else if (string.equals("PartOfComplex")) {
			//3xxx
			for (int i = 0; i < ((IfcProperty) object).getPartOfComplex().size(); i++) {
				resultList.add(((IfcProperty) object).getPartOfComplex().get(i));
			}
			 //1EList
		}
		else if (string.equals("PropertyDependsOn")) {
			//3xxx
			for (int i = 0; i < ((IfcProperty) object).getPropertyDependsOn().size(); i++) {
				resultList.add(((IfcProperty) object).getPropertyDependsOn().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcProperty) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcProperty) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
