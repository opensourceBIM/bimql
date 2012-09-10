package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcAnnotationSurface;

public class GetAttributeSubIfcAnnotationSurface {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAnnotationSurface(Object object, String string) {
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
		if (string.equals("TextureCoordinates")) {
			resultList.add(((IfcAnnotationSurface) object).getTextureCoordinates());
			 //1IfcTextureCoordinate
		}
		else if (string.equals("Item")) {
			resultList.add(((IfcAnnotationSurface) object).getItem());
			 //1IfcGeometricRepresentationItem
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotationSurface) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcAnnotationSurface) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcAnnotationSurface) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcAnnotationSurface) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
