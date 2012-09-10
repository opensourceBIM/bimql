package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDimensionCurve;

public class GetAttributeSubIfcDimensionCurve {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDimensionCurve(Object object, String string) {
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
		if (string.equals("AnnotatedBySymbols")) {
			//3xxx
			for (int i = 0; i < ((IfcDimensionCurve) object).getAnnotatedBySymbols().size(); i++) {
				resultList.add(((IfcDimensionCurve) object).getAnnotatedBySymbols().get(i));
			}
			 //1EList
		}
		else if (string.equals("Styles")) {
			//3xxx
			for (int i = 0; i < ((IfcDimensionCurve) object).getStyles().size(); i++) {
				resultList.add(((IfcDimensionCurve) object).getStyles().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDimensionCurve) object).getName());
			 //3String
		}
		else if (string.equals("Item")) {
			resultList.add(((IfcDimensionCurve) object).getItem());
			 //3IfcRepresentationItem
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcDimensionCurve) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcDimensionCurve) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDimensionCurve) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcDimensionCurve) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
