package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcSurfaceStyleWithTextures;

public class GetAttributeSubIfcSurfaceStyleWithTextures {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSurfaceStyleWithTextures(Object object, String string) {
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
		if (string.equals("Textures")) {
			//3xxx
			for (int i = 0; i < ((IfcSurfaceStyleWithTextures) object).getTextures().size(); i++) {
				resultList.add(((IfcSurfaceStyleWithTextures) object).getTextures().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
