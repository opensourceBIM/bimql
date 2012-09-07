package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcPostalAddress {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPostalAddress(Object object, String string) {
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
		if (string.equals("PostalBox")) {
			resultList.add(((IfcPostalAddress) object).getPostalBox());
			 //1String
		}
		else if (string.equals("Town")) {
			resultList.add(((IfcPostalAddress) object).getTown());
			 //1String
		}
		else if (string.equals("InternalLocation")) {
			resultList.add(((IfcPostalAddress) object).getInternalLocation());
			 //1String
		}
		else if (string.equals("AddressLines")) {
			//3xxx
			for (int i = 0; i < ((IfcPostalAddress) object).getAddressLines().size(); i++) {
				resultList.add(((IfcPostalAddress) object).getAddressLines().get(i));
			}
			 //1EList
		}
		else if (string.equals("PostalCode")) {
			resultList.add(((IfcPostalAddress) object).getPostalCode());
			 //1String
		}
		else if (string.equals("Country")) {
			resultList.add(((IfcPostalAddress) object).getCountry());
			 //1String
		}
		else if (string.equals("Region")) {
			resultList.add(((IfcPostalAddress) object).getRegion());
			 //1String
		}
		return resultList;
	}
}
