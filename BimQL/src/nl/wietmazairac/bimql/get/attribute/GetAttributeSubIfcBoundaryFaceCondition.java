package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcBoundaryFaceCondition;

public class GetAttributeSubIfcBoundaryFaceCondition {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBoundaryFaceCondition(Object object, String string) {
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
		if (string.equals("LinearStiffnessByAreaX")) {
			resultList.add(((IfcBoundaryFaceCondition) object).getLinearStiffnessByAreaX());
			 //1double
		}
		else if (string.equals("LinearStiffnessByAreaY")) {
			resultList.add(((IfcBoundaryFaceCondition) object).getLinearStiffnessByAreaY());
			 //1double
		}
		else if (string.equals("LinearStiffnessByAreaZ")) {
			resultList.add(((IfcBoundaryFaceCondition) object).getLinearStiffnessByAreaZ());
			 //1double
		}
		else if (string.equals("LinearStiffnessByAreaXAsString")) {
			resultList.add(((IfcBoundaryFaceCondition) object).getLinearStiffnessByAreaXAsString());
			 //1String
		}
		else if (string.equals("LinearStiffnessByAreaYAsString")) {
			resultList.add(((IfcBoundaryFaceCondition) object).getLinearStiffnessByAreaYAsString());
			 //1String
		}
		else if (string.equals("LinearStiffnessByAreaZAsString")) {
			resultList.add(((IfcBoundaryFaceCondition) object).getLinearStiffnessByAreaZAsString());
			 //1String
		}
		return resultList;
	}
}
