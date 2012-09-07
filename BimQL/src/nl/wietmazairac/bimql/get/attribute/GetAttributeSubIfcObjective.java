package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcObjective {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcObjective(Object object, String string) {
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
		if (string.equals("ObjectiveQualifier")) {
			resultList.add(((IfcObjective) object).getObjectiveQualifier());
			 //1IfcObjectiveEnum
		}
		else if (string.equals("UserDefinedQualifier")) {
			resultList.add(((IfcObjective) object).getUserDefinedQualifier());
			 //1String
		}
		else if (string.equals("BenchmarkValues")) {
			resultList.add(((IfcObjective) object).getBenchmarkValues());
			 //1IfcMetric
		}
		else if (string.equals("ResultValues")) {
			resultList.add(((IfcObjective) object).getResultValues());
			 //1IfcMetric
		}
		return resultList;
	}
}
