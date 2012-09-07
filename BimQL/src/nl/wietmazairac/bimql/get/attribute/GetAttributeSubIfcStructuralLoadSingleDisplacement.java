package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcStructuralLoadSingleDisplacement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralLoadSingleDisplacement(Object object, String string) {
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
		if (string.equals("RotationalDisplacementRXAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacement) object).getRotationalDisplacementRXAsString());
			 //1String
		}
		else if (string.equals("RotationalDisplacementRYAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacement) object).getRotationalDisplacementRYAsString());
			 //1String
		}
		else if (string.equals("RotationalDisplacementRZAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacement) object).getRotationalDisplacementRZAsString());
			 //1String
		}
		else if (string.equals("DisplacementXAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacement) object).getDisplacementXAsString());
			 //1String
		}
		else if (string.equals("DisplacementYAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacement) object).getDisplacementYAsString());
			 //1String
		}
		else if (string.equals("DisplacementX")) {
			resultList.add(((IfcStructuralLoadSingleDisplacement) object).getDisplacementX());
			 //1double
		}
		else if (string.equals("DisplacementY")) {
			resultList.add(((IfcStructuralLoadSingleDisplacement) object).getDisplacementY());
			 //1double
		}
		else if (string.equals("DisplacementZ")) {
			resultList.add(((IfcStructuralLoadSingleDisplacement) object).getDisplacementZ());
			 //1double
		}
		else if (string.equals("DisplacementZAsString")) {
			resultList.add(((IfcStructuralLoadSingleDisplacement) object).getDisplacementZAsString());
			 //1String
		}
		else if (string.equals("RotationalDisplacementRX")) {
			resultList.add(((IfcStructuralLoadSingleDisplacement) object).getRotationalDisplacementRX());
			 //1double
		}
		else if (string.equals("RotationalDisplacementRY")) {
			resultList.add(((IfcStructuralLoadSingleDisplacement) object).getRotationalDisplacementRY());
			 //1double
		}
		else if (string.equals("RotationalDisplacementRZ")) {
			resultList.add(((IfcStructuralLoadSingleDisplacement) object).getRotationalDisplacementRZ());
			 //1double
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralLoadSingleDisplacement) object).getName());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
