package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcAddress;

public class GetAttributeSubIfcAddress {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAddress(Object object, String string) {
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
		if (string.equals("Purpose")) {
			resultList.add(((IfcAddress) object).getPurpose());
			 //1IfcAddressTypeEnum
		}
		else if (string.equals("OfPerson")) {
			//3xxx
			for (int i = 0; i < ((IfcAddress) object).getOfPerson().size(); i++) {
				resultList.add(((IfcAddress) object).getOfPerson().get(i));
			}
			 //1EList
		}
		else if (string.equals("UserDefinedPurpose")) {
			resultList.add(((IfcAddress) object).getUserDefinedPurpose());
			 //1String
		}
		else if (string.equals("OfOrganization")) {
			//3xxx
			for (int i = 0; i < ((IfcAddress) object).getOfOrganization().size(); i++) {
				resultList.add(((IfcAddress) object).getOfOrganization().get(i));
			}
			 //1EList
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcAddress) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
