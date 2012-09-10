package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCircle;

public class GetAttributeSubIfcCircle {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCircle(Object object, String string) {
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
		if (string.equals("RadiusAsString")) {
			resultList.add(((IfcCircle) object).getRadiusAsString());
			 //1String
		}
		else if (string.equals("Radius")) {
			resultList.add(((IfcCircle) object).getRadius());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcCircle) object).getPosition());
			 //2IfcAxis2Placement
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcCircle) object).getDim());
			 //3int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcCircle) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcCircle) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCircle) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcCircle) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
