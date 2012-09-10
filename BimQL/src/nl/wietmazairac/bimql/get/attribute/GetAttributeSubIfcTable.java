package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTable;

public class GetAttributeSubIfcTable {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTable(Object object, String string) {
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
		if (string.equals("Name")) {
			resultList.add(((IfcTable) object).getName());
			 //1String
		}
		else if (string.equals("Rows")) {
			//3xxx
			for (int i = 0; i < ((IfcTable) object).getRows().size(); i++) {
				resultList.add(((IfcTable) object).getRows().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
