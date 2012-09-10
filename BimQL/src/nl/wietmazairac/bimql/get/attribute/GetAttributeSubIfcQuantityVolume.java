package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcQuantityVolume;

public class GetAttributeSubIfcQuantityVolume {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcQuantityVolume(Object object, String string) {
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
		if (string.equals("VolumeValue")) {
			resultList.add(((IfcQuantityVolume) object).getVolumeValue());
			 //1double
		}
		else if (string.equals("VolumeValueAsString")) {
			resultList.add(((IfcQuantityVolume) object).getVolumeValueAsString());
			 //1String
		}
		else if (string.equals("Unit")) {
			resultList.add(((IfcQuantityVolume) object).getUnit());
			 //2IfcNamedUnit
		}
		else if (string.equals("PartOfComplex")) {
			//3xxx
			for (int i = 0; i < ((IfcQuantityVolume) object).getPartOfComplex().size(); i++) {
				resultList.add(((IfcQuantityVolume) object).getPartOfComplex().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcQuantityVolume) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcQuantityVolume) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
