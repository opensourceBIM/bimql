package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDateAndTime;

public class GetAttributeSubIfcDateAndTime {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDateAndTime(Object object, String string) {
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
		if (string.equals("DateComponent")) {
			resultList.add(((IfcDateAndTime) object).getDateComponent());
			 //1IfcCalendarDate
		}
		else if (string.equals("TimeComponent")) {
			resultList.add(((IfcDateAndTime) object).getTimeComponent());
			 //1IfcLocalTime
		}
		return resultList;
	}
}
