package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcFacetedBrepWithVoids;

public class GetAttributeSubIfcFacetedBrepWithVoids {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFacetedBrepWithVoids(Object object, String string) {
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
		if (string.equals("Voids")) {
			//3xxx
			for (int i = 0; i < ((IfcFacetedBrepWithVoids) object).getVoids().size(); i++) {
				resultList.add(((IfcFacetedBrepWithVoids) object).getVoids().get(i));
			}
			 //1EList
		}
		else if (string.equals("Outer")) {
			resultList.add(((IfcFacetedBrepWithVoids) object).getOuter());
			 //2IfcClosedShell
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcFacetedBrepWithVoids) object).getDim());
			 //3int
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcFacetedBrepWithVoids) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcFacetedBrepWithVoids) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFacetedBrepWithVoids) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcFacetedBrepWithVoids) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
