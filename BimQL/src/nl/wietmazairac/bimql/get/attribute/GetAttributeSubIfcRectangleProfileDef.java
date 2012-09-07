package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRectangleProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRectangleProfileDef(Object object, String string) {
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
		if (string.equals("XDimAsString")) {
			resultList.add(((IfcRectangleProfileDef) object).getXDimAsString());
			 //1String
		}
		else if (string.equals("YDimAsString")) {
			resultList.add(((IfcRectangleProfileDef) object).getYDimAsString());
			 //1String
		}
		else if (string.equals("XDim")) {
			resultList.add(((IfcRectangleProfileDef) object).getXDim());
			 //1double
		}
		else if (string.equals("YDim")) {
			resultList.add(((IfcRectangleProfileDef) object).getYDim());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcRectangleProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcRectangleProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcRectangleProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
