package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTextureMap;

public class GetAttributeSubIfcTextureMap {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTextureMap(Object object, String string) {
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
		if (string.equals("TextureMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcTextureMap) object).getTextureMaps().size(); i++) {
				resultList.add(((IfcTextureMap) object).getTextureMaps().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
