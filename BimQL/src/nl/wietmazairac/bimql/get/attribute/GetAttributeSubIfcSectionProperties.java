package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcSectionProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSectionProperties(Object object, String string) {
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
		if (string.equals("SectionType")) {
			resultList.add(((IfcSectionProperties) object).getSectionType());
			 //1IfcSectionTypeEnum
		}
		else if (string.equals("StartProfile")) {
			resultList.add(((IfcSectionProperties) object).getStartProfile());
			 //1IfcProfileDef
		}
		else if (string.equals("EndProfile")) {
			resultList.add(((IfcSectionProperties) object).getEndProfile());
			 //1IfcProfileDef
		}
		return resultList;
	}
}
