package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDocumentElectronicFormat;

public class GetAttributeSubIfcDocumentElectronicFormat {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDocumentElectronicFormat(Object object, String string) {
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
		if (string.equals("FileExtension")) {
			resultList.add(((IfcDocumentElectronicFormat) object).getFileExtension());
			 //1String
		}
		else if (string.equals("MimeContentType")) {
			resultList.add(((IfcDocumentElectronicFormat) object).getMimeContentType());
			 //1String
		}
		else if (string.equals("MimeSubtype")) {
			resultList.add(((IfcDocumentElectronicFormat) object).getMimeSubtype());
			 //1String
		}
		return resultList;
	}
}
