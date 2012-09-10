package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcAnnotationFillAreaOccurrence;

public class GetAttributeSubIfcAnnotationFillAreaOccurrence {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAnnotationFillAreaOccurrence(Object object, String string) {
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
		if (string.equals("GlobalOrLocal")) {
			resultList.add(((IfcAnnotationFillAreaOccurrence) object).getGlobalOrLocal());
			 //1IfcGlobalOrLocalEnum
		}
		else if (string.equals("FillStyleTarget")) {
			resultList.add(((IfcAnnotationFillAreaOccurrence) object).getFillStyleTarget());
			 //1IfcPoint
		}
		else if (string.equals("Styles")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotationFillAreaOccurrence) object).getStyles().size(); i++) {
				resultList.add(((IfcAnnotationFillAreaOccurrence) object).getStyles().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcAnnotationFillAreaOccurrence) object).getName());
			 //3String
		}
		else if (string.equals("Item")) {
			resultList.add(((IfcAnnotationFillAreaOccurrence) object).getItem());
			 //3IfcRepresentationItem
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotationFillAreaOccurrence) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcAnnotationFillAreaOccurrence) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotationFillAreaOccurrence) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcAnnotationFillAreaOccurrence) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
