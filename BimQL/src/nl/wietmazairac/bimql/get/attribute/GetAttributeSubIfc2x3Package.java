package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;

public class GetAttributeSubIfc2x3Package {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfc2x3Package(Object object, String string) {
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
		resultList.add(((Ifc2x3tc1Package)object).getEClassifier(string));
		return resultList;
	}
}
