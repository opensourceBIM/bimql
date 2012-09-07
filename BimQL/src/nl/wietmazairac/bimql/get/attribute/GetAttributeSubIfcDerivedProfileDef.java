package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcDerivedProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDerivedProfileDef(Object object, String string) {
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
		if (string.equals("Operator")) {
			resultList.add(((IfcDerivedProfileDef) object).getOperator());
			 //1IfcCartesianTransformationOperator2D
		}
		else if (string.equals("ParentProfile")) {
			resultList.add(((IfcDerivedProfileDef) object).getParentProfile());
			 //1IfcProfileDef
		}
		else if (string.equals("Label")) {
			resultList.add(((IfcDerivedProfileDef) object).getLabel());
			 //1String
		}
		return resultList;
	}
}
