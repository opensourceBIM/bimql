package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcStyledRepresentation {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStyledRepresentation(Object object, String string) {
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
		if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStyledRepresentation) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcStyledRepresentation) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("RepresentationIdentifier")) {
			resultList.add(((IfcStyledRepresentation) object).getRepresentationIdentifier());
			 //3String
		}
		else if (string.equals("RepresentationType")) {
			resultList.add(((IfcStyledRepresentation) object).getRepresentationType());
			 //3String
		}
		else if (string.equals("OfProductRepresentation")) {
			//3xxx
			for (int i = 0; i < ((IfcStyledRepresentation) object).getOfProductRepresentation().size(); i++) {
				resultList.add(((IfcStyledRepresentation) object).getOfProductRepresentation().get(i));
			}
			 //3EList
		}
		else if (string.equals("Items")) {
			//3xxx
			for (int i = 0; i < ((IfcStyledRepresentation) object).getItems().size(); i++) {
				resultList.add(((IfcStyledRepresentation) object).getItems().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContextOfItems")) {
			resultList.add(((IfcStyledRepresentation) object).getContextOfItems());
			 //3IfcRepresentationContext
		}
		else if (string.equals("RepresentationMap")) {
			//3xxx
			for (int i = 0; i < ((IfcStyledRepresentation) object).getRepresentationMap().size(); i++) {
				resultList.add(((IfcStyledRepresentation) object).getRepresentationMap().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
