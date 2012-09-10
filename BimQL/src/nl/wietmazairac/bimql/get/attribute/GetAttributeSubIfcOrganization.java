package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcOrganization;

public class GetAttributeSubIfcOrganization {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcOrganization(Object object, String string) {
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
		if (string.equals("IsRelatedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcOrganization) object).getIsRelatedBy().size(); i++) {
				resultList.add(((IfcOrganization) object).getIsRelatedBy().get(i));
			}
			 //1EList
		}
		else if (string.equals("Roles")) {
			//3xxx
			for (int i = 0; i < ((IfcOrganization) object).getRoles().size(); i++) {
				resultList.add(((IfcOrganization) object).getRoles().get(i));
			}
			 //1EList
		}
		else if (string.equals("Addresses")) {
			//3xxx
			for (int i = 0; i < ((IfcOrganization) object).getAddresses().size(); i++) {
				resultList.add(((IfcOrganization) object).getAddresses().get(i));
			}
			 //1EList
		}
		else if (string.equals("Relates")) {
			//3xxx
			for (int i = 0; i < ((IfcOrganization) object).getRelates().size(); i++) {
				resultList.add(((IfcOrganization) object).getRelates().get(i));
			}
			 //1EList
		}
		else if (string.equals("Engages")) {
			//3xxx
			for (int i = 0; i < ((IfcOrganization) object).getEngages().size(); i++) {
				resultList.add(((IfcOrganization) object).getEngages().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcOrganization) object).getName());
			 //1String
		}
		else if (string.equals("Id")) {
			resultList.add(((IfcOrganization) object).getId());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcOrganization) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
