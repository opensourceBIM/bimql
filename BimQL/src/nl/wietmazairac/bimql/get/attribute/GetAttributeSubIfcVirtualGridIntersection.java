package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcVirtualGridIntersection;

public class GetAttributeSubIfcVirtualGridIntersection {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcVirtualGridIntersection(Object object, String string) {
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
		if (string.equals("IntersectingAxes")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualGridIntersection) object).getIntersectingAxes().size(); i++) {
				resultList.add(((IfcVirtualGridIntersection) object).getIntersectingAxes().get(i));
			}
			 //1EList
		}
		else if (string.equals("OffsetDistances")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualGridIntersection) object).getOffsetDistances().size(); i++) {
				resultList.add(((IfcVirtualGridIntersection) object).getOffsetDistances().get(i));
			}
			 //1EList
		}
		else if (string.equals("OffsetDistancesAsString")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualGridIntersection) object).getOffsetDistancesAsString().size(); i++) {
				resultList.add(((IfcVirtualGridIntersection) object).getOffsetDistancesAsString().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
