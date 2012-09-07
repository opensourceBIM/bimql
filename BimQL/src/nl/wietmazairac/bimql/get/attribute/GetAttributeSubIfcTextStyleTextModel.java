package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcTextStyleTextModel {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTextStyleTextModel(Object object, String string) {
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
		if (string.equals("TextAlign")) {
			resultList.add(((IfcTextStyleTextModel) object).getTextAlign());
			 //1String
		}
		else if (string.equals("TextIndent")) {
			resultList.add(((IfcTextStyleTextModel) object).getTextIndent());
			 //1IfcSizeSelect
		}
		else if (string.equals("TextDecoration")) {
			resultList.add(((IfcTextStyleTextModel) object).getTextDecoration());
			 //1String
		}
		else if (string.equals("LetterSpacing")) {
			resultList.add(((IfcTextStyleTextModel) object).getLetterSpacing());
			 //1IfcSizeSelect
		}
		else if (string.equals("WordSpacing")) {
			resultList.add(((IfcTextStyleTextModel) object).getWordSpacing());
			 //1IfcSizeSelect
		}
		else if (string.equals("TextTransform")) {
			resultList.add(((IfcTextStyleTextModel) object).getTextTransform());
			 //1String
		}
		else if (string.equals("LineHeight")) {
			resultList.add(((IfcTextStyleTextModel) object).getLineHeight());
			 //1IfcSizeSelect
		}
		return resultList;
	}
}
