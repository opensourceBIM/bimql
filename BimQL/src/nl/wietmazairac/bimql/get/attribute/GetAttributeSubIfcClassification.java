package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcClassification {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcClassification(Object object, String string) {
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
		if (string.equals("Edition")) {
			resultList.add(((IfcClassification) object).getEdition());
			 //1String
		}
		else if (string.equals("Contains")) {
			//3xxx
			for (int i = 0; i < ((IfcClassification) object).getContains().size(); i++) {
				resultList.add(((IfcClassification) object).getContains().get(i));
			}
			 //1EList
		}
		else if (string.equals("EditionDate")) {
			resultList.add(((IfcClassification) object).getEditionDate());
			 //1IfcCalendarDate
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcClassification) object).getName());
			 //1String
		}
		else if (string.equals("Source")) {
			resultList.add(((IfcClassification) object).getSource());
			 //1String
		}
		return resultList;
	}
}
