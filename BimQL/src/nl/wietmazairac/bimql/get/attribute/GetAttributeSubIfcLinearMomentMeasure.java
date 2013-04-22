package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcLinearMomentMeasure;

public class GetAttributeSubIfcLinearMomentMeasure {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLinearMomentMeasure(Object object, String string) {
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
			resultList.add(((IfcLinearMomentMeasure) object));
			 //1double
		}
		else if (string.equals("WrappedValueAsString")) {
			resultList.add(((IfcLinearMomentMeasure) object).getWrappedValueAsString());
			 //1String
		}
		return resultList;
	}
}
