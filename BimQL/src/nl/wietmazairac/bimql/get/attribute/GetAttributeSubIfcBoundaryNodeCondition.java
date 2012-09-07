package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcBoundaryNodeCondition {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBoundaryNodeCondition(Object object, String string) {
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
		if (string.equals("LinearStiffnessXAsString")) {
			resultList.add(((IfcBoundaryNodeCondition) object).getLinearStiffnessXAsString());
			 //1String
		}
		else if (string.equals("LinearStiffnessYAsString")) {
			resultList.add(((IfcBoundaryNodeCondition) object).getLinearStiffnessYAsString());
			 //1String
		}
		else if (string.equals("LinearStiffnessZAsString")) {
			resultList.add(((IfcBoundaryNodeCondition) object).getLinearStiffnessZAsString());
			 //1String
		}
		else if (string.equals("RotationalStiffnessX")) {
			resultList.add(((IfcBoundaryNodeCondition) object).getRotationalStiffnessX());
			 //1double
		}
		else if (string.equals("RotationalStiffnessY")) {
			resultList.add(((IfcBoundaryNodeCondition) object).getRotationalStiffnessY());
			 //1double
		}
		else if (string.equals("RotationalStiffnessZ")) {
			resultList.add(((IfcBoundaryNodeCondition) object).getRotationalStiffnessZ());
			 //1double
		}
		else if (string.equals("LinearStiffnessX")) {
			resultList.add(((IfcBoundaryNodeCondition) object).getLinearStiffnessX());
			 //1double
		}
		else if (string.equals("LinearStiffnessY")) {
			resultList.add(((IfcBoundaryNodeCondition) object).getLinearStiffnessY());
			 //1double
		}
		else if (string.equals("LinearStiffnessZ")) {
			resultList.add(((IfcBoundaryNodeCondition) object).getLinearStiffnessZ());
			 //1double
		}
		else if (string.equals("RotationalStiffnessXAsString")) {
			resultList.add(((IfcBoundaryNodeCondition) object).getRotationalStiffnessXAsString());
			 //1String
		}
		else if (string.equals("RotationalStiffnessYAsString")) {
			resultList.add(((IfcBoundaryNodeCondition) object).getRotationalStiffnessYAsString());
			 //1String
		}
		else if (string.equals("RotationalStiffnessZAsString")) {
			resultList.add(((IfcBoundaryNodeCondition) object).getRotationalStiffnessZAsString());
			 //1String
		}
		return resultList;
	}
}
