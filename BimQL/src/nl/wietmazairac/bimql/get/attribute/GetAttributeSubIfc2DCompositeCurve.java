package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.Ifc2DCompositeCurve;

public class GetAttributeSubIfc2DCompositeCurve {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfc2DCompositeCurve(Object object, String string) {
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
			for (int i = 0; i < ((Ifc2DCompositeCurve) object).getSegments().size(); i++) {
				resultList.add(((Ifc2DCompositeCurve) object).getSegments().get(i));
			}
			 //2EList
		}
		else if (string.equals("Dim")) {
			resultList.add(((Ifc2DCompositeCurve) object).getDim());
			 //3int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((Ifc2DCompositeCurve) object).getStyledByItem().size(); i++) {
				resultList.add(((Ifc2DCompositeCurve) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((Ifc2DCompositeCurve) object).getLayerAssignments().size(); i++) {
				resultList.add(((Ifc2DCompositeCurve) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
