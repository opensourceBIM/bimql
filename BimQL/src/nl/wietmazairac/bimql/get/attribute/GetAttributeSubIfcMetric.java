package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcMetric;

public class GetAttributeSubIfcMetric {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMetric(Object object, String string) {
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
		if (string.equals("Benchmark")) {
			resultList.add(((IfcMetric) object).getBenchmark());
			 //1IfcBenchmarkEnum
		}
		else if (string.equals("DataValue")) {
			resultList.add(((IfcMetric) object).getDataValue());
			 //1IfcMetricValueSelect
		}
		else if (string.equals("ValueSource")) {
			resultList.add(((IfcMetric) object).getValueSource());
			 //1String
		}
		return resultList;
	}
}
