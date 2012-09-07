package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcLocalTime {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcLocalTime() {
	}

	public SetAttributeSubIfcLocalTime(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("HourComponent")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("MinuteComponent")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("SecondComponent")) {
			//1NoEList
			((IfcLocalTime) object).setSecondComponent(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("SecondComponentAsString")) {
			//1NoEList
			((IfcLocalTime) object).setSecondComponentAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DaylightSavingOffset")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("Zone")) {
			//1NoEList
			 //1void
			 //1IfcCoordinatedUniversalTimeOffset
		}
	}
}
