package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcGridPlacement;

public class GetAttributeSubIfcGridPlacement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcGridPlacement(Object object, String string) {
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
		if (string.equals("PlacementRefDirection")) {
			resultList.add(((IfcGridPlacement) object).getPlacementRefDirection());
			 //1IfcVirtualGridIntersection
		}
		else if (string.equals("PlacementLocation")) {
			resultList.add(((IfcGridPlacement) object).getPlacementLocation());
			 //1IfcVirtualGridIntersection
		}
		return resultList;
	}
}
