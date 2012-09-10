package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTopologyRepresentation;

public class GetAttributeSubIfcTopologyRepresentation {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTopologyRepresentation(Object object, String string) {
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
		if (string.equals("OfShapeAspect")) {
			//3xxx
			for (int i = 0; i < ((IfcTopologyRepresentation) object).getOfShapeAspect().size(); i++) {
				resultList.add(((IfcTopologyRepresentation) object).getOfShapeAspect().get(i));
			}
			 //2EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTopologyRepresentation) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcTopologyRepresentation) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("RepresentationIdentifier")) {
			resultList.add(((IfcTopologyRepresentation) object).getRepresentationIdentifier());
			 //3String
		}
		else if (string.equals("RepresentationType")) {
			resultList.add(((IfcTopologyRepresentation) object).getRepresentationType());
			 //3String
		}
		else if (string.equals("OfProductRepresentation")) {
			//3xxx
			for (int i = 0; i < ((IfcTopologyRepresentation) object).getOfProductRepresentation().size(); i++) {
				resultList.add(((IfcTopologyRepresentation) object).getOfProductRepresentation().get(i));
			}
			 //3EList
		}
		else if (string.equals("Items")) {
			//3xxx
			for (int i = 0; i < ((IfcTopologyRepresentation) object).getItems().size(); i++) {
				resultList.add(((IfcTopologyRepresentation) object).getItems().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContextOfItems")) {
			resultList.add(((IfcTopologyRepresentation) object).getContextOfItems());
			 //3IfcRepresentationContext
		}
		else if (string.equals("RepresentationMap")) {
			//3xxx
			for (int i = 0; i < ((IfcTopologyRepresentation) object).getRepresentationMap().size(); i++) {
				resultList.add(((IfcTopologyRepresentation) object).getRepresentationMap().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
