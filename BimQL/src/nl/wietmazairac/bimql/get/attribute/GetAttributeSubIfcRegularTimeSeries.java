package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRegularTimeSeries;

public class GetAttributeSubIfcRegularTimeSeries {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRegularTimeSeries(Object object, String string) {
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
		if (string.equals("TimeStep")) {
			resultList.add(((IfcRegularTimeSeries) object).getTimeStep());
			 //1double
		}
		else if (string.equals("TimeStepAsString")) {
			resultList.add(((IfcRegularTimeSeries) object).getTimeStepAsString());
			 //1String
		}
		else if (string.equals("Values")) {
			//3xxx
			for (int i = 0; i < ((IfcRegularTimeSeries) object).getValues().size(); i++) {
				resultList.add(((IfcRegularTimeSeries) object).getValues().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
