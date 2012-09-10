package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTerminatorSymbol;

public class GetAttributeSubIfcTerminatorSymbol {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTerminatorSymbol(Object object, String string) {
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
		if (string.equals("AnnotatedCurve")) {
			resultList.add(((IfcTerminatorSymbol) object).getAnnotatedCurve());
			 //1IfcAnnotationCurveOccurrence
		}
		else if (string.equals("Styles")) {
			//3xxx
			for (int i = 0; i < ((IfcTerminatorSymbol) object).getStyles().size(); i++) {
				resultList.add(((IfcTerminatorSymbol) object).getStyles().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcTerminatorSymbol) object).getName());
			 //3String
		}
		else if (string.equals("Item")) {
			resultList.add(((IfcTerminatorSymbol) object).getItem());
			 //3IfcRepresentationItem
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcTerminatorSymbol) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcTerminatorSymbol) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTerminatorSymbol) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcTerminatorSymbol) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
