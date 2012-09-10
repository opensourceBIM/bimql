package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPhysicalComplexQuantity;

public class GetAttributeSubIfcPhysicalComplexQuantity {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPhysicalComplexQuantity(Object object, String string) {
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
		if (string.equals("HasQuantities")) {
			//3xxx
			for (int i = 0; i < ((IfcPhysicalComplexQuantity) object).getHasQuantities().size(); i++) {
				resultList.add(((IfcPhysicalComplexQuantity) object).getHasQuantities().get(i));
			}
			 //1EList
		}
		else if (string.equals("Discrimination")) {
			resultList.add(((IfcPhysicalComplexQuantity) object).getDiscrimination());
			 //1String
		}
		else if (string.equals("Quality")) {
			resultList.add(((IfcPhysicalComplexQuantity) object).getQuality());
			 //1String
		}
		else if (string.equals("Usage")) {
			resultList.add(((IfcPhysicalComplexQuantity) object).getUsage());
			 //1String
		}
		return resultList;
	}
}
