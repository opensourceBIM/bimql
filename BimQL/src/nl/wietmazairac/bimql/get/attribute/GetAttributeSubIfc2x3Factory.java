package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfc2x3Factory {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfc2x3Factory(Object object, String string) {
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
		if (string.equals("Ifc2x3Package")) {
			resultList.add(((Ifc2x3Factory) object).getIfc2x3Package());
			 //1Ifc2x3Package
		}
		else if (string.equals("Package")) {
			resultList.add(((Ifc2x3Factory) object).getPackage());
			 //1Ifc2x3Package
		}
		return resultList;
	}
}
