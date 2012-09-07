package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcSoundPowerMeasure {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSoundPowerMeasure(Object object, String string) {
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
		if (string.equals("WrappedValue")) {
			resultList.add(((IfcSoundPowerMeasure) object).getWrappedValue());
			 //1double
		}
		else if (string.equals("WrappedValueAsString")) {
			resultList.add(((IfcSoundPowerMeasure) object).getWrappedValueAsString());
			 //1String
		}
		return resultList;
	}
}
