package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcStructuralLoadSingleDisplacementDistortion {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralLoadSingleDisplacementDistortion(Object object, String string) {
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
		if (string.equals("DistortionAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDistortionAsString());
			 //1String
		}
		else if (string.equals("Distortion")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDistortion());
			 //1double
		}
		else if (string.equals("RotationalDisplacementRXAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getRotationalDisplacementRXAsString());
			 //2String
		}
		else if (string.equals("RotationalDisplacementRYAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getRotationalDisplacementRYAsString());
			 //2String
		}
		else if (string.equals("RotationalDisplacementRZAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getRotationalDisplacementRZAsString());
			 //2String
		}
		else if (string.equals("DisplacementXAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDisplacementXAsString());
			 //2String
		}
		else if (string.equals("DisplacementYAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDisplacementYAsString());
			 //2String
		}
		else if (string.equals("DisplacementX")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDisplacementX());
			 //2double
		}
		else if (string.equals("DisplacementY")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDisplacementY());
			 //2double
		}
		else if (string.equals("DisplacementZ")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDisplacementZ());
			 //2double
		}
		else if (string.equals("DisplacementZAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getDisplacementZAsString());
			 //2String
		}
		else if (string.equals("RotationalDisplacementRX")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getRotationalDisplacementRX());
			 //2double
		}
		else if (string.equals("RotationalDisplacementRY")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getRotationalDisplacementRY());
			 //2double
		}
		else if (string.equals("RotationalDisplacementRZ")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getRotationalDisplacementRZ());
			 //2double
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralLoadSingleDisplacementDistortion) object).getName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
