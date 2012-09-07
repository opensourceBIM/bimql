package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcSurfaceTexture {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSurfaceTexture(Object object, String string) {
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
		if (string.equals("TextureType")) {
			resultList.add(((IfcSurfaceTexture) object).getTextureType());
			 //1IfcSurfaceTextureEnum
		}
		else if (string.equals("TextureTransform")) {
			resultList.add(((IfcSurfaceTexture) object).getTextureTransform());
			 //1IfcCartesianTransformationOperator2D
		}
		else if (string.equals("RepeatS")) {
			resultList.add(((IfcSurfaceTexture) object).getRepeatS());
			 //1Tristate
		}
		else if (string.equals("RepeatT")) {
			resultList.add(((IfcSurfaceTexture) object).getRepeatT());
			 //1Tristate
		}
		return resultList;
	}
}
