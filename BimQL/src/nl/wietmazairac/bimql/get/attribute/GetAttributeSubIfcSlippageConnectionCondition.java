package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcSlippageConnectionCondition {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSlippageConnectionCondition(Object object, String string) {
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
		if (string.equals("SlippageX")) {
			resultList.add(((IfcSlippageConnectionCondition) object).getSlippageX());
			 //1double
		}
		else if (string.equals("SlippageY")) {
			resultList.add(((IfcSlippageConnectionCondition) object).getSlippageY());
			 //1double
		}
		else if (string.equals("SlippageZ")) {
			resultList.add(((IfcSlippageConnectionCondition) object).getSlippageZ());
			 //1double
		}
		else if (string.equals("SlippageXAsString")) {
			resultList.add(((IfcSlippageConnectionCondition) object).getSlippageXAsString());
			 //1String
		}
		else if (string.equals("SlippageYAsString")) {
			resultList.add(((IfcSlippageConnectionCondition) object).getSlippageYAsString());
			 //1String
		}
		else if (string.equals("SlippageZAsString")) {
			resultList.add(((IfcSlippageConnectionCondition) object).getSlippageZAsString());
			 //1String
		}
		return resultList;
	}
}
