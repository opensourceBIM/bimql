package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCompositeCurve;

public class GetAttributeSubIfcCompositeCurve {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCompositeCurve(Object object, String string) {
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
		if (string.equals("Segments")) {
			//3xxx
			for (int i = 0; i < ((IfcCompositeCurve) object).getSegments().size(); i++) {
				resultList.add(((IfcCompositeCurve) object).getSegments().get(i));
			}
			 //1EList
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcCompositeCurve) object).getDim());
			 //3int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcCompositeCurve) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcCompositeCurve) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCompositeCurve) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcCompositeCurve) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
