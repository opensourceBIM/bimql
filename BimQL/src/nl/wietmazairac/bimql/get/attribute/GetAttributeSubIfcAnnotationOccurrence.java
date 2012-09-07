package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcAnnotationOccurrence {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAnnotationOccurrence(Object object, String string) {
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
			for (int i = 0; i < ((IfcAnnotationOccurrence) object).getStyles().size(); i++) {
				resultList.add(((IfcAnnotationOccurrence) object).getStyles().get(i));
			}
			 //2EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcAnnotationOccurrence) object).getName());
			 //2String
		}
		else if (string.equals("Item")) {
			resultList.add(((IfcAnnotationOccurrence) object).getItem());
			 //2IfcRepresentationItem
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotationOccurrence) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcAnnotationOccurrence) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotationOccurrence) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcAnnotationOccurrence) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
