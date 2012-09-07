package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcLocalTime {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLocalTime(Object object, String string) {
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
		if (string.equals("SecondComponentAsString")) {
			resultList.add(((IfcLocalTime) object).getSecondComponentAsString());
			 //1String
		}
		else if (string.equals("DaylightSavingOffset")) {
			resultList.add(((IfcLocalTime) object).getDaylightSavingOffset());
			 //1int
		}
		else if (string.equals("HourComponent")) {
			resultList.add(((IfcLocalTime) object).getHourComponent());
			 //1int
		}
		else if (string.equals("MinuteComponent")) {
			resultList.add(((IfcLocalTime) object).getMinuteComponent());
			 //1int
		}
		else if (string.equals("SecondComponent")) {
			resultList.add(((IfcLocalTime) object).getSecondComponent());
			 //1double
		}
		else if (string.equals("Zone")) {
			resultList.add(((IfcLocalTime) object).getZone());
			 //1IfcCoordinatedUniversalTimeOffset
		}
		return resultList;
	}
}
