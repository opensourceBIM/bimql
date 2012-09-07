package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcTextStyleFontModel {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTextStyleFontModel(Object object, String string) {
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
		if (string.equals("FontStyle")) {
			resultList.add(((IfcTextStyleFontModel) object).getFontStyle());
			 //1String
		}
		else if (string.equals("FontVariant")) {
			resultList.add(((IfcTextStyleFontModel) object).getFontVariant());
			 //1String
		}
		else if (string.equals("FontWeight")) {
			resultList.add(((IfcTextStyleFontModel) object).getFontWeight());
			 //1String
		}
		else if (string.equals("FontFamily")) {
			//3xxx
			for (int i = 0; i < ((IfcTextStyleFontModel) object).getFontFamily().size(); i++) {
				resultList.add(((IfcTextStyleFontModel) object).getFontFamily().get(i));
			}
			 //1EList
		}
		else if (string.equals("FontSize")) {
			resultList.add(((IfcTextStyleFontModel) object).getFontSize());
			 //1IfcSizeSelect
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcTextStyleFontModel) object).getName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
