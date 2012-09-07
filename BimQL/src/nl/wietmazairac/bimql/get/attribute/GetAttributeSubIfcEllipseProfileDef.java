package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcEllipseProfileDef {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcEllipseProfileDef(Object object, String string) {
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
		if (string.equals("SemiAxis1AsString")) {
			resultList.add(((IfcEllipseProfileDef) object).getSemiAxis1AsString());
			 //1String
		}
		else if (string.equals("SemiAxis2AsString")) {
			resultList.add(((IfcEllipseProfileDef) object).getSemiAxis2AsString());
			 //1String
		}
		else if (string.equals("SemiAxis1")) {
			resultList.add(((IfcEllipseProfileDef) object).getSemiAxis1());
			 //1double
		}
		else if (string.equals("SemiAxis2")) {
			resultList.add(((IfcEllipseProfileDef) object).getSemiAxis2());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcEllipseProfileDef) object).getPosition());
			 //2IfcAxis2Placement2D
		}
		else if (string.equals("ProfileType")) {
			resultList.add(((IfcEllipseProfileDef) object).getProfileType());
			 //3IfcProfileTypeEnum
		}
		else if (string.equals("ProfileName")) {
			resultList.add(((IfcEllipseProfileDef) object).getProfileName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
