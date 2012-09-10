package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcStyledItem;

public class GetAttributeSubIfcStyledItem {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStyledItem(Object object, String string) {
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
		if (string.equals("Styles")) {
			//3xxx
			for (int i = 0; i < ((IfcStyledItem) object).getStyles().size(); i++) {
				resultList.add(((IfcStyledItem) object).getStyles().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStyledItem) object).getName());
			 //1String
		}
		else if (string.equals("Item")) {
			resultList.add(((IfcStyledItem) object).getItem());
			 //1IfcRepresentationItem
		}
		return resultList;
	}
}
