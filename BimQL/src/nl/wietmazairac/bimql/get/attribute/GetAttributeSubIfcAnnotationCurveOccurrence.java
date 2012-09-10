package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcAnnotationCurveOccurrence;

public class GetAttributeSubIfcAnnotationCurveOccurrence {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAnnotationCurveOccurrence(Object object, String string) {
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
		if (string.equals("Styles")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotationCurveOccurrence) object).getStyles().size(); i++) {
				resultList.add(((IfcAnnotationCurveOccurrence) object).getStyles().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcAnnotationCurveOccurrence) object).getName());
			 //3String
		}
		else if (string.equals("Item")) {
			resultList.add(((IfcAnnotationCurveOccurrence) object).getItem());
			 //3IfcRepresentationItem
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotationCurveOccurrence) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcAnnotationCurveOccurrence) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotationCurveOccurrence) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcAnnotationCurveOccurrence) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
