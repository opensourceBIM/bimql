package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcTelecomAddress {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTelecomAddress(Object object, String string) {
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
		if (string.equals("TelephoneNumbers")) {
			//3xxx
			for (int i = 0; i < ((IfcTelecomAddress) object).getTelephoneNumbers().size(); i++) {
				resultList.add(((IfcTelecomAddress) object).getTelephoneNumbers().get(i));
			}
			 //1EList
		}
		else if (string.equals("FacsimileNumbers")) {
			//3xxx
			for (int i = 0; i < ((IfcTelecomAddress) object).getFacsimileNumbers().size(); i++) {
				resultList.add(((IfcTelecomAddress) object).getFacsimileNumbers().get(i));
			}
			 //1EList
		}
		else if (string.equals("PagerNumber")) {
			resultList.add(((IfcTelecomAddress) object).getPagerNumber());
			 //1String
		}
		else if (string.equals("WWWHomePageURL")) {
			resultList.add(((IfcTelecomAddress) object).getWWWHomePageURL());
			 //1String
		}
		else if (string.equals("ElectronicMailAddresses")) {
			//3xxx
			for (int i = 0; i < ((IfcTelecomAddress) object).getElectronicMailAddresses().size(); i++) {
				resultList.add(((IfcTelecomAddress) object).getElectronicMailAddresses().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
