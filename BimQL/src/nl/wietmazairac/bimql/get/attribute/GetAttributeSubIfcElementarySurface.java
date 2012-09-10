package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcElementarySurface;

public class GetAttributeSubIfcElementarySurface {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcElementarySurface(Object object, String string) {
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
		if (string.equals("Dim")) {
			resultList.add(((IfcElementarySurface) object).getDim());
			 //1int
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcElementarySurface) object).getPosition());
			 //1IfcAxis2Placement3D
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcElementarySurface) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcElementarySurface) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcElementarySurface) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcElementarySurface) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
