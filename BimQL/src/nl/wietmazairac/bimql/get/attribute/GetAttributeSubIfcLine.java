package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcLine;

public class GetAttributeSubIfcLine {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLine(Object object, String string) {
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
		if (string.equals("Pnt")) {
			resultList.add(((IfcLine) object).getPnt());
			 //1IfcCartesianPoint
		}
		else if (string.equals("Dir")) {
			resultList.add(((IfcLine) object).getDir());
			 //1IfcVector
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcLine) object).getDim());
			 //2int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcLine) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcLine) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcLine) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcLine) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
