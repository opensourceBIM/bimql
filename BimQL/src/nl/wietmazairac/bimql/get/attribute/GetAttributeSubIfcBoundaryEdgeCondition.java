package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcBoundaryEdgeCondition {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBoundaryEdgeCondition(Object object, String string) {
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
		if (string.equals("RotationalStiffnessByLengthXAsString")) {
			resultList.add(((IfcBoundaryEdgeCondition) object).getRotationalStiffnessByLengthXAsString());
			 //1String
		}
		else if (string.equals("RotationalStiffnessByLengthYAsString")) {
			resultList.add(((IfcBoundaryEdgeCondition) object).getRotationalStiffnessByLengthYAsString());
			 //1String
		}
		else if (string.equals("RotationalStiffnessByLengthZAsString")) {
			resultList.add(((IfcBoundaryEdgeCondition) object).getRotationalStiffnessByLengthZAsString());
			 //1String
		}
		else if (string.equals("LinearStiffnessByLengthX")) {
			resultList.add(((IfcBoundaryEdgeCondition) object).getLinearStiffnessByLengthX());
			 //1double
		}
		else if (string.equals("LinearStiffnessByLengthY")) {
			resultList.add(((IfcBoundaryEdgeCondition) object).getLinearStiffnessByLengthY());
			 //1double
		}
		else if (string.equals("LinearStiffnessByLengthZ")) {
			resultList.add(((IfcBoundaryEdgeCondition) object).getLinearStiffnessByLengthZ());
			 //1double
		}
		else if (string.equals("LinearStiffnessByLengthXAsString")) {
			resultList.add(((IfcBoundaryEdgeCondition) object).getLinearStiffnessByLengthXAsString());
			 //1String
		}
		else if (string.equals("LinearStiffnessByLengthYAsString")) {
			resultList.add(((IfcBoundaryEdgeCondition) object).getLinearStiffnessByLengthYAsString());
			 //1String
		}
		else if (string.equals("LinearStiffnessByLengthZAsString")) {
			resultList.add(((IfcBoundaryEdgeCondition) object).getLinearStiffnessByLengthZAsString());
			 //1String
		}
		else if (string.equals("RotationalStiffnessByLengthX")) {
			resultList.add(((IfcBoundaryEdgeCondition) object).getRotationalStiffnessByLengthX());
			 //1double
		}
		else if (string.equals("RotationalStiffnessByLengthY")) {
			resultList.add(((IfcBoundaryEdgeCondition) object).getRotationalStiffnessByLengthY());
			 //1double
		}
		else if (string.equals("RotationalStiffnessByLengthZ")) {
			resultList.add(((IfcBoundaryEdgeCondition) object).getRotationalStiffnessByLengthZ());
			 //1double
		}
		return resultList;
	}
}
