package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcFaceSurface;

public class GetAttributeSubIfcFaceSurface {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFaceSurface(Object object, String string) {
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
		if (string.equals("FaceSurface")) {
			resultList.add(((IfcFaceSurface) object).getFaceSurface());
			 //1IfcSurface
		}
		else if (string.equals("SameSense")) {
			resultList.add(((IfcFaceSurface) object).getSameSense());
			 //1Tristate
		}
		else if (string.equals("Bounds")) {
			//3xxx
			for (int i = 0; i < ((IfcFaceSurface) object).getBounds().size(); i++) {
				resultList.add(((IfcFaceSurface) object).getBounds().get(i));
			}
			 //2EList
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcFaceSurface) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcFaceSurface) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFaceSurface) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcFaceSurface) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
