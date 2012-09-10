package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPerson;

public class GetAttributeSubIfcPerson {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPerson(Object object, String string) {
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
		if (string.equals("GivenName")) {
			resultList.add(((IfcPerson) object).getGivenName());
			 //1String
		}
		else if (string.equals("EngagedIn")) {
			//3xxx
			for (int i = 0; i < ((IfcPerson) object).getEngagedIn().size(); i++) {
				resultList.add(((IfcPerson) object).getEngagedIn().get(i));
			}
			 //1EList
		}
		else if (string.equals("MiddleNames")) {
			//3xxx
			for (int i = 0; i < ((IfcPerson) object).getMiddleNames().size(); i++) {
				resultList.add(((IfcPerson) object).getMiddleNames().get(i));
			}
			 //1EList
		}
		else if (string.equals("PrefixTitles")) {
			//3xxx
			for (int i = 0; i < ((IfcPerson) object).getPrefixTitles().size(); i++) {
				resultList.add(((IfcPerson) object).getPrefixTitles().get(i));
			}
			 //1EList
		}
		else if (string.equals("SuffixTitles")) {
			//3xxx
			for (int i = 0; i < ((IfcPerson) object).getSuffixTitles().size(); i++) {
				resultList.add(((IfcPerson) object).getSuffixTitles().get(i));
			}
			 //1EList
		}
		else if (string.equals("Roles")) {
			//3xxx
			for (int i = 0; i < ((IfcPerson) object).getRoles().size(); i++) {
				resultList.add(((IfcPerson) object).getRoles().get(i));
			}
			 //1EList
		}
		else if (string.equals("Addresses")) {
			//3xxx
			for (int i = 0; i < ((IfcPerson) object).getAddresses().size(); i++) {
				resultList.add(((IfcPerson) object).getAddresses().get(i));
			}
			 //1EList
		}
		else if (string.equals("Id")) {
			resultList.add(((IfcPerson) object).getId());
			 //1String
		}
		else if (string.equals("FamilyName")) {
			resultList.add(((IfcPerson) object).getFamilyName());
			 //1String
		}
		return resultList;
	}
}
