package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcVertexBasedTextureMap {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcVertexBasedTextureMap(Object object, String string) {
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
		if (string.equals("TextureVertices")) {
			//3xxx
			for (int i = 0; i < ((IfcVertexBasedTextureMap) object).getTextureVertices().size(); i++) {
				resultList.add(((IfcVertexBasedTextureMap) object).getTextureVertices().get(i));
			}
			 //1EList
		}
		else if (string.equals("TexturePoints")) {
			//3xxx
			for (int i = 0; i < ((IfcVertexBasedTextureMap) object).getTexturePoints().size(); i++) {
				resultList.add(((IfcVertexBasedTextureMap) object).getTexturePoints().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
